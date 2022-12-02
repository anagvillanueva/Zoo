
package com.mycompany.proyectozoolechugadiego;

public class CarlosCapibara extends AnimalZoo {
    //Atributos
    private String colorPelaje;
    private float tamañoDientesCM;
    
    //Constructores
    public CarlosCapibara (){
        nombre = "Carlos";
        tamaño = "Pequeño";
        habitad = "Terrestre";
        edad = 3;
        alimentacion = "Herviboro";
        localizacion = "Sudamerica";
        colorPelaje = "Cafe claro";
        tamañoDientesCM = 5.0f;
    }
    public CarlosCapibara (String nombre, String tamaño, String habitad, byte edad, String alimentacion, String localizacion, String colorPelaje, float tamañoDientesCM){
       this.nombre = nombre;
       this.tamaño = tamaño;
       this.habitad = habitad;
       this.edad = edad;
       this.alimentacion = alimentacion;
       this.localizacion = localizacion;
       this.colorPelaje = colorPelaje;
       this.tamañoDientesCM = tamañoDientesCM;
    }
    //Metodos
    @Override
    public void observarInfo() {
        super.observarInfo();
    }
    public void alimentar (){
            System.out.println ("Carlos esta comiendo, se le ve feliz");
    }
    public void transportar () {
            System.out.println("Un pajaro se subio sobre Carlos, este lo lleva al otro lado de la exhibicion");
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

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public float getTamañoDientesCM() {
        return tamañoDientesCM;
    }

    public void setTamañoDientesCM(float tamañoDientesCM) {
        this.tamañoDientesCM = tamañoDientesCM;
    }
    
}
