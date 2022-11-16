package punto3;

import punto1.*;

public class Universidad {
	private String nombre;
	private ListaVinculada<ElementoUniversidad> elementos;
	
	public Universidad(String nombre){
		this.nombre = nombre;
		elementos = new ListaVinculada<>();
	}
	
	public int contarTotalDeAlumnos() {
		int contarTotal = 0;
		for(ElementoUniversidad elemento: elementos){
			contarTotal = elemento.contarAlumnos();
		}
		return contarTotal;
	}

	public void ordenarAlumnos(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
