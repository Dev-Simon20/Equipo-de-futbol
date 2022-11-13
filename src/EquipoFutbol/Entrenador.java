
package EquipoFutbol;


public class Entrenador extends Persona{
    //esyratehgia
       private String estrategia;
       


    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }
    
    //Planificar 
    
    public void planificar(){
       System.out.println(super.nombre+"-->   Estoy planeando una estrategia para el partido");
    }

    @Override
    public void viajar() {
        System.out.println(super.nombre+"-->  Viajando para dirigir al equipo");
    
    }

    @Override
    public void partidoFutbol() {
        System.out.println(super.nombre+"-->  Estoy dirigiendo el partido");
    }

    @Override
    public void entrenamiento() {
        System.out.println(super.nombre+"-->  Estoy entrenando al equipo para el partido");
    }
    
}
