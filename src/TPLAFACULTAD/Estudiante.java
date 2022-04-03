package POO.TPLAFACULTAD;

import java.util.Scanner;

public class Estudiante extends Persona {

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }


    @Override
    public void modificarDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Está por modificar los datos del estudiante: " + this.toString());
        System.out.println("Ingrese el nombre:");
        String nombre = input.nextLine();
        this.setNombre(nombre);
        System.out.println("Ingrese el apellido:");
        String apellido = input.nextLine();
        this.setApellido(apellido);
        System.out.println("Ingrese el legajo:");
        int legajo = input.nextInt();
        this.setLegajo(legajo);
        System.out.println("Se modificaron los datos del estudiante:");
        System.out.println(this.toString());

        input.close();
    }


    @Override
    public String toString() {
        return "Estudiante: " + super.toString();
    }
}
