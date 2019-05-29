package INTERFACES;

import FUENTES.cargarFuente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class RegistroDiario extends javax.swing.JFrame {

    cargarFuente fuente = new cargarFuente();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableCellRenderer tcr;
    Calendar calendario = new GregorianCalendar();
    String[] titulos = {"Fecha", "Cuenta", "Concepto", "Cargo", "Abono"};
    String[] datosFila1 = new String[5];
    String[] datosFila2 = new String[5];
    CuentasT ventana = new CuentasT();

    public RegistroDiario() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENES/cartera.png")));
        setTitle("Registro Diario");

        //darle forma a la fila de titulos
        modelo.setColumnIdentifiers(titulos);
        Tabla.setModel(modelo);
        Tabla.getTableHeader().setPreferredSize(new java.awt.Dimension(200, 60));
        Tabla.getTableHeader().setBackground(new Color(232, 63, 96));
        Tabla.getTableHeader().setForeground(Color.white);
        Tabla.getColumnModel().getColumn(2).setPreferredWidth(200);

        //Iniciar panel izquierdo con logo
        PanelAccionesPadre.remove(PanelAcciones);
        PanelAccionesPadre.setLayout(new GridLayout());
        PanelAccionesPadre.add(logo);

        //Mostrar panel Fecha
        PanelAcciones.remove(PanelFecha);
        cbxFecha.setLocation(150, 630);
        btnGuardar.setLocation(200, 665);
        PanelAcciones.setPreferredSize(new Dimension(600, 770));
        PanelAccionesPadre.setPreferredSize(new Dimension(PanelAccionesPadre.getWidth(), 780));

        //Alinear datos de la tebla al centro
        tcr = new DefaultTableCellRenderer();
        for (int z = 0; z <= 4; z++) {
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            Tabla.getColumnModel().getColumn(z).setCellRenderer(tcr);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        logo = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        PanelInferior = new javax.swing.JPanel();
        btnRegistroDiario = new javax.swing.JButton();
        btnEsquemasDeMayor = new javax.swing.JButton();
        btnBalanzasDeComprobacion = new javax.swing.JButton();
        btnEstadoDeResultados = new javax.swing.JButton();
        btnBalanceGeneral = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        BarraDeHerramientas = new javax.swing.JToolBar();
        btnNuevoRegistro = new javax.swing.JButton();
        btnCancelarRegistro = new javax.swing.JButton();
        btnEditarRegistro = new javax.swing.JButton();
        btnEliminarRegistro = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        PanelCentral = new javax.swing.JPanel();
        PanelIzquierdo = new javax.swing.JPanel();
        PanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ScrollIzquierdo = new javax.swing.JScrollPane();
        PanelAccionesPadre = new javax.swing.JPanel();
        PanelAcciones = new javax.swing.JPanel();
        PanelConcepto = new javax.swing.JPanel();
        txtConcepto = new javax.swing.JTextField();
        PanelMonto = new javax.swing.JPanel();
        txtMonto = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        cbxFecha = new javax.swing.JCheckBox();
        PanelFecha = new javax.swing.JPanel();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbAno = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelBalanceGeneralPadre = new javax.swing.JPanel();
        PanelBalanceGeneral = new javax.swing.JPanel();
        rbtCaja = new javax.swing.JRadioButton();
        rbtBanco = new javax.swing.JRadioButton();
        rbtMercancia = new javax.swing.JRadioButton();
        rbtMobiliario = new javax.swing.JRadioButton();
        rbtProovedores = new javax.swing.JRadioButton();
        rbtDocsPorPagar = new javax.swing.JRadioButton();
        rbtCapital = new javax.swing.JRadioButton();
        rbtOtro = new javax.swing.JRadioButton();
        PanelMovimientos = new javax.swing.JPanel();
        rbtCompra = new javax.swing.JRadioButton();
        rbtVenta = new javax.swing.JRadioButton();
        rbtDevCliente = new javax.swing.JRadioButton();
        rbtDevProovedor = new javax.swing.JRadioButton();
        rbtDescCliente = new javax.swing.JRadioButton();
        rbtDescProovedor = new javax.swing.JRadioButton();
        rbtGastos = new javax.swing.JRadioButton();
        rbtOtros = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        PanelOpcionesTabla = new javax.swing.JTabbedPane();
        PanelInicio = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        PanelOpciones = new javax.swing.JPanel();
        PanelCelda = new javax.swing.JPanel();
        btnNegrita = new javax.swing.JToggleButton();
        cbxTipoLetra = new javax.swing.JComboBox<>();
        cbxTamanoLetra = new javax.swing.JComboBox<>();
        cbxColorLetra = new javax.swing.JComboBox<>();
        cbxColorFondo = new javax.swing.JComboBox<>();
        PanelDerecho = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Tabla.getTableHeader().setFont(fuente.setFont(fuente.GoogleNegrita, 0, 20));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cartera.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Diario");
        setPreferredSize(new java.awt.Dimension(1500, 900));

        PanelInferior.setBackground(java.awt.Color.gray);
        PanelInferior.setPreferredSize(new java.awt.Dimension(1200, 100));

        btnRegistroDiario.setBackground(java.awt.Color.white);
        btnRegistroDiario.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        btnRegistroDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/checklist.png"))); // NOI18N
        btnRegistroDiario.setText("Registro Diario");
        btnRegistroDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistroDiario.setPreferredSize(new java.awt.Dimension(220, 130));
        btnRegistroDiario.setVerifyInputWhenFocusTarget(false);
        btnRegistroDiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnRegistroDiario);

        btnEsquemasDeMayor.setBackground(java.awt.Color.white);
        btnEsquemasDeMayor.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        btnEsquemasDeMayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/rgb.png"))); // NOI18N
        btnEsquemasDeMayor.setText("Esqeumas De Mayor");
        btnEsquemasDeMayor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEsquemasDeMayor.setPreferredSize(new java.awt.Dimension(220, 130));
        btnEsquemasDeMayor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEsquemasDeMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquemasDeMayorActionPerformed(evt);
            }
        });
        PanelInferior.add(btnEsquemasDeMayor);

        btnBalanzasDeComprobacion.setBackground(java.awt.Color.white);
        btnBalanzasDeComprobacion.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        btnBalanzasDeComprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/resultado.png"))); // NOI18N
        btnBalanzasDeComprobacion.setText("Balanzas De Comprobacion");
        btnBalanzasDeComprobacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBalanzasDeComprobacion.setPreferredSize(new java.awt.Dimension(250, 130));
        btnBalanzasDeComprobacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnBalanzasDeComprobacion);

        btnEstadoDeResultados.setBackground(java.awt.Color.white);
        btnEstadoDeResultados.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        btnEstadoDeResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salud.png"))); // NOI18N
        btnEstadoDeResultados.setText("Estado De Resultados");
        btnEstadoDeResultados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstadoDeResultados.setPreferredSize(new java.awt.Dimension(220, 130));
        btnEstadoDeResultados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnEstadoDeResultados);

        btnBalanceGeneral.setBackground(java.awt.Color.white);
        btnBalanceGeneral.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        btnBalanceGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/balanza.png"))); // NOI18N
        btnBalanceGeneral.setText("Balance General");
        btnBalanceGeneral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBalanceGeneral.setPreferredSize(new java.awt.Dimension(220, 130));
        btnBalanceGeneral.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnBalanceGeneral);

        btnSalir.setBackground(java.awt.Color.white);
        btnSalir.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPreferredSize(new java.awt.Dimension(220, 130));
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelInferior.add(btnSalir);

        BarraDeHerramientas.setFloatable(false);

        btnNuevoRegistro.setBackground(java.awt.Color.white);
        btnNuevoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/anadir.png"))); // NOI18N
        btnNuevoRegistro.setToolTipText("Nuevo Registro");
        btnNuevoRegistro.setFocusable(false);
        btnNuevoRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoRegistro.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNuevoRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
            }
        });
        BarraDeHerramientas.add(btnNuevoRegistro);

        btnCancelarRegistro.setBackground(java.awt.Color.white);
        btnCancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cancelar.png"))); // NOI18N
        btnCancelarRegistro.setToolTipText("Cancelar Registro");
        btnCancelarRegistro.setEnabled(false);
        btnCancelarRegistro.setFocusable(false);
        btnCancelarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarRegistro.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCancelarRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroActionPerformed(evt);
            }
        });
        BarraDeHerramientas.add(btnCancelarRegistro);

        btnEditarRegistro.setBackground(java.awt.Color.white);
        btnEditarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/editar.png"))); // NOI18N
        btnEditarRegistro.setToolTipText("Editar celda");
        btnEditarRegistro.setEnabled(false);
        btnEditarRegistro.setFocusable(false);
        btnEditarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarRegistro.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEditarRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraDeHerramientas.add(btnEditarRegistro);

        btnEliminarRegistro.setBackground(java.awt.Color.white);
        btnEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/eliminar.png"))); // NOI18N
        btnEliminarRegistro.setToolTipText("Borrar fila");
        btnEliminarRegistro.setEnabled(false);
        btnEliminarRegistro.setFocusable(false);
        btnEliminarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarRegistro.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEliminarRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraDeHerramientas.add(btnEliminarRegistro);

        btnAjustes.setBackground(java.awt.Color.white);
        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/configuracion_1.png"))); // NOI18N
        btnAjustes.setToolTipText("Ajustes");
        btnAjustes.setFocusable(false);
        btnAjustes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAjustes.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAjustes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraDeHerramientas.add(btnAjustes);

        PanelCentral.setLayout(new java.awt.GridLayout(1, 2));

        PanelIzquierdo.setLayout(new java.awt.BorderLayout());

        PanelTitulo.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true));
        PanelTitulo.setPreferredSize(new java.awt.Dimension(700, 60));
        PanelTitulo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro Diario");
        PanelTitulo.add(jLabel1);

        PanelIzquierdo.add(PanelTitulo, java.awt.BorderLayout.NORTH);

        PanelAccionesPadre.setPreferredSize(new java.awt.Dimension(600, 950));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 20);
        flowLayout1.setAlignOnBaseline(true);
        PanelAccionesPadre.setLayout(flowLayout1);

        PanelAcciones.setBackground(java.awt.Color.white);
        PanelAcciones.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true));
        PanelAcciones.setPreferredSize(new java.awt.Dimension(600, 900));
        PanelAcciones.setLayout(null);

        PanelConcepto.setBackground(java.awt.Color.white);
        PanelConcepto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Concepto:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelConcepto.setLayout(new java.awt.GridLayout(1, 0));

        txtConcepto.setFont(new java.awt.Font("Google Sans", 0, 25)); // NOI18N
        txtConcepto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConcepto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelConcepto.add(txtConcepto);

        PanelAcciones.add(PanelConcepto);
        PanelConcepto.setBounds(10, 270, 580, 150);

        PanelMonto.setBackground(java.awt.Color.white);
        PanelMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Monto:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelMonto.setPreferredSize(new java.awt.Dimension(20, 150));
        PanelMonto.setLayout(new java.awt.GridLayout(1, 0));

        txtMonto.setFont(new java.awt.Font("Google Sans", 0, 25)); // NOI18N
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMonto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMontoFocusGained(evt);
            }
        });
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        PanelMonto.add(txtMonto);

        PanelAcciones.add(PanelMonto);
        PanelMonto.setBounds(10, 430, 580, 150);

        btnGuardar.setBackground(new java.awt.Color(232, 63, 96));
        btnGuardar.setFont(fuente.setFont(fuente.GoogleRegular, 0, 30));
        btnGuardar.setForeground(java.awt.Color.white);
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 3, true));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        PanelAcciones.add(btnGuardar);
        btnGuardar.setBounds(200, 790, 200, 80);

        cbxFecha.setBackground(java.awt.Color.white);
        cbxFecha.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        cbxFecha.setSelected(true);
        cbxFecha.setText("Usar fecha actual");
        cbxFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cbxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFechaActionPerformed(evt);
            }
        });
        PanelAcciones.add(cbxFecha);
        cbxFecha.setBounds(150, 760, 300, 30);

        PanelFecha.setBackground(java.awt.Color.white);
        PanelFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Fecha:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelFecha.setPreferredSize(new java.awt.Dimension(488, 50));
        PanelFecha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Dia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 15), new java.awt.Color(58, 173, 118))); // NOI18N
        cbDia.setPreferredSize(new java.awt.Dimension(150, 80));
        PanelFecha.add(cbDia);

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Mes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 15), new java.awt.Color(58, 173, 118))); // NOI18N
        cbMes.setPreferredSize(new java.awt.Dimension(150, 80));
        PanelFecha.add(cbMes);

        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cbAno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Ano", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 15), new java.awt.Color(58, 173, 118))); // NOI18N
        cbAno.setPreferredSize(new java.awt.Dimension(150, 80));
        PanelFecha.add(cbAno);

        PanelAcciones.add(PanelFecha);
        PanelFecha.setBounds(10, 590, 580, 150);

        jTabbedPane1.setBackground(java.awt.Color.gray);
        jTabbedPane1.setForeground(java.awt.Color.white);
        jTabbedPane1.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );

        PanelBalanceGeneralPadre.setBackground(java.awt.Color.white);
        PanelBalanceGeneralPadre.setPreferredSize(new java.awt.Dimension(572, 320));

        PanelBalanceGeneral.setBackground(java.awt.Color.white);
        PanelBalanceGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Balance Inicial:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelBalanceGeneral.setLayout(new java.awt.GridLayout(3, 3));

        rbtCaja.setBackground(java.awt.Color.white);
        buttonGroup2.add(rbtCaja);
        rbtCaja.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        rbtCaja.setText("Caja");
        rbtCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCajaActionPerformed(evt);
            }
        });
        PanelBalanceGeneral.add(rbtCaja);

        rbtBanco.setBackground(java.awt.Color.white);
        buttonGroup2.add(rbtBanco);
        rbtBanco.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        rbtBanco.setText("Banco");
        PanelBalanceGeneral.add(rbtBanco);

        rbtMercancia.setBackground(java.awt.Color.white);
        buttonGroup2.add(rbtMercancia);
        rbtMercancia.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        rbtMercancia.setText("Mercancia");
        PanelBalanceGeneral.add(rbtMercancia);

        rbtMobiliario.setBackground(java.awt.Color.white);
        buttonGroup2.add(rbtMobiliario);
        rbtMobiliario.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        rbtMobiliario.setText("Mobiliario");
        PanelBalanceGeneral.add(rbtMobiliario);

        rbtProovedores.setBackground(java.awt.Color.white);
        buttonGroup2.add(rbtProovedores);
        rbtProovedores.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        rbtProovedores.setText("Proovedores");
        PanelBalanceGeneral.add(rbtProovedores);

        rbtDocsPorPagar.setBackground(java.awt.Color.white);
        buttonGroup2.add(rbtDocsPorPagar);
        rbtDocsPorPagar.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        rbtDocsPorPagar.setText("Docs. por pagar");
        PanelBalanceGeneral.add(rbtDocsPorPagar);

        rbtCapital.setBackground(java.awt.Color.white);
        buttonGroup2.add(rbtCapital);
        rbtCapital.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        rbtCapital.setText("Capital");
        PanelBalanceGeneral.add(rbtCapital);

        rbtOtro.setBackground(java.awt.Color.white);
        buttonGroup2.add(rbtOtro);
        rbtOtro.setFont(fuente.setFont(fuente.GoogleRegular, 0, 20)
        );
        rbtOtro.setText("Otros");
        PanelBalanceGeneral.add(rbtOtro);

        javax.swing.GroupLayout PanelBalanceGeneralPadreLayout = new javax.swing.GroupLayout(PanelBalanceGeneralPadre);
        PanelBalanceGeneralPadre.setLayout(PanelBalanceGeneralPadreLayout);
        PanelBalanceGeneralPadreLayout.setHorizontalGroup(
            PanelBalanceGeneralPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBalanceGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBalanceGeneralPadreLayout.setVerticalGroup(
            PanelBalanceGeneralPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBalanceGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Balance General Inicial", PanelBalanceGeneralPadre);

        PanelMovimientos.setBackground(java.awt.Color.white);
        PanelMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Movimientos:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelMovimientos.setPreferredSize(new java.awt.Dimension(474, 200));
        PanelMovimientos.setLayout(new java.awt.GridLayout(3, 3));

        rbtCompra.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtCompra);
        rbtCompra.setFont(fuente.setFont(fuente.GoogleRegular, 0, 16)
        );
        rbtCompra.setText("Compra");
        rbtCompra.setHideActionText(true);
        rbtCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCompraActionPerformed(evt);
            }
        });
        PanelMovimientos.add(rbtCompra);

        rbtVenta.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtVenta);
        rbtVenta.setFont(fuente.setFont(fuente.GoogleRegular, 0, 16)
        );
        rbtVenta.setText("Venta");
        rbtVenta.setHideActionText(true);
        rbtVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVentaActionPerformed(evt);
            }
        });
        PanelMovimientos.add(rbtVenta);

        rbtDevCliente.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtDevCliente);
        rbtDevCliente.setFont(fuente.setFont(fuente.GoogleRegular, 0, 16)
        );
        rbtDevCliente.setText("Devoucion del cliente");
        rbtDevCliente.setHideActionText(true);
        rbtDevCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDevClienteActionPerformed(evt);
            }
        });
        PanelMovimientos.add(rbtDevCliente);

        rbtDevProovedor.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtDevProovedor);
        rbtDevProovedor.setFont(fuente.setFont(fuente.GoogleRegular, 0, 16)
        );
        rbtDevProovedor.setText("Devol. al proovedoor");
        rbtDevProovedor.setHideActionText(true);
        rbtDevProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDevProovedorActionPerformed(evt);
            }
        });
        PanelMovimientos.add(rbtDevProovedor);

        rbtDescCliente.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtDescCliente);
        rbtDescCliente.setFont(fuente.setFont(fuente.GoogleRegular, 0, 16)
        );
        rbtDescCliente.setText("Descuento al cliente");
        rbtDescCliente.setHideActionText(true);
        rbtDescCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDescClienteActionPerformed(evt);
            }
        });
        PanelMovimientos.add(rbtDescCliente);

        rbtDescProovedor.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtDescProovedor);
        rbtDescProovedor.setFont(fuente.setFont(fuente.GoogleRegular, 0, 16)
        );
        rbtDescProovedor.setText("Desc. del proovedor");
        rbtDescProovedor.setHideActionText(true);
        rbtDescProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDescProovedorActionPerformed(evt);
            }
        });
        PanelMovimientos.add(rbtDescProovedor);

        rbtGastos.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtGastos);
        rbtGastos.setFont(fuente.setFont(fuente.GoogleRegular, 0, 16)
        );
        rbtGastos.setText("Gastos");
        rbtGastos.setHideActionText(true);
        rbtGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtGastosActionPerformed(evt);
            }
        });
        PanelMovimientos.add(rbtGastos);

        rbtOtros.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtOtros);
        rbtOtros.setFont(fuente.setFont(fuente.GoogleRegular, 0, 16)
        );
        rbtOtros.setText("Otro");
        rbtOtros.setHideActionText(true);
        rbtOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOtrosActionPerformed(evt);
            }
        });
        PanelMovimientos.add(rbtOtros);

        jTabbedPane1.addTab("Movimientos", null, PanelMovimientos, "");

        PanelAcciones.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 15, 580, 250);

        PanelAccionesPadre.add(PanelAcciones);

        ScrollIzquierdo.setViewportView(PanelAccionesPadre);

        PanelIzquierdo.add(ScrollIzquierdo, java.awt.BorderLayout.CENTER);

        PanelCentral.add(PanelIzquierdo);

        jPanel1.setLayout(new java.awt.BorderLayout());

        PanelOpcionesTabla.setBackground(java.awt.Color.gray);
        PanelOpcionesTabla.setForeground(java.awt.Color.white);
        PanelOpcionesTabla.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        PanelOpcionesTabla.setToolTipText("Opciones");
        PanelOpcionesTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelOpcionesTabla.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        PanelOpcionesTabla.setOpaque(true);
        PanelOpcionesTabla.setPreferredSize(new java.awt.Dimension(8, 115));

        PanelInicio.setToolTipText("Opciones");
        PanelInicio.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 7));

        jButton2.setBackground(java.awt.Color.gray);
        jButton2.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Guardar");
        jButton2.setPreferredSize(new java.awt.Dimension(120, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelInicio.add(jButton2);

        PanelOpcionesTabla.addTab("Inicio", PanelInicio);

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        PanelOpcionesTabla.addTab("Opciones", PanelOpciones);

        btnNegrita.setBackground(java.awt.Color.white);
        btnNegrita.setFont(new java.awt.Font("Google Sans", 1, 20)); // NOI18N
        btnNegrita.setText("N");
        btnNegrita.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Negrita", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 14), new java.awt.Color(89, 177, 108))); // NOI18N
        btnNegrita.setPreferredSize(new java.awt.Dimension(80, 60));
        btnNegrita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNegritaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNegritaMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNegritaMouseClicked(evt);
            }
        });
        btnNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegritaActionPerformed(evt);
            }
        });
        PanelCelda.add(btnNegrita);

        cbxTipoLetra.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        cbxTipoLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Google Sans", "Arial", "Calibri", "Lato", "Stencil", " " }));
        cbxTipoLetra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Tipo de letra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 14), new java.awt.Color(91, 170, 126))); // NOI18N
        cbxTipoLetra.setPreferredSize(new java.awt.Dimension(140, 65));
        cbxTipoLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoLetraActionPerformed(evt);
            }
        });
        PanelCelda.add(cbxTipoLetra);

        cbxTamanoLetra.setEditable(true);
        cbxTamanoLetra.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        cbxTamanoLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12", "14", "15", "16", "18", "20", " " }));
        cbxTamanoLetra.setSelectedIndex(4);
        cbxTamanoLetra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Tamano de la letra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 14), new java.awt.Color(91, 170, 126))); // NOI18N
        cbxTamanoLetra.setPreferredSize(new java.awt.Dimension(140, 65));
        cbxTamanoLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTamanoLetraActionPerformed(evt);
            }
        });
        PanelCelda.add(cbxTamanoLetra);

        cbxColorLetra.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        cbxColorLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Azul", "Verde", "Amarillo", "Rojo", "Gris", " ", " " }));
        cbxColorLetra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Color de la letra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 14), new java.awt.Color(91, 170, 126))); // NOI18N
        cbxColorLetra.setPreferredSize(new java.awt.Dimension(140, 65));
        cbxColorLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxColorLetraActionPerformed(evt);
            }
        });
        PanelCelda.add(cbxColorLetra);

        cbxColorFondo.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        cbxColorFondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Azul", "Verde", "Amarillo", "Rojo", "Gris", " ", " " }));
        cbxColorFondo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Color de fondo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 14), new java.awt.Color(91, 170, 126))); // NOI18N
        cbxColorFondo.setPreferredSize(new java.awt.Dimension(140, 65));
        cbxColorFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxColorFondoActionPerformed(evt);
            }
        });
        PanelCelda.add(cbxColorFondo);

        PanelOpcionesTabla.addTab("Diseno", PanelCelda);

        jPanel1.add(PanelOpcionesTabla, java.awt.BorderLayout.SOUTH);

        Tabla.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true));
        Tabla.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4", "Título 5"
            }
        ));
        Tabla.setCellSelectionEnabled(true);
        Tabla.setRowHeight(50);
        Tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaKeyPressed(evt);
            }
        });
        PanelDerecho.setViewportView(Tabla);
        Tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(PanelDerecho, java.awt.BorderLayout.CENTER);

        PanelCentral.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BarraDeHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCentral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BarraDeHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed

        PanelAccionesPadre.remove(logo);
        PanelAccionesPadre.setLayout(new FlowLayout());
        PanelAccionesPadre.add(PanelAcciones);
        PanelAccionesPadre.updateUI();
        btnNuevoRegistro.setEnabled(false);
        btnCancelarRegistro.setEnabled(true);
    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void btnCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroActionPerformed
        PanelAccionesPadre.remove(PanelAcciones);
        PanelAccionesPadre.setLayout(new GridLayout());
        PanelAccionesPadre.add(logo);
        PanelAccionesPadre.updateUI();
        btnNuevoRegistro.setEnabled(true);
        btnCancelarRegistro.setEnabled(false);
    }//GEN-LAST:event_btnCancelarRegistroActionPerformed

    private void btnNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegritaActionPerformed
        if (btnNegrita.isSelected()) {
            if (fuente.getFontName().equals("GoogleSans-Regular.ttf")) {
                Tabla.setFont(fuente.setFont(fuente.GoogleNegrita, 0, fuente.getTamano()));
            }
            Tabla.setFont(fuente.setFont(fuente.getFontName(), 1, fuente.getTamano()));
        } else {
            if (fuente.getFontName().equals("GoogleSans-Bold.ttf")) {
                Tabla.setFont(fuente.setFont(fuente.GoogleRegular, 0, fuente.getTamano()));
            }
            Tabla.setFont(fuente.setFont(fuente.getFontName(), 0, fuente.getTamano()));
        }

    }//GEN-LAST:event_btnNegritaActionPerformed

    private void btnNegritaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNegritaMouseClicked

    }//GEN-LAST:event_btnNegritaMouseClicked

    private void btnNegritaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNegritaMouseReleased

    }//GEN-LAST:event_btnNegritaMouseReleased

    private void btnNegritaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNegritaMousePressed

    }//GEN-LAST:event_btnNegritaMousePressed

    private void TablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaKeyPressed

    }//GEN-LAST:event_TablaKeyPressed

    private void cbxColorFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColorFondoActionPerformed
        String color = cbxColorFondo.getSelectedItem().toString();
        switch (color) {
            case "Negro":
                Tabla.setBackground(Color.black);
                break;

            case "Blanco":
                Tabla.setBackground(Color.white);
                break;

            case "Azul":
                Tabla.setBackground(Color.blue);
                break;

            case "Amarillo":
                Tabla.setBackground(Color.yellow);
                break;

            case "Verde":
                Tabla.setBackground(Color.green);
                break;

            case "Rojo":
                Tabla.setBackground(Color.red);
                break;

            case "Gris":
                Tabla.setBackground(Color.gray);
                break;
        }
    }//GEN-LAST:event_cbxColorFondoActionPerformed

    private void cbxColorLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColorLetraActionPerformed
        String color = cbxColorLetra.getSelectedItem().toString();
        switch (color) {
            case "Negro":
                Tabla.setForeground(Color.black);
                break;

            case "Blanco":
                Tabla.setForeground(Color.white);
                break;

            case "Azul":
                Tabla.setForeground(Color.blue);
                break;

            case "Amarillo":
                Tabla.setForeground(Color.yellow);
                break;

            case "Verde":
                Tabla.setForeground(Color.green);
                break;

            case "Rojo":
                Tabla.setForeground(Color.red);
                break;

            case "Gris":
                Tabla.setForeground(Color.gray);
                break;
        }

    }//GEN-LAST:event_cbxColorLetraActionPerformed

    private void cbxTamanoLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTamanoLetraActionPerformed
        float tamano = Float.parseFloat(cbxTamanoLetra.getSelectedItem().toString());
        Tabla.setFont(fuente.setFont(fuente.getFontName(), fuente.getEstilo(), tamano));
    }//GEN-LAST:event_cbxTamanoLetraActionPerformed

    private void cbxTipoLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoLetraActionPerformed
        String opc = cbxTipoLetra.getSelectedItem().toString();
        switch (opc) {
            case "Google Sans":
                if (btnNegrita.isSelected()) {
                    Tabla.setFont(fuente.setFont(fuente.GoogleNegrita, 0, fuente.getTamano()));
                } else {
                    Tabla.setFont(fuente.setFont(fuente.GoogleRegular, 0, fuente.getTamano()));
                }
                break;

            case "Arial":
                if (btnNegrita.isSelected()) {
                    Tabla.setFont(fuente.setFont(fuente.Arial, 1, fuente.getTamano()));
                } else {
                    Tabla.setFont(fuente.setFont(fuente.Arial, 0, fuente.getTamano()));
                }
                break;

            case "Calibri":
                if (btnNegrita.isSelected()) {
                    Tabla.setFont(fuente.setFont(fuente.Calibri, 1, fuente.getTamano()));
                } else {
                    Tabla.setFont(fuente.setFont(fuente.Calibri, 0, fuente.getTamano()));
                }
                break;

            case "Lato":
                if (btnNegrita.isSelected()) {
                    Tabla.setFont(fuente.setFont(fuente.Lato, 1, fuente.getTamano()));
                } else {
                    Tabla.setFont(fuente.setFont(fuente.Lato, 0, fuente.getTamano()));
                }
                break;

            case "Stencil":
                if (btnNegrita.isSelected()) {
                    Tabla.setFont(fuente.setFont(fuente.Stencil, 1, fuente.getTamano()));
                } else {
                    Tabla.setFont(fuente.setFont(fuente.Stencil, 0, fuente.getTamano()));
                }
                break;
        }

    }//GEN-LAST:event_cbxTipoLetraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            String sucursalesCSVFile = "src/archivos/DatosTabla.txt";
            BufferedWriter bfw = new BufferedWriter(new FileWriter(sucursalesCSVFile));

            for (int i = 0; i < Tabla.getRowCount(); i++) //realiza un barrido por filas.
            {
                for (int j = 0; j < Tabla.getColumnCount(); j++) //realiza un barrido por columnas.
                {
                    bfw.write((String) (Tabla.getValueAt(i, j)));
                    if (j < Tabla.getColumnCount() - 1) { //agrega separador "," si no es el ultimo elemento de la fila.
                        bfw.write(",");
                    }
                }
                bfw.newLine(); //inserta nueva linea.
            }

            bfw.close(); //cierra archivo!
            System.out.println("El archivo fue salvado correctamente!");
        } catch (IOException e) {
            System.out.println("ERROR: Ocurrio un problema al salvar el archivo!" + e.getMessage());
        }
        String [] cuentas = new String[Tabla.getRowCount()];
        for(int i=0 ; i<Tabla.getRowCount() ; i++){ // Recorro todas las filas de la tablita y guardo los datos en los arrays
            cuentas[i] = Tabla.getValueAt(i, 1).toString();
                
            }
        
        ventana.recibirDatos(cuentas);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //fecha
        String fecha;

        //Comprovar que se selecciono un radioButton
        if (rbtCompra.isSelected() || rbtVenta.isSelected() || rbtDescCliente.isSelected() || rbtDescProovedor.isSelected() || rbtDevCliente.isSelected()
                || rbtDevProovedor.isSelected() || rbtGastos.isSelected() || rbtOtros.isSelected() || rbtCaja.isSelected()) {
            //EstablecerFecha
            if (cbxFecha.isSelected()) {
                fecha = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH) + "/" + (calendario.get(Calendar.MONTH) + 1) + "/" + calendario.get(Calendar.YEAR));
            } else {
                fecha = cbDia.getSelectedItem().toString() + "/" + cbMes.getSelectedItem().toString() + "/" + cbAno.getSelectedItem().toString();
            }

            if (jTabbedPane1.getSelectedIndex() == 1) {
                //Caso compra ---------------------------------------------------------------------------------------------------------------------------------
                if (rbtCompra.isSelected()) {
                    llenarFila1(fecha, "Caja / Banco", txtConcepto.getText(), txtMonto.getText(), "0");
                    llenarFila2(fecha, "Proovedor", "Venta de mercancia", "0", txtMonto.getText());
                }

                //Caso venta ---------------------------------------------------------------------------------------------------------------------------------
                if (rbtVenta.isSelected()) {
                    llenarFila1(fecha, "Cliente", "Compra de Mercancia", txtMonto.getText(), "0");
                    llenarFila2(fecha, "Mercancias", txtConcepto.getText(), "0", txtMonto.getText());
                }

                //Caso devolucion del cliente ---------------------------------------------------------------------------------------------------------------------------------
                if (rbtDevCliente.isSelected()) {
                    llenarFila1(fecha, "Mercancias", txtConcepto.getText(), txtMonto.getText(), "0");
                    llenarFila2(fecha, "cliente", txtConcepto.getText(), "0", txtMonto.getText());
                }

                //Caso devolucion al proovedor ---------------------------------------------------------------------------------------------------------------------------------
                if (rbtDevProovedor.isSelected()) {
                    llenarFila1(fecha, "Proovedor", txtConcepto.getText(), txtMonto.getText(), "0");
                    llenarFila2(fecha, "Mercancias", txtConcepto.getText(), "0", txtMonto.getText());
                }

                //Caso descuento al cliente ---------------------------------------------------------------------------------------------------------------------------------
                if (rbtDescCliente.isSelected()) {
                    llenarFila1(fecha, "Mercancias", txtConcepto.getText(), txtMonto.getText(), "0");
                    llenarFila2(fecha, "cliente", txtConcepto.getText(), "0", txtMonto.getText());
                }

                //Caso descuento del proovedor ---------------------------------------------------------------------------------------------------------------------------------
                if (rbtDescCliente.isSelected()) {
                    llenarFila1(fecha, "Proovedor", txtConcepto.getText(), txtMonto.getText(), "0");
                    llenarFila2(fecha, "Mercancias", txtConcepto.getText(), "0", txtMonto.getText());
                }

                //caso Gastos ---------------------------------------------------------------------------------------------------------------------------------
                if (rbtDescCliente.isSelected()) {
                    llenarFila1(fecha, "Caja / Banco", txtConcepto.getText(), txtMonto.getText(), "0");
                    llenarFila2(fecha, "Proovedor", txtConcepto.getText(), "0", txtMonto.getText());
                }

                //Otro caso ---------------------------------------------------------------------------------------------------------------------------------
                if (rbtDescCliente.isSelected()) {
                    llenarFila1(fecha, "Mercancias", txtConcepto.getText(), txtMonto.getText(), "0");
                    llenarFila2(fecha, "Clientes", txtConcepto.getText(), "0", txtMonto.getText());
                }

                modelo.addRow(datosFila1);
                modelo.addRow(datosFila2);
                Tabla.setModel(modelo);

                //***************************************************************************************************************************************
            } else if(jTabbedPane1.getSelectedIndex()==0){
                if(rbtCaja.isSelected()){
                    llenarFila1(fecha, "Caja", txtConcepto.getText(), txtMonto.getText(), "0");
                }
                
                modelo.addRow(datosFila1);
                Tabla.setModel(modelo);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una opcion en el panel de movimientos");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFechaActionPerformed
        if (cbxFecha.isSelected()) {
            PanelAcciones.remove(PanelFecha);
            cbxFecha.setLocation(150, 640);
            btnGuardar.setLocation(200, 670);
            PanelAcciones.setPreferredSize(new Dimension(600, 770));
            PanelAccionesPadre.setPreferredSize(new Dimension(600, 780));
            PanelAcciones.updateUI();
            PanelAccionesPadre.updateUI();
        } else {
            PanelAccionesPadre.setPreferredSize(new Dimension(600, 930));
            PanelAcciones.setPreferredSize(new Dimension(600, 900));
            PanelAcciones.add(PanelFecha);
            PanelFecha.setLocation(10, 590);
            cbxFecha.setLocation(150, 760);
            btnGuardar.setLocation(200, 790);
            PanelAccionesPadre.updateUI();
            PanelAcciones.updateUI();
        }
    }//GEN-LAST:event_cbxFechaActionPerformed

    private void txtMontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMontoFocusGained
        txtMonto.setText("");
    }//GEN-LAST:event_txtMontoFocusGained

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void rbtOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOtrosActionPerformed
        if (rbtOtros.isSelected()) {
            txtConcepto.setText("");
            txtMonto.setText("0");

        }
    }//GEN-LAST:event_rbtOtrosActionPerformed

    private void rbtGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtGastosActionPerformed
        if (rbtGastos.isSelected()) {
            txtConcepto.setText("");
            txtMonto.setText("0");

        }
    }//GEN-LAST:event_rbtGastosActionPerformed

    private void rbtDescProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDescProovedorActionPerformed
        if (rbtDescProovedor.isSelected()) {
            txtConcepto.setText("Descuento por compra de mercancia");
            txtMonto.setText("0");

        }
    }//GEN-LAST:event_rbtDescProovedorActionPerformed

    private void rbtDescClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDescClienteActionPerformed
        if (rbtDescCliente.isSelected()) {
            txtConcepto.setText("Descuento por compra de mercancia");
            txtMonto.setText("0");

        }
    }//GEN-LAST:event_rbtDescClienteActionPerformed

    private void rbtDevProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDevProovedorActionPerformed
        if (rbtDevProovedor.isSelected()) {
            txtConcepto.setText("Devolucion de mercancia");
            txtMonto.setText("0");

        }
    }//GEN-LAST:event_rbtDevProovedorActionPerformed

    private void rbtDevClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDevClienteActionPerformed
        if (rbtDevCliente.isSelected()) {
            txtConcepto.setText("Devolucion de mercancia");
            txtMonto.setText("0");

        }
    }//GEN-LAST:event_rbtDevClienteActionPerformed

    private void rbtVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtVentaActionPerformed

        txtConcepto.setText("Venta de mercancia");
        txtMonto.setText("0");
    }//GEN-LAST:event_rbtVentaActionPerformed

    private void rbtCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCompraActionPerformed

        txtConcepto.setText("Compra de mercancia");
        txtMonto.setText("0");
    }//GEN-LAST:event_rbtCompraActionPerformed

    private void rbtCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCajaActionPerformed
        
    }//GEN-LAST:event_rbtCajaActionPerformed

    private void btnEsquemasDeMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquemasDeMayorActionPerformed

     ventana.setVisible(true);
    }//GEN-LAST:event_btnEsquemasDeMayorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraDeHerramientas;
    private javax.swing.JPanel PanelAcciones;
    private javax.swing.JPanel PanelAccionesPadre;
    private javax.swing.JPanel PanelBalanceGeneral;
    private javax.swing.JPanel PanelBalanceGeneralPadre;
    private javax.swing.JPanel PanelCelda;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelConcepto;
    private javax.swing.JScrollPane PanelDerecho;
    private javax.swing.JPanel PanelFecha;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JPanel PanelIzquierdo;
    private javax.swing.JPanel PanelMonto;
    private javax.swing.JPanel PanelMovimientos;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JTabbedPane PanelOpcionesTabla;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JScrollPane ScrollIzquierdo;
    public static javax.swing.JTable Tabla;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnBalanceGeneral;
    private javax.swing.JButton btnBalanzasDeComprobacion;
    private javax.swing.JButton btnCancelarRegistro;
    private javax.swing.JButton btnEditarRegistro;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JButton btnEsquemasDeMayor;
    private javax.swing.JButton btnEstadoDeResultados;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JToggleButton btnNegrita;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btnRegistroDiario;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbxColorFondo;
    private javax.swing.JComboBox<String> cbxColorLetra;
    private javax.swing.JCheckBox cbxFecha;
    private javax.swing.JComboBox<String> cbxTamanoLetra;
    private javax.swing.JComboBox<String> cbxTipoLetra;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton rbtBanco;
    private javax.swing.JRadioButton rbtCaja;
    private javax.swing.JRadioButton rbtCapital;
    private javax.swing.JRadioButton rbtCompra;
    private javax.swing.JRadioButton rbtDescCliente;
    private javax.swing.JRadioButton rbtDescProovedor;
    private javax.swing.JRadioButton rbtDevCliente;
    private javax.swing.JRadioButton rbtDevProovedor;
    private javax.swing.JRadioButton rbtDocsPorPagar;
    private javax.swing.JRadioButton rbtGastos;
    private javax.swing.JRadioButton rbtMercancia;
    private javax.swing.JRadioButton rbtMobiliario;
    private javax.swing.JRadioButton rbtOtro;
    private javax.swing.JRadioButton rbtOtros;
    private javax.swing.JRadioButton rbtProovedores;
    private javax.swing.JRadioButton rbtVenta;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

    private void llenarFila1(String fecha, String cuenta, String concepto, String cargo, String abono) {
        datosFila1[0] = fecha;
        datosFila1[1] = cuenta;
        datosFila1[2] = concepto;
        datosFila1[3] = cargo;
        datosFila1[4] = abono;
    }

    private void llenarFila2(String fecha, String cuenta, String concepto, String cargo, String abono) {
        datosFila2[0] = fecha;
        datosFila2[1] = cuenta;
        datosFila2[2] = concepto;
        datosFila2[3] = cargo;
        datosFila2[4] = abono;
    }

   

}
