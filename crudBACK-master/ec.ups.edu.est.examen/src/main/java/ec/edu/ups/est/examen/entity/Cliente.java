package ec.edu.ups.est.examen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private float edad;
    private String sexo;
    private String nivelEduacion;
    private String nacionalidad;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, float edad, String sexo, String nivelEduacion, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.nivelEduacion = nivelEduacion;
        this.nacionalidad = nacionalidad;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNivelEduacion() {
        return nivelEduacion;
    }

    public void setNivelEduacion(String nivelEduacion) {
        this.nivelEduacion = nivelEduacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
