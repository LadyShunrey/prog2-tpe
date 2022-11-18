package punto3;

import punto1.*;

import java.util.ArrayList;


public class Grupo extends ElementoUniversidad {
	private String nombre;
	private ArrayList<ElementoUniversidad> elementos;
	
	public Grupo(String nombre){
		this.nombre = nombre;
		elementos = new ArrayList<>();
	}

	@Override
	public int contarAlumnos() {
		int contarTotal = 0;
		for(ElementoUniversidad elemento: elementos){
			contarTotal += elemento.contarAlumnos();
		}
		return contarTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void addElemento(ElementoUniversidad elemento){
		elementos.add(elemento);
	}

	public void imprimirEstructura(){
		System.out.println("Este grupo se llama: " + nombre +" y adentro tiene todos estos elementos");
		for(ElementoUniversidad elemento: elementos){
			elemento.imprimirEstructura();
		}
	}
	
	@Override
	public String toString() {
		return "Este grupo se llama: " + nombre;
	}
}
