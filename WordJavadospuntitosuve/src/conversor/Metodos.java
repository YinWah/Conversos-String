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
 * @author Sorzano Torres Pablo,Wah Ortiz Yin Chew
 */

public class Metodos {

    /**
     * @throws FileNotFoundException
     * 
     */
    
     /**
     * El metodo Guardar() pide al usuario los datos nombre, boleta y el promedio,
     * despues de que reciba los datos, se genera un documeto con la extension .txt
     * que guardara los datos del usuario
     */
    public void Guardar() throws FileNotFoundException {

        //Un texto cualquiera guardado en una variable
        Scanner leer = new Scanner(System.in);    
        String Nombre,Boletas,Promedio;     
        Boolean seguir;
        PrintStream Escritura = new PrintStream("Archivo.txt");
        do {
            System.out.print("------------------------------------");
            System.out.print("Ingrese un nombre");
            System.out.println("------------------------------------");
            Nombre = leer.next();
            if (Nombre.matches(".*[A-Z \\s].*")) {
                seguir = true;
                Escritura.println("Nombre: " + Nombre);

            } else {
                System.out.println("El dato ingresado es incorrecto");
                seguir = false;
            }
        } while (!seguir);

        do {
            System.out.print("------------------------------------");
            System.out.print("Ingrese la boleta de la persona");
            System.out.println("------------------------------------");
            Boletas = leer.next();
            if (Boletas.matches(".*[^0123456789\\s].*")) {
                System.out.println("El dato ingresado es incorrecto");
                seguir = false;
            } else {
                seguir = true;
                Escritura.println("Boleta: " + Boletas);
            }
        } while (!seguir);

        do {
            System.out.print("------------------------------------");
            System.out.print("Ingrese el promedio de la persona");
            System.out.println("------------------------------------");
            Promedio = leer.next();
            if (Promedio.matches(".*[0123456789 \\s]+.\\w.*")) {
                seguir = true;
                Escritura.println("Promedio: " + Promedio);
            } else {
                System.out.println("Lo sentimos ingreso un dato no valido para este campo");
                seguir = false;
            }
        } while (!seguir);
        System.out.print("------------------------------------");
        System.out.print("DATOS GUARDADOS CORRECTAMENTE");
        System.out.println("------------------------------------");
        System.out.println("\n");
    }

    /**
     *El metodo Desplegar() se usa para desplegar los datos ingresados por el usuario
     * almacenados en el documento Archivo.txt generado en el metodo Guardar()
     */
    public void Desplegar() {
        //Creamos un String que va a contener todo el texto del archivo
        String texto;
        try {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader("Archivo.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while ((texto = contenido.readLine()) != null) {
                System.out.println("\n" + texto);
            }
        } //Si se causa un error al leer cae aqui
        catch (IOException e) {
            System.out.println("Error al leer");
        }
    }
}
