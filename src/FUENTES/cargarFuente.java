
package FUENTES;

import java.awt.Font;
import java.io.InputStream;
import javax.swing.JOptionPane;

public class cargarFuente {
    private Font font = null;
    public String GoogleNegrita = "GoogleSans-Bold.ttf";
    public String negritaItalica = "GoogleSans-BoldItalic.ttf";
    public String Italica = "GoogleSans-Italic.ttf";
    public String Mediana = "GoogleSans-Medium.ttf";
    public String MedianaItalica = "GoogleSans-MediumItalic.ttf";
    public String GoogleRegular = "GoogleSans-Regular.ttf";
    public String Arial = "Arial.ttf";
    public String ArialNegrita = "ArialBold.ttf";
    public String Calibri = "Calibri.ttf";
    public String CalibriNegrita = "CalibriBold.ttf";
    public String Lato = "Lato.ttf";
    public String Stencil = "Stencil.ttf";
    
    private String fontName;
    private int estilo;
    private float tamano;

    public Font setFont(String fontName, int estilo, float tamano){
        try{
            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
            this.fontName = fontName;
            this.estilo = estilo;
            this.tamano = tamano;
        } catch(Exception ex){
           
        }
        Font tFont = font.deriveFont(estilo,tamano);
        return tFont;
    }
    
    public String getFontName(){   
        return this.fontName;
    }
    
    public int getEstilo(){
        return this.estilo;
    }
    
    public float getTamano(){
        return this.tamano;
    }
}
