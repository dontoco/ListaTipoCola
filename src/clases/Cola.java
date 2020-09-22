/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class Cola {
    private Nodo inicioCola, finalCola;
    String Cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null; 
        
    }
    // metodo para saber si la cola esta vacia 
    public boolean colaVacia(){
        if (inicioCola == null) {
            return true;
            
        } else {
            return false;
        }
    }
    // metodo para insertar a la cola 
    public void Insertar(int informacion){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.informacion = informacion;
        nuevoNodo.siguente = null;
        if (colaVacia()) {
            inicioCola = nuevoNodo;
            finalCola = nuevoNodo;
            
            
        } else {
            finalCola.siguente = nuevoNodo;
            finalCola = nuevoNodo;
        }
        
        
    }
    //Metodo para extraer de la cola 
    public int Extraer(){
        if (!colaVacia()){
            int informacion = inicioCola.informacion;
            
            
            if (inicioCola == finalCola){
                inicioCola = null;
                finalCola = null;
            }
            else{
                inicioCola = inicioCola.siguente;
            }
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    //metodo para mostrar el contenido de la cola 
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while(recorrido !=null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguente;
        }
        String cadena [] = Cola.split(" ");
        for (int i = cadena.length -1 ; i >= 0; i--) { 
            ColaInvertida += " " + cadena[i];
            
        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        //limpiar cola 
        Cola = "";
    }
}
