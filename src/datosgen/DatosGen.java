/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosgen;

/**
 *
 * @author María Lourdes
 */
public class DatosGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "María Lourdes";
        String apellido = "Morán Mazariego";
        int edad = 18;
        String fN = "05/04/1999";
        String carnet = "00113417";
        
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + "\n" + "Fecha de Nacimiento: " + fN + "\n" + "Número de carnet: " + carnet);
    }

}
