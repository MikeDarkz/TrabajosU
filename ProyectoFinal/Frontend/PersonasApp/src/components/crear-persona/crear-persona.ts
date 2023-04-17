import { IRouter } from "@aurelia/router";
import { PersonaService } from "../../services/personas.service";
import { IPersona } from "../../model/persona.model";

export class CrearPersona {
    private nombre: string;
    private apellido: string;
    private edad: number;
    private genero: string;

    constructor(private service: PersonaService, @IRouter private router: IRouter) {}

    async crearPersona(){
        const personaCrear: IPersona = {
            nombre: this.nombre,
            apellido: this.apellido,
            edad: this.edad,
            genero: this.genero
        }
        const respuesta = await this.service.crearPersona(personaCrear);
        if (respuesta.id) {
            this.limpiarFormulario();
            this.router.load("/personas");
        } else {
            this.limpiarFormulario();
        }
    }

    limpiarFormulario() {
        this.nombre = '';
        this.apellido = '';
        this.edad = 0;
        this.genero = '';
    }
}