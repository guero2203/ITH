//http://slideplayer.es/slide/3612437/

package masarchivosjava;

import java.text.DecimalFormat;

public class Cosa {
    private String nombre;
    private int unidades;
    private float precio;
    private DecimalFormat fmt;
    
    Cosa (String n, int u, float p) {
        nombre = n;
        unidades = u;
        precio = p;
        fmt = new DecimalFormat ("0.##");
    }
    
    public String toString () {
        return nombre + ":\t" + unidades + " a $" + precio + " = " +
                fmt.format ((unidades * precio));
     }
    
    public String getDatos(){
        return nombre + " " + unidades + " " + precio;
    }
 }

