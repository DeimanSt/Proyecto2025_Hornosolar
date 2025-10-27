package Controlador;

import Modelo.*;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
           String sql = "insert into ambiente(idh, intensidad_solar, temperatura_ambiente, angulo, direccion_sol, fecha_registro) values(?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, a.getIDH);
            pst.setString(2, a.getIntensidad_solar());
            pst.setInt(3, a.getTemperatura_ambiente());
            pst.setInt(4, a.getAngulo());
            pst.setString(5, a.getDireccion_sol());
            pst.setString(6, a.getFecha_registro());

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



    public DefaultTableModel consultarHornos() {
        
        // 1. Definir las columnas
        String[] titulos = {"ID", "Tipo Horno"};
        
        // 2. Crear el DefaultTableModel (no editable)
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        // 3. Definir la consulta SQL
        String sql = "SELECT idh, tipo FROM `hornos`";
        
        // 4. Conexión y ejecución (¡Usando try-with-resources
        //    para cerrar la conexión automáticamente!)
        ConexionBDD nuevaC = new ConexionBDD();
        
        try (Connection con = nuevaC.conectar();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            // 5. Recorrer el ResultSet y llenar el modelo
            while (rs.next()) {
                Object[] fila = new Object[2]; // Correcto (2 columnas)
                fila[0] = rs.getInt("idh");
                fila[1] = rs.getString("tipo");
                modelo.addRow(fila);
            }
            
        } catch (SQLException e) {
            // Es mejor mostrar el error en una ventana
            JOptionPane.showMessageDialog(null, 
                "Error al consultar datos de hornos: " + e.getMessage(), 
                "Error de Base de Datos", 
                JOptionPane.ERROR_MESSAGE);
            System.err.println("Error al cargar datos de hornos: " + e.getMessage());
        }
                return modelo;
    }

    
 }

