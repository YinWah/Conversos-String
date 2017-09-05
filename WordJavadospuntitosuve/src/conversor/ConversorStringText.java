/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.io.*;
import java.util.*;

/**
 *
 * @author Alumno
 */
public class ConversorStringText {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
     /** 
     * El metodo main se usa para desplegar en consola una menu con las opciones
     * que ofrece la aplicacion (Guardar String y Ver .txt), una vez que el 
     * usuario escoge opcion el sistema manda el metodo correspondiente para llevar
     * a cabo la accion .
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner leer= new Scanner(System.in); 
        String opc;
        Metodos objNumero = new Metodos();
        String respuesta;
        
        System.out.println("Deseea realizar alguna operacion? SI / NO");
        respuesta=leer.next();
        
        while(respuesta.equalsIgnoreCase("si"))
        {
            System.out.println("Seleccione una opcion");
            System.out.println("a) Guardar String");
            System.out.println("b) Ver .txt");
            System.out.println("----------------------------------------");
            opc = leer.next();
                switch (opc) {
                case "a":
                objNumero.Guardar();
                break;
                case "b":
                objNumero.Desplegar();
                break;
                default:
                 System.out.println("Opcion seleccionada incorrecta");
                break;
                 }
                    System.out.println("Deseea realizar alguna operacion? SI / NO");
                    respuesta=leer.next();
                }   
                System.out.println(":v Gracias por usar el programa :v");
            }
    
}
