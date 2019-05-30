
package INTERFACES;

import FUENTES.cargarFuente;
import java.awt.Color;
import java.awt.Dimension;

public class Tabla extends javax.swing.JPanel {
    
    cargarFuente fuente = new cargarFuente();
    
    public Tabla() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        TablaCajaBanco = new javax.swing.JTable();
        TablaCajaBanco.getTableHeader().setBackground(new Color(232, 63, 96));
        TablaCajaBanco.getTableHeader().setForeground(Color.white);
        TablaCajaBanco.getTableHeader().setFont(fuente.setFont(fuente.GoogleRegular, 0, 20));
        TablaCajaBanco.getTableHeader().setPreferredSize(new Dimension(200,60));
        TablaCajaBanco.setFont(fuente.setFont(fuente.GoogleRegular, 0, 15));

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(fuente.setFont(fuente.GoogleNegrita, 0, 30)
        );
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Caja / Banco");
        jLabel1.setPreferredSize(new java.awt.Dimension(34, 60));
        add(jLabel1, java.awt.BorderLayout.NORTH);

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

        add(jScrollPane13, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCajaBanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane13;
    // End of variables declaration//GEN-END:variables
}
