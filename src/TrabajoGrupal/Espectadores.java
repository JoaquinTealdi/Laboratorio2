package TrabajoGrupal;

 public class Espectadores extends Personas{
    //atributos
    private  String fila;
    private int silla;
    private String sala;

    //constructor
    public Espectadores(String nombre, int edad, String fila, int silla) {
        super.nombre = nombre;
        super.edad = edad;
        this.fila = fila;
        this.silla = silla;
    }



    public String getButaca(){
        return this.fila + this.silla;
    }

    public String getTipo(){
        return "Espectador";
    }

     public String getSala(){ return this.sala;}

    public void setSala(String sala){
         this.sala = sala;
     }


    public String toString() {
        return "\n" + "Nombre: " + super.nombre + "\n" + "Edad: " + super.edad + "\n" + "Fila: " + fila + "\n" + "Silla: " + silla;
    }
}
