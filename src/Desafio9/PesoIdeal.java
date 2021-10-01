package Desafio9;

import java.util.Scanner; //libreria necesaria para utilizar clase scanner

public class PesoIdeal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in); //defino clase scanner

        //defino variables
        float altura;
        int genero;

        //pido datos y guardo en variables
        System.out.print("Ingrese la altura en centimetros: ");
        altura = scanner.nextFloat();
        System.out.println("Ingrese el género  1- Si es Mujer  2- Si es Hombre: ");
        genero = scanner.nextInt();

        //analizo género ingresado y realizo la consigna requerida
        if (genero == 1){
            System.out.println("El peso ideal  es => " + (altura-120) + " kg");
        } else if(genero == 2){
            System.out.println("El peso ideal es => " + (altura-110) + " kg");
        }else{
            System.out.println("El número ingresado no corresponde con ningún género");
        }


    }
}
