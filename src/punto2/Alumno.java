package punto2;

import punto1.*;
import punto3.*;

import java.util.ArrayList;

public class Alumno extends ElementoUniversidad implements Comparable<Alumno>{
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private ArrayList<String> intereses;
	
	public Alumno(String nombre, String apellido, int dni, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		intereses = new ArrayList<String>();
	}
	
	//implementar equals
	
	public int contarAlumnos(){
		return 1;
	}

	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}
	
	public void addInteres(String interes){
		intereses.add(interes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Alumno other = (Alumno) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni != other.dni)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Alumno alumno) {
		ComparadorAlumnoApellido comparadorApellido = new ComparadorAlumnoApellido();
		ComparadorAlumnoNombre comparadorNombre = new ComparadorAlumnoNombre();
		ComparadorDNI comparadorDNI = new ComparadorDNI();
		int resultado;
		resultado = comparadorApellido.compare(this, alumno);
		if(resultado==0){
			resultado = comparadorNombre.compare(this, alumno);
		}
		if(resultado==0){
			resultado = comparadorDNI.compare(this, alumno);
		}
		return resultado;
	}
}
