import { IRouteableComponent, IRouter } from "@aurelia/router";
import { PersonaService } from "../../services/personas.service";
import { IPersona } from "../../model/persona.model";
export class ConsultarPersonas implements IRouteableComponent {
    private personas: IPersona[];

    constructor(private service: PersonaService, @IRouter private router: IRouter){     
    }

    attached(){
        this.consultarPersonas();
    }

    async consultarPersonas() {
        this.personas = await this.service.consultarPersonas();
    }

    redirigirCreacion() {
        this.router.load("/personas/crear");
    }

    redirigirActualizar(id) {
        this.router.load(`/personas/actualizar/${id}`);
    }

    redirigirEliminar(id){
        this.router.load(`/personas/eliminar/${id}`);
    }
}