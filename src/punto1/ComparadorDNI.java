package punto1;
import java.util.Comparator;

import punto2.*;

public class ComparadorDNI implements Comparator<Alumno>{

	@Override
	public int compare(Alumno alumno1, Alumno alumno2) {
		if(alumno1.getDni() > alumno2.getDni()){
			return 1;
		}
		else if(alumno1.getDni() < alumno2.getDni()){
			return -1;
		}
		return 0;
	}

}
