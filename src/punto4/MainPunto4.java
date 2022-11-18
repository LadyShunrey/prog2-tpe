package punto4;

import punto1.*;
import punto2.*;
import punto3.*;

public class MainPunto4 {

	public static void main(String[] args) {
		//PUNTO A
		System.out.println("------------------------------");
		System.out.println("------------------------------");
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
		System.out.println("------------------------------");
		System.out.println("------------------------------");
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
		
		String facil = "Fácil";
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
		System.out.println("La posición en la que está el String 'Parcial' es: " + encontrarPosicion);
		
		//PUNTO G
		System.out.println("--------- EL PUNTO G ---------");
//		int encontrarPosicion2 = listaDePalabras.obtenerPosicion("Recuperatorio"); //creo que deberia NO existir, no? 
//		System.out.println("La posición en la que está el String 'Recuperatorio' es: " + encontrarPosicion2);
		
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
		
		Alumno martin = new Alumno("Martin", "Gómez", 34111222 , 23);
		martin.addInteres("romanos");
		martin.addInteres("egipcios");
		martin.addInteres("griegos");
		
		Alumno roman = new Alumno("Román", "Bazán", 32555111 , 24);
		roman.addInteres("argentina");
		
		Alumno juan = new Alumno("Juan", "Juarez", 33222444 , 25);
		juan.addInteres("sucesiones");
		juan.addInteres("álgebra");
		
		Alumno julio = new Alumno("Julio", "Cesar", 33222111 , 26);
		julio.addInteres("sucesiones");
		julio.addInteres("algebra");
		
		Alumno bernardino = new Alumno("Bernardino", "Rivas", 30987654 , 27);
		bernardino.addInteres("matemáticas");
		
		Alumno jose = new Alumno("José", "Paso", 33322112 , 28);
		jose.addInteres("problemas");
		
		Alumno isaac = new Alumno("Isaac", "Newton", 12343565 , 28);
		isaac.addInteres("sucesiones");
		
		Grupo unicen = new Grupo("Unicen");
		
		Grupo exactas = new Grupo("Exactas");
		
		Grupo humanas = new Grupo("Humanas");
		
		Grupo historia = new Grupo("Historia");
		
		Grupo olimpiadas = new Grupo("Olimpíadas Matemáticas");
		
		Grupo matea2 = new Grupo("Matea2");
		
		Grupo losFibo = new Grupo("Los Fibo");
		
		//Unicen
		unicen.addElemento(exactas);
		unicen.addElemento(humanas);
		unicen.addElemento(john);
		
		exactas.addElemento(fede);
		exactas.addElemento(juana);
		
		humanas.addElemento(historia);
		humanas.addElemento(mora);
		
		historia.addElemento(flora);
		historia.addElemento(martin);
		historia.addElemento(roman);
		
		//Olimpiadas Matematicsa
		olimpiadas.addElemento(matea2);
		olimpiadas.addElemento(losFibo);
		
		matea2.addElemento(juan);
		matea2.addElemento(julio);
		
		losFibo.addElemento(bernardino);
		losFibo.addElemento(jose);
		losFibo.addElemento(isaac);
		
		unicen.imprimirEstructura();
		
		olimpiadas.imprimirEstructura();
		
		System.out.println("La universidad " + unicen.getNombre() + " tiene esta cantidad de alumnos:" + unicen.contarAlumnos());
		System.out.println("El grupo " + olimpiadas.getNombre() + " tiene esta cantidad de alumnos:" + olimpiadas.contarAlumnos());
		
		ComparadorElementoUniversidad comparadorUniversidad = new ComparadorElementoUniversidad();
		ComparadorInverso<ElementoUniversidad> comparadorInvertidoUniversidad = new ComparadorInverso<>(comparadorUniversidad);
		ListaVinculada<ElementoUniversidad> listaUniversidad = new ListaVinculada<ElementoUniversidad>(comparadorInvertidoUniversidad);
		
		listaUniversidad.InsertarOrdenado(olimpiadas);
		listaUniversidad.InsertarOrdenado(unicen);
		listaUniversidad.InsertarOrdenado(olimpiadas);

		listaUniversidad.mostrarLista();
		
	}

}
