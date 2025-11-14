package Vista;

import Modelo.*;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controlador.*;

public class Menu extends javax.swing.JFrame {

    private int idHornoCalc1 = -1;
    private int idHornoCalc2 = -1;

    /**
     * Creates new form Pruebita
     */
    public Menu() {

        initComponents();

        jPanelHornosSolares.setVisible(false);
        jPanelMantenimiento.setVisible(false);
        jPanelFuncionamiento.setVisible(false);
        jPanelAmbiente.setVisible(false);
        jPanelAutosustentable.setVisible(false);
        txb_buscarAutosustentable.setEnabled(false);
        txb_buscarFuncionamiento.setEnabled(false);
        txb_buscarHornos.setEnabled(false);
        txb_buscarMantenimiento.setEnabled(false);

        cb_AnalisisDesempeño.setSelected(false);

        rbPorBusquedaAutosustentabilidad.setVisible(false);
        txb_buscarAutosustentable.setEnabled(false);

        rbPorFechaAutosustentabilidad.setSelected(true);
        Jd_fechaInicioAutosustentable.setEnabled(true);
        Jd_FechaFinalAutosustentable.setEnabled(true);
        actualizarVisibilidadAutosustentable();
        javax.swing.ButtonGroup grupoHoraMoA = new javax.swing.ButtonGroup();
        grupoHoraMoA.add(rbManual);
        grupoHoraMoA.add(rbAutomatico);
        rbAutomatico.setSelected(true);
        rbManual.setSelected(false);
        jb_fechaoperacion.setEnabled(false);
        js_Hora.setEnabled(false);

    }

    public void refrescarTablaHornos() {
        ClaseConsulta misConsultas = new ClaseConsulta();
        tblDatoHorno.setModel(misConsultas.MostrarHornos());
    }

    private void actualizarVisibilidadAutosustentable() {
        if (rbPorFechaAutosustentabilidad.isSelected()) {
            Jd_fechaInicioAutosustentable.setEnabled(true);
            Jd_FechaFinalAutosustentable.setEnabled(true);
            txb_buscarAutosustentable.setEnabled(false);

        } else if (rbPorBusquedaAutosustentabilidad.isSelected()) {
            txb_buscarAutosustentable.setEnabled(true);
            Jd_fechaInicioAutosustentable.setEnabled(false);
            Jd_FechaFinalAutosustentable.setEnabled(false);

        }
    }

    /**
     * Habilita o deshabilita las tablas de selección de hornos en el panel de
     * Cálculos, basado en el método de comparación seleccionado.
     */
    private void actualizarDisponibilidadTablasCalculo() {
        if (rbCompararTodoslosHornos.isSelected()) {
            tblDatoHornoAutosustentable.setEnabled(false);
            tblDatoHornoAutosustentable2.setEnabled(false);
            jl_Desde1.setEnabled(false);

            jl_Desde2.setEnabled(false);
            tblDatoHornoAutosustentable.clearSelection();
            tblDatoHornoAutosustentable2.clearSelection();
            idHornoCalc1 = -1;
            idHornoCalc2 = -1;

        } else if (rbComparVariosHornos.isSelected()) {
            tblDatoHornoAutosustentable.setEnabled(true);
            tblDatoHornoAutosustentable2.setEnabled(true);
            jl_Desde1.setEnabled(true);
            jl_Desde2.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoHornos = new javax.swing.ButtonGroup();
        GrupoMantenimiento = new javax.swing.ButtonGroup();
        GrupoAutosustentabilidad = new javax.swing.ButtonGroup();
        GrupoFunciones = new javax.swing.ButtonGroup();
        GrupoModoAutosustentable = new javax.swing.ButtonGroup();
        GrupoMetodoCompararAutoHorno = new javax.swing.ButtonGroup();
        GrupoMetodoCalculoAutoHorno = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        lblMantenimiento = new javax.swing.JLabel();
        lblHorno = new javax.swing.JLabel();
        lblFuncionamiento = new javax.swing.JLabel();
        lblAmbiente = new javax.swing.JLabel();
        lblAutosustentable = new javax.swing.JLabel();
        jPanelHornosSolares = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txb_materiales = new javax.swing.JTextArea();
        cb_sisAislamiento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDatoHorno = new javax.swing.JTable();
        txb_tipo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txb_dimensiones = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Jd_fechaHorno = new com.toedter.calendar.JDateChooser();
        txb_reflectores = new javax.swing.JTextField();
        btn_IngresarHornos = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        rbPorFechaHornos = new javax.swing.JRadioButton();
        rbPorBusquedaHornos = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        Jd_FechaFinal = new com.toedter.calendar.JDateChooser();
        Jd_fechaInicioHornos = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txb_buscarHornos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_BuscarHorno = new javax.swing.JButton();
        btn_ResetearHorno = new javax.swing.JButton();
        txb_CantidadFilasHornos = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanelMantenimiento = new javax.swing.JPanel();
        txtIDMantenimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Jd_fechaMantenimiento = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatoReparados = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txb_detallesr = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txb_materialesr = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblDatoHornoMante = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        btn_IngresarMantenimiento = new javax.swing.JButton();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        rbPorFechaMantenimiento = new javax.swing.JRadioButton();
        rbPorBusquedaMantenimiento = new javax.swing.JRadioButton();
        jLabel64 = new javax.swing.JLabel();
        Jd_FechaFinalMantenimiento = new com.toedter.calendar.JDateChooser();
        Jd_fechaInicioMantenimiento = new com.toedter.calendar.JDateChooser();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txb_buscarMantenimiento = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        btn_BuscarMantenimiento = new javax.swing.JButton();
        btn_ResetearMantenimiento = new javax.swing.JButton();
        txb_CantidadFilasMantenimiento = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jPanelFuncionamiento = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btn_IngresarFuncionamiento = new javax.swing.JButton();
        txb_tiempoc = new com.toedter.calendar.JSpinnerDateEditor();
        js_temperaturai = new javax.swing.JSpinner();
        cb_tipodealimento = new javax.swing.JComboBox<>();
        cb_estadohorno = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        rbManual = new javax.swing.JRadioButton();
        rbAutomatico = new javax.swing.JRadioButton();
        js_Hora = new com.toedter.calendar.JSpinnerDateEditor();
        jLabel36 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jb_fechaoperacion = new com.toedter.calendar.JDateChooser();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblHornoFuncionamiento = new javax.swing.JTable();
        txtIDFuncionamiento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDatoFuncionamiento = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        rbPorFechaFunciones = new javax.swing.JRadioButton();
        rbPorBusquedaFunciones = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        Jd_FechaFinalFuncionamiento = new com.toedter.calendar.JDateChooser();
        Jd_fechaInicioFuncionamiento = new com.toedter.calendar.JDateChooser();
        jLabel57 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txb_buscarFuncionamiento = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        btn_BuscarFuncionamiento = new javax.swing.JButton();
        btn_ResetearBusquedaFuncionamiento = new javax.swing.JButton();
        txb_CantidadFilasFunciones = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanelAutosustentable = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btn_IngresarAutosustentable = new javax.swing.JButton();
        js_EficienciaEnergetica = new javax.swing.JSpinner();
        jLabel47 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txb_consumoe = new javax.swing.JTextField();
        txb_energiaalmacenada = new javax.swing.JTextField();
        Jd_fechaAutosustentable = new com.toedter.calendar.JDateChooser();
        cb_EnergiaRecibida = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblDatoFuncionAutosustentable = new javax.swing.JTable();
        txtIDAutosustentable = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDatoAutosustentable = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        JP_AutoP1 = new javax.swing.JDesktopPane();
        rbPorFechaAutosustentabilidad = new javax.swing.JRadioButton();
        jl_CantFilas = new javax.swing.JLabel();
        Jd_FechaFinalAutosustentable = new com.toedter.calendar.JDateChooser();
        Jd_fechaInicioAutosustentable = new com.toedter.calendar.JDateChooser();
        jl_Desde = new javax.swing.JLabel();
        jlBuscar = new javax.swing.JLabel();
        txb_buscarAutosustentable = new javax.swing.JTextField();
        txb_CantidadFilasAutosustentable = new javax.swing.JTextField();
        rbPorBusquedaAutosustentabilidad = new javax.swing.JRadioButton();
        btn_BuscarAutosustentable = new javax.swing.JButton();
        btn_ResetearAutosustentable = new javax.swing.JButton();
        jl_Hasta = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        cb_AnalisisDesempeño = new javax.swing.JCheckBox();
        jLabel74 = new javax.swing.JLabel();
        jlBuscar1 = new javax.swing.JLabel();
        JP_AutoP2 = new javax.swing.JDesktopPane();
        btn_EstadisticasGenerales = new javax.swing.JButton();
        jl_CalcularEstadisticas = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblDatoHornoAutosustentable2 = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblDatoHornoAutosustentable = new javax.swing.JTable();
        jl_Desde1 = new javax.swing.JLabel();
        jl_Desde2 = new javax.swing.JLabel();
        rbCompararTodoslosHornos = new javax.swing.JRadioButton();
        rbComparVariosHornos = new javax.swing.JRadioButton();
        jLabel76 = new javax.swing.JLabel();
        btn_ResetearCalculoAuto = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        rbCalcularMinimo = new javax.swing.JRadioButton();
        rbCalcularPromedio = new javax.swing.JRadioButton();
        rbCalcularMaximo = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        rb_Calculos = new javax.swing.JRadioButton();
        rb_ConsultaDatos = new javax.swing.JRadioButton();
        jLabel75 = new javax.swing.JLabel();
        jPanelAmbiente = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        btn_IngresarAmbiente = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txb_direccion = new javax.swing.JComboBox<>();
        txb_angulo = new javax.swing.JSpinner();
        jLabel59 = new javax.swing.JLabel();
        txb_temperatura = new javax.swing.JSpinner();
        txb_intensidadsolar = new javax.swing.JComboBox<>();
        Jd_fechaAmbiente = new com.toedter.calendar.JDateChooser();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblDatHornoAmbiente = new javax.swing.JTable();
        txtIDAmbiente = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblDatoAmbiente = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel29 = new javax.swing.JLabel();
        Jd_FechaFinalAmbiente = new com.toedter.calendar.JDateChooser();
        Jd_fechaDesdeAmbiente = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        btn_BuscarAmbiente = new javax.swing.JButton();
        btn_ResetearAmbiente = new javax.swing.JButton();
        txb_CantidadFilasAmbiente = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jPanelFondo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMantenimiento.setBackground(new java.awt.Color(102, 102, 102));
        lblMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ix - maintenance-filled.png"))); // NOI18N
        lblMantenimiento.setText("Mantenimiento");
        lblMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMantenimientoMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(lblMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 186, 58));

        lblHorno.setBackground(new java.awt.Color(102, 102, 102));
        lblHorno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHorno.setForeground(new java.awt.Color(255, 255, 255));
        lblHorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ph - oven-fill.png"))); // NOI18N
        lblHorno.setText("Horno");
        lblHorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHornoMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(lblHorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 186, 58));

