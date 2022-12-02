
package com.mycompany.proyectozoolechugadiego;

public class AnaLeon extends AnimalZoo {
    //Atributos
    private float tamañoGarrasMM;
    private float tamañoColaCM;
    
    //Constructores
    public AnaLeon (){
        nombre = "Ana";
        tamaño = "Grande";
        habitad = "Terrestre";
        edad = 5;
        alimentacion = "Carnivoro";
        localizacion = "Africa";
        tamañoGarrasMM = 10f;
        tamañoColaCM = 30f;
    }
    public AnaLeon (String nombre, String tamaño, String habitad, byte edad, String alimentacion, String localizacion, float tamañoGarrasMM,float tamañoColaCM){
       this.nombre = nombre;
       this.tamaño = tamaño;
       this.habitad = habitad;
       this.edad = edad;
       this.alimentacion = alimentacion;
       this.localizacion = localizacion;
       this.tamañoGarrasMM = tamañoGarrasMM;
       this.tamañoColaCM = tamañoColaCM;
    }
    @Override
    public void observarInfo() {
        super.observarInfo();
    }
    public void rugir () {
            System.out.println("Ana se molesto, rugio para asustarte");
    }
    public void atacar () {
            System.out.println("Ana ataco a la reja, deberias dejarla en paz");
    }
    //Gets and Sets
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

    public float getTamañoGarrasMM() {
        return tamañoGarrasMM;
    }

    public void setTamañoGarrasMM(float tamañoGarrasMM) {
        this.tamañoGarrasMM = tamañoGarrasMM;
    }

    public float getTamañoColaCM() {
        return tamañoColaCM;
    }

    public void setTamañoColaCM(float tamañoColaCM) {
        this.tamañoColaCM = tamañoColaCM;
    }
}
