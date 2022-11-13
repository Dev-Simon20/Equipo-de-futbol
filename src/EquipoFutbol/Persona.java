/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoFutbol;

/**
 *
 * @author jean
 */
public abstract class Persona {
    //nombre apellido edad viajr partido futbol entrenaien
         protected String nombre;
         protected String apellido;
         protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
         
         public abstract void  viajar();
         public abstract void partidoFutbol();
         public abstract void entrenamiento();
         
         
       
}
