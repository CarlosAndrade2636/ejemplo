export class Producto {
    id?: number;
    nombre: string;
    apellido: string;
    edad: number;
    sexo: string;
    nivelEduacion: string;
    nacionalidad: string;
    tiempo:number;


    constructor(nombre: string, apellido: string,edad: number,sexo: string,nivelEduacion: string,nacionalidad: string,tiempo: number,) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.nivelEduacion = nivelEduacion;
        this.nacionalidad = nacionalidad;
        this.tiempo=tiempo;
    }
}


