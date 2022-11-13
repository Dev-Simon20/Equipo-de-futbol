
package EquipoFutbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     static Scanner entrada=new Scanner(System.in);
     static ArrayList<Persona> perso=new ArrayList<Persona>();
     static Persona jugador1=new Futbolista(8, "MC", "Pedri", "Gonzales",20);
     static Persona jugador2=new Futbolista(9,"Delantero","Robert","Lewandoswi",34);
     static Persona coach=new Entrenador("Posecion de balon ","Xavi", "Hernandez", 40);
     static Persona doc=new Doctor("Ortopedista",15, "Juan","Velarde",40);
     
    public static void agre(){
      perso.add(jugador1);
      perso.add(jugador2);
      perso.add(coach);
      perso.add(doc);
    }
     
     
    public static void main(String[] args) {
        agre();
        int opcion;
        do {
            System.out.println("");
            System.out.println("\tBienvenido al Menu");
            System.out.println("1-Viaje de equipo");
            System.out.println("2-Jugar partido de futbol");
            System.out.println("3-Entrenamiento");
            System.out.println("4-Entrevista");
            System.out.println("5-Planificar entrenamiento");
            System.out.println("6-Curar lesion");
            System.out.println("7-Salir");
            System.out.print("Digite una opcion: ");
            opcion=entrada.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1://ViAJE DE EQUIPO
                        for (Persona p:perso) {                   
                            p.viajar();
                    }
                    break;
                case 2://Jugar partido de futbol
                    for (Persona p:perso) {
                         p.partidoFutbol();
                    }
                    break;
                case 3://Entrenamiento
                    for (Persona p:perso) {
                        p.entrenamiento();
                    }
                    break;
                case 4: //Entrevista
                    
                    Futbolista fut=(Futbolista) jugador1;
                    fut.entrevista();
                    Futbolista fut2=(Futbolista) jugador2;
                    fut2.entrevista();
                    break;
                case 5://Planifica entreno
                      Entrenador trainer=(Entrenador)coach;
                      trainer.planificar();
                      break;
                case 6://Curar lesion
                    Doctor med=(Doctor)doc;
                    med.curarLesion();
                    break;
                case 7://Slir
                    System.out.println("Gracias por usar el programa");
                    break;
                default: System.out.println("Erro de opcion");
                break;
                 
                    
            }
            
        } while (opcion!=7);
        
    }
   
}
