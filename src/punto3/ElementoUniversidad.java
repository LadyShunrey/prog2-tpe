package punto3;

import java.util.Iterator;

public abstract class ElementoUniversidad implements Iterable<ElementoUniversidad>{
	public abstract int contarAlumnos();
	
	public Iterator<ElementoUniversidad> iterator() {
		
		return null;
	}
}
