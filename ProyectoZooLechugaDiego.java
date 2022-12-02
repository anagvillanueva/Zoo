package com.mycompany.proyectozoolechugadiego;
import java.util.Scanner;
public class ProyectoZooLechugaDiego {

    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
     
        int opcion; //Guardaremos la opcion del usuario
        
          System.out.println("Escribe una de las opciones");
        
          System.out.println("1. Pancho la Foca");
          System.out.println("2. Carlos el Capibara");
          System.out.println("3. Ana la Leona");
          System.out.println("4. Salir");
        
          System.out.print("Opcion:");
   
                opcion = sn.nextInt();
                boolean salir = false;
                    if (opcion == 1){
                    
                    PanchoFoca foquita = new PanchoFoca();
                    
                    System.out.println("--------------------------------------");
                    System.out.println("Has seleccionado ir con Pancho la Foca");
                    
                    System.out.println("¿Qué metodo te gustaria realizar?");
                    System.out.println("1.Observar informacion");
                    System.out.println("2.Aplaudir");
                    System.out.println("3.Huir");
                    System.out.print("Opcion:");
   
                    int Foca;
                    Scanner sn1 = new Scanner(System.in);
                    Foca = sn1.nextInt();
              
                        if(Foca == 1){
                           System.out.println("-----------------------------");
                           System.out.println(" Metodo: Observar informacion" );
                           System.out.println("-----------------------------");
                           foquita.observarInfo();
                        } else if (Foca == 2){
                            System.out.println("----------------");
                            System.out.println("Metodo: Aplaudir");
                            System.out.println("----------------");
                            foquita.aplaudir();
                        
                        }else if (Foca == 3){
                            System.out.println("------------");
                            System.out.println("Metodo: Huir");
                            System.out.println("------------");
                            foquita.huir();
                            
                        }
                        
                    }else if (opcion == 2){
                    CarlosCapibara capibarita = new CarlosCapibara();
                    System.out.println("------------------------------------------");
                    System.out.println("Has seleccionado ir con Carlos el Capibara");
                  
                    System.out.println("¿Qué metodo te gustaria realizar?");
                    System.out.println("1.Observar informacion");
                    System.out.println("2.Alimentar");
                    System.out.println("3.Transportar");
                    System.out.print("Opcion:");
   
                    int Capi;
                    Scanner sn1 = new Scanner(System.in);
                    Capi = sn1.nextInt();
              
                        if(Capi == 1){
                           System.out.println("-----------------------------");
                           System.out.println(" Metodo: Observar informacion");
                           System.out.println("-----------------------------");
                           capibarita.observarInfo();
                        } else if (Capi == 2){
                            System.out.println("------------------");
                            System.out.println("Metodo: Alimentar");
                            System.out.println("------------------");
                            capibarita.alimentar();
                        }else if (Capi == 3){
                            System.out.println("-------------------");
                            System.out.println("Metodo: Transportar");
                            System.out.println("-------------------");
                            capibarita.transportar();
                        }
          
                    }
                    else if(opcion == 3){
                    AnaLeon leoncita = new AnaLeon();
                    
                    System.out.println("------------------------------------");
                    System.out.println("Has seleccionado ir con Ana la Leona");
                    System.out.println("¿Qué metodo te gustaria realizar?");
                    System.out.println("1.Observar informacion");
                    System.out.println("2.Rugir");
                    System.out.println("3.Atacar");
                    System.out.print("Opcion:");
   
                    int Leo;
                    Scanner sn1 = new Scanner(System.in);
                    Leo = sn1.nextInt();
              
                        if(Leo == 1){
                           System.out.println("-----------------------------");
                           System.out.println(" Metodo: Observar informacion");
                           System.out.println("-----------------------------");
                           leoncita.observarInfo();
                        } else if (Leo == 2){
                            System.out.println("--------------");
                            System.out.println("Metodo: Rugir");
                            System.out.println("--------------");
                            leoncita.rugir();
                        }else if (Leo == 3){
                            System.out.println("---------------");
                            System.out.println("Metodo: Atacar");
                            System.out.println("---------------");
                            leoncita.atacar();
                        }
                    }
                    else if (opcion == 4){
                    System.out.println("----------------------------------------------");
                    System.out.println("Adios, gracias por venir al Zoologico Lechuga");
                    salir = true;}
                    else{
                    System.out.println("----------------------------------------");
                    System.out.println("Solo números entre 1 y 4, inicia de nuevo");
                    }
            
        }
    }
    

