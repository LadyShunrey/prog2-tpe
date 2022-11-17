package punto4;

import punto1.*;
import punto2.*;
import punto3.*;

public class MainPunto4 {

	public static void main(String[] args) {
		//PUNTO A
		System.out.println("--------- EL PUNTO A ---------");
		ComparadorInteger<Integer> comparadorDeInts = new ComparadorInteger<>();
		
		ListaVinculada<Integer> listaDeNumeros = new ListaVinculada<>(comparadorDeInts);
		
		Integer numero1 = 10;
		Integer numero2 = 21;
		Integer numero3 = 1;
		Integer numero4 = 5;
		Integer numero5 = 11;
		
		listaDeNumeros.InsertarOrdenado(numero1);
		listaDeNumeros.InsertarOrdenado(numero2);
		listaDeNumeros.InsertarOrdenado(numero3);
		listaDeNumeros.InsertarOrdenado(numero4);
		listaDeNumeros.InsertarOrdenado(numero5);
		
		listaDeNumeros.mostrarLista();
		
		//PUNTO B
		System.out.println("--------- EL PUNTO B ---------");
		for(Integer numero: listaDeNumeros){
			System.out.println(numero);
		}
		
		//PUNTO C
		System.out.println("--------- EL PUNTO C ---------");
		//eliminar por pos el primero
		//buscar el 5 y borrarlo
		//buscar el 11 y eliminarlo
		for(Integer numero: listaDeNumeros){
			System.out.println(numero);
		}
		
		//PUNTO D
		System.out.println("--------- EL PUNTO D ---------");
		
		ComparadorString<String> comparadorString = new ComparadorString<>();
		
		ListaVinculada<String> listaDePalabras = new ListaVinculada<>(comparadorString);
		
		String facil = "F�cil";
		String es = "Es";
		String parcial = "Parcial";
		String prog2 = "Prog2";
		
		listaDePalabras.InsertarOrdenado(facil);
		listaDePalabras.InsertarOrdenado(es);
		listaDePalabras.InsertarOrdenado(parcial);
		listaDePalabras.InsertarOrdenado(prog2);
		
		for(String palabra: listaDePalabras){
			System.out.println(palabra);
		}
		
		//PUNTO E
		System.out.println("--------- EL PUNTO E ---------");
		
		for(String palabra: listaDePalabras){
			System.out.println(palabra);
		}
		
		//PUNTO F
		System.out.println("--------- EL PUNTO F ---------");
		int encontrarPosicion = listaDePalabras.obtenerPosicion(parcial); 
		System.out.println("La posici�n en la que est� el String 'Parcial' es: " + encontrarPosicion);
		
		//PUNTO G
		System.out.println("--------- EL PUNTO G ---------");
//		int encontrarPosicion2 = listaDePalabras.obtenerPosicion("Recuperatorio"); //creo que deberia NO existir, no? 
//		System.out.println("La posici�n en la que est� el String 'Recuperatorio' es: " + encontrarPosicion2);
		
		//PUNTO H
		System.out.println("--------- EL PUNTO H ---------");
		
		ComparadorInverso<String> comparadorInvertido = new ComparadorInverso<>(comparadorString);
		
		System.out.println("El orden de la lista actual: ");
		for(String palabra: listaDePalabras){
			System.out.println(palabra);
		}
		System.out.println("Con el orden invertido: ");
		
//		listaDePalabras.(comparadorInvertido);
		//me falta el metodo para ordenar
		for(String palabra: listaDePalabras){
			System.out.println(palabra);
		}
		
		//PUNTO I
		System.out.println("--------- EL PUNTO I ---------");
		
		Alumno john = new Alumno("John", "Doe", 1200000 , 18);
		john.addInteres("intercambio");
		
		Alumno fede = new Alumno("Federico", "Lopez", 35999888 , 19);
		fede.addInteres("redes");
		fede.addInteres("php");
		fede.addInteres("java");
		fede.addInteres("Python");
		
		Alumno juana = new Alumno("Juana", "Garcia", 27123455 , 20);
		juana.addInteres("programacion");
		juana.addInteres("php");
		juana.addInteres("java");
		
		Alumno mora = new Alumno("Mora", "Diaz", 37124425 , 21);
		mora.addInteres("psicologia");
		mora.addInteres("Freud");
		
		Alumno flora = new Alumno("Flora", "Rivas", 34555111 , 22);
		flora.addInteres("historia");
		flora.addInteres("antigua");
		
		Alumno martin = new Alumno("Martin", "G�mez", 34111222 , 23);
		martin.addInteres("romanos");
		martin.addInteres("egipcios");
		martin.addInteres("griegos");
		
		Alumno roman = new Alumno("Rom�n", "Baz�n", 32555111 , 24);
		roman.addInteres("argentina");
	}

}
