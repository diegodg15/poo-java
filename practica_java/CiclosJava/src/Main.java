import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ciclos java:

        //ciclo while:
        int i = 0;
        while (i <= 10) {
            i++; // i++; es lo mismo que (i+=1;) o (i = i + 1;)
        }

        //ciclo for:


        //------------------------------------------------------------------------------
        /*Ejemplos por cada bucle*/
        //WHILE:

        int contador = 3;

        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }
        System.out.println("Felíz año nuevo");

        //FOR

        for (int contador2 = 3; contador2 > 0; contador2--) {
            System.out.println(contador2);
        }
        System.out.println("Feliz año nuevo");

        //DO WHILE
        int contador3 = 3;
        do {
            System.out.println(contador3);
            contador3--;
        } while (contador3 > 0);
        System.out.println("feliz año nuevo");

        //Uso de centinela
        //la centinela es el primer número negativo
        /**
         * CENTNELA:
         * Actúa como señal de parada: cuando el programa encuentra ese valor, sabe que debe detenerse.
         * Se usa en estructuras como listas, arreglos, o bucles de lectura, especialmente cuando no se conoce de antemano la cantidad de datos.
         *
         */
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println("Número leído: " + numero);
            }
        } while (numero >= 0);

        System.out.println("Fin de la lectura");


    }

}