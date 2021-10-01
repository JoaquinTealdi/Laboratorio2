package Desafio_8_Raiz_cuadrada;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double raiz = scanner.nextDouble();
        double resultado = Math.sqrt(raiz);
        System.out.println("La raiz de " + raiz + " es = "+resultado);
    }
}
