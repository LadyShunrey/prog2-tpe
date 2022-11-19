package punto1;

import java.util.Comparator;

import punto2.*;

public class ComparadorAND implements Comparator<Alumno>{
	Comparator<Alumno> c1;
	Comparator<Alumno> c2;
	
	public ComparadorAND(Comparator<Alumno> c1, Comparator<Alumno> c2){
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		int result = c1.compare(o1, o2);
		if(result == 0){
			result = c2.compare(o1, o2);
		}
		return result;
	}

}
