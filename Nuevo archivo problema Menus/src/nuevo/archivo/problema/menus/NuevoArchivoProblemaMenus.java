/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevo.archivo.problema.menus;

import java.util.Scanner;

/**
 *
 * @author Andre Flores
 */
public class NuevoArchivoProblemaMenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Menu");
        System.out.println("1 -> Promedio con ciclo");
        System.out.println("2 -> Factorial");
        System.out.println("3 -> Tabla de multiplicar");
        System.out.println("4 -> Numero primo");
        System.out.println("5 -> Potencias");
        System.out.println("6 -> serie fibonacci");
        System.out.println("7 -> salir ");
        System.out.println("Ingrese su opcion");
        
        int opcion = leer.nextInt();
        
        while(opcion != 7){
            
        if (opcion == 1) {
            System.out.print("promedio en proceso, ");
            System.out.print(" ingrese cantidad de numeros");
            int limite = leer.nextInt();
            int contador = 0;
            double numero;
            double acumulador = 0.0;
            
            while (contador < limite) {
                System.out.println(" ingrese su numero: ");
                numero = leer.nextInt();
                acumulador = acumulador + numero;
                contador = contador + 1; 
                
            } // fin del while
            double promedio = acumulador/limite;
            System.out.println("El promedio es " + promedio);
        } // fin de opcion 1
            else
                if (opcion == 2) {
                int numero, factorial, contador;
                factorial = 1;
                contador = 1;
                System.out.print("Ingrese un numero");
                numero = leer.nextInt();
                
                while (numero < 1 || numero > 15) {
                    System.out.print("Ingrese un numero correcto: ");
                    numero = leer.nextInt();
                
                } // fin del while validacion
                System.out.println("Pase");
                while (contador <= numero){ 
                    factorial = factorial * contador;
                    contador = contador + 1;
                    
                } // fin while contador
                System.out.println(">> El factorial del numero" + numero + " es: " + factorial);
                } // fin opcion 2
                else if (opcion == 3) {
                    // entradas
                    System.out.println(" opcion tabla--\n");
                    System.out.print("ingrese numero");
                    int mult = leer.nextInt();
                    System.out.print("Ingrese limite: ");
                    int limite = leer.nextInt();
                    // validacion
                    if (mult < 0) {
                        System.out.println("No se puede hacer tabla con numero negativo");
                        
                    } // mult
                    else if (mult == 0) {
                        System.out.println("el numero 0 no puede hacer tabla");
                        
                    } // fin de else if mult
                    else {
                        int i = 1;
                        // calculo de la tabla
                        while (i <= limite){
                            int promedio = i * mult;
                            System.out.printf("%d x %d = %d%n", mult, i, promedio);
                            i++; 
                        } // fin while limite
                    } // fin else int
                } // fin opcion 3
                else if (opcion == 4){
                    int c4, primo, numero, respuesta;
                    primo = 0;
                    c4 = 2; 
                    System.out.println("Ingrese un numero para poder determinar si es primo o no");
                    numero =leer.nextInt();
                    
                    while (c4<numero){
                        respuesta = numero % c4;
                        if (respuesta == 0) {
                            primo = 1;
                        } //fin if respu 0
                        c4++;
                    } //fin while numero
                    if (primo ==1){
                        System.out.println("El numero no es un numero primo");
                    } //finprimo1
                    else if (primo == 0){
                        System.out.println("El numero es primo");
                    } // fin del else if 0
                } // fin opcion 4
                else if (opcion == 5){
                    System.out.print(" ingrese la base: ");
                    int base = leer.nextInt();
                    System.out.print("ingrese la potencia:  ");
                    int expo = leer.nextInt();
                    
                    int i = 0;
                    int respuesta = 1;
                    while (i < expo) {
                        respuesta *= base;
                        i++;
                    } // fin while exponentes
                    System.out.printf("%d a la %d potencia es: %d", base, expo, respuesta);
                } //fin op5
                else
                    if (opcion == 6) {
                        int x, y, suma, contador, limite;
                        System.out.println("ingrese el limite de la serie:  ");
                        limite = leer.nextInt();
                        x = 0;
                        y = 1;
                        suma = 0;
                        contador = 0;
                        System.out.println(x+",  " +y+",  ");
                        
                        while (contador < limite -2) {
                            suma = x + y;
                            System.out.print(suma+" , ");
                            x=y;
                            y=suma;
                            contador++;
                        } //fin while
                    } // fin op6
                    else
                        if (opcion == 7){
                            System.out.println("Saliendo... ");
                        } //fin del if
                            System.out.println("1 -> Promedio con ciclo");
                            System.out.println("2 -> Factorial");
                            System.out.println("3 -> Tabla de multiplicar");
                            System.out.println("4 -> Numero primo");
                            System.out.println("5 -> Potencias");
                            System.out.println("6 -> serie fibonacci");
                            System.out.println("Ingrese su opcion");
                            opcion = leer.nextInt();
        } // fin del while opcion 7
    }// fin del main
    
} // fin de clase
    
    