        lblFuncionamiento.setBackground(new java.awt.Color(102, 102, 102));
        lblFuncionamiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFuncionamiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFuncionamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lsicon - operation-filled.png"))); // NOI18N
        lblFuncionamiento.setText("Funcionamiento");
        lblFuncionamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncionamientoMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(lblFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 186, 58));

        lblAmbiente.setBackground(new java.awt.Color(102, 102, 102));
        lblAmbiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAmbiente.setForeground(new java.awt.Color(255, 255, 255));
        lblAmbiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tdesign - undertake-environment-protection-filled.png"))); // NOI18N
        lblAmbiente.setText("Ambiente");
        lblAmbiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAmbienteMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(lblAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 186, 58));

        lblAutosustentable.setBackground(new java.awt.Color(102, 102, 102));
        lblAutosustentable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAutosustentable.setForeground(new java.awt.Color(255, 255, 255));
        lblAutosustentable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carbon - sustainability.png"))); // NOI18N
        lblAutosustentable.setText("Autosustentable");
        lblAutosustentable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAutosustentableMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(lblAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 180, 58));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 510));

        jPanelHornosSolares.setBackground(new java.awt.Color(102, 102, 102));
        jPanelHornosSolares.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fecha creacion");
        jPanelHornosSolares.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Sistema de aislamiento");
        jPanelHornosSolares.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        txb_materiales.setColumns(20);
        txb_materiales.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        txb_materiales.setLineWrap(true);
        txb_materiales.setRows(5);
        txb_materiales.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txb_materiales);

        jPanelHornosSolares.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 156, 65));

        cb_sisAislamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Aislamiento por material", "Doble cubierta transparente", "Sellado hermético", "Aislamiento reflectante" }));
        cb_sisAislamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sisAislamientoActionPerformed(evt);
            }
        });
        jPanelHornosSolares.add(cb_sisAislamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 153, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingreso de los Hornos Solares");
        jPanelHornosSolares.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        tblDatoHorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoHornoMouseClicked(evt);
            }
        });
        tblDatoHorno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDatoHornoKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblDatoHorno);

        jPanelHornosSolares.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 630, 200));

        txb_tipo.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        txb_tipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txb_tipoFocusGained(evt);
            }
        });
        txb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txb_tipoActionPerformed(evt);
            }
        });
        jPanelHornosSolares.add(txb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 129, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tipo");
        jPanelHornosSolares.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Materiales");
        jPanelHornosSolares.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txb_dimensiones.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        txb_dimensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txb_dimensionesActionPerformed(evt);
            }
        });
        jPanelHornosSolares.add(txb_dimensiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 129, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Dimensiones");
        jPanelHornosSolares.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        Jd_fechaHorno.setDateFormatString("yyyy-MM-dd");
        jPanelHornosSolares.add(Jd_fechaHorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 153, 46));

        txb_reflectores.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jPanelHornosSolares.add(txb_reflectores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 133, 153, 30));

        btn_IngresarHornos.setBackground(new java.awt.Color(51, 153, 0));
        btn_IngresarHornos.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_IngresarHornos.setForeground(new java.awt.Color(255, 255, 255));
        btn_IngresarHornos.setText("Ingresar");
        btn_IngresarHornos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_IngresarHornos.setBorderPainted(false);
        btn_IngresarHornos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarHornosActionPerformed(evt);
            }
        });
        jPanelHornosSolares.add(btn_IngresarHornos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 300, 60));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Reflectores");
        jPanelHornosSolares.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jDesktopPane2.setBackground(new java.awt.Color(71, 76, 86));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrupoHornos.add(rbPorFechaHornos);
        rbPorFechaHornos.setForeground(new java.awt.Color(255, 255, 255));
        rbPorFechaHornos.setSelected(true);
        rbPorFechaHornos.setText("Por fechas (Inicio/Fin)");
        rbPorFechaHornos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPorFechaHornosActionPerformed(evt);
            }
        });
        jDesktopPane2.setLayer(rbPorFechaHornos, javax.swing.JLayeredPane.DRAG_LAYER);
        jDesktopPane2.add(rbPorFechaHornos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, 20));

        GrupoHornos.add(rbPorBusquedaHornos);
        rbPorBusquedaHornos.setForeground(new java.awt.Color(255, 255, 255));
        rbPorBusquedaHornos.setText("Por busqueda");
        rbPorBusquedaHornos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPorBusquedaHornosActionPerformed(evt);
            }
        });
        jDesktopPane2.add(rbPorBusquedaHornos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 20));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cantidad de filas");
        jDesktopPane2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 20));

        Jd_FechaFinal.setDateFormatString("yyyy-MM-dd");
        jDesktopPane2.add(Jd_FechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 153, 30));

        Jd_fechaInicioHornos.setDateFormatString("yyyy-MM-dd");
        jDesktopPane2.add(Jd_fechaInicioHornos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 153, 30));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Fecha desde");
        jDesktopPane2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 20));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Buscar hornos:");
        jDesktopPane2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 30));

        txb_buscarHornos.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jDesktopPane2.add(txb_buscarHornos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 450, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Metodo de busqueda:");
        jDesktopPane2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 20));

        btn_BuscarHorno.setBackground(new java.awt.Color(56, 60, 68));
        btn_BuscarHorno.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_BuscarHorno.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarHorno.setText("Buscar");
        btn_BuscarHorno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_BuscarHorno.setBorderPainted(false);
        btn_BuscarHorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarHornoActionPerformed(evt);
            }
        });
        jDesktopPane2.add(btn_BuscarHorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 40));

        btn_ResetearHorno.setBackground(new java.awt.Color(56, 60, 68));
        btn_ResetearHorno.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_ResetearHorno.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetearHorno.setText("Resetear");
        btn_ResetearHorno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ResetearHorno.setBorderPainted(false);
        btn_ResetearHorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetearHornoActionPerformed(evt);
            }
        });
        jDesktopPane2.add(btn_ResetearHorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 190, 40));

        txb_CantidadFilasHornos.setEditable(false);
        jDesktopPane2.add(txb_CantidadFilasHornos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 110, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Fecha hasta");
        jDesktopPane2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, 20));

        jPanelHornosSolares.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 630, 200));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lista de hornos ingresados");
        jPanelHornosSolares.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        getContentPane().add(jPanelHornosSolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1130, 510));

        jPanelMantenimiento.setBackground(new java.awt.Color(91, 91, 91));
        jPanelMantenimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelMantenimiento.add(txtIDMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 150, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lista de hornos en reparación / reparados");
        jPanelMantenimiento.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 420, 30));

        Jd_fechaMantenimiento.setDateFormatString("yyyy-MM-dd");
        jPanelMantenimiento.add(Jd_fechaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 150, 33));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Detalles de la Reparacion");
        jPanelMantenimiento.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 230, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Materiales Remplazados");
        jPanelMantenimiento.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento de los hornos");
        jPanelMantenimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Fecha creacion");
        jPanelMantenimiento.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, -1));

        tblDatoReparados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatoReparados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoReparadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDatoReparados);

        jPanelMantenimiento.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 610, 200));

        txb_detallesr.setColumns(20);
        txb_detallesr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txb_detallesr.setRows(5);
        jScrollPane1.setViewportView(txb_detallesr);

        jPanelMantenimiento.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 190, 100));

        txb_materialesr.setColumns(20);
        txb_materialesr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txb_materialesr.setRows(5);
        jScrollPane2.setViewportView(txb_materialesr);

        jPanelMantenimiento.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 100));

        tblDatoHornoMante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoHornoManteMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tblDatoHornoMante);

        jPanelMantenimiento.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 150, 60));

        jLabel31.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Lista de hornos ingresados");
        jPanelMantenimiento.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 280, -1));

        btn_IngresarMantenimiento.setBackground(new java.awt.Color(51, 153, 0));
        btn_IngresarMantenimiento.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_IngresarMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        btn_IngresarMantenimiento.setText("Ingresar");
        btn_IngresarMantenimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_IngresarMantenimiento.setBorderPainted(false);
        btn_IngresarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarMantenimientoActionPerformed(evt);
            }
        });
        jPanelMantenimiento.add(btn_IngresarMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 330, -1));

        jDesktopPane5.setBackground(new java.awt.Color(213, 167, 99));
        jDesktopPane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrupoMantenimiento.add(rbPorFechaMantenimiento);
        rbPorFechaMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        rbPorFechaMantenimiento.setSelected(true);
        rbPorFechaMantenimiento.setText("Por fechas (Desde/Hasta)");
        rbPorFechaMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPorFechaMantenimientoActionPerformed(evt);
            }
        });
        jDesktopPane5.add(rbPorFechaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, 20));

        GrupoMantenimiento.add(rbPorBusquedaMantenimiento);
        rbPorBusquedaMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        rbPorBusquedaMantenimiento.setText("Por busqueda");
        rbPorBusquedaMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPorBusquedaMantenimientoActionPerformed(evt);
            }
        });
        jDesktopPane5.add(rbPorBusquedaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 20));

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Cantidad de filas");
        jDesktopPane5.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 20));

        Jd_FechaFinalMantenimiento.setDateFormatString("yyyy-MM-dd");
        jDesktopPane5.add(Jd_FechaFinalMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 153, 30));

        Jd_fechaInicioMantenimiento.setDateFormatString("yyyy-MM-dd");
        jDesktopPane5.add(Jd_fechaInicioMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 153, 30));

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Fecha desde");
        jDesktopPane5.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 20));

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Buscar hornos:");
        jDesktopPane5.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 30));

        txb_buscarMantenimiento.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jDesktopPane5.add(txb_buscarMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 440, 30));

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Metodo de busqueda:");
        jDesktopPane5.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 20));

        btn_BuscarMantenimiento.setBackground(new java.awt.Color(182, 149, 98));
        btn_BuscarMantenimiento.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_BuscarMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarMantenimiento.setText("Buscar");
        btn_BuscarMantenimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_BuscarMantenimiento.setBorderPainted(false);
        btn_BuscarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarMantenimientoActionPerformed(evt);
            }
        });
        jDesktopPane5.add(btn_BuscarMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 40));

        btn_ResetearMantenimiento.setBackground(new java.awt.Color(182, 149, 98));
        btn_ResetearMantenimiento.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_ResetearMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetearMantenimiento.setText("Resetear");
        btn_ResetearMantenimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ResetearMantenimiento.setBorderPainted(false);
        btn_ResetearMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetearMantenimientoActionPerformed(evt);
            }
        });
        jDesktopPane5.add(btn_ResetearMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 180, 40));

        txb_CantidadFilasMantenimiento.setEditable(false);
        jDesktopPane5.add(txb_CantidadFilasMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 110, -1));

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Fecha hasta");
        jDesktopPane5.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, 20));

        jPanelMantenimiento.add(jDesktopPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 610, 200));

        getContentPane().add(jPanelMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1130, 510));

        jPanelFuncionamiento.setBackground(new java.awt.Color(102, 102, 102));
        jPanelFuncionamiento.setForeground(new java.awt.Color(255, 255, 255));
        jPanelFuncionamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Funcionamiento del Horno");
        jPanelFuncionamiento.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Temperatura Interna");
        jPanelFuncionamiento.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Datos operación");
        jPanelFuncionamiento.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        btn_IngresarFuncionamiento.setBackground(new java.awt.Color(51, 153, 0));
        btn_IngresarFuncionamiento.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_IngresarFuncionamiento.setForeground(new java.awt.Color(255, 255, 255));
        btn_IngresarFuncionamiento.setText("Ingresar");
        btn_IngresarFuncionamiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_IngresarFuncionamiento.setBorderPainted(false);
        btn_IngresarFuncionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarFuncionamientoActionPerformed(evt);
            }
        });
        jPanelFuncionamiento.add(btn_IngresarFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 280, 63));

        txb_tiempoc.setDateFormatString("HH:mm:ss");
        txb_tiempoc.setEditor(new javax.swing.JSpinner.DateEditor(txb_tiempoc, "HH:mm:ss"));
        txb_tiempoc.setMaxSelectableDate(new java.util.Date(253370861999000L));
        txb_tiempoc.setMinSelectableDate(new java.util.Date(-62135758800000L));
        jPanelFuncionamiento.add(txb_tiempoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 100, 39));

        js_temperaturai.setModel(new javax.swing.SpinnerNumberModel(0, 0, 360, 1));
        js_temperaturai.setName(""); // NOI18N
        jPanelFuncionamiento.add(js_temperaturai, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 97, 36));

        cb_tipodealimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Carnes y Aves", "Pescados y Verduras", "Panadería y", "Repostería", "Pastas", "Arroces y Guisos", "Otros" }));
        jPanelFuncionamiento.add(cb_tipodealimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 109, 40));

        cb_estadohorno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Buen Estado", "Estado Decente", "Estado Regular", "Estado mal", "Estado para reparar" }));
        jPanelFuncionamiento.add(cb_estadohorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 99, 40));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Estado del Horno");
        jPanelFuncionamiento.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo de Alimento");
        jPanelFuncionamiento.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jDesktopPane1.setBackground(new java.awt.Color(89, 49, 49));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbManual.setForeground(new java.awt.Color(255, 255, 255));
        rbManual.setText("Ingreso manual de fechas");
        rbManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManualActionPerformed(evt);
            }
        });
        jDesktopPane1.add(rbManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        rbAutomatico.setForeground(new java.awt.Color(255, 255, 255));
        rbAutomatico.setText("Ingreso automatico de fecha");
        rbAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAutomaticoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(rbAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 6, -1, -1));

        js_Hora.setDateFormatString("HH:mm:ss");
        js_Hora.setEditor(new javax.swing.JSpinner.DateEditor(js_Hora, "HH:mm:ss"));
        js_Hora.setMaxSelectableDate(new java.util.Date(253370861999000L));
        js_Hora.setMinSelectableDate(new java.util.Date(-62135758800000L));
        jDesktopPane1.add(js_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 61, 86, 30));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Fecha Operacion");
        jDesktopPane1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 33, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Hora de la Operacion");
        jDesktopPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 33, -1, -1));

        jb_fechaoperacion.setDateFormatString("yyyy-MM-dd");
        jDesktopPane1.add(jb_fechaoperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 62, -1, 30));

        tblHornoFuncionamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblHornoFuncionamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHornoFuncionamientoMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tblHornoFuncionamiento);

        jDesktopPane1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 230, 60));

        txtIDFuncionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDFuncionamientoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtIDFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 40, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Lista de hornos ingresados");
        jDesktopPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanelFuncionamiento.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 380, 190));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Tiempo de Coccion");
        jPanelFuncionamiento.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        tblDatoFuncionamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoFuncionamientoMouseClicked(evt);
            }
        });
        tblDatoFuncionamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDatoFuncionamientoKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(tblDatoFuncionamiento);

        jPanelFuncionamiento.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 620, 220));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Tabla funcionamiento del horno ingresado ");
        jPanelFuncionamiento.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, 30));

        jDesktopPane4.setBackground(new java.awt.Color(89, 49, 49));
        jDesktopPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrupoFunciones.add(rbPorFechaFunciones);
        rbPorFechaFunciones.setForeground(new java.awt.Color(255, 255, 255));
        rbPorFechaFunciones.setSelected(true);
        rbPorFechaFunciones.setText("Por fechas (Desde/Hasta)");
        rbPorFechaFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPorFechaFuncionesActionPerformed(evt);
            }
        });
        jDesktopPane4.add(rbPorFechaFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, 20));

        GrupoFunciones.add(rbPorBusquedaFunciones);
        rbPorBusquedaFunciones.setForeground(new java.awt.Color(255, 255, 255));
        rbPorBusquedaFunciones.setText("Por busqueda");
        rbPorBusquedaFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPorBusquedaFuncionesActionPerformed(evt);
            }
        });
        jDesktopPane4.add(rbPorBusquedaFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 20));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Cantidad de filas");
        jDesktopPane4.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 20));

        Jd_FechaFinalFuncionamiento.setDateFormatString("yyyy-MM-dd");
        jDesktopPane4.add(Jd_FechaFinalFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 153, 30));

        Jd_fechaInicioFuncionamiento.setDateFormatString("yyyy-MM-dd");
        jDesktopPane4.add(Jd_fechaInicioFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 153, 30));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Fecha desde");
        jDesktopPane4.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 20));

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Buscar:");
        jDesktopPane4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        txb_buscarFuncionamiento.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jDesktopPane4.add(txb_buscarFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 500, 30));

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Metodo de busqueda:");
        jDesktopPane4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 20));

        btn_BuscarFuncionamiento.setBackground(new java.awt.Color(104, 56, 56));
        btn_BuscarFuncionamiento.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_BuscarFuncionamiento.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarFuncionamiento.setText("Buscar");
        btn_BuscarFuncionamiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_BuscarFuncionamiento.setBorderPainted(false);
        btn_BuscarFuncionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarFuncionamientoActionPerformed(evt);
            }
        });
        jDesktopPane4.add(btn_BuscarFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 40));

        btn_ResetearBusquedaFuncionamiento.setBackground(new java.awt.Color(104, 56, 56));
        btn_ResetearBusquedaFuncionamiento.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_ResetearBusquedaFuncionamiento.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetearBusquedaFuncionamiento.setText("Resetear");
        btn_ResetearBusquedaFuncionamiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ResetearBusquedaFuncionamiento.setBorderPainted(false);
        btn_ResetearBusquedaFuncionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetearBusquedaFuncionamientoActionPerformed(evt);
            }
        });
        jDesktopPane4.add(btn_ResetearBusquedaFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 190, 40));

        txb_CantidadFilasFunciones.setEditable(false);
        jDesktopPane4.add(txb_CantidadFilasFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 110, -1));

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Fecha hasta");
        jDesktopPane4.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, 20));

        jPanelFuncionamiento.add(jDesktopPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 620, 200));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("°C");
        jPanelFuncionamiento.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        getContentPane().add(jPanelFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1110, 510));

        jPanelAutosustentable.setBackground(new java.awt.Color(71, 71, 71));
        jPanelAutosustentable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Eficiencia Energetica");
        jPanelAutosustentable.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Consumo Energetico");
        jPanelAutosustentable.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("%");
        jPanelAutosustentable.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 10));

        btn_IngresarAutosustentable.setBackground(new java.awt.Color(51, 153, 0));
        btn_IngresarAutosustentable.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_IngresarAutosustentable.setForeground(new java.awt.Color(255, 255, 255));
        btn_IngresarAutosustentable.setText("Ingresar");
        btn_IngresarAutosustentable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_IngresarAutosustentable.setBorderPainted(false);
        btn_IngresarAutosustentable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarAutosustentableActionPerformed(evt);
            }
        });
        jPanelAutosustentable.add(btn_IngresarAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 280, 63));

        js_EficienciaEnergetica.setModel(new javax.swing.SpinnerNumberModel(0, 0, 360, 1));
        js_EficienciaEnergetica.setName(""); // NOI18N
        jPanelAutosustentable.add(js_EficienciaEnergetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 90, 30));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("w");
        jPanelAutosustentable.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, 20));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Autosustentabilidad del horno");
        jPanelAutosustentable.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 40));

        txb_consumoe.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txb_consumoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txb_consumoeActionPerformed(evt);
            }
        });
        jPanelAutosustentable.add(txb_consumoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, 30));

        txb_energiaalmacenada.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanelAutosustentable.add(txb_energiaalmacenada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 84, 30));

        Jd_fechaAutosustentable.setDateFormatString("yyyy-MM-dd");
        jPanelAutosustentable.add(Jd_fechaAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 130, 38));

        cb_EnergiaRecibida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Alta", "Media", "Baja" }));
        jPanelAutosustentable.add(cb_EnergiaRecibida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 119, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha creacion");
        jPanelAutosustentable.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("w");
        jPanelAutosustentable.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Energia Solar Recibida");
        jPanelAutosustentable.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Lista de funciones");
        jPanelAutosustentable.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        tblDatoFuncionAutosustentable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatoFuncionAutosustentable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoFuncionAutosustentableMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblDatoFuncionAutosustentable);

        jPanelAutosustentable.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 150, 70));
        jPanelAutosustentable.add(txtIDAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 150, -1));

        tblDatoAutosustentable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoAutosustentableMouseClicked(evt);
            }
        });
        tblDatoAutosustentable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDatoAutosustentableKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(tblDatoAutosustentable);

        jPanelAutosustentable.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 570, 170));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Energia Almacenada");
        jPanelAutosustentable.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        JP_AutoP1.setBackground(new java.awt.Color(71, 139, 93));
        JP_AutoP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrupoAutosustentabilidad.add(rbPorFechaAutosustentabilidad);
        rbPorFechaAutosustentabilidad.setForeground(new java.awt.Color(255, 255, 255));
        rbPorFechaAutosustentabilidad.setSelected(true);
        rbPorFechaAutosustentabilidad.setText("Por fechas (Desde/Hasta)");
        rbPorFechaAutosustentabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPorFechaAutosustentabilidadActionPerformed(evt);
            }
        });
        JP_AutoP1.add(rbPorFechaAutosustentabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jl_CantFilas.setBackground(new java.awt.Color(255, 255, 255));
        jl_CantFilas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_CantFilas.setForeground(new java.awt.Color(255, 255, 255));
        jl_CantFilas.setText("Cantidad de filas");
        JP_AutoP1.add(jl_CantFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 20));

        Jd_FechaFinalAutosustentable.setDateFormatString("yyyy-MM-dd");
        JP_AutoP1.add(Jd_FechaFinalAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 153, 30));

        Jd_fechaInicioAutosustentable.setDateFormatString("yyyy-MM-dd");
        JP_AutoP1.add(Jd_fechaInicioAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 153, 30));

        jl_Desde.setBackground(new java.awt.Color(255, 255, 255));
        jl_Desde.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Desde.setForeground(new java.awt.Color(255, 255, 255));
        jl_Desde.setText("Fecha desde");
        JP_AutoP1.add(jl_Desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 20));

        jlBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jlBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jlBuscar.setText("y por horno:");
        JP_AutoP1.add(jlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 30));

        txb_buscarAutosustentable.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        JP_AutoP1.add(txb_buscarAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 360, 30));

        txb_CantidadFilasAutosustentable.setEditable(false);
        JP_AutoP1.add(txb_CantidadFilasAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 110, -1));

        GrupoAutosustentabilidad.add(rbPorBusquedaAutosustentabilidad);
        rbPorBusquedaAutosustentabilidad.setForeground(new java.awt.Color(255, 255, 255));
        rbPorBusquedaAutosustentabilidad.setText("Por funcion");
        rbPorBusquedaAutosustentabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPorBusquedaAutosustentabilidadActionPerformed(evt);
            }
        });
        JP_AutoP1.add(rbPorBusquedaAutosustentabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        btn_BuscarAutosustentable.setBackground(new java.awt.Color(27, 109, 163));
        btn_BuscarAutosustentable.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_BuscarAutosustentable.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarAutosustentable.setText("Buscar");
        btn_BuscarAutosustentable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_BuscarAutosustentable.setBorderPainted(false);
        btn_BuscarAutosustentable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarAutosustentableActionPerformed(evt);
            }
        });
        JP_AutoP1.add(btn_BuscarAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 190, 40));

        btn_ResetearAutosustentable.setBackground(new java.awt.Color(27, 109, 163));
        btn_ResetearAutosustentable.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_ResetearAutosustentable.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetearAutosustentable.setText("Resetear");
        btn_ResetearAutosustentable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ResetearAutosustentable.setBorderPainted(false);
        btn_ResetearAutosustentable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetearAutosustentableActionPerformed(evt);
            }
        });
        JP_AutoP1.add(btn_ResetearAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 190, 40));

        jl_Hasta.setBackground(new java.awt.Color(255, 255, 255));
        jl_Hasta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Hasta.setForeground(new java.awt.Color(255, 255, 255));
        jl_Hasta.setText("Fecha hasta");
        JP_AutoP1.add(jl_Hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, 20));

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Metodo de busqueda:");
        JP_AutoP1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, 20));

        cb_AnalisisDesempeño.setForeground(new java.awt.Color(255, 255, 255));
        cb_AnalisisDesempeño.setText("Analisis de desempeño");
        cb_AnalisisDesempeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AnalisisDesempeñoActionPerformed(evt);
            }
        });
        JP_AutoP1.add(cb_AnalisisDesempeño, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 20));

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Vincular con Funciones");
        JP_AutoP1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 20));

        jlBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        jlBuscar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        jlBuscar1.setText("Buscar por Alimento");
        JP_AutoP1.add(jlBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 30));

        jPanelAutosustentable.add(JP_AutoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 570, 210));

        JP_AutoP2.setBackground(new java.awt.Color(41, 146, 75));
        JP_AutoP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_EstadisticasGenerales.setBackground(new java.awt.Color(27, 109, 163));
        btn_EstadisticasGenerales.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_EstadisticasGenerales.setForeground(new java.awt.Color(255, 255, 255));
        btn_EstadisticasGenerales.setText("Calcular");
        btn_EstadisticasGenerales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_EstadisticasGenerales.setBorderPainted(false);
        btn_EstadisticasGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstadisticasGeneralesActionPerformed(evt);
            }
        });
        JP_AutoP2.add(btn_EstadisticasGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, 40));

        jl_CalcularEstadisticas.setBackground(new java.awt.Color(255, 255, 255));
        jl_CalcularEstadisticas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_CalcularEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        jl_CalcularEstadisticas.setText("Calcular Estadísticas");
        JP_AutoP2.add(jl_CalcularEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 20));

        tblDatoHornoAutosustentable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoHornoAutosustentable2MouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tblDatoHornoAutosustentable2);

        JP_AutoP2.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 70));

        tblDatoHornoAutosustentable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoHornoAutosustentableMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(tblDatoHornoAutosustentable);

        JP_AutoP2.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 70));

        jl_Desde1.setBackground(new java.awt.Color(255, 255, 255));
        jl_Desde1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Desde1.setForeground(new java.awt.Color(255, 255, 255));
        jl_Desde1.setText("Segundo horno");
        JP_AutoP2.add(jl_Desde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 140, 30));

        jl_Desde2.setBackground(new java.awt.Color(255, 255, 255));
        jl_Desde2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_Desde2.setForeground(new java.awt.Color(255, 255, 255));
        jl_Desde2.setText("Primer horno");
        JP_AutoP2.add(jl_Desde2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 120, 30));

        GrupoMetodoCalculoAutoHorno.add(rbCompararTodoslosHornos);
        rbCompararTodoslosHornos.setForeground(new java.awt.Color(255, 255, 255));
        rbCompararTodoslosHornos.setText("Comparar todos los hornos");
        rbCompararTodoslosHornos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCompararTodoslosHornosActionPerformed(evt);
            }
        });
        JP_AutoP2.add(rbCompararTodoslosHornos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        GrupoMetodoCalculoAutoHorno.add(rbComparVariosHornos);
        rbComparVariosHornos.setForeground(new java.awt.Color(255, 255, 255));
        rbComparVariosHornos.setSelected(true);
        rbComparVariosHornos.setText("Comparar dos hornos");
        rbComparVariosHornos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbComparVariosHornosActionPerformed(evt);
            }
        });
        JP_AutoP2.add(rbComparVariosHornos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Metodo de comparación:");
        JP_AutoP2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        btn_ResetearCalculoAuto.setBackground(new java.awt.Color(27, 109, 163));
        btn_ResetearCalculoAuto.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_ResetearCalculoAuto.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetearCalculoAuto.setText("Resetear");
        btn_ResetearCalculoAuto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ResetearCalculoAuto.setBorderPainted(false);
        btn_ResetearCalculoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetearCalculoAutoActionPerformed(evt);
            }
        });
        JP_AutoP2.add(btn_ResetearCalculoAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 190, 40));

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Metodo de calculo:");
        JP_AutoP2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        GrupoMetodoCompararAutoHorno.add(rbCalcularMinimo);
        rbCalcularMinimo.setForeground(new java.awt.Color(255, 255, 255));
        rbCalcularMinimo.setText("Calcular Minimo");
        rbCalcularMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCalcularMinimoActionPerformed(evt);
            }
        });
        JP_AutoP2.add(rbCalcularMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        GrupoMetodoCompararAutoHorno.add(rbCalcularPromedio);
        rbCalcularPromedio.setForeground(new java.awt.Color(255, 255, 255));
        rbCalcularPromedio.setSelected(true);
        rbCalcularPromedio.setText("Calcular Promedio");
        rbCalcularPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCalcularPromedioActionPerformed(evt);
            }
        });
        JP_AutoP2.add(rbCalcularPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        GrupoMetodoCompararAutoHorno.add(rbCalcularMaximo);
        rbCalcularMaximo.setForeground(new java.awt.Color(255, 255, 255));
        rbCalcularMaximo.setText("Calcular  Maximo");
        rbCalcularMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCalcularMaximoActionPerformed(evt);
            }
        });
        JP_AutoP2.add(rbCalcularMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jPanelAutosustentable.add(JP_AutoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 570, 230));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Tabla autosustentable ingresado");
        jPanelAutosustentable.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        GrupoModoAutosustentable.add(rb_Calculos);
        rb_Calculos.setForeground(new java.awt.Color(255, 255, 255));
        rb_Calculos.setText("Cálculos y Estadísticas");
        rb_Calculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_CalculosActionPerformed(evt);
            }
        });
        jPanelAutosustentable.add(rb_Calculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, 20));

        GrupoModoAutosustentable.add(rb_ConsultaDatos);
        rb_ConsultaDatos.setForeground(new java.awt.Color(255, 255, 255));
        rb_ConsultaDatos.setSelected(true);
        rb_ConsultaDatos.setText("Consulta");
        rb_ConsultaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ConsultaDatosActionPerformed(evt);
            }
        });
        jPanelAutosustentable.add(rb_ConsultaDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, 20));

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Modo de Análisis");
        jPanelAutosustentable.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, 20));

        getContentPane().add(jPanelAutosustentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1110, 510));

        jPanelAmbiente.setBackground(new java.awt.Color(58, 58, 58));
        jPanelAmbiente.setForeground(new java.awt.Color(255, 255, 255));
        jPanelAmbiente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Lista de hornos");
        jPanelAmbiente.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        btn_IngresarAmbiente.setBackground(new java.awt.Color(51, 153, 0));
        btn_IngresarAmbiente.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_IngresarAmbiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_IngresarAmbiente.setText("Ingresar");
        btn_IngresarAmbiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_IngresarAmbiente.setBorderPainted(false);
        btn_IngresarAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarAmbienteActionPerformed(evt);
            }
        });
        jPanelAmbiente.add(btn_IngresarAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 280, 63));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Dirección del Sol");
        jPanelAmbiente.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Fecha creacion");
        jPanelAmbiente.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("°");
        jPanelAmbiente.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Intensidad Solar");
        jPanelAmbiente.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Angulo Solar");
        jPanelAmbiente.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Temperatura");
        jPanelAmbiente.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        txb_direccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Norte", "Sur", "Este", "Oeste" }));
        jPanelAmbiente.add(txb_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 130, 32));

        txb_angulo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 180, 1));
        txb_angulo.setName(""); // NOI18N
        jPanelAmbiente.add(txb_angulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("°C");
        jPanelAmbiente.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        txb_temperatura.setModel(new javax.swing.SpinnerNumberModel(0, -20, 60, 1));
        txb_temperatura.setName(""); // NOI18N
        jPanelAmbiente.add(txb_temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, 30));

        txb_intensidadsolar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Alta", "Media", "Baja" }));
        jPanelAmbiente.add(txb_intensidadsolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 140, 34));

        Jd_fechaAmbiente.setDateFormatString("yyyy-MM-dd");
        jPanelAmbiente.add(Jd_fechaAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, 40));

        tblDatHornoAmbiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatHornoAmbienteMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblDatHornoAmbiente);

        jPanelAmbiente.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 150, 70));
        jPanelAmbiente.add(txtIDAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 150, 20));

        jLabel60.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Ambiente del Horno");
        jPanelAmbiente.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 330, -1));

        tblDatoAmbiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatoAmbienteMouseClicked(evt);
            }
        });
        tblDatoAmbiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDatoAmbienteKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(tblDatoAmbiente);

        jPanelAmbiente.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 660, 180));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lista ambiente del horno ingresado");
        jPanelAmbiente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jDesktopPane3.setBackground(new java.awt.Color(144, 176, 150));
        jDesktopPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Cantidad de filas");
        jDesktopPane3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 150, 20));

        Jd_FechaFinalAmbiente.setDateFormatString("yyyy-MM-dd");
        jDesktopPane3.add(Jd_FechaFinalAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 190, 50));

        Jd_fechaDesdeAmbiente.setDateFormatString("yyyy-MM-dd");
        jDesktopPane3.add(Jd_fechaDesdeAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 50));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha desde");
        jDesktopPane3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 160, 50));

        btn_BuscarAmbiente.setBackground(new java.awt.Color(135, 157, 185));
        btn_BuscarAmbiente.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_BuscarAmbiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_BuscarAmbiente.setText("Buscar");
        btn_BuscarAmbiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_BuscarAmbiente.setBorderPainted(false);
        btn_BuscarAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarAmbienteActionPerformed(evt);
            }
        });
        jDesktopPane3.add(btn_BuscarAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 190, 40));

        btn_ResetearAmbiente.setBackground(new java.awt.Color(135, 157, 185));
        btn_ResetearAmbiente.setFont(new java.awt.Font("Gadugi", 1, 38)); // NOI18N
        btn_ResetearAmbiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_ResetearAmbiente.setText("Resetear");
        btn_ResetearAmbiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ResetearAmbiente.setBorderPainted(false);
        btn_ResetearAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetearAmbienteActionPerformed(evt);
            }
        });
        jDesktopPane3.add(btn_ResetearAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 200, 40));

        txb_CantidadFilasAmbiente.setEditable(false);
        jDesktopPane3.add(txb_CantidadFilasAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 110, -1));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Fecha hasta");
        jDesktopPane3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 120, 20));

        jPanelAmbiente.add(jDesktopPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 660, 210));

        getContentPane().add(jPanelAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1110, 510));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 510));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestion de hornos solares");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 410, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDatHornoAmbienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatHornoAmbienteMouseClicked
        int filaSeleccionada = tblDatHornoAmbiente.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblDatHornoAmbiente.getModel();
        Object idObjeto = modelo.getValueAt(filaSeleccionada, 0);
        txtIDAmbiente.setText(String.valueOf(idObjeto));
    }//GEN-LAST:event_tblDatHornoAmbienteMouseClicked

    private void btn_IngresarAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarAmbienteActionPerformed
        if (txtIDAmbiente.getText().trim().isEmpty()
                || txb_intensidadsolar.getSelectedIndex() <= 0
                || txb_direccion.getSelectedIndex() <= 0
                || Jd_fechaAmbiente.getDate() == null) {

            JOptionPane.showMessageDialog(this, "Error: Debe seleccionar un Horno, una fecha y completar los combos.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            try {
                ClaseConsulta INGA = new ClaseConsulta();
                ambiente a = new ambiente(
                        Integer.parseInt(txtIDAmbiente.getText()),
                        (String) txb_intensidadsolar.getSelectedItem(),
                        (int) txb_angulo.getValue(),
                        (int) txb_temperatura.getValue(),
                        (String) txb_direccion.getSelectedItem(),
                        new SimpleDateFormat("yyyy/MM/dd").format(Jd_fechaAmbiente.getDate())
                );
                INGA.IngAmbiente(a);
                tblDatoAmbiente.setModel(INGA.MostrarAmbiente());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e);
            }
        }
    }//GEN-LAST:event_btn_IngresarAmbienteActionPerformed

    private void txb_consumoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txb_consumoeActionPerformed
    }//GEN-LAST:event_txb_consumoeActionPerformed

    private void btn_IngresarAutosustentableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarAutosustentableActionPerformed
