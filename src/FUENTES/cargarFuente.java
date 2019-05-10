
package FUENTES;

import java.awt.Font;
import java.io.InputStream;
import javax.swing.JOptionPane;

public class cargarFuente {
    private Font font = null;
    public String negrita = "GoogleSans-Bold.ttf";
    public String negritaItalica = "GoogleSans-BoldItalic.ttf";
    public String Italica = "GoogleSans-Italic.ttf";
    public String Mediana = "GoogleSans-Medium.ttf";
    public String MedianaItalica = "GoogleSans-MediumItalic.ttf";
    public String Regular = "GoogleSans-Regular.ttf";
    

    public Font setFont(String fontName, int estilo, float tamano){
        try{
            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch(Exception ex){
           
        }
        Font tFont = font.deriveFont(estilo,tamano);
        return tFont;
    }
}
