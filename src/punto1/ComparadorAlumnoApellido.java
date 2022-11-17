package punto1;
import punto2.*;
//import punto3.*;

import java.util.Comparator;

public class ComparadorAlumnoApellido implements Comparator<Alumno> {

	
	
	@Override
	public int compare(Alumno alumno1, Alumno alumno2) {
		if(alumno1.getApellido().compareTo(alumno2.getApellido()) > 0){
			return 1;
		}
		else if(alumno1.getApellido().compareTo(alumno2.getApellido()) < 0){
			return -1;
		}
		return 0;
	}

}


