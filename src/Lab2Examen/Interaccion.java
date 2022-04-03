package Lab2Examen;

import java.util.Scanner;

public class Interaccion {
    public static void main(String[] args) {
        Personal persona1 = new Personal();
        int opcion = 53; //numero random poco común para que siempre entre al while
        Scanner entrada = new Scanner(System.in);
        try {
            while (opcion != 0) {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre de la persona");
                        String nombre = entrada.next();
                        System.out.println("Ingrese el apellido de la persona");
                        String apellido = entrada.next();
                        System.out.println("Ingrese el DNI de la persona");
                        int dni = entrada.nextInt();
                        System.out.println("Ingrese el sueldo de la persona");
                        double sueldo = entrada.nextDouble();
                        System.out.println("La persona que está creando ¿Es Jefe o es Empleado? ");
                        String tipo = entrada.next();
                        if (tipo.equals("empleado")) {
                            Empleados empleado = new Empleados(nombre, apellido, dni, sueldo);
                            persona1.addPersona(empleado);
                        } else {
                            System.out.println("Ingrese el porcentaje");
                            double porcentaje = entrada.nextDouble();
                            Jefe jefe = new Jefe(nombre, apellido, dni, sueldo, porcentaje);
                            persona1.addPersona(jefe);
                        }
                        break;
                    case 2:
                        persona1.listarPersonas();
                        break;

                    case 3:
                        System.out.println("Ingrese el DNI de la persona que desea eliminar: ");
                        int dniEliminar = entrada.nextInt();
                        persona1.eliminarPersona(dniEliminar);
                        break;

                    case 4:
                        System.out.println("Ingrese el DNI de la persona que desea buscar");
                        int dniBuscar = entrada.nextInt();
                        persona1.buscarPersona(dniBuscar);
                        break;
                    case 5:
                        System.out.println("Ingrese el DNI de la persona que desea modificar");
                        int dniModificar = entrada.nextInt();
                        persona1.modificarPersona(dniModificar);
                        break;
                    case 6:
                        System.out.println("Ingrese el DNI de la persona que desea ver el sueldo");
                        int dniVerSueldo = entrada.nextInt();
                        persona1.verSueldo(dniVerSueldo);
                        break;
                    case 7:
                        System.out.println("Ingrese el DNI de la persona y el valor del incremento de sueldo");
                        int dniIncremento = entrada.nextInt();
                        double incremento = entrada.nextDouble();
                        persona1.aumentarSalario(dniIncremento, incremento);
                        break;
                    default:
                        break;


                }

                System.out.println("-----------------------------" + "\n"
                        + "1.crear persona\n"
                        + "2.listar personas\n"
                        + "3.eliminar persona\n"
                        + "4.buscar persona\n"
                        + "5.modificar persona\n"
                        + "6.ver sueldo de la persona\n"
                        + "7.aumentar el sueldo de la persona\n"
                        + "0.salir\n"
                        + "ingrese la opcion: ");
                opcion = entrada.nextInt();
            }
        }
        //en caso de error se asigna numero random de nuevo para que se vuelva a consultar los datos y no se cierre el programa
        catch (Exception e) {
            System.out.println("error en el ingreso de datos");
            opcion = 53;
        }
        //se cierra scanner porque no se utilizará más
        entrada.close();

    }
}