if (txtIDAutosustentable.getText().trim().isEmpty() ||
    txb_consumoe.getText().trim().isEmpty() ||
    txb_energiaalmacenada.getText().trim().isEmpty() ||
    cb_EnergiaRecibida.getSelectedIndex() <= 0 ||
    Jd_fechaAutosustentable.getDate() == null) {
    
    JOptionPane.showMessageDialog(this, "Error: Todos los campos de Autosustentable deben estar completos.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
    return; 
}else{
       cb_AnalisisDesempeño.setSelected(false);
        try {
            ClaseConsulta INAU = new ClaseConsulta();
            autosustentable au = new autosustentable(
                    Integer.parseInt(txtIDAutosustentable.getText()),
                    Integer.parseInt(txb_consumoe.getText()),
                    Integer.parseInt(txb_energiaalmacenada.getText()),
                    (String) cb_EnergiaRecibida.getSelectedItem(),
                    (int) js_EficienciaEnergetica.getValue(),
                    new SimpleDateFormat("yyyy/MM/dd").format(Jd_fechaAutosustentable.getDate())
            );
            INAU.IngresarAutosustentable(au);
            tblDatoAutosustentable.setModel(INAU.MostrarAutosustentable());
            txb_consumoe.setText(null);
            txb_energiaalmacenada.setText(null);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
}
     
    }//GEN-LAST:event_btn_IngresarAutosustentableActionPerformed

    private void rbAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAutomaticoActionPerformed
        if (rbAutomatico.isSelected()) {
            jb_fechaoperacion.setEnabled(false);
            js_Hora.setEnabled(false);
        }


    }//GEN-LAST:event_rbAutomaticoActionPerformed

    private void rbManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManualActionPerformed
        if (rbManual.isSelected()) {
            jb_fechaoperacion.setEnabled(true);
            js_Hora.setEnabled(true);
        }
    }//GEN-LAST:event_rbManualActionPerformed

    private void btn_IngresarFuncionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarFuncionamientoActionPerformed
        if (rbAutomatico.isSelected()) {
            if (txtIDFuncionamiento.getText().trim().isEmpty()
                    || cb_tipodealimento.getSelectedIndex() <= 0
                    || cb_estadohorno.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "Error: Debe seleccionar un Horno y completar los combos de alimento y estado.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
                return; 
            } else {
                String fechaOperacion;
                String horaOperacion;
                try {
                    ClaseConsulta INFU = new ClaseConsulta();
                    java.util.Date fechaActual = new java.util.Date();
                    fechaOperacion = new SimpleDateFormat("yyyy/MM/dd").format(fechaActual);
                    horaOperacion = new SimpleDateFormat("HH:mm:ss").format(fechaActual);
                    funciones f = new funciones(
                            Integer.parseInt(txtIDFuncionamiento.getText()),
                            (int) (js_temperaturai.getValue()),
                            new SimpleDateFormat("HH:mm:ss").format(txb_tiempoc.getValue()),
                            (String) cb_tipodealimento.getSelectedItem(),
                            (String) cb_estadohorno.getSelectedItem(),
                            fechaOperacion,
                            horaOperacion
                    );
                    INFU.InsertarFuncion(f);
                    tblDatoFuncionamiento.setModel(INFU.MostrarFuncionamiento());

                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                }
            }

        } else if (rbManual.isSelected()) {
            if (jb_fechaoperacion.getDate() == null || js_Hora.getValue() == null) {
                JOptionPane.showMessageDialog(this, "Error: En modo Manual, debe seleccionar fecha y hora de operación.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                try {
                    ClaseConsulta INFU = new ClaseConsulta();
                    funciones f = new funciones(
                            Integer.parseInt(txb_CantidadFilasFunciones.getText()),
                            (int) (js_temperaturai.getValue()),
                            new SimpleDateFormat("HH:mm:ss").format(txb_tiempoc.getValue()),
                            (String) cb_tipodealimento.getSelectedItem(),
                            (String) cb_estadohorno.getSelectedItem(),
                            new SimpleDateFormat("yyyy/MM/dd").format(jb_fechaoperacion.getDate()),
                            new SimpleDateFormat("HH:mm:ss").format(js_Hora.getValue())
                    );
                    INFU.InsertarFuncion(f);
                    tblDatoFuncionamiento.setModel(INFU.MostrarFuncionamiento());

                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                }
            }

        }
    }//GEN-LAST:event_btn_IngresarFuncionamientoActionPerformed

    private void tblDatoReparadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoReparadosMouseClicked

    }//GEN-LAST:event_tblDatoReparadosMouseClicked

    private void txb_dimensionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txb_dimensionesActionPerformed

    }//GEN-LAST:event_txb_dimensionesActionPerformed

    private void txb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txb_tipoActionPerformed

    }//GEN-LAST:event_txb_tipoActionPerformed

    private void txb_tipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txb_tipoFocusGained

    }//GEN-LAST:event_txb_tipoFocusGained

    private void tblDatoHornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoHornoMouseClicked
        int filaSeleccionada = tblDatoHorno.getSelectedRow();

        if (filaSeleccionada == -1) {
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tblDatoHorno.getModel();
        Object idObjeto = modelo.getValueAt(filaSeleccionada, 0);
        txtIDMantenimiento.setText(String.valueOf(idObjeto));

        if (evt.getClickCount() == 2) {

            try {
                int idh = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());
                String tipo = modelo.getValueAt(filaSeleccionada, 1).toString();
                String materiales = modelo.getValueAt(filaSeleccionada, 2).toString();
                String dimensiones = modelo.getValueAt(filaSeleccionada, 3).toString();
                String aislamiento = modelo.getValueAt(filaSeleccionada, 4).toString();
                int reflectores = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 5).toString());
                String fecha = modelo.getValueAt(filaSeleccionada, 6).toString();

                Modificar_Eliminar ventanaEditar = new Modificar_Eliminar(this, idh, tipo, materiales, dimensiones, aislamiento, reflectores, fecha);

                ventanaEditar.setVisible(true);
                ventanaEditar.setLocationRelativeTo(this);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al leer datos de la fila: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_tblDatoHornoMouseClicked

    private void btn_BuscarHornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarHornoActionPerformed
        ClaseConsulta miConsulta = new ClaseConsulta();
        DefaultTableModel modelo;
        if (rbPorFechaHornos.isSelected()) {
            try {
                if (Jd_fechaInicioHornos.getDate() == null || Jd_FechaFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar ambas fechas.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fechaDesde = sdf.format(Jd_fechaInicioHornos.getDate());
                String fechaHasta = sdf.format(Jd_FechaFinal.getDate());

                modelo = miConsulta.MostrarHornosPorFecha(fechaDesde, fechaHasta);
                tblDatoHorno.setModel(modelo);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al buscar por fecha: " + e.getMessage());
                return;
            }

        } else if (rbPorBusquedaHornos.isSelected()) {
            try {
                String textoBusqueda = txb_buscarHornos.getText();
                if (textoBusqueda.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe escribir un texto para buscar.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                modelo = miConsulta.MostrarHornosPorTipo(textoBusqueda);
                tblDatoHorno.setModel(modelo);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al buscar por texto: " + e.getMessage());
                return;
            }
        } else {
            modelo = miConsulta.MostrarHornos();
            tblDatoHorno.setModel(modelo);
        }

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasHornos.setText(String.valueOf(cantidad));
    }//GEN-LAST:event_btn_BuscarHornoActionPerformed

    private void lblMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenimientoMouseClicked
        jPanelHornosSolares.setVisible(false);
        jPanelMantenimiento.setVisible(true);
        jPanelFuncionamiento.setVisible(false);
        jPanelAmbiente.setVisible(false);
        jPanelAutosustentable.setVisible(false);
        ClaseConsulta misConsultas = new ClaseConsulta();
        tblDatoReparados.setModel(misConsultas.MostrarReparacion());
        tblDatoHornoMante.setModel(misConsultas.consultaHornos());

    }//GEN-LAST:event_lblMantenimientoMouseClicked

    private void lblHornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHornoMouseClicked
        jPanelHornosSolares.setVisible(true);
        jPanelMantenimiento.setVisible(false);
        jPanelFuncionamiento.setVisible(false);
        jPanelAmbiente.setVisible(false);
        jPanelAutosustentable.setVisible(false);
        ClaseConsulta misConsultas = new ClaseConsulta();
        tblDatoHorno.setModel(misConsultas.MostrarHornos());

    }//GEN-LAST:event_lblHornoMouseClicked

    private void lblFuncionamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionamientoMouseClicked
        jPanelHornosSolares.setVisible(false);
        jPanelMantenimiento.setVisible(false);
        jPanelFuncionamiento.setVisible(true);
        jPanelAmbiente.setVisible(false);
        jPanelAutosustentable.setVisible(false);
        ClaseConsulta misConsultas = new ClaseConsulta();
        tblHornoFuncionamiento.setModel(misConsultas.consultaHornos());
        tblDatoFuncionamiento.setModel(misConsultas.MostrarFuncionamiento());

    }//GEN-LAST:event_lblFuncionamientoMouseClicked

    private void lblAmbienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmbienteMouseClicked
        jPanelHornosSolares.setVisible(false);
        jPanelMantenimiento.setVisible(false);
        jPanelFuncionamiento.setVisible(false);
        jPanelAmbiente.setVisible(true);
        jPanelAutosustentable.setVisible(false);
        ClaseConsulta misConsultas = new ClaseConsulta();
        tblDatHornoAmbiente.setModel(misConsultas.consultaHornos());
        tblDatoAmbiente.setModel(misConsultas.MostrarAmbiente());

    }//GEN-LAST:event_lblAmbienteMouseClicked

    private void lblAutosustentableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAutosustentableMouseClicked
        jPanelHornosSolares.setVisible(false);
        jPanelMantenimiento.setVisible(false);
        jPanelFuncionamiento.setVisible(false);
        jPanelAmbiente.setVisible(false);
        jPanelAutosustentable.setVisible(true);
        ClaseConsulta misConsultas = new ClaseConsulta();
        tblDatoFuncionAutosustentable.setModel(misConsultas.consultaFuncion());
        tblDatoAutosustentable.setModel(misConsultas.MostrarAutosustentable());
        actualizarVisibilidadAutosustentable();
        JP_AutoP1.setVisible(true);
        JP_AutoP2.setVisible(false);
        cb_AnalisisDesempeño.setSelected(false);
        rbPorBusquedaAutosustentabilidad.setVisible(false);
        txb_buscarAutosustentable.setEnabled(false);
        rb_ConsultaDatos.setSelected(true);
        rb_Calculos.setSelected(false);
    }//GEN-LAST:event_lblAutosustentableMouseClicked

    private void tblDatoHornoManteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoHornoManteMouseClicked
        int filaSeleccionada = tblDatoHornoMante.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblDatoHornoMante.getModel();
        Object idObjeto = modelo.getValueAt(filaSeleccionada, 0);
        txtIDMantenimiento.setText(String.valueOf(idObjeto));

    }//GEN-LAST:event_tblDatoHornoManteMouseClicked

    private void tblDatoFuncionAutosustentableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoFuncionAutosustentableMouseClicked
        int filaSeleccionada = tblDatoFuncionAutosustentable.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblDatoFuncionAutosustentable.getModel();
        Object idObjeto = modelo.getValueAt(filaSeleccionada, 0);
        txtIDAutosustentable.setText(String.valueOf(idObjeto));

    }//GEN-LAST:event_tblDatoFuncionAutosustentableMouseClicked

    private void btn_IngresarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarMantenimientoActionPerformed
        if (txtIDMantenimiento.getText().trim().isEmpty()
                || txb_detallesr.getText().trim().isEmpty()
                || txb_materialesr.getText().trim().isEmpty()
                || Jd_fechaMantenimiento.getDate() == null) {

            JOptionPane.showMessageDialog(this, "Error: Debe seleccionar un Horno de la tabla y completar todos los campos.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            try {
                ClaseConsulta INGM = new ClaseConsulta();

                mantenimiento m = new mantenimiento(
                        Integer.parseInt(txtIDMantenimiento.getText()),
                        txb_detallesr.getText(),
                        txb_materialesr.getText(),
                        new SimpleDateFormat("yyyy-MM-dd").format(Jd_fechaMantenimiento.getDate())
                );
                INGM.InsertarMante(m);
                tblDatoReparados.setModel(INGM.MostrarReparacion());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "error: " + e);

            }
        }

    }//GEN-LAST:event_btn_IngresarMantenimientoActionPerformed

    private void tblDatoHornoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatoHornoKeyPressed
    }//GEN-LAST:event_tblDatoHornoKeyPressed

    private void btn_IngresarHornosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarHornosActionPerformed
        if (txb_tipo.getText().trim().isEmpty()
                || txb_materiales.getText().trim().isEmpty()
                || txb_dimensiones.getText().trim().isEmpty()
                || txb_reflectores.getText().trim().isEmpty()
                || Jd_fechaHorno.getDate() == null
                || cb_sisAislamiento.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Uno de los campos de textos está vacío");
            return;
        } else {
            try {
                ClaseConsulta INH = new ClaseConsulta();
                horno h = new horno(
                        Integer.parseInt(txb_reflectores.getText()),
                        txb_tipo.getText(),
                        txb_materiales.getText(),
                        (String) cb_sisAislamiento.getSelectedItem(),
                        new SimpleDateFormat("yyyy-MM-dd").format(Jd_fechaHorno.getDate()),
                        Double.parseDouble(txb_dimensiones.getText())
                );
                INH.registrarHorno(h);
                tblDatoHorno.setModel(INH.MostrarHornos());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "error: " + e);
            }
        }


    }//GEN-LAST:event_btn_IngresarHornosActionPerformed

    private void rbPorFechaHornosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPorFechaHornosActionPerformed
        Jd_FechaFinal.setEnabled(true);
        Jd_fechaInicioHornos.setEnabled(true);
        txb_buscarHornos.setEnabled(false);

    }//GEN-LAST:event_rbPorFechaHornosActionPerformed

    private void rbPorBusquedaHornosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPorBusquedaHornosActionPerformed
        Jd_FechaFinal.setEnabled(false);
        Jd_fechaInicioHornos.setEnabled(false);
        txb_buscarHornos.setEnabled(true);    }//GEN-LAST:event_rbPorBusquedaHornosActionPerformed

    private void btn_ResetearHornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetearHornoActionPerformed
        ClaseConsulta RH = new ClaseConsulta();
        DefaultTableModel modelo = RH.MostrarHornos();
        tblDatoHorno.setModel(modelo);

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasHornos.setText(String.valueOf(cantidad));

        Jd_fechaInicioHornos.setDate(null);
        Jd_FechaFinal.setDate(null);
        txb_buscarHornos.setText("");

        rbPorFechaHornos.setSelected(true);
        Jd_fechaInicioHornos.setEnabled(true);
        Jd_FechaFinal.setEnabled(true);
        txb_buscarHornos.setEnabled(false);

    }//GEN-LAST:event_btn_ResetearHornoActionPerformed

    private void tblDatoFuncionamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoFuncionamientoMouseClicked
    }//GEN-LAST:event_tblDatoFuncionamientoMouseClicked

    private void tblDatoFuncionamientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatoFuncionamientoKeyPressed
    }//GEN-LAST:event_tblDatoFuncionamientoKeyPressed

    private void tblDatoAutosustentableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoAutosustentableMouseClicked
    }//GEN-LAST:event_tblDatoAutosustentableMouseClicked

    private void tblDatoAutosustentableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatoAutosustentableKeyPressed
    }//GEN-LAST:event_tblDatoAutosustentableKeyPressed

    private void tblDatoAmbienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoAmbienteMouseClicked
    }//GEN-LAST:event_tblDatoAmbienteMouseClicked

    private void tblDatoAmbienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatoAmbienteKeyPressed
    }//GEN-LAST:event_tblDatoAmbienteKeyPressed

    private void btn_BuscarAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarAmbienteActionPerformed
        ClaseConsulta miConsulta = new ClaseConsulta();
        DefaultTableModel modelo;

        try {
            if (Jd_fechaDesdeAmbiente.getDate() == null || Jd_FechaFinalAmbiente.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar ambas fechas (Desde y Hasta).", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDesde = sdf.format(Jd_fechaDesdeAmbiente.getDate());
            String fechaHasta = sdf.format(Jd_FechaFinalAmbiente.getDate());

            modelo = miConsulta.MostrarAmbientePorFecha(fechaDesde, fechaHasta);
            tblDatoAmbiente.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar por fecha: " + e.getMessage());
            modelo = miConsulta.MostrarAmbiente();
            tblDatoAmbiente.setModel(modelo);
        }

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasAmbiente.setText(String.valueOf(cantidad));
    }//GEN-LAST:event_btn_BuscarAmbienteActionPerformed

    private void btn_ResetearAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetearAmbienteActionPerformed
        ClaseConsulta RA = new ClaseConsulta();

        DefaultTableModel modelo = RA.MostrarAmbiente();
        tblDatoAmbiente.setModel(modelo);

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasAmbiente.setText(String.valueOf(cantidad));

        Jd_fechaDesdeAmbiente.setDate(null);
        Jd_FechaFinalAmbiente.setDate(null);
    }//GEN-LAST:event_btn_ResetearAmbienteActionPerformed

    private void rbPorFechaFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPorFechaFuncionesActionPerformed
        Jd_FechaFinalFuncionamiento.setEnabled(true);
        Jd_fechaInicioFuncionamiento.setEnabled(true);
        txb_buscarFuncionamiento.setEnabled(false);    }//GEN-LAST:event_rbPorFechaFuncionesActionPerformed

    private void rbPorBusquedaFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPorBusquedaFuncionesActionPerformed
        Jd_FechaFinalFuncionamiento.setEnabled(false);
        Jd_fechaInicioFuncionamiento.setEnabled(false);
        txb_buscarFuncionamiento.setEnabled(true);    }//GEN-LAST:event_rbPorBusquedaFuncionesActionPerformed

    private void btn_BuscarFuncionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarFuncionamientoActionPerformed
        ClaseConsulta miConsulta = new ClaseConsulta();
        DefaultTableModel modelo;

        if (rbPorFechaFunciones.isSelected()) {
            try {
                if (Jd_fechaInicioFuncionamiento.getDate() == null || Jd_FechaFinalFuncionamiento.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar ambas fechas.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fechaDesde = sdf.format(Jd_fechaInicioFuncionamiento.getDate());
                String fechaHasta = sdf.format(Jd_FechaFinalFuncionamiento.getDate());

                modelo = miConsulta.MostrarFuncionamientoPorFecha(fechaDesde, fechaHasta);
                tblDatoFuncionamiento.setModel(modelo);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al buscar por fecha: " + e.getMessage());
                return;
            }

        } else if (rbPorBusquedaFunciones.isSelected()) {
            try {
                String textoBusqueda = txb_buscarFuncionamiento.getText();
                if (textoBusqueda.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe escribir un texto para buscar.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                modelo = miConsulta.MostrarFuncionamientoPorAlimento(textoBusqueda);
                tblDatoFuncionamiento.setModel(modelo);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al buscar por texto: " + e.getMessage());
                return;
            }
        } else {
            modelo = miConsulta.MostrarFuncionamiento();
            tblDatoFuncionamiento.setModel(modelo);
        }
        int cantidad = modelo.getRowCount();
        txb_CantidadFilasFunciones.setText(String.valueOf(cantidad));
    }//GEN-LAST:event_btn_BuscarFuncionamientoActionPerformed

    private void btn_ResetearBusquedaFuncionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetearBusquedaFuncionamientoActionPerformed
        ClaseConsulta RH = new ClaseConsulta();
        DefaultTableModel modelo = RH.MostrarFuncionamiento();
        tblDatoFuncionamiento.setModel(modelo);

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasFunciones.setText(String.valueOf(cantidad));

        Jd_fechaInicioFuncionamiento.setDate(null);
        Jd_FechaFinalFuncionamiento.setDate(null);
        txb_buscarFuncionamiento.setText("");

        rbPorFechaFunciones.setSelected(true);
        Jd_fechaInicioFuncionamiento.setEnabled(true);
        Jd_FechaFinalFuncionamiento.setEnabled(true);
    txb_buscarFuncionamiento.setEnabled(false);    }//GEN-LAST:event_btn_ResetearBusquedaFuncionamientoActionPerformed

    private void btn_BuscarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarMantenimientoActionPerformed
        ClaseConsulta miConsulta = new ClaseConsulta();
        DefaultTableModel modelo;

        if (rbPorFechaMantenimiento.isSelected()) {
            try {
                if (Jd_fechaInicioMantenimiento.getDate() == null || Jd_FechaFinalMantenimiento.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar ambas fechas.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fechaDesde = sdf.format(Jd_fechaInicioMantenimiento.getDate());
                String fechaHasta = sdf.format(Jd_FechaFinalMantenimiento.getDate());

                modelo = miConsulta.MostrarMantenimientoPorFecha(fechaDesde, fechaHasta);
                tblDatoReparados.setModel(modelo);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al buscar por fecha: " + e.getMessage());
                return;
            }

        } else if (rbPorBusquedaMantenimiento.isSelected()) {
            try {
                String textoBusqueda = txb_buscarMantenimiento.getText();
                if (textoBusqueda.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe escribir un texto para buscar.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                modelo = miConsulta.MostrarMantenimientoPorDetalle(textoBusqueda);
                tblDatoReparados.setModel(modelo);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al buscar por texto: " + e.getMessage());
                return;
            }
        } else {
            modelo = miConsulta.MostrarReparacion();
            tblDatoReparados.setModel(modelo);
        }

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasMantenimiento.setText(String.valueOf(cantidad));

    }//GEN-LAST:event_btn_BuscarMantenimientoActionPerformed

    private void rbPorFechaMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPorFechaMantenimientoActionPerformed
        Jd_FechaFinalMantenimiento.setEnabled(true);
        Jd_fechaInicioMantenimiento.setEnabled(true);
        txb_buscarMantenimiento.setEnabled(false);
    }//GEN-LAST:event_rbPorFechaMantenimientoActionPerformed

    private void btn_ResetearMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetearMantenimientoActionPerformed
        ClaseConsulta RH = new ClaseConsulta();
        DefaultTableModel modelo = RH.MostrarReparacion();
        tblDatoReparados.setModel(modelo);

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasMantenimiento.setText(String.valueOf(cantidad));

        Jd_fechaInicioMantenimiento.setDate(null);
        Jd_FechaFinalMantenimiento.setDate(null);
        txb_buscarMantenimiento.setText("");

        rbPorFechaMantenimiento.setSelected(true);
        Jd_fechaInicioMantenimiento.setEnabled(true);
        Jd_FechaFinalMantenimiento.setEnabled(true);
        txb_buscarMantenimiento.setEnabled(false);
    }//GEN-LAST:event_btn_ResetearMantenimientoActionPerformed

    private void rbPorBusquedaMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPorBusquedaMantenimientoActionPerformed
        actualizarVisibilidadAutosustentable();
    }//GEN-LAST:event_rbPorBusquedaMantenimientoActionPerformed

    private void rbPorFechaAutosustentabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPorFechaAutosustentabilidadActionPerformed
        actualizarVisibilidadAutosustentable();
    }//GEN-LAST:event_rbPorFechaAutosustentabilidadActionPerformed

    private void txtIDFuncionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDFuncionamientoActionPerformed
    }//GEN-LAST:event_txtIDFuncionamientoActionPerformed

    private void tblHornoFuncionamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHornoFuncionamientoMouseClicked
        int filaSeleccionada = tblHornoFuncionamiento.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblHornoFuncionamiento.getModel();
        Object idObjeto = modelo.getValueAt(filaSeleccionada, 0);
        txtIDFuncionamiento.setText(String.valueOf(idObjeto));
    }//GEN-LAST:event_tblHornoFuncionamientoMouseClicked

    private void rbPorBusquedaAutosustentabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPorBusquedaAutosustentabilidadActionPerformed
        if (cb_AnalisisDesempeño.isSelected()) {
            rbPorBusquedaAutosustentabilidad.setVisible(true);
            txb_buscarAutosustentable.setVisible(true);
            actualizarVisibilidadAutosustentable();
        } else {
            actualizarVisibilidadAutosustentable();
        }


    }//GEN-LAST:event_rbPorBusquedaAutosustentabilidadActionPerformed

    private void btn_BuscarAutosustentableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarAutosustentableActionPerformed
        ClaseConsulta miConsulta = new ClaseConsulta();
        DefaultTableModel modelo;

        String busqueda = txb_buscarAutosustentable.getText().trim();
        java.util.Date fechaDesdeUtil = Jd_fechaInicioAutosustentable.getDate();
        java.util.Date fechaHastaUtil = Jd_FechaFinalAutosustentable.getDate();

        try {
            if (cb_AnalisisDesempeño.isSelected()) {

                if (rbPorFechaAutosustentabilidad.isSelected()) {
                    if (fechaDesdeUtil == null || fechaHastaUtil == null) {
                        JOptionPane.showMessageDialog(this, "Debe seleccionar ambas fechas.");
                        return;
                    }
                    String fechaDesde = new SimpleDateFormat("yyyy-MM-dd").format(fechaDesdeUtil);
                    String fechaHasta = new SimpleDateFormat("yyyy-MM-dd").format(fechaHastaUtil);
                    modelo = miConsulta.MostrarAutosustentablePorFecha_JOIN_Funcion(fechaDesde, fechaHasta);

                } else {
                    if (busqueda.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Debe escribir un texto para buscar.");
                        return;
                    }
                    modelo = miConsulta.MostrarAutosustentablePorBusqueda_JOIN_Funcion(busqueda);
                }

            } else {
                if (fechaDesdeUtil == null || fechaHastaUtil == null) {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar ambas fechas.");
                    return;
                }
                String fechaDesde = new SimpleDateFormat("yyyy-MM-dd").format(fechaDesdeUtil);
                String fechaHasta = new SimpleDateFormat("yyyy-MM-dd").format(fechaHastaUtil);

                modelo = miConsulta.MostrarAutosustentablePorFecha(fechaDesde, fechaHasta);
            }

            tblDatoAutosustentable.setModel(modelo);

            int cantidad = modelo.getRowCount();
            txb_CantidadFilasAutosustentable.setText(String.valueOf(cantidad));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_BuscarAutosustentableActionPerformed

    private void btn_ResetearAutosustentableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetearAutosustentableActionPerformed
        ClaseConsulta RA = new ClaseConsulta();
        DefaultTableModel modelo = RA.MostrarAutosustentable();
        tblDatoAutosustentable.setModel(modelo);

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasAutosustentable.setText(String.valueOf(cantidad));

        Jd_fechaInicioAutosustentable.setDate(null);
        Jd_FechaFinalAutosustentable.setDate(null);
        txb_buscarAutosustentable.setText("");
        cb_AnalisisDesempeño.setSelected(false);
        rbPorFechaAutosustentabilidad.setSelected(true);
        Jd_fechaInicioAutosustentable.setEnabled(true);
        Jd_FechaFinalAutosustentable.setEnabled(true);
        rbPorBusquedaAutosustentabilidad.setVisible(false);
        txb_buscarAutosustentable.setEnabled(false);
    }//GEN-LAST:event_btn_ResetearAutosustentableActionPerformed

    private void btn_EstadisticasGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EstadisticasGeneralesActionPerformed
        ClaseConsulta miConsulta = new ClaseConsulta();
        String funcionSQL = "";
        String funcionNombre = "";
        double resultado = 0.0;

        if (rbCalcularPromedio.isSelected()) {
            funcionSQL = "AVG";
            funcionNombre = "Promedio";
        } else if (rbCalcularMaximo.isSelected()) {
            funcionSQL = "MAX";
            funcionNombre = "Máximo";
        } else if (rbCalcularMinimo.isSelected()) {
            funcionSQL = "MIN";
            funcionNombre = "Mínimo";
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de cálculo (Promedio, Máximo o Mínimo).", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            if (rbCompararTodoslosHornos.isSelected()) {

                resultado = miConsulta.calcularEstadisticaGlobal(funcionSQL);
                JOptionPane.showMessageDialog(this,
                        "El " + funcionNombre + " de eficiencia térmica (Todos los hornos) es: " + String.format("%.2f", resultado),
                        "Resultado Global",
                        JOptionPane.INFORMATION_MESSAGE);

            } else if (rbComparVariosHornos.isSelected()) {
                if (idHornoCalc1 == -1 || idHornoCalc2 == -1) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un horno de cada tabla para comparar.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                resultado = miConsulta.calcularEstadisticaDosHornos(funcionSQL, idHornoCalc1, idHornoCalc2);
                JOptionPane.showMessageDialog(this,
                        "El " + funcionNombre + " de eficiencia térmica (Hornos ID " + idHornoCalc1 + " y " + idHornoCalc2 + ") es: " + String.format("%.2f", resultado),
                        "Resultado Comparativo",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un método de comparación (Todos o Dos hornos).", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al calcular la estadística: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_EstadisticasGeneralesActionPerformed

    private void cb_sisAislamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sisAislamientoActionPerformed
    }//GEN-LAST:event_cb_sisAislamientoActionPerformed

    private void cb_AnalisisDesempeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_AnalisisDesempeñoActionPerformed
        ClaseConsulta miConsulta = new ClaseConsulta();
        DefaultTableModel modelo;

        if (cb_AnalisisDesempeño.isSelected()) {
            rbPorBusquedaAutosustentabilidad.setEnabled(true);
            rbPorBusquedaAutosustentabilidad.setVisible(true);

            modelo = miConsulta.MostrarAutosustentable_JOIN_Funcion();
            tblDatoAutosustentable.setModel(modelo);

        } else {

            rbPorBusquedaAutosustentabilidad.setEnabled(false);
            rbPorBusquedaAutosustentabilidad.setVisible(false);

            rbPorFechaAutosustentabilidad.setSelected(true);
            modelo = miConsulta.MostrarAutosustentable();
            tblDatoAutosustentable.setModel(modelo);
        }

        actualizarVisibilidadAutosustentable();

        int cantidad = modelo.getRowCount();
        txb_CantidadFilasAutosustentable.setText(String.valueOf(cantidad));
    }//GEN-LAST:event_cb_AnalisisDesempeñoActionPerformed

    private void rb_CalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_CalculosActionPerformed
        JP_AutoP1.setVisible(false);
        JP_AutoP2.setVisible(true);

        try {
            ClaseConsulta misConsultas = new ClaseConsulta();
            DefaultTableModel modeloHornos = misConsultas.consultaHornosConDatosAutosustentables();

            tblDatoHornoAutosustentable.setModel(modeloHornos);

            DefaultTableModel modeloHornos2 = misConsultas.consultaHornosConDatosAutosustentables();
            tblDatoHornoAutosustentable2.setModel(modeloHornos2);

            idHornoCalc1 = -1;
            idHornoCalc2 = -1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar las tablas de hornos: " + e.getMessage());
        }
    }//GEN-LAST:event_rb_CalculosActionPerformed

    private void rb_ConsultaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ConsultaDatosActionPerformed
        JP_AutoP1.setVisible(true);
        JP_AutoP2.setVisible(false);
    }//GEN-LAST:event_rb_ConsultaDatosActionPerformed

    private void tblDatoHornoAutosustentable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoHornoAutosustentable2MouseClicked
        int fila = tblDatoHornoAutosustentable2.getSelectedRow();
        if (fila >= 0) {
            try {
                this.idHornoCalc2 = (int) tblDatoHornoAutosustentable2.getValueAt(fila, 0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al seleccionar el horno 2.");
            }
        }

    }//GEN-LAST:event_tblDatoHornoAutosustentable2MouseClicked

    private void tblDatoHornoAutosustentableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatoHornoAutosustentableMouseClicked
        int fila = tblDatoHornoAutosustentable.getSelectedRow();
        if (fila >= 0) {
            try {
                this.idHornoCalc1 = (int) tblDatoHornoAutosustentable.getValueAt(fila, 0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al seleccionar el horno 1.");
            }
        }
    }//GEN-LAST:event_tblDatoHornoAutosustentableMouseClicked

    private void rbCompararTodoslosHornosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCompararTodoslosHornosActionPerformed
        actualizarDisponibilidadTablasCalculo();
    }//GEN-LAST:event_rbCompararTodoslosHornosActionPerformed

    private void rbComparVariosHornosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbComparVariosHornosActionPerformed
        actualizarDisponibilidadTablasCalculo();
    }//GEN-LAST:event_rbComparVariosHornosActionPerformed

    private void btn_ResetearCalculoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetearCalculoAutoActionPerformed
    }//GEN-LAST:event_btn_ResetearCalculoAutoActionPerformed

    private void rbCalcularMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCalcularMinimoActionPerformed
    }//GEN-LAST:event_rbCalcularMinimoActionPerformed

    private void rbCalcularPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCalcularPromedioActionPerformed
    }//GEN-LAST:event_rbCalcularPromedioActionPerformed

    private void rbCalcularMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCalcularMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCalcularMaximoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoAutosustentabilidad;
    private javax.swing.ButtonGroup GrupoFunciones;
    private javax.swing.ButtonGroup GrupoHornos;
    private javax.swing.ButtonGroup GrupoMantenimiento;
    private javax.swing.ButtonGroup GrupoMetodoCalculoAutoHorno;
    private javax.swing.ButtonGroup GrupoMetodoCompararAutoHorno;
    private javax.swing.ButtonGroup GrupoModoAutosustentable;
    private javax.swing.JDesktopPane JP_AutoP1;
    private javax.swing.JDesktopPane JP_AutoP2;
    private com.toedter.calendar.JDateChooser Jd_FechaFinal;
    private com.toedter.calendar.JDateChooser Jd_FechaFinalAmbiente;
    private com.toedter.calendar.JDateChooser Jd_FechaFinalAutosustentable;
    private com.toedter.calendar.JDateChooser Jd_FechaFinalFuncionamiento;
    private com.toedter.calendar.JDateChooser Jd_FechaFinalMantenimiento;
    private com.toedter.calendar.JDateChooser Jd_fechaAmbiente;
    private com.toedter.calendar.JDateChooser Jd_fechaAutosustentable;
    private com.toedter.calendar.JDateChooser Jd_fechaDesdeAmbiente;
    private com.toedter.calendar.JDateChooser Jd_fechaHorno;
    private com.toedter.calendar.JDateChooser Jd_fechaInicioAutosustentable;
    private com.toedter.calendar.JDateChooser Jd_fechaInicioFuncionamiento;
    private com.toedter.calendar.JDateChooser Jd_fechaInicioHornos;
    private com.toedter.calendar.JDateChooser Jd_fechaInicioMantenimiento;
    private com.toedter.calendar.JDateChooser Jd_fechaMantenimiento;
    private javax.swing.JButton btn_BuscarAmbiente;
    private javax.swing.JButton btn_BuscarAutosustentable;
    private javax.swing.JButton btn_BuscarFuncionamiento;
    private javax.swing.JButton btn_BuscarHorno;
    private javax.swing.JButton btn_BuscarMantenimiento;
    private javax.swing.JButton btn_EstadisticasGenerales;
    private javax.swing.JButton btn_IngresarAmbiente;
    private javax.swing.JButton btn_IngresarAutosustentable;
    private javax.swing.JButton btn_IngresarFuncionamiento;
    private javax.swing.JButton btn_IngresarHornos;
    private javax.swing.JButton btn_IngresarMantenimiento;
    private javax.swing.JButton btn_ResetearAmbiente;
    private javax.swing.JButton btn_ResetearAutosustentable;
    private javax.swing.JButton btn_ResetearBusquedaFuncionamiento;
    private javax.swing.JButton btn_ResetearCalculoAuto;
    private javax.swing.JButton btn_ResetearHorno;
    private javax.swing.JButton btn_ResetearMantenimiento;
    private javax.swing.JCheckBox cb_AnalisisDesempeño;
    private javax.swing.JComboBox<String> cb_EnergiaRecibida;
    private javax.swing.JComboBox<String> cb_estadohorno;
    private javax.swing.JComboBox<String> cb_sisAislamiento;
    private javax.swing.JComboBox<String> cb_tipodealimento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelAmbiente;
    private javax.swing.JPanel jPanelAutosustentable;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelFuncionamiento;
    private javax.swing.JPanel jPanelHornosSolares;
    private javax.swing.JPanel jPanelMantenimiento;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private com.toedter.calendar.JDateChooser jb_fechaoperacion;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlBuscar1;
    private javax.swing.JLabel jl_CalcularEstadisticas;
    private javax.swing.JLabel jl_CantFilas;
    private javax.swing.JLabel jl_Desde;
    private javax.swing.JLabel jl_Desde1;
    private javax.swing.JLabel jl_Desde2;
    private javax.swing.JLabel jl_Hasta;
    private javax.swing.JSpinner js_EficienciaEnergetica;
    private com.toedter.calendar.JSpinnerDateEditor js_Hora;
    private javax.swing.JSpinner js_temperaturai;
    private javax.swing.JLabel lblAmbiente;
    private javax.swing.JLabel lblAutosustentable;
    private javax.swing.JLabel lblFuncionamiento;
    private javax.swing.JLabel lblHorno;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JRadioButton rbAutomatico;
    private javax.swing.JRadioButton rbCalcularMaximo;
    private javax.swing.JRadioButton rbCalcularMinimo;
    private javax.swing.JRadioButton rbCalcularPromedio;
    private javax.swing.JRadioButton rbComparVariosHornos;
    private javax.swing.JRadioButton rbCompararTodoslosHornos;
    private javax.swing.JRadioButton rbManual;
    private javax.swing.JRadioButton rbPorBusquedaAutosustentabilidad;
    private javax.swing.JRadioButton rbPorBusquedaFunciones;
    private javax.swing.JRadioButton rbPorBusquedaHornos;
    private javax.swing.JRadioButton rbPorBusquedaMantenimiento;
    private javax.swing.JRadioButton rbPorFechaAutosustentabilidad;
    private javax.swing.JRadioButton rbPorFechaFunciones;
    private javax.swing.JRadioButton rbPorFechaHornos;
    private javax.swing.JRadioButton rbPorFechaMantenimiento;
    private javax.swing.JRadioButton rb_Calculos;
    private javax.swing.JRadioButton rb_ConsultaDatos;
    private javax.swing.JTable tblDatHornoAmbiente;
    private javax.swing.JTable tblDatoAmbiente;
    private javax.swing.JTable tblDatoAutosustentable;
    private javax.swing.JTable tblDatoFuncionAutosustentable;
    private javax.swing.JTable tblDatoFuncionamiento;
    private javax.swing.JTable tblDatoHorno;
    private javax.swing.JTable tblDatoHornoAutosustentable;
    private javax.swing.JTable tblDatoHornoAutosustentable2;
    private javax.swing.JTable tblDatoHornoMante;
    private javax.swing.JTable tblDatoReparados;
    private javax.swing.JTable tblHornoFuncionamiento;
    private javax.swing.JTextField txb_CantidadFilasAmbiente;
    private javax.swing.JTextField txb_CantidadFilasAutosustentable;
    private javax.swing.JTextField txb_CantidadFilasFunciones;
    private javax.swing.JTextField txb_CantidadFilasHornos;
    private javax.swing.JTextField txb_CantidadFilasMantenimiento;
    private javax.swing.JSpinner txb_angulo;
    private javax.swing.JTextField txb_buscarAutosustentable;
    private javax.swing.JTextField txb_buscarFuncionamiento;
    private javax.swing.JTextField txb_buscarHornos;
    private javax.swing.JTextField txb_buscarMantenimiento;
    private javax.swing.JTextField txb_consumoe;
    private javax.swing.JTextArea txb_detallesr;
    private javax.swing.JTextField txb_dimensiones;
    private javax.swing.JComboBox<String> txb_direccion;
    private javax.swing.JTextField txb_energiaalmacenada;
    private javax.swing.JComboBox<String> txb_intensidadsolar;
    private javax.swing.JTextArea txb_materiales;
    private javax.swing.JTextArea txb_materialesr;
    private javax.swing.JTextField txb_reflectores;
    private javax.swing.JSpinner txb_temperatura;
    private com.toedter.calendar.JSpinnerDateEditor txb_tiempoc;
    private javax.swing.JTextField txb_tipo;
    private javax.swing.JTextField txtIDAmbiente;
    private javax.swing.JTextField txtIDAutosustentable;
    private javax.swing.JTextField txtIDFuncionamiento;
    private javax.swing.JTextField txtIDMantenimiento;
    // End of variables declaration//GEN-END:variables
}
