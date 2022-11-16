package punto3;

import punto1.*;


public class Grupo extends ElementoUniversidad {
	private String nombre;
	private ListaVinculada<ElementoUniversidad> elementos;
	
	public Grupo(String nombre){
		this.nombre = nombre;
		elementos = new ListaVinculada<>();
	}

	@Override
	public int contarAlumnos() {
		int contarTotal = 0;
		for(ElementoUniversidad elemento: elementos){
			contarTotal = elemento.contarAlumnos();
		}
		return contarTotal;
	}

	public String getNombre() {
		return nombre;
	}

	

}
