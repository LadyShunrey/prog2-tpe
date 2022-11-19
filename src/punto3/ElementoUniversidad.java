package punto3;

public abstract class ElementoUniversidad implements Comparable<ElementoUniversidad>{
	public abstract int contarAlumnos();
	
	//compareTo que nos dijo Franco de hacer
	@Override 
	public int compareTo(ElementoUniversidad grupo) {
		return this.contarAlumnos() - grupo.contarAlumnos();
	}

}
