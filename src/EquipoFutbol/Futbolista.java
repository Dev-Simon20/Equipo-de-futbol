
package EquipoFutbol;


public class Futbolista extends Persona {
    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    
    
    

    @Override
    public void viajar() {
        System.out.println(super.nombre+"-->  Estoy viajando para el partido");
    }

    @Override
    public void partidoFutbol() {
        System.out.println(super.nombre+"-->  Estoy jugando un partido oficial");
    }

    @Override
    public void entrenamiento() {
        System.out.println(super.nombre+"-->  Estoy entrenando para el partido oficial");
    }
    
    public void entrevista(){
        System.out.println(super.nombre+"-->  Estoy dadni un entrevista");
    
    }

    
}
