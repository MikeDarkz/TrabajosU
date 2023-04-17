import { HttpClient, json } from '@aurelia/fetch-client';
import { inject } from 'aurelia';
import { IPersona } from '../model/persona.model';

@inject(HttpClient)
export class PersonaService {

	constructor(private http: HttpClient) {

	}

    public async consultarPersonas(): Promise<IPersona[]> {
        const req = await this.http.fetch(`https://trabajosu-production.up.railway.app/personas`);
        return req.json();
    }

    public async consultarPersonaPorId(id): Promise<IPersona> {
        const req = await this.http.fetch(`https://trabajosu-production.up.railway.app/personas/${id}`);
        return req.json();
    }

    public async crearPersona(persona: IPersona): Promise<IPersona> {
        const req = await this.http.fetch(`https://trabajosu-production.up.railway.app/personas`,
        {
            method: "post",
            body: json(persona)
        });
        return req.json();
    }

    public async actualizarPersona(persona: IPersona): Promise<IPersona> {
        const req = await this.http.fetch(`https://trabajosu-production.up.railway.app/personas/${persona.id}`,
        {
            method: "put",
            body: json(persona)
        });
        return req.json();
    }

    public async eliminarPersona(id): Promise<IPersona> {
        const req = await this.http.fetch(`https://trabajosu-production.up.railway.app/personas/${id}`,
        {
            method: "delete"
        });
        return req.json();
    }
}