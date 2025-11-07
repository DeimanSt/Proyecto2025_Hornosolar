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
public void modificarHorno(int idh, horno h) { 
        ConexionBDD nuevoc = new ConexionBDD();
        Connection con = nuevoc.conectar();
        PreparedStatement pst = null;

        // CAMBIAMOS el WHERE
        String sql = "update hornos set tipo=?, materiales=?, sistema_aislamiento=?, fecha_creacion=?, dimensiones=?, reflectores=? where idh=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, h.getTipo());
            pst.setString(2, h.getMateriales());
            pst.setString(3, h.getSistema_aislamiento());
            pst.setString(4, h.getFecha());
            pst.setDouble(5, h.getDimensiones());
            pst.setInt(6, h.getReflectores());
            pst.setInt(7, idh);

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
public void eliminarHorno(int idh) { 
        ConexionBDD nuevoc = new ConexionBDD();
        Connection con = nuevoc.conectar();
        PreparedStatement pst = null;

        // CAMBIAMOS el WHERE
        String sql = "delete from hornos where idh=?"; 

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idh); // <-- Usamos el ID
            
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
            sql="insert into autosustentable(idf, eficiencia_termica, energia_solar_recibida, consumo_energetico, energia_almacenada, fecha_evaluacion) values(?,?,?,?,?,?)";
          
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setInt(1, au.getIdf());
            pst.setDouble(2, au.getEficiencia_energetica());
            pst.setString(3, au.getEnergia_solar_recibida());
            pst.setInt(4, au.getConsumo_energetico());
            pst.setInt(5, au.getEnergia_almacenada());
            pst.setString(6, au.getFecha_evaluacion());
            
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
             pst.setInt(1, f.getIDH());
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
          String sql="insert into mantenimientos(idh, detalles_reparacion, materiales_remplazados, fecha_creacion) values(?,?,?,?)";  
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, m.getIDH());
            pst.setString(2, m.getDetalles_reparacion());
            pst.setString(3, m.getMateriales_reemplazados());
            pst.setString(4, m.getFecha_creacion());
            
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
public DefaultTableModel consultaHornos() {
        
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
        
        String[] titulos = {"IDH","Tipo", "Materiales", "Dimensiones", "Sistema Aislamiento", "Reflectores", "Fecha"};
        
               
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
    };
        
        String sql = "SELECT * FROM hornos";
        ConexionBDD nuevaC = new ConexionBDD();
        
        try (Connection con = nuevaC.conectar();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] fila = new Object[7]; 
                fila[0] = rs.getInt("IDH");
                fila[1] = rs.getString("tipo");
                fila[2] = rs.getString("materiales");
                fila[3] = rs.getString("dimensiones");
                fila[4] = rs.getString("sistema_aislamiento");
                fila[5] = rs.getString("reflectores");
                fila[6] = rs.getString("fecha_creacion");

                
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
public DefaultTableModel MostrarHornosPorFecha(String fechaDesde, String fechaHasta) {
    String[] titulos = {"ID", "Tipo", "Materiales", "Dimensiones", "Sistema Aislamiento", "Reflectores", "Fecha"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) { return false; }
    };

    String sql = "SELECT idh, tipo, materiales, dimensiones, sistema_aislamiento, reflectores, fecha_creacion FROM hornos WHERE fecha_creacion >= ? AND fecha_creacion <= ?";    
    ConexionBDD nuevaC = new ConexionBDD();
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, fechaDesde);
        pst.setString(2, fechaHasta);
        
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Object[] fila = new Object[7]; 
                fila[0] = rs.getInt("idh"); 
                fila[1] = rs.getString("tipo");
                fila[2] = rs.getString("materiales");
                fila[3] = rs.getString("dimensiones");
                fila[4] = rs.getString("sistema_aislamiento");
                fila[5] = rs.getInt("reflectores");
                fila[6] = rs.getString("fecha_creacion");
                modelo.addRow(fila);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar por fecha: " + e.getMessage());
    }
    return modelo;
}
public DefaultTableModel MostrarHornosPorTipo(String tipo) {
    String[] titulos = {"ID", "Tipo", "Materiales", "Dimensiones", "Sistema Aislamiento", "Reflectores", "Fecha"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) { return false; }
    };
    
    // Usamos el operador LIKE para buscar coincidencias parciales
    String sql = "SELECT idh, tipo, materiales, dimensiones, sistema_aislamiento, reflectores, fecha_creacion FROM hornos WHERE tipo LIKE ?";
    
    ConexionBDD nuevaC = new ConexionBDD();
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {

        // El "%" es un comodín. "%caja%" busca cualquier cosa que contenga "caja"
        pst.setString(1, "%" + tipo + "%"); 
        
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Object[] fila = new Object[7]; 
                fila[0] = rs.getInt("idh"); 
                fila[1] = rs.getString("tipo");
                fila[2] = rs.getString("materiales");
                fila[3] = rs.getString("dimensiones");
                fila[4] = rs.getString("sistema_aislamiento");
                fila[5] = rs.getInt("reflectores");
                fila[6] = rs.getString("fecha_creacion");
                modelo.addRow(fila);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar por tipo: " + e.getMessage());
    }
    return modelo;
}
public DefaultTableModel MostrarReparacion() {
    
    
    String[] titulos = {"Tipo Horno", "Fecha Reparación", "Materiales Usados", "Detalle Reparación"};
    
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };

    String sql = "SELECT  h.tipo, m.fecha_creacion, m.detalles_reparacion, m.materiales_remplazados FROM hornos h INNER JOIN mantenimientos m ON h.idh = m.idh";

    ConexionBDD nuevaC = new ConexionBDD();
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        while (rs.next()) {
            Object[] fila = new Object[4]; 
            fila[0] = rs.getString("tipo");
            fila[1] = rs.getString("fecha_creacion"); 
            fila[2] = rs.getString("detalles_reparacion");
            fila[3] = rs.getString("materiales_remplazados");
           
            
            modelo.addRow(fila);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, 
                "Error al consultar historial de reparaciones: " + e.getMessage(), 
                "Error de Base de Datos", 
                JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Para ver el error en la consola de NetBeans
    }
    
    return modelo;
}  
public DefaultTableModel MostrarMantenimientoPorFecha(String fechaDesde, String fechaHasta) {
    // Los títulos de tu tabla de Mantenimiento (ajusta si es necesario)
 String[] titulos = {"Tipo Horno", "Fecha Reparación", "Detalle Reparación", "Materiales Usados"};
 DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) { return false; }
    };

    // La columna de fecha en tu tabla 'mantenimientos' se llama 'fecha'
    String sql = "SELECT h.tipo, m.fecha_creacion, m.detalles_reparacion, m.materiales_remplazados FROM hornos h INNER JOIN mantenimientos m ON h.idh = m.idh WHERE m.fecha_creacion >= ? AND m.fecha_creacion <= ?";
    
    ConexionBDD nuevaC = new ConexionBDD(); // O tu método de conexión
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, fechaDesde);
        pst.setString(2, fechaHasta);
        
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
            Object[] fila = new Object[4]; 
            fila[0] = rs.getString("tipo");
            fila[1] = rs.getString("fecha_creacion"); 
            fila[2] = rs.getString("detalles_reparacion");
            fila[3] = rs.getString("materiales_remplazados");
           
                modelo.addRow(fila);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar mantenimientos por fecha: " + e.getMessage());
    }
    return modelo;
}
public DefaultTableModel MostrarMantenimientoPorDetalle(String detalle) {
 String[] titulos = {"Tipo Horno", "Fecha Reparación", "Detalle Reparación", "Materiales Usados"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) { return false; }
    };
    
    // Buscamos en la columna 'detalles_reparacion'
    String sql = "SELECT h.tipo, m.fecha_creacion, m.detalles_reparacion, m.materiales_remplazados FROM hornos h INNER JOIN mantenimientos m ON h.idh = m.idh WHERE detalles_reparacion LIKE ?";
    
    ConexionBDD nuevaC = new ConexionBDD();
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, "%" + detalle + "%"); 
        
        try (ResultSet rs = pst.executeQuery()) {
          while (rs.next()) {
            Object[] fila = new Object[4]; 
            fila[0] = rs.getString("tipo");
            fila[1] = rs.getString("fecha_creacion"); 
            fila[2] = rs.getString("detalles_reparacion");
            fila[3] = rs.getString("materiales_remplazados");
           
                modelo.addRow(fila);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar mantenimientos por detalle: " + e.getMessage());
    }
    return modelo;
}
public DefaultTableModel consultaFuncion() {
  String[] titulos = {"IDF", "Fecha"};
        
DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
    };
        String sql = "SELECT IDF, fecha_operacion FROM `funcionamiento`";
        
       
        ConexionBDD nuevaC = new ConexionBDD();
        
        try (Connection con = nuevaC.conectar();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            // 5. Recorrer el ResultSet y llenar el modelo
            while (rs.next()) {
                Object[] fila = new Object[2]; // Correcto (2 columnas)
                fila[0] = rs.getInt("idf");
                fila[1] = rs.getString("fecha_operacion");
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
public DefaultTableModel MostrarFuncionamiento() {
    // Definimos los títulos que tendrá la tabla
    String[] titulos = {"IDF", "IDH", "Temp. Interna", "T. Cocción", "Alimento", "Estado", "Fecha Op.", "Hora Op."};
    
    // Creamos el modelo de la tabla, no editable
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    // Tu consulta SQL
    String sql = "SELECT * FROM funcionamiento";
    
    // Tu clase de conexión
    ConexionBDD nuevaC = new ConexionBDD();
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        while (rs.next()) {
            // 8 columnas
            Object[] fila = new Object[8];
            fila[0] = rs.getInt("IDF");
            fila[1] = rs.getInt("IDH");
            fila[2] = rs.getInt("temperatura_interna");
            fila[3] = rs.getString("tiempo_coccion"); // Lo leemos como String
            fila[4] = rs.getString("tipo_alimento");
            fila[5] = rs.getString("estado_horno");
            fila[6] = rs.getString("fecha_operacion"); // O rs.getDate()
            fila[7] = rs.getString("hora_operacion");  // O rs.getTime()

            modelo.addRow(fila);
        }
        
    } catch (SQLException e) {
        // Tu manejo de errores
        JOptionPane.showMessageDialog(null, 
                "Error al consultar datos de funcionamiento: " + e.getMessage(), 
                "Error de Base de Datos", 
                JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error al cargar datos de funcionamiento: " + e.getMessage());
    }
            
    return modelo;
}
public DefaultTableModel MostrarFuncionamientoPorFecha(String fechaDesde, String fechaHasta) {
    // Títulos (Asegúrate de que coincidan con tu 'consultaFuncionamiento')
    String[] titulos = {"IDF", "IDH", "Temp. Interna", "T. Cocción", "Alimento", "Estado", "Fecha Op.", "Hora Op."};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override public boolean isCellEditable(int row, int column) { return false; }
    };

    // Usamos la columna 'fecha_operacion' de la tabla 'funcionamiento'
    String sql = "SELECT * FROM funcionamiento WHERE fecha_operacion >= ? AND fecha_operacion <= ?";

    ConexionBDD nuevaC = new ConexionBDD();
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, fechaDesde);
        pst.setString(2, fechaHasta);

        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
            // 8 columnas
            Object[] fila = new Object[8];
            fila[0] = rs.getInt("IDF");
            fila[1] = rs.getInt("IDH");
            fila[2] = rs.getInt("temperatura_interna");
            fila[3] = rs.getString("tiempo_coccion"); // Lo leemos como String
            fila[4] = rs.getString("tipo_alimento");
            fila[5] = rs.getString("estado_horno");
            fila[6] = rs.getString("fecha_operacion"); // O rs.getDate()
            fila[7] = rs.getString("hora_operacion");  // O rs.getTime()

            modelo.addRow(fila);
        }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar funcionamiento por fecha: " + e.getMessage());
    }
    return modelo;
}
public DefaultTableModel MostrarFuncionamientoPorAlimento(String alimento) {
    String[] titulos = {"IDF", "IDH", "Temp. Interna", "T. Cocción", "Alimento", "Estado", "Fecha Op.", "Hora Op."};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override public boolean isCellEditable(int row, int column) { return false; }
    };

    // Buscamos usando 'tipo_alimento' [cite: 26]
    String sql = "SELECT * FROM funcionamiento WHERE tipo_alimento LIKE ?";

    ConexionBDD nuevaC = new ConexionBDD();
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, "%" + alimento + "%");

        try (ResultSet rs = pst.executeQuery()) {
             while (rs.next()) {
            // 8 columnas
            Object[] fila = new Object[8];
            fila[0] = rs.getInt("IDF");
            fila[1] = rs.getInt("IDH");
            fila[2] = rs.getInt("temperatura_interna");
            fila[3] = rs.getString("tiempo_coccion"); // Lo leemos como String
            fila[4] = rs.getString("tipo_alimento");
            fila[5] = rs.getString("estado_horno");
            fila[6] = rs.getString("fecha_operacion"); // O rs.getDate()
            fila[7] = rs.getString("hora_operacion");  // O rs.getTime()

            modelo.addRow(fila);
        }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar por alimento: " + e.getMessage());
    }
    return modelo;
}
public DefaultTableModel MostrarAmbiente() {
    // Definimos los títulos
    String[] titulos = {"IDAM", "IDH", "Intensidad", "Temp. Ambiente", "Ángulo", "Dirección Sol", "Fecha Reg."};
    
    // Creamos el modelo de la tabla, no editable
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    String sql = "SELECT * FROM ambiente";
    ConexionBDD nuevaC = new ConexionBDD();
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        while (rs.next()) {
            // 7 columnas
            Object[] fila = new Object[7];
            fila[0] = rs.getInt("IDAM");
            fila[1] = rs.getInt("IDH"); // Con tu arreglo del SQL, esto ya no será NULL
            fila[2] = rs.getString("intensidad_solar");
            fila[3] = rs.getInt("temperatura_ambiente");
            fila[4] = rs.getInt("angulo");
            fila[5] = rs.getString("direccion_sol");
            fila[6] = rs.getString("fecha_registro"); // O rs.getDate()

            modelo.addRow(fila);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, 
                "Error al consultar datos de ambiente: " + e.getMessage(), 
                "Error de Base de Datos", 
                JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error al cargar datos de ambiente: " + e.getMessage());
    }
            
    return modelo;
}
public DefaultTableModel MostrarAutosustentable() {
    // Definimos los títulos
    String[] titulos = {"IDAU", "IDF", "Eficiencia", "Energía Recibida", "Consumo", "Energía Almac.", "Fecha Eval."};
    
    // Creamos el modelo de la tabla, no editable
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    String sql = "SELECT * FROM autosustentable";
    ConexionBDD nuevaC = new ConexionBDD();
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        while (rs.next()) {
            // 7 columnas
            Object[] fila = new Object[7];
            fila[0] = rs.getInt("IDAU");
            fila[1] = rs.getInt("IDF");
            fila[2] = rs.getDouble("eficiencia_termica"); // Ojo: es double en tu SQL
            fila[3] = rs.getString("energia_solar_recibida"); // Es varchar en tu SQL
            fila[4] = rs.getInt("consumo_energetico");
            fila[5] = rs.getInt("energia_almacenada");
            fila[6] = rs.getString("fecha_evaluacion"); // O rs.getDate()

            modelo.addRow(fila);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, 
                "Error al consultar datos de autosustentable: " + e.getMessage(), 
                "Error de Base de Datos", 
                JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error al cargar datos de autosustentable: " + e.getMessage());
    }
            
    return modelo;
}
public DefaultTableModel MostrarAutosustentablePorFecha(String fechaDesde, String fechaHasta) {
    // Títulos (Asegúrate de que coincidan con tu 'consultaFuncionamiento')
    String[] titulos = {"Intensidad solar","Temperatura ambiente", "Angulo", "Direccion del sol", "Fecha registro"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override public boolean isCellEditable(int row, int column) { return false; }
    };

    // Usamos la columna 'fecha_operacion' de la tabla 'funcionamiento'
    String sql = "SELECT intensidad_solar, temperatura_ambiente, angulo, direccion_sol, fecha_registro FROM autosustentable WHERE fecha_registro >= ? AND fecha_registro <= ?";

    ConexionBDD nuevaC = new ConexionBDD();
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, fechaDesde);
        pst.setString(2, fechaHasta);

        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
            Object[] fila = new Object[6];
            fila[1] = rs.getString("intensidad_solar"); 
            fila[2] = rs.getString("temperatura_ambiente");
            fila[3] = rs.getString("angulo");
            fila[4] = rs.getString("fecha_operacion"); 
            fila[5] = rs.getString("direccion_sol");  
            fila[6] = rs.getString("fecha_registro");  

            modelo.addRow(fila);
        }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar funcionamiento por fecha: " + e.getMessage());
    }
    return modelo;
}
public DefaultTableModel MostrarAutosustentablePorBusqueda(String busqueda) {
 String[] titulos = {"Intensidad solar","Temperatura ambiente", "Angulo", "Direccion del sol", "Fecha registro"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override public boolean isCellEditable(int row, int column) { return false; }
    };
    // Usamos la columna 'fecha_operacion' de la tabla 'funcionamiento'
    String sql = "SELECT intensidad_solar, temperatura_ambiente, angulo, direccion_sol, fecha_registro FROM autosustentable WHERE intensidad_solar LIKE ?";

    ConexionBDD nuevaC = new ConexionBDD();
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, "%" + busqueda + "%");

        try (ResultSet rs = pst.executeQuery()) {
             while (rs.next()) {
     Object[] fila = new Object[6];
            fila[1] = rs.getString("intensidad_solar"); 
            fila[2] = rs.getString("temperatura_ambiente");
            fila[3] = rs.getString("angulo");
            fila[4] = rs.getString("fecha_operacion"); 
            fila[5] = rs.getString("direccion_sol");  
            fila[6] = rs.getString("fecha_registro");  

            modelo.addRow(fila);
        }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar por alimento: " + e.getMessage());
    }
    return modelo;
}
public DefaultTableModel MostrarAnalisisComparativo(int idHorno) {
        String[] titulos = {"ID Horno", "Tipo de Horno", "Gasto Promedio (Consumo)"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacemos que la tabla no sea editable
        }
    };

    // Esta es la consulta SQL que agrupa por horno y calcula el promedio
    String sql = "SELECT h.idh, h.tipo, AVG(a.consumo_energetico) AS GastoPromedio FROM autosustentable a JOIN funcionamiento f ON f.IDF = a.IDF JOIN hornos h ON h.IDH = f.IDH GROUP BY h.idh, h.tipo";
    
    ConexionBDD nuevaC = new ConexionBDD(); // Usamos tu clase de conexión
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        while (rs.next()) {
            Object[] fila = new Object[3]; // Un objeto para 3 columnas
            
            fila[0] = rs.getInt("idh");
            fila[1] = rs.getString("tipo");
            fila[2] = rs.getDouble("GastoPromedio"); // Es un AVG (promedio), así que usamos getDouble
            
            modelo.addRow(fila);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al calcular análisis comparativo: " + e.getMessage());
        e.printStackTrace(); // Bueno para depurar
    }
    
    return modelo; // Devolvemos el modelo (lleno o vacío)
}
public String CalcularEstadisticasGenerales() {
    
    String sql = "SELECT " +
                 "AVG(eficiencia_termica) AS prom_eficiencia, " +
                 "MAX(energia_solar_recibida) AS max_energia, " +
                 "MIN(consumo_energetico) AS min_consumo " +
                 "FROM autosustentable";
    
    ConexionBDD nuevaC = new ConexionBDD(); // Tu clase de conexión
    String resultado = "No se pudieron calcular las estadísticas.";
    
    try (Connection con = nuevaC.conectar();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {
        
        if (rs.next()) {
            double promEficiencia = rs.getDouble("prom_eficiencia");
            // OJO: Si energia_solar_recibida es VARCHAR en tu BD, usa rs.getString()
            int maxEnergia = rs.getInt("max_energia"); 
            int minConsumo = rs.getInt("consumo_energetico");
            
            // Formateamos el texto que se mostrará
            resultado = String.format(
                "--- Estadísticas Generales del Sistema ---\n\n" +
                "Promedio Eficiencia Térmica: %.2f\n" +
                "Máxima Energía Solar Recibida: %d\n" +
                "Mínimo Consumo Energético: %d",
                promEficiencia, maxEnergia, minConsumo
            );
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al calcular estadísticas: " + e.getMessage());
        e.printStackTrace();
    }
    return resultado; // Devuelve el texto
}
}

