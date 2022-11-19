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
			contarTotal += elemento.contarAlumnos();
		}
		return contarTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void addElemento(ElementoUniversidad elemento){
		elementos.insertar(elemento);
	}

//	public void imprimirEstructura(){
//		System.out.println("Este grupo se llama: " + nombre +" y adentro tiene todos estos elementos");
//		for(ElementoUniversidad elemento: elementos){
//			elemento.imprimirEstructura();
//		}
//	}
	
	
	
	@Override
	public String toString() {
		String resultado = "Este grupo se llama: " + nombre + "\n";
		resultado += "Y adentro tiene todo esto: \n";
		for(ElementoUniversidad elemento: elementos){
			resultado += elemento.toString();
		}
		return resultado;
	}

}
