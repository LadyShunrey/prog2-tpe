package punto3;

import punto1.*;

import java.util.ArrayList;

public class Universidad {
	private String nombre;
	private ArrayList<ElementoUniversidad> elementos;
	
	public Universidad(String nombre){
		this.nombre = nombre;
		elementos = new ArrayList<>();
	}
	
	public int contarTotalDeAlumnos() {
		int contarTotal = 0;
		for(ElementoUniversidad elemento: elementos){
			contarTotal += elemento.contarAlumnos();
		}
		return contarTotal;
	}
	
	public void imprimirEstructura(){
		System.out.println("Esta universidad se llama: " + nombre + " y adentro tiene todos estos elementos");
		for(ElementoUniversidad elemento: elementos){
			elemento.imprimirEstructura();
		}
	}
	
	public void addElemento(ElementoUniversidad elemento){
		elementos.add(elemento);
	}

	public void ordenarAlumnos(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
