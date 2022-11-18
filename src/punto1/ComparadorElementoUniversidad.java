package punto1;

import java.util.Comparator;
import punto3.*;

public class ComparadorElementoUniversidad implements Comparator<ElementoUniversidad>{
	public int compare(ElementoUniversidad elemento1, ElementoUniversidad elemento2){
		if(elemento1.contarAlumnos()>elemento2.contarAlumnos()){
			return 1;	
		}
		else if(elemento1.contarAlumnos()<elemento2.contarAlumnos()){
			return -1;	
		}
		return 0;
	}
}
