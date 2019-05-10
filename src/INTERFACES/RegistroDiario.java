package INTERFACES;

import FUENTES.cargarFuente;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class RegistroDiario extends javax.swing.JFrame {
    //
    cargarFuente fuente = new cargarFuente();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableCellRenderer tcr;
    Calendar fecha = new GregorianCalendar();

    public RegistroDiario() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENES/cartera.png")));
        setTitle("Registro Diario");

        String[] titulos = {"Fecha", "Cuenta", "Concepto", "Cargo", "Abono"};
        modelo.setColumnIdentifiers(titulos);
        Tabla.setModel(modelo);
        Tabla.getTableHeader().setPreferredSize(new java.awt.Dimension(200, 60));
        Tabla.getTableHeader().setBackground(new Color(232, 63, 96));
        Tabla.getTableHeader().setForeground(Color.white);
        Tabla.getTableHeader().setFont(fuente.setFont(fuente.negrita, 0, 20));

        PanelAccionesPadre.remove(PanelAcciones);
        PanelAccionesPadre.setLayout(new GridLayout());
        PanelAccionesPadre.add(logo);

        PanelAcciones.remove(PanelFecha);
        cbxFecha.setLocation(150, 610);
        btnGuardar.setLocation(200, 655);
        PanelAcciones.setPreferredSize(new Dimension(600, 770));
        PanelAccionesPadre.setPreferredSize(new Dimension(PanelAccionesPadre.getWidth(), 780));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        logo = new javax.swing.JLabel();
        PanelInferior = new javax.swing.JPanel();
        btnRegistroDiario = new javax.swing.JButton();
        btnEsquemasDeMayor = new javax.swing.JButton();
        btnBalanzasDeComprobacion = new javax.swing.JButton();
        btnEstadoDeResultados = new javax.swing.JButton();
        btnBalanceGeneral = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        BarraDeHerramientas = new javax.swing.JToolBar();
        btnNuevoRegistro = new javax.swing.JButton();
        btnEditarRegistro = new javax.swing.JButton();
        btnCancelarRegistro = new javax.swing.JButton();
        btnEliminarRegistro = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        PanelCentral = new javax.swing.JPanel();
        PanelIzquierdo = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        PanelDerecho = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();
        PanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelAccionesPadre = new javax.swing.JPanel();
        PanelAcciones = new javax.swing.JPanel();
        PanelMovimientos = new javax.swing.JPanel();
        rbtCompra = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
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

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cartera.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Diario");
        setPreferredSize(new java.awt.Dimension(1400, 800));

        PanelInferior.setBackground(java.awt.Color.gray);
        PanelInferior.setPreferredSize(new java.awt.Dimension(1200, 100));

        btnRegistroDiario.setBackground(java.awt.Color.white);
        btnRegistroDiario.setFont(fuente.setFont(fuente.negrita, 0, 15)
        );
        btnRegistroDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/checklist.png"))); // NOI18N
        btnRegistroDiario.setText("Registro Diario");
        btnRegistroDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistroDiario.setPreferredSize(new java.awt.Dimension(220, 130));
        btnRegistroDiario.setVerifyInputWhenFocusTarget(false);
        btnRegistroDiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnRegistroDiario);

        btnEsquemasDeMayor.setBackground(java.awt.Color.white);
        btnEsquemasDeMayor.setFont(fuente.setFont(fuente.negrita, 0, 15)
        );
        btnEsquemasDeMayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/rgb.png"))); // NOI18N
        btnEsquemasDeMayor.setText("Esqeumas De Mayor");
        btnEsquemasDeMayor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEsquemasDeMayor.setPreferredSize(new java.awt.Dimension(220, 130));
        btnEsquemasDeMayor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnEsquemasDeMayor);

        btnBalanzasDeComprobacion.setBackground(java.awt.Color.white);
        btnBalanzasDeComprobacion.setFont(fuente.setFont(fuente.negrita, 0, 15)
        );
        btnBalanzasDeComprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/resultado.png"))); // NOI18N
        btnBalanzasDeComprobacion.setText("Balanzas De Comprobacion");
        btnBalanzasDeComprobacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBalanzasDeComprobacion.setPreferredSize(new java.awt.Dimension(250, 130));
        btnBalanzasDeComprobacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnBalanzasDeComprobacion);

        btnEstadoDeResultados.setBackground(java.awt.Color.white);
        btnEstadoDeResultados.setFont(fuente.setFont(fuente.negrita, 0, 15)
        );
        btnEstadoDeResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salud.png"))); // NOI18N
        btnEstadoDeResultados.setText("Estado De Resultados");
        btnEstadoDeResultados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstadoDeResultados.setPreferredSize(new java.awt.Dimension(220, 130));
        btnEstadoDeResultados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnEstadoDeResultados);

        btnBalanceGeneral.setBackground(java.awt.Color.white);
        btnBalanceGeneral.setFont(fuente.setFont(fuente.negrita, 0, 15)
        );
        btnBalanceGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/balanza.png"))); // NOI18N
        btnBalanceGeneral.setText("Balance General");
        btnBalanceGeneral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBalanceGeneral.setPreferredSize(new java.awt.Dimension(220, 130));
        btnBalanceGeneral.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(btnBalanceGeneral);

        btnSalir.setBackground(java.awt.Color.white);
        btnSalir.setFont(fuente.setFont(fuente.negrita, 0, 15)
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

        btnEditarRegistro.setBackground(java.awt.Color.white);
        btnEditarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/editar.png"))); // NOI18N
        btnEditarRegistro.setEnabled(false);
        btnEditarRegistro.setFocusable(false);
        btnEditarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarRegistro.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEditarRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraDeHerramientas.add(btnEditarRegistro);

        btnCancelarRegistro.setBackground(java.awt.Color.white);
        btnCancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cancelar.png"))); // NOI18N
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

        btnEliminarRegistro.setBackground(java.awt.Color.white);
        btnEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/eliminar.png"))); // NOI18N
        btnEliminarRegistro.setEnabled(false);
        btnEliminarRegistro.setFocusable(false);
        btnEliminarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarRegistro.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEliminarRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraDeHerramientas.add(btnEliminarRegistro);

        btnAjustes.setBackground(java.awt.Color.white);
        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/configuracion_1.png"))); // NOI18N
        btnAjustes.setFocusable(false);
        btnAjustes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAjustes.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAjustes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraDeHerramientas.add(btnAjustes);

        PanelCentral.setLayout(new java.awt.GridLayout(1, 2));

        Tabla.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5"
            }
        ));
        Tabla.setRowHeight(50);
        PanelIzquierdo.setViewportView(Tabla);

        PanelCentral.add(PanelIzquierdo);

        Panel.setLayout(new java.awt.BorderLayout());

        PanelTitulo.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true));
        PanelTitulo.setPreferredSize(new java.awt.Dimension(600, 60));
        PanelTitulo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Google Sans", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 182, 96));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro Diario");
        jLabel1.setOpaque(true);
        PanelTitulo.add(jLabel1);

        Panel.add(PanelTitulo, java.awt.BorderLayout.NORTH);

        PanelAccionesPadre.setPreferredSize(new java.awt.Dimension(610, 950));
        PanelAccionesPadre.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        PanelAcciones.setBackground(java.awt.Color.white);
        PanelAcciones.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true));
        PanelAcciones.setPreferredSize(new java.awt.Dimension(600, 940));
        PanelAcciones.setLayout(null);

        PanelMovimientos.setBackground(java.awt.Color.white);
        PanelMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Movimientos:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelMovimientos.setLayout(new java.awt.GridLayout(3, 3));

        rbtCompra.setBackground(java.awt.Color.white);
        buttonGroup1.add(rbtCompra);
        rbtCompra.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        rbtCompra.setSelected(true);
        rbtCompra.setText("Compra");
        rbtCompra.setHideActionText(true);
        rbtCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rbtCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelMovimientos.add(rbtCompra);

        jRadioButton2.setBackground(java.awt.Color.white);
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        jRadioButton2.setText("Venta");
        jRadioButton2.setHideActionText(true);
        jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelMovimientos.add(jRadioButton2);

        jRadioButton3.setBackground(java.awt.Color.white);
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        jRadioButton3.setText("Devoucion del cliente");
        jRadioButton3.setHideActionText(true);
        jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelMovimientos.add(jRadioButton3);

        jRadioButton4.setBackground(java.awt.Color.white);
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        jRadioButton4.setText("Devol. al proovedoor");
        jRadioButton4.setHideActionText(true);
        jRadioButton4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelMovimientos.add(jRadioButton4);

        jRadioButton5.setBackground(java.awt.Color.white);
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        jRadioButton5.setText("Descuento al cliente");
        jRadioButton5.setHideActionText(true);
        jRadioButton5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelMovimientos.add(jRadioButton5);

        jRadioButton6.setBackground(java.awt.Color.white);
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        jRadioButton6.setText("Desc. del proovedor");
        jRadioButton6.setHideActionText(true);
        jRadioButton6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelMovimientos.add(jRadioButton6);

        jRadioButton7.setBackground(java.awt.Color.white);
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        jRadioButton7.setText("Gastos");
        jRadioButton7.setHideActionText(true);
        jRadioButton7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelMovimientos.add(jRadioButton7);

        jRadioButton8.setBackground(java.awt.Color.white);
        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        jRadioButton8.setText("Otro");
        jRadioButton8.setHideActionText(true);
        jRadioButton8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelMovimientos.add(jRadioButton8);

        PanelAcciones.add(PanelMovimientos);
        PanelMovimientos.setBounds(10, 20, 580, 250);

        PanelConcepto.setBackground(java.awt.Color.white);
        PanelConcepto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Concepto:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelConcepto.setLayout(new java.awt.GridLayout(1, 0));

        txtConcepto.setFont(new java.awt.Font("Google Sans", 0, 25)); // NOI18N
        txtConcepto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConcepto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelConcepto.add(txtConcepto);

        PanelAcciones.add(PanelConcepto);
        PanelConcepto.setBounds(10, 280, 580, 150);

        PanelMonto.setBackground(java.awt.Color.white);
        PanelMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Monto:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelMonto.setLayout(new java.awt.GridLayout(1, 0));

        txtMonto.setBackground(java.awt.Color.white);
        txtMonto.setFont(new java.awt.Font("Google Sans", 0, 25)); // NOI18N
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelMonto.add(txtMonto);

        PanelAcciones.add(PanelMonto);
        PanelMonto.setBounds(10, 445, 580, 150);

        btnGuardar.setBackground(new java.awt.Color(232, 63, 96));
        btnGuardar.setFont(new java.awt.Font("Google Sans", 0, 25)); // NOI18N
        btnGuardar.setForeground(java.awt.Color.white);
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        PanelAcciones.add(btnGuardar);
        btnGuardar.setBounds(200, 820, 200, 80);

        cbxFecha.setBackground(java.awt.Color.white);
        cbxFecha.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        cbxFecha.setSelected(true);
        cbxFecha.setText("Usar fecha actual");
        cbxFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cbxFecha.setOpaque(true);
        cbxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFechaActionPerformed(evt);
            }
        });
        PanelAcciones.add(cbxFecha);
        cbxFecha.setBounds(150, 775, 300, 30);

        PanelFecha.setBackground(java.awt.Color.white);
        PanelFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 5, true), "Fecha:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 30), java.awt.Color.red)); // NOI18N
        PanelFecha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        cbDia.setBackground(java.awt.Color.white);
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Dia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 15), new java.awt.Color(58, 173, 118))); // NOI18N
        cbDia.setPreferredSize(new java.awt.Dimension(150, 80));
        PanelFecha.add(cbDia);

        cbMes.setBackground(java.awt.Color.white);
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbMes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Mes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 15), new java.awt.Color(58, 173, 118))); // NOI18N
        cbMes.setPreferredSize(new java.awt.Dimension(150, 80));
        PanelFecha.add(cbMes);

        cbAno.setBackground(java.awt.Color.white);
        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cbAno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Ano", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Google Sans", 0, 15), new java.awt.Color(58, 173, 118))); // NOI18N
        cbAno.setPreferredSize(new java.awt.Dimension(150, 80));
        PanelFecha.add(cbAno);

        PanelAcciones.add(PanelFecha);
        PanelFecha.setBounds(10, 610, 580, 150);

        PanelAccionesPadre.add(PanelAcciones);

        Panel.add(PanelAccionesPadre, java.awt.BorderLayout.CENTER);

        PanelDerecho.setViewportView(Panel);

        PanelCentral.add(PanelDerecho);

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
                .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (rbtCompra.isSelected()) {
            String fechaActual;
            if (cbxFecha.isSelected()) {
                fechaActual = String.valueOf(fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR));
                String[] datos = {fechaActual, "Proovedoor", txtConcepto.getText(), txtMonto.getText(), "0"};
                modelo.addRow(datos);
            } else {
            }

            tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.setBackground(Color.white);
            Tabla.setModel(modelo);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFechaActionPerformed
        if (cbxFecha.isSelected()) {
            PanelAcciones.remove(PanelFecha);
            cbxFecha.setLocation(150, 610);
            btnGuardar.setLocation(200, 655);
            PanelAcciones.setPreferredSize(new Dimension(600, 770));
            PanelAccionesPadre.setPreferredSize(new Dimension(PanelAccionesPadre.getWidth(), 780));
            PanelAcciones.updateUI();
            PanelAccionesPadre.updateUI();
        } else {
            PanelAccionesPadre.setPreferredSize(new Dimension(PanelAccionesPadre.getWidth(), 950));
            PanelAcciones.setPreferredSize(new Dimension(600, 940));
            PanelAcciones.add(PanelFecha);
            PanelFecha.setLocation(10, 610);
            cbxFecha.setLocation(150, 775);
            btnGuardar.setLocation(200, 820);
            PanelAccionesPadre.updateUI();
            PanelAcciones.updateUI();
        }
    }//GEN-LAST:event_cbxFechaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraDeHerramientas;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelAcciones;
    private javax.swing.JPanel PanelAccionesPadre;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelConcepto;
    private javax.swing.JScrollPane PanelDerecho;
    private javax.swing.JPanel PanelFecha;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JScrollPane PanelIzquierdo;
    private javax.swing.JPanel PanelMonto;
    private javax.swing.JPanel PanelMovimientos;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnBalanceGeneral;
    private javax.swing.JButton btnBalanzasDeComprobacion;
    private javax.swing.JButton btnCancelarRegistro;
    private javax.swing.JButton btnEditarRegistro;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JButton btnEsquemasDeMayor;
    private javax.swing.JButton btnEstadoDeResultados;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btnRegistroDiario;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JCheckBox cbxFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton rbtCompra;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
