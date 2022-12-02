
package com.mycompany.proyectozoolechugadiego;

public class AnimalZoo {
    //Atributos
    String nombre;
    String tamaño;
    String habitad;
    byte edad;
    String alimentacion;
    String localizacion;
   
    //Constructores
    public AnimalZoo (){
        
    }
    public AnimalZoo (String nombre, String tamaño, String habitad, byte edad, String alimentacion, String localizacion){
       this.nombre = nombre;
       this.tamaño = tamaño;
       this.habitad = habitad;
       this.edad = edad;
       this.alimentacion = alimentacion;
       this.localizacion = localizacion;
    }
        
    //Metodos
    public void observarInfo (){
            System.out.printf("La edad de " + nombre + " es " + edad + " tiene un tamaño " + tamaño + " su habitad es " + habitad + "\n"+"su alimentación es " + alimentacion + " y se localiza en " + localizacion);
        
    }
    //Gets and Sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
}
