package Lab2Examen;

import java.util.LinkedList;
import java.util.Scanner;

public class Personal {
    private LinkedList<Persona> personas;
    Scanner input = new Scanner(System.in);

    public Personal() {
        personas = new LinkedList<Persona>();
    }


    public void listarPersonas() {
        for (Persona i : personas) {
            System.out.println(i.toString());
        }
    }

    public void addPersona(Persona personas) {
        this.personas.add(personas);
    }

    public void eliminarPersona(int dniEliminar) {
        boolean existe = false;
        for (Persona i : personas) {
            if (i.getDni() == dniEliminar) {
                this.personas.remove(i);
                existe = true;
                break;
            }
        }
        if (existe) System.out.println("borrado con exito");
        else System.out.println("dni no encontrado");
    }

    public void modificarPersona(int dniModificar) {
        boolean existe = false;
        for (Persona i : personas) {
            if (i.getDni() == dniModificar) {
                System.out.println("escribir nuevo nombre: ");
                String nombre = input.next();
                i.setNombre(nombre);
                System.out.println("escribir nuevo apellido");
                String apellido = input.next();
                i.setApellido(apellido);
                System.out.println("escribir nuevo dni");
                int dni = input.nextInt();
                i.setDni(dni);
                System.out.println(i.toString());
            } else System.out.println("no existe la persona.");
        }
    }

    public void buscarPersona(int dniBuscar) {
        for (Persona i : personas) {
            if (i.getDni() == dniBuscar) {
                System.out.println("persona encontrada : " + i.toString());
            } else System.out.println("persona no encontrada");
        }

    }

    public void verSueldo(int dniVerSueldo) {
        boolean existe = false;
        for (Persona i : personas) {
            if (i.getDni() == dniVerSueldo) {
                System.out.println("el sueldo es: " + i.getSueldoBasico());
                existe = true;
                break;
            }
        }
        if (existe) System.out.println("mostrar sueldo exitosamente");
        else System.out.println("error dni no encontrado");
    }

    public void aumentarSalario(int dniAumentar, double incremento) {
        for (Persona i : personas) {
            if (i.getDni() == dniAumentar) {
                i.subirSueldo(incremento);
            }
            System.out.println("Persona no encontrada");
        }
    }
}

