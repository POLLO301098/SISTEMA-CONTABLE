package INTERFACES;

import javax.swing.JOptionPane;

public class prueba {

    public static void main(String[] args) {

        int cal;
        int z = 1;
        int[] calificaciones = new int[z];
        
        for (int x = 0; x < calificaciones.length; x++) {
            cal = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu calificacion"));
            calificaciones[x] = cal;
            z++;
            calificaciones = new int[z];
        }
    }
}
