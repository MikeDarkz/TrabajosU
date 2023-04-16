import { HttpClient } from '@aurelia/fetch-client';
import { inject } from 'aurelia';
import { IPersona } from '../model/persona.model';

@inject(HttpClient)
export class PersonaService {

	constructor(private http: HttpClient) {

	}

    public async consultarPersonas(): Promise<IPersona> {
        const req = await this.http.fetch(`https://trabajosu-production.up.railway.app/personas`);
        console.log(req.json());
        return req.json();
    }
}