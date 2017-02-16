/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masarchivosjava;

/**
 *
 * @author JesusAdolfo
 */
public class Nodo {
    String nombre;
    int unidad;
    float precio;
    Nodo sig=null;
    
    public Nodo(String n, int u, float p){
        nombre=n;
        unidad=u;
        precio=p;      
    }
}
