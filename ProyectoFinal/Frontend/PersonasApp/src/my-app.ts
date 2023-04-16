import { PersonaService } from "./services/personas.service";

export class MyApp {

  private personaService;

  constructor(private service: PersonaService) {

  }

  attached() {
    this.consulta();
  }

  async consulta() {
    this.service.consultarPersonas();
  }
}
