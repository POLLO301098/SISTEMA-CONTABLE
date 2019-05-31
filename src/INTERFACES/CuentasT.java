package INTERFACES;

import FUENTES.cargarFuente;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CuentasT extends javax.swing.JFrame {
    int z = 0;
    cargarFuente fuente = new cargarFuente();
    DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
    String[] titulos = {"Cargo", "Abono"};
    

    ////////////////////////////////
    DefaultTableModel modeloCajaBanco = new DefaultTableModel();
    DefaultTableModel modeloMercancia = new DefaultTableModel();
    DefaultTableModel modeloClientes = new DefaultTableModel();
    DefaultTableModel modeloProovedores = new DefaultTableModel();
    DefaultTableModel modeloDevolucionAlCliente = new DefaultTableModel();
    DefaultTableModel modeloDevolucionDelProovedor = new DefaultTableModel();
    DefaultTableModel modeloDescuentoAlCliente = new DefaultTableModel();
    DefaultTableModel modeloDescuentoDelProovedor = new DefaultTableModel();
    DefaultTableModel modeloInventario = new DefaultTableModel();
    DefaultTableModel modeloGastos = new DefaultTableModel();
    DefaultTableModel modeloPerdidasGanancias = new DefaultTableModel();
    DefaultTableModel modeloOtros = new DefaultTableModel();

    ///////////////////////////////
    String[] DatosTablas = new String[2];
    String[] DatosTablas2 = new String[2];

    public CuentasT() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        modeloCajaBanco.setColumnIdentifiers(titulos);
        modeloProovedores.setColumnIdentifiers(titulos);
        modeloClientes.setColumnIdentifiers(titulos);
        modeloMercancia.setColumnIdentifiers(titulos);
        tcr.setHorizontalAlignment(SwingConstants.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        TablaCajaBanco = new javax.swing.JTable();
        TablaCajaBanco.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaCajaBanco.getTableHeader().setForeground(Color.white);
        TablaCajaBanco.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaCajaBanco.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaCajaBanco.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TablaMercancia = new javax.swing.JTable();
        TablaMercancia.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaMercancia.getTableHeader().setForeground(Color.white);
        TablaMercancia.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaMercancia.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaMercancia.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        TablaClientes.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaClientes.getTableHeader().setForeground(Color.white);
        TablaClientes.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaClientes.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaClientes.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        TablaProovedores = new javax.swing.JTable();
        TablaProovedores.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaProovedores.getTableHeader().setForeground(Color.white);
        TablaProovedores.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaProovedores.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaProovedores.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        TablaDevolucionDelCliente = new javax.swing.JTable();
        TablaDevolucionDelCliente.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaDevolucionDelCliente.getTableHeader().setForeground(Color.white);
        TablaDevolucionDelCliente.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaDevolucionDelCliente.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaDevolucionDelCliente.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        TablaDevolucionAlProovedor = new javax.swing.JTable();
        TablaDevolucionAlProovedor.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaDevolucionAlProovedor.getTableHeader().setForeground(Color.white);
        TablaDevolucionAlProovedor.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaDevolucionAlProovedor.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaDevolucionAlProovedor.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        TablaDescuentoAlCliente = new javax.swing.JTable();
        TablaDescuentoAlCliente.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaDescuentoAlCliente.getTableHeader().setForeground(Color.white);
        TablaDescuentoAlCliente.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaDescuentoAlCliente.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaDescuentoAlCliente.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        TablaDescuentoDelProovedor = new javax.swing.JTable();
        TablaDescuentoDelProovedor.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaDescuentoDelProovedor.getTableHeader().setForeground(Color.white);
        TablaDescuentoDelProovedor.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaDescuentoDelProovedor.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaDescuentoDelProovedor.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        TablaInventario.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaInventario.getTableHeader().setForeground(Color.white);
        TablaInventario.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaInventario.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaInventario.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        TablaGastos = new javax.swing.JTable();
        TablaGastos.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaGastos.getTableHeader().setForeground(Color.white);
        TablaGastos.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaGastos.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaGastos.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        TablaPerdidasGanancias = new javax.swing.JTable();
        TablaPerdidasGanancias.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaPerdidasGanancias.getTableHeader().setForeground(Color.white);
        TablaPerdidasGanancias.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaPerdidasGanancias.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaPerdidasGanancias.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        TablaOtros = new javax.swing.JTable();
        TablaOtros.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaOtros.getTableHeader().setForeground(Color.white);
        TablaOtros.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaOtros.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaOtros.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 4));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Caja / Banco");
        jLabel1.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        TablaCajaBanco.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaCajaBanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaCajaBanco.setRowHeight(50);
        jScrollPane13.setViewportView(TablaCajaBanco);

        jPanel1.add(jScrollPane13, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mercancia");
        jLabel2.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel2.add(jLabel2, java.awt.BorderLayout.NORTH);

        TablaMercancia.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaMercancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaMercancia.setRowHeight(50);
        jScrollPane14.setViewportView(TablaMercancia);

        jPanel2.add(jScrollPane14, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel3.setForeground(java.awt.Color.gray);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clientes");
        jLabel3.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel3.add(jLabel3, java.awt.BorderLayout.NORTH);

        TablaClientes.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaClientes.setRowHeight(50);
        jScrollPane15.setViewportView(TablaClientes);

        jPanel3.add(jScrollPane15, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel4.setForeground(java.awt.Color.gray);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Proovedores");
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel4.add(jLabel4, java.awt.BorderLayout.NORTH);

        TablaProovedores.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaProovedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaProovedores.setRowHeight(50);
        jScrollPane16.setViewportView(TablaProovedores);

        jPanel4.add(jScrollPane16, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel5.setForeground(java.awt.Color.gray);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Devolucion del cliente");
        jLabel5.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel5.add(jLabel5, java.awt.BorderLayout.NORTH);

        TablaDevolucionDelCliente.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaDevolucionDelCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaDevolucionDelCliente.setRowHeight(50);
        jScrollPane17.setViewportView(TablaDevolucionDelCliente);

        jPanel5.add(jScrollPane17, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel6.setForeground(java.awt.Color.gray);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Devolucion al proovedor");
        jLabel6.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel6.add(jLabel6, java.awt.BorderLayout.NORTH);

        TablaDevolucionAlProovedor.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaDevolucionAlProovedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaDevolucionAlProovedor.setRowHeight(50);
        jScrollPane18.setViewportView(TablaDevolucionAlProovedor);

        jPanel6.add(jScrollPane18, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel7.setForeground(java.awt.Color.gray);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descuento al cliente");
        jLabel7.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel7.add(jLabel7, java.awt.BorderLayout.NORTH);

        TablaDescuentoAlCliente.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaDescuentoAlCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaDescuentoAlCliente.setRowHeight(50);
        jScrollPane19.setViewportView(TablaDescuentoAlCliente);

        jPanel7.add(jScrollPane19, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel8.setForeground(java.awt.Color.gray);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Descuento del proovedor");
        jLabel8.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel8.add(jLabel8, java.awt.BorderLayout.NORTH);

        TablaDescuentoDelProovedor.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaDescuentoDelProovedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaDescuentoDelProovedor.setRowHeight(50);
        jScrollPane20.setViewportView(TablaDescuentoDelProovedor);

        jPanel8.add(jScrollPane20, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel9.setForeground(java.awt.Color.gray);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Inventario");
        jLabel9.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel9.add(jLabel9, java.awt.BorderLayout.NORTH);

        TablaInventario.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaInventario.setRowHeight(50);
        jScrollPane21.setViewportView(TablaInventario);

        jPanel9.add(jScrollPane21, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel9);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel10.setForeground(java.awt.Color.gray);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Gastos");
        jLabel10.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel10.add(jLabel10, java.awt.BorderLayout.NORTH);

        TablaGastos.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaGastos.setRowHeight(50);
        jScrollPane22.setViewportView(TablaGastos);

        jPanel10.add(jScrollPane22, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel11.setForeground(java.awt.Color.gray);
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Perdidas y Ganancias");
        jLabel11.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel11.add(jLabel11, java.awt.BorderLayout.NORTH);

        TablaPerdidasGanancias.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaPerdidasGanancias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaPerdidasGanancias.setRowHeight(50);
        jScrollPane23.setViewportView(TablaPerdidasGanancias);

        jPanel11.add(jScrollPane23, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel11);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel12.setForeground(java.awt.Color.gray);
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Otros");
        jLabel12.setPreferredSize(new java.awt.Dimension(34, 60));
        jPanel12.add(jLabel12, java.awt.BorderLayout.NORTH);

        TablaOtros.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15)
        );
        TablaOtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargo", "Abono"
            }
        ));
        TablaOtros.setRowHeight(50);
        jScrollPane24.setViewportView(TablaOtros);

        jPanel12.add(jScrollPane24, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel12);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentasT().setVisible(true);
            }
        });
    }

    public void recibirDatos(String[] cuenta, String[] cargo, String[] abono) {

        //x = filas z = columnas
        
        for (int x = 0; x < cuenta.length; x++) {
            switch (cuenta[x]) {
                case "Caja / Banco": // compra de mercancia

                    DatosTablas[0] = cargo[z];
                    DatosTablas[1] = "0";
                    DatosTablas2[0] = "0";
                    DatosTablas2[1] = abono[(z)+1];
                    modeloCajaBanco.addRow(DatosTablas);
                    modeloProovedores.addRow(DatosTablas2);
                    TablaCajaBanco.setModel(modeloCajaBanco);
                    TablaProovedores.setModel(modeloProovedores);
                    z = z + 2;

                    break;

                case "Cliente":  //venta de mercancia
                    
                    DatosTablas[0] = cargo[z];
                    DatosTablas[1] = "0";
                    DatosTablas2[0] = "0";
                    DatosTablas2[1] = abono[(z) + 1];
                    modeloClientes.addRow(DatosTablas);
                    modeloMercancia.addRow(DatosTablas2);
                    TablaClientes.setModel(modeloClientes);
                    TablaMercancia.setModel(modeloMercancia);
                    z = z + 2;
                    
                    break;

            }
            x = x + 1;
        }
        centrardatosTablas();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCajaBanco;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaDescuentoAlCliente;
    private javax.swing.JTable TablaDescuentoDelProovedor;
    private javax.swing.JTable TablaDevolucionAlProovedor;
    private javax.swing.JTable TablaDevolucionDelCliente;
    private javax.swing.JTable TablaGastos;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JTable TablaMercancia;
    private javax.swing.JTable TablaOtros;
    private javax.swing.JTable TablaPerdidasGanancias;
    private javax.swing.JTable TablaProovedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    // End of variables declaration//GEN-END:variables

    private void centrardatosTablas() {
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 2; i++) {

            TablaCajaBanco.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaDescuentoAlCliente.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaDescuentoDelProovedor.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaDevolucionAlProovedor.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaDevolucionDelCliente.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaGastos.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaInventario.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaMercancia.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaPerdidasGanancias.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaOtros.getColumnModel().getColumn(i).setCellRenderer(tcr);
            TablaProovedores.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

}
