
package INTERFACES;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class ModeloCelda implements TableCellRenderer{

    private Integer fila;
    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
    
    public ModeloCelda(Integer row){
        fila = row;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if(fila.compareTo(row) == 0 && isSelected == true){
            c.setBackground(Color.red);
        }
        return c;
    }
    
    
}
