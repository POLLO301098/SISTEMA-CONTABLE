
package INTERFACES;

import FUENTES.cargarFuente;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends javax.swing.JFrame {
    
    cargarFuente fuente = new cargarFuente();

    public SplashScreen() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENES/cartera.png")));
        llenarBarra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar(0,1000);
        ;
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        titulo.setFont(fuente.setFont(fuente.negrita, 0, 40)
        );
        titulo.setForeground(java.awt.Color.white);
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SISTEMA CONTABLE");
        titulo.setPreferredSize(new java.awt.Dimension(600, 60));
        getContentPane().add(titulo);
        titulo.setBounds(0, 30, 800, 60);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cartera.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 75, 800, 300);
        getContentPane().add(progreso);
        progreso.setBounds(60, 380, 670, 60);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/wallpaper.jpeg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 800, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void llenarBarra() {
        Timer tiempo = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                if(progreso.getValue()<1000){
                    setColor();
                    progreso.setValue(progreso.getValue()+10);
                }else{
                RegistroDiario ventana = new RegistroDiario();
                ventana.setVisible(true);
                tiempo.cancel();
                dispose();
            }
            }

            private void setColor() {
                
                int num = (int) (Math.random()*10);
                switch(num){
                    case 0:
                        progreso.setForeground(Color.white);
                        break;
                    case 1:
                        progreso.setForeground(Color.red);
                        break;
                    case 2:
                        progreso.setForeground(Color.yellow);
                        break;
                    case 3:
                        progreso.setForeground(Color.blue);
                        break;
                    case 4:
                        progreso.setForeground(Color.black);
                        break;
                    case 5:
                        progreso.setForeground(Color.green);
                        break;
                    case 6:
                        progreso.setForeground(Color.orange);
                        break;
                    case 7:
                        progreso.setForeground(Color.cyan);
                        break;
                    case 8:
                        progreso.setForeground(Color.gray);
                        break;  
                    case 9:
                        progreso.setForeground(Color.pink);
                        break;
                    case 10:
                        progreso.setForeground(Color.magenta);
                        break;    
                        
                }
                
            }
        };
        tiempo.schedule(tarea, 0,30);
    }
}
