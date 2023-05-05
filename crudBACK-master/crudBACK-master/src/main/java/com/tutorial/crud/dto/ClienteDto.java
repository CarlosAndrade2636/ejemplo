package com.tutorial.crud.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ClienteDto {

    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotNull
    private float edad;
    @NotBlank
    private String sexo;
    @NotBlank
    private String nivelEduacion;
    @NotBlank
    private String nacionalidad;



    public ClienteDto() {
    }

    public ClienteDto(String nombre, String apellido, float edad, String sexo, String nivelEduacion, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.nivelEduacion = nivelEduacion;
        this.nacionalidad = nacionalidad;
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
