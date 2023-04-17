import { IRouter, Parameters } from "@aurelia/router";
import { PersonaService } from "../../services/personas.service";
import { IPersona } from "../../model/persona.model";

export class EditarPersona {
    private nombre: string;
    private apellido: string;
    private edad: number;
    private genero: string;
    private id: any;

    constructor(private service: PersonaService, @IRouter private router: IRouter) {
    }
    
    async canLoad(params: Parameters) {
        this.id = params.id;
        const respuesta = await this.service.consultarPersonaPorId(this.id);
        this.cargarPersonaEnFormulario(respuesta);
        return true;
    }

    async actualizarPersona() {
        const personaActualizar: IPersona = {
            id: this.id,
            nombre: this.nombre,
            apellido: this.apellido,
            edad: this.edad,
            genero: this.genero
        }
        const respuesta = await this.service.actualizarPersona(personaActualizar);
        if (respuesta.id) {
            this.limpiarFormulario();
            this.router.load("/personas");
        } else {
            this.limpiarFormulario();
        }
    }

    cargarPersonaEnFormulario(persona: IPersona) {
        if (persona) {
            this.nombre = persona.nombre;
            this.apellido = persona.apellido;
            this.edad = persona.edad;
            this.genero = persona.genero;
        }
    }

    limpiarFormulario() {
        this.nombre = '';
        this.apellido = '';
        this.edad = 0;
        this.genero = '';
    }
}