package punto3;

import java.util.Iterator;

public abstract class ElementoUniversidad implements Comparable<ElementoUniversidad>{
	public abstract int contarAlumnos();
//	public abstract void imprimirEstructura();
		
	public Iterator<ElementoUniversidad> iterator() {
		
		return null;
	}
	
	//compareTo que nos dijo Franco de hacer
	@Override 
	public int compareTo(ElementoUniversidad grupo) {
		return this.contarAlumnos() - grupo.contarAlumnos();
	}

}
