package POO.TPLAFACULTAD;

import java.util.Scanner;

public class Profesor extends Persona {
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo() {
        return (this.basico + (this.basico * (0.1 * this.antiguedad)));
    }

    @Override
    public void modificarDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Esta por modificar los datos del Profesor: " + this.toString());
        System.out.println("Ingrese el nombre:");
        String nombre = input.nextLine();
        this.setNombre(nombre);
        System.out.println("Ingrese el apellido:");
        String apellido = input.nextLine();
        this.setApellido(apellido);
        System.out.println("Ingrese el legajo:");
        int legajo = input.nextInt();
        this.setLegajo(legajo);
        System.out.println("Ingrese el basico del sueldo:");
        double basico = input.nextDouble();
        this.setBasico(basico);
        System.out.println("Ingrese la antiguedad:");
        int antiguedad = input.nextInt();
        this.setAntiguedad(antiguedad);
        System.out.println("Se modificaron los datos del Profesor: " + this.toString());

        input.close();
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString() + "\nbasico: " + basico + "\nantiguedad: " + antiguedad;
    }
}
