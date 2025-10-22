package Controlador;

import Modelo.*;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClaseConsulta {

    public void registrarHorno(horno h) {
        ConexionBDD nuevoc = new ConexionBDD();
        Connection con = nuevoc.conectar();
        PreparedStatement pst = null;

        String sql = "insert into hornos(tipo, materiales, dimensiones, sistema_aislamiento, reflectores, fecha) values(?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, h.getTipo());
            pst.setString(2, h.getMateriales());
            pst.setDouble(3, h.getDimensiones());
            pst.setString(4, h.getSistema_aislamiento());
            pst.setInt(5, h.getReflectores());
            pst.setString(6, h.getFecha());

            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Horno ingresado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Horno no ingresado.");
            }
            
            pst.close();
            con.close();

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e);
        }
    }


    public void modificarHorno(String tipoOriginal, horno h) {
        ConexionBDD nuevoc = new ConexionBDD();
        Connection con = nuevoc.conectar();
        PreparedStatement pst = null;

        String sql = "update hornos set tipo=?, materiales=?, sistema_aislamiento=?, fecha=?, dimensiones=?, reflectores=? where tipo=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, h.getTipo());
            pst.setString(2, h.getMateriales());
            pst.setString(3, h.getSistema_aislamiento());
            pst.setString(4, h.getFecha());
            pst.setDouble(5, h.getDimensiones());
            pst.setInt(6, h.getReflectores());
            pst.setString(7, tipoOriginal);

            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Horno modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error: No se encontró el horno para modificar.");
            }
            
            pst.close();
            con.close();

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e);
        }
    }

    
    public void eliminarHorno(String tipoDeHorno) {
        ConexionBDD nuevoc = new ConexionBDD();
        Connection con = nuevoc.conectar();
        PreparedStatement pst = null;

        String sql = "delete from hornos where tipo=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, tipoDeHorno);
            
            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Horno eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error: No se encontró el horno para eliminar.");
            }

            pst.close();
            con.close();

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e);
        }
    }
    
 
    public horno buscarHornoPorTipo(String tipoDeHorno) {
        ConexionBDD nuevoc = new ConexionBDD();
        Connection con = nuevoc.conectar();
        PreparedStatement pst = null;
        ResultSet rs = null;
        horno hornoEncontrado = null;

        String sql = "select * from hornos where tipo = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, tipoDeHorno);
            rs = pst.executeQuery();

            if (rs.next()) {
                // Se extraen los datos del resultado
                String tipo = rs.getString("tipo");
                String materiales = rs.getString("materiales");
                String sistema_aislamiento = rs.getString("sistema_aislamiento");
                String fecha = rs.getString("fecha");
                double dimensiones = rs.getDouble("dimensiones");
                int reflectores = rs.getInt("reflectores");

                // Se usa tu constructor para crear el objeto
                hornoEncontrado = new horno(reflectores, tipo, materiales, sistema_aislamiento, fecha, dimensiones);
            }
            
            rs.close();
            pst.close();
            con.close();
            
            return hornoEncontrado;

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e);
            return null;
        }
    }
    public void IngAmbiente (ambiente a){
        
        ConexionBDD nuevoc = new ConexionBDD();
        Connection con = nuevoc.conectar();
        PreparedStatement pst = null;
try{
           String sql = "insert into ambiente(intensidad_solar, temperatura_ambiente, angulo, direccion_sol, fecha_registro) values(?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, a.getIntensidad_solar());
            pst.setInt(2, a.getTemperatura_ambiente());
            pst.setInt(3, a.getAngulo());
            pst.setString(4, a.getDireccion_sol());
            pst.setString(5, a.getFecha_registro());

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Ambiente del horno ingresado");
            } else {
                JOptionPane.showMessageDialog(null, "El ambiente del horno no pudo ser ingresado");
            }
            con.close();
            pst.close();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}
