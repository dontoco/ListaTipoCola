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
public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0, nodo_informacion = 0;
        Cola cola = new Cola();

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones \n\n"
                        + "1. Insertar un Nodo\n"
                        + "2. Extraer Nodo\n"
                        + "3. Mostrar contenido de la Cola \n"
                        + "4. Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el valor a guardar en el nodo  "));
                        cola.Insertar(nodo_informacion);
                        break;
                    case 2:
                        if (!cola.colaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor :" + cola.Extraer());
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia ");
                            
                        }
                        break;
                    case 3:
                        cola.MostrarContenido();
                        JOptionPane.showConfirmDialog(null, " lol");
                        break;
                    case 4:
                        // no se requere ya que cuando se selecciones esta alternativa el ciclo se terminara y se cerrara el programa 
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "el numero que ingreso no existe o no corresponde");
                        break;

                }

            } catch (NumberFormatException e) {
            }

        } while (opcion != 4);
    }

}
