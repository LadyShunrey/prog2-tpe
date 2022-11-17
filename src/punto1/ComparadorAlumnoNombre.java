package punto1;
import punto2.*;

import java.util.Comparator;

public class ComparadorAlumnoNombre implements Comparator<Alumno>{
	

	@Override
	public int compare(Alumno alumno1, Alumno alumno2) {
		if(alumno1.getNombre().compareTo(alumno2.getNombre()) > 0){
			return 1;
		}
		else if(alumno1.getNombre().compareTo(alumno2.getNombre()) < 0){
			return -1;
		}
		return 0;
	}
}
