package TrabajoGrupal;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Salas sala = new Salas(3, "Sala 01");
        sala.setPelicula("Jocker");

        Espectadores espectador1 = new Espectadores("Joaquin", 21, "A", 12);
        Espectadores espectador2 = new Espectadores("Ivan", 30, "A", 2);
        espectador1.setSala(sala.getNombre());
        espectador2.setSala(sala.getNombre());

        System.out.println("| Espectadores |" + sala.getEspectadores());

        Acomodadores acomodador1 = new Acomodadores("Juan", 35);
        acomodador1.setSala(sala.getNombre());
        acomodador1.setSueldo(50000);
        System.out.println("| Acomodador 1 |"+ acomodador1.toString());

        Empleados empleado1 = new Empleados("Alan", 32);
        empleado1.setSueldo(30000);
        System.out.println("| Empleado 1 |"+ empleado1.toString());




    }
}

