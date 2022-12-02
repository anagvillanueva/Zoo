
package com.mycompany.proyectozoolechugadiego;

public class PanchoFoca extends AnimalZoo {
    //Atributos
    private float largoBigotesCM;
    private float largoMTS;
    
    //Constructores
    public PanchoFoca (){
        nombre = "Pancho";
        tamaño = "Mediano";
        habitad = "Marino";
        edad = 6;
        alimentacion = "Carnivoro";
        localizacion = "Oceanos del Norte";
        largoBigotesCM = 15.0f;
        largoMTS = 1.75f;
    }
    public PanchoFoca (String nombre, String tamaño, String habitad, byte edad, String alimentacion, String localizacion, float largoBigotesCM, float largoMTS){
       this.nombre = nombre;
       this.tamaño = tamaño;
       this.habitad = habitad;
       this.edad = edad;
       this.alimentacion = alimentacion;
       this.localizacion = localizacion;
       this.largoBigotesCM = largoBigotesCM;
       this.largoMTS = largoMTS;
    }
    //Metodos
    public void aplaudir (){
            System.out.println("Pancho Aplaudio");
    }
    public void huir (){
        
            System.out.println("Pancho se asusto, esta nadando a su casa");
    }

    @Override
    public void observarInfo() {
        super.observarInfo();
    }
    //Gets and Sets

    public float getLargoBigotesCM() {
        return largoBigotesCM;
    }

    public void setLargoBigotesCM(float largoBigotesCM) {
        this.largoBigotesCM = largoBigotesCM;
    }

    public float getLargoMTS() {
        return largoMTS;
    }

    public void setLargoMTS(float largoMTS) {
        this.largoMTS = largoMTS;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTamaño() {
        return tamaño;
    }

    @Override
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String getHabitad() {
        return habitad;
    }

    @Override
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    @Override
    public byte getEdad() {
        return edad;
    }

    @Override
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String getAlimentacion() {
        return alimentacion;
    }

    @Override
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
}