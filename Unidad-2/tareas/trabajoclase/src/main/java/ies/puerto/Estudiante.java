package ies.puerto;
/**
 * @author rabgonzalez
 */
public class Estudiante{
    private String Nombre;
    private String Carrera;
    private int Edad;
    private int Promedio;

    public Estudiante(){}

    public Estudiante(String Nombre, String Carrera, int Edad, int Promedio){
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.Edad = Edad;
        this.Promedio = Promedio;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getCarrera(){
        return this.Carrera;
    }
    
    public int getEdad(){
        return this.Edad;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public int getPromedio(){
        return this.Promedio;
    }

    public void setPromedio(int Promedio){
        this.Promedio = Promedio;
    }

    public String detalles(){
        return "Nombre: " + Nombre + "Edad: " + Edad + "Carrera: " + Carrera;
    }

    public boolean verificarAprobado(){
        boolean resultado = false;
        if(Promedio >= 5){
            resultado = true;
        }
        return resultado;
    }
}