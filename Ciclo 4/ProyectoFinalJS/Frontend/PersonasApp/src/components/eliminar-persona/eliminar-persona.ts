import { IRouter, Parameters } from "@aurelia/router";
import { PersonaService } from "../../services/personas.service";

export class EliminarPersona {

    private id: any;

    constructor(private service: PersonaService, @IRouter private router: IRouter){}

    async canLoad(params: Parameters) {
        this.id = params.id;
        const respuesta = await this.service.eliminarPersona(this.id);
        if (respuesta.id) {
            this.router.load("/personas");
        }
        return true;
    }
}