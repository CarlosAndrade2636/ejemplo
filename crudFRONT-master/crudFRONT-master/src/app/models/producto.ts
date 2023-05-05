export class Producto {
    id?: number;
    nombre: string;
    apellido: string;
    edad: number;
    sexo: string;
    nivelEduacion: string;
    nacionalidad: string;



    constructor(nombre: string, apellido: string,edad: number,sexo: string,nivelEduacion: string,nacionalidad: string,) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.nivelEduacion = nivelEduacion;
        this.nacionalidad = nacionalidad;
       
    }
}


