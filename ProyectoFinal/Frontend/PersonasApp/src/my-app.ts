import { ConsultarPersonas } from "./components/consultar-personas/consultar-personas";
import { CrearPersona } from "./components/crear-persona/crear-persona";
import { EditarPersona } from "./components/editar-persona/editar-persona";
import { EliminarPersona } from "./components/eliminar-persona/eliminar-persona";

export class MyApp {
  static routes = [
    {
      path: '',
      component: ConsultarPersonas,
      title: 'Consulta de personas'
    },
    {
      path: 'personas',
      component: ConsultarPersonas,
      title: 'Consulta de personas'
    },
    {
      path: 'personas/crear',
      component: CrearPersona,
      title: 'Creación de persona'
    },
    {
      path: 'personas/actualizar/:id',
      component: EditarPersona,
      title: 'Actualización de persona'
    },
    {
      path: 'personas/eliminar/:id',
      component: EliminarPersona,
      title: 'Eliminando persona..'
    },
  ];
}
