package EquipoFutbol;


public class Doctor extends Persona {
    //titulacion   int años exp
    private String titulacion;
    private int añosExp;
    

    public Doctor(String titulacion, int añosExp, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExp = añosExp;
    }
    
    //Curarar lreiosn
    public void curarLesion(){
        System.out.println("Medico "+super.nombre+" -->  Cuarando Lesion");
    }
    @Override
    public void viajar() {
        System.out.println(super.nombre+"Viajando al estadio para cuidar a los futbolistas");
    }

    @Override
    public void partidoFutbol() {
        System.out.println(super.nombre+"-->  Atento al partido por si algun futbolista se lesiona");
    }

    @Override
    public void entrenamiento() {
        System.out.println(super.nombre+"Creando rutinas para prevenir lesiones");
    }
}
