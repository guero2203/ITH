package masarchivosjava;

import java.io.*;

public class CreaInventario {
    public static void main (String [] args) {
        final int MAX = 3;
        Cosa[] items = new Cosa [MAX];
        String linea, arch = "inventario.dat";
        int i = 0;
        items [i++] = new Cosa ("Tuercas", 500, 200);
        items [i++] = new Cosa ("Arandelas", 300, 1000);
        items [i++] = new Cosa ("Tornillos", 25000, 5);
        i=0;
        try {
            FileWriter fw = new FileWriter (arch);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter archSal = new PrintWriter (bw);
            archSal.println(items[i++].getDatos());
            archSal.println(items[i++].getDatos());
            archSal.println(items[i++].getDatos());
            archSal.close();
        } catch (FileNotFoundException exc) {
            System.out.println("El archivo " + arch + " no fue encontrado. ");
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}
