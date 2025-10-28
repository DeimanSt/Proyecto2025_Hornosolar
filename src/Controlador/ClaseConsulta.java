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

        String sql = "insert into hornos(tipo, materiales, dimensiones, sistema_aislamiento, reflectores, fecha_creacion) values(?,?,?,?,?,?)";

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
    
 
 
    
    
    public void IngAmbiente (ambiente a){
        
        ConexionBDD nuevoc = new ConexionBDD();
        Connection con = nuevoc.conectar();
        PreparedStatement pst = null;
try{
           String sql = "insert into ambiente(idh, intensidad_solar, temperatura_ambiente, angulo, direccion_sol, fecha_registro) values(?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, a.getIDH());
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
    
public void IngresarAutosustentable(autosustentable au){
     try {
            String sql;
            ConexionBDD nuevoc=new ConexionBDD();
            Connection con = nuevoc.conectar();        
            sql="insert into autosustentable(eficiencia_termica, energia_solar_recibida, consumo_energetico, energia_almacenada, fecha_evaluacion) values(?,?,?,?,?,?)";
          
            PreparedStatement pst= con.prepareStatement(sql);
            
            pst.setDouble(1, au.getEficiencia_energetica());
            pst.setString(2, au.getEnergia_solar_recibida());
            pst.setInt(3, au.getConsumo_energetico());
            pst.setInt(4, au.getEnergia_almacenada());
            pst.setString(5, au.getFecha_evaluacion());
            
            int n = pst.executeUpdate();
            if(n > 0){
                JOptionPane.showMessageDialog(null, "La Autosustentabilidad del Horno ha sido ingresada");
            }else{
                JOptionPane.showMessageDialog(null, "La Autosustentabilidad del Horno no se ha podido ingresar");
            }
            con.close();
            pst.close();

         
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
} 
public void InsertarFuncion(funciones f){
        try{
            String sql;
            ConexionBDD nuevoc=new ConexionBDD();
            Connection con = nuevoc.conectar();        
            sql="insert into funcionamiento(IDH, temperatura_interna, tiempo_coccion, tipo_alimento, estado_horno, fecha_operacion, hora_operacion) values(?,?,?,?,?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
             pst.setInt(1, f.getTemperaturaInterna());
            pst.setInt(2, f.getTemperaturaInterna());
            pst.setString(3, f.getTiempoCoccion());
            pst.setString(4, f.getTipoAlimento());
            pst.setString(5, f.getEstadoHorno());
            pst.setString(6, f.getFechaOperacion());
            pst.setString(7, f.getHoraOperacion());
            
            int n = pst.executeUpdate();
            if(n > 0){
                JOptionPane.showMessageDialog(null, "Funcionamiento del horno ingresado existosamente");
            }else{
                JOptionPane.showMessageDialog(null, "Funcionamiento del horno no se ha podido ingresar");
            }
              } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
}

public void InsertarMante(mantenimiento m){
    

try{
            ConexionBDD nuevoc=new ConexionBDD();
            Connection con = nuevoc.conectar();        
          String  sql="insert into mantenimientos(idh, detalles_reparacion, materiales_remplazados, fecha_creacion) values(?,?,?,?)";  
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(0, m.getIDH());
            pst.setString(1, m.getDetalles_reparacion());
            pst.setString(2, m.getMateriales_reemplazados());
            pst.setString(3, m.getFecha_creacion());
            
            int n = pst.executeUpdate();
            if(n > 0){
                JOptionPane.showMessageDialog(null, "Mantenimiento del horno ingresado existosamente");
            }else{
               JOptionPane.showMessageDialog(null, "Mantenimiento del horno no se ha podido ingresar");
            }
            con.close();
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
}

    public DefaultTableModel conexionHornos() {
        
        String[] titulos = {"ID", "Tipo Horno"};
        
DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
    };
        String sql = "SELECT idh, tipo FROM `hornos`";
        
       
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
            JOptionPane.showMessageDialog(null, 
                "Error al consultar datos de hornos: " + e.getMessage(), 
                "Error de Base de Datos", 
                JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, "Error al cargar datos de hornos: " + e.getMessage());
        }
                return modelo;
    }

     public DefaultTableModel MostrarHornos() {
        
        String[] titulos = {"Tipo", "Materiales", "Dimensiones", "Sistema Aislamiento", "Reflectores", "Fecha"};
        
               
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
    };
        
        String sql = "SELECT tipo, materiales, dimensiones, sistema_aislamiento, reflectores, fecha_creacion FROM hornos";
        ConexionBDD nuevaC = new ConexionBDD();
        
        try (Connection con = nuevaC.conectar();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] fila = new Object[6]; 
                fila[0] = rs.getString("tipo");
                fila[1] = rs.getString("materiales");
                fila[2] = rs.getString("dimensiones");
                fila[3] = rs.getString("sistema_aislamiento");
                fila[4] = rs.getString("reflectores");
                fila[5] = rs.getString("fecha_creacion");
                modelo.addRow(fila);
            }
            
        } catch (SQLException e) {
            // Es mejor mostrar el error en una ventana
            JOptionPane.showMessageDialog(null, 
                "Error al consultar datos de hornos: " + e.getMessage(), 
                "Error de Base de Datos", 
                JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, "Error al cargar datos de hornos: " + e.getMessage());
        }
                return modelo;
    }

    
 }

