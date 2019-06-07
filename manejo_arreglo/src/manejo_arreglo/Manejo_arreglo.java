/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_arreglo;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Manejo_arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad = 0, pos;//(catidd devalores a ingresar)(posicion a ingresar)

        Scanner entrada = new Scanner(System.in);
        System.out.print("DIGITE LA CANTIDAD DE NUMEROS QUE DESEA INGRESAR : ");
        cantidad = entrada.nextInt();
        //usuario ingresa cantidad a conveniencia 

        int[] valores = new int[cantidad];
        Scanner sc = new Scanner(System.in);

        /*
         int[] valores = new int[4];
         Scanner entrada = new Scanner(System.in);

         System.out.println(valores[3]);
         valores[1 + 1] = 35;
         valores[2] = 35;
         // valores [4] = 25;
         for (int i = 0; i < valores.length; i++) {
         System.out.println(valores[i]);
         }
         .....................
         */
        for (int i = 0; i < valores.length; i++) {
            pos = i + 1;//aumento 1 para mejor entedimeinto de ubicacion al usuario
            System.out.print("VALOR[" + pos + "]  : ");//conteo para ingreso de valores
            valores[i] = entrada.nextInt();//se lee y se obtiene los valores 
        }
        /*for (int i = 0; i < valores.length; i++) {
         System.out.println(valores[i]);
         }*/
        System.out.println("Los [" + cantidad + "] valores ingresados son: ");
        //anuncio la cantidad de valores que se han ingresado
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);//preseto uno a uno los valores anteriores
        }

    }

}
