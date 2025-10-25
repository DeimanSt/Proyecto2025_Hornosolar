package Vista;

import Modelo.*;
import Controlador.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Ambiente extends javax.swing.JDialog {

    /**
     * Creates new form Ambiente
     */
    public Ambiente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btn_Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txb_direccion = new javax.swing.JComboBox<>();
        txb_angulo = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        txb_temperatura = new javax.swing.JSpinner();
        txb_intensidadsolar = new javax.swing.JComboBox<>();
        Jd_fecha = new com.toedter.calendar.JDateChooser();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setText("Ambiente del Horno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 330, -1));

        btn_Ingresar.setBackground(new java.awt.Color(51, 153, 0));
        btn_Ingresar.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Ingresar.setBorderPainted(false);
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 200, 60));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtG", 1, 24)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 282, -1, -1));

        jLabel4.setFont(new java.awt.Font("SimSun-ExtG", 1, 24)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 288, -1, -1));

        jLabel5.setFont(new java.awt.Font("SimSun-ExtG", 1, 24)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 288, -1, -1));

        jLabel6.setFont(new java.awt.Font("SimSun-ExtG", 1, 24)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 363, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Dirección del Sol");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Fecha de creacion");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("°");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Intensidad Solar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Angulo Solar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Temperatura");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txb_direccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Norte", "Sur", "Este", "Oeste" }));
        getContentPane().add(txb_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 130, 40));

        txb_angulo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 360, 1));
        txb_angulo.setName(""); // NOI18N
        getContentPane().add(txb_angulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("°C");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        txb_temperatura.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        txb_temperatura.setName(""); // NOI18N
        getContentPane().add(txb_temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 30));

        txb_intensidadsolar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Alta", "Media", "Baja" }));
        getContentPane().add(txb_intensidadsolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 40));

        Jd_fecha.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(Jd_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 160, 40));

        btn_salir.setBackground(new java.awt.Color(255, 71, 71));
        btn_salir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 70, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        // TODO add your handling code here:
        try {
             ClaseConsulta INGA = new ClaseConsulta();
            String sql;
            ambiente a;
            a = new ambiente(
                    (String) txb_intensidadsolar.getSelectedItem(),
                    (int) txb_angulo.getValue(), 
                    (int) txb_temperatura.getValue(),
                    (String) txb_direccion.getSelectedItem(),
                    new SimpleDateFormat("yyyy/MM/dd").format(Jd_fecha.getDate())
            );
        INGA.IngAmbiente(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        menu m=new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ambiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ambiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ambiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ambiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ambiente dialog = new Ambiente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Jd_fecha;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner txb_angulo;
    private javax.swing.JComboBox<String> txb_direccion;
    private javax.swing.JComboBox<String> txb_intensidadsolar;
    private javax.swing.JSpinner txb_temperatura;
    // End of variables declaration//GEN-END:variables
}
