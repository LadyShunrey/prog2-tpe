package punto2;

import punto1.ListaVinculada;
import punto3.*;

import java.util.ArrayList;

public class Alumno extends ElementoUniversidad{
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
	public String toString() {
		return "El alumno: " + apellido +", "+ nombre + ". Con DNI " + dni + " y edad " + edad + " y sus intereses son: "+intereses+"\n";
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
}
