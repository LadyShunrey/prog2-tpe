package punto4;

import punto1.*;
import punto2.*;
import punto3.*;

public class MainPunto4 {

	public static void main(String[] args) {
		//PUNTO A
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO A ---------");
		System.out.println(" ");
		ComparadorInteger<Integer> comparadorDeInts = new ComparadorInteger<>();
		
		ListaVinculada<Integer> listaDeNumeros = new ListaVinculada<>(comparadorDeInts);
		
		Integer numero1 = 10;
		Integer numero2 = 21;
		Integer numero3 = 1;
		Integer numero4 = 5;
		Integer numero5 = 11;
	
		listaDeNumeros.insertar(numero1);
		listaDeNumeros.insertar(numero2);
		listaDeNumeros.insertar(numero3);
		listaDeNumeros.insertar(numero4);
		listaDeNumeros.insertar(numero5);
		
		System.out.println(listaDeNumeros);
		
		//PUNTO B
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO B ---------");
		System.out.println(" ");
		for(Integer numero: listaDeNumeros){
			System.out.println(numero);
		}
		
		//PUNTO C
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO C ---------");
		System.out.println(" ");
		//eliminar por pos el primero
		System.out.println("Borramos la primer posicion que es el 10 y queda:");
		listaDeNumeros.eliminarSegunPosicion(0);
		System.out.println(listaDeNumeros);
		//buscar el 5 y borrarlo
		int posicionDel5 = listaDeNumeros.obtenerPosicion(5);
		System.out.println("Hay que borrar el 5 que está en la posicion " + posicionDel5 + " y ahora nos queda:");
//		listaDeNumeros.eliminarSegunPosicion(posicionDel5);
		listaDeNumeros.eliminarSegunValor(5);
		System.out.println(listaDeNumeros);
		//buscar el 11 y eliminarlo
		int posicionDel11 = listaDeNumeros.obtenerPosicion(11);
		System.out.println("Ahora hay que borrar el 11 que está en la posicion " + posicionDel11 + " y ahora nos queda:");
//		listaDeNumeros.eliminarSegunPosicion(posicionDel11);
		listaDeNumeros.eliminarSegunValor(11);

		for(Integer numero: listaDeNumeros){
			System.out.println(numero);
		}
		
		//PUNTO D
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO D ---------");
		System.out.println(" ");
		
		ComparadorString<String> comparadorString = new ComparadorString<>();
		
		ListaVinculada<String> listaDePalabras = new ListaVinculada<>(comparadorString);
		
		String facil = "Fácil";
		String es = "Es";
		String parcial = "Parcial";
		String prog2 = "Prog2";
		
		listaDePalabras.insertar(facil);
		listaDePalabras.insertar(es);
		listaDePalabras.insertar(parcial);
		listaDePalabras.insertar(prog2);
		
		for(String palabra: listaDePalabras){
			System.out.println(palabra);
		}
		
		//PUNTO E
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO E ---------");
		System.out.println(" ");
		
		for(String palabra: listaDePalabras){
			System.out.println(palabra);
		}
		
		//PUNTO F
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO F ---------");
		System.out.println(" ");
		int encontrarPosicionDeParcial = listaDePalabras.obtenerPosicion(parcial); 
		System.out.println("La posición en la que está el String 'Parcial' es: " + encontrarPosicionDeParcial);
		
		//PUNTO G
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO G ---------");
		System.out.println(" ");
		int encontrarPosicionDeRecuperatorio = listaDePalabras.obtenerPosicion("Recuperatorio"); //creo que deberia NO existir, no?
		String resultado = "La posición en la que está el String 'Recuperatorio' es: ";
		if(encontrarPosicionDeRecuperatorio < 0){
			resultado = "No existe esa palabra, la posicion es: ";
		}
		System.out.println(resultado + encontrarPosicionDeRecuperatorio);
		
		//PUNTO H
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO H ---------");
		System.out.println(" ");
		
		ComparadorInverso<String> comparadorInvertido = new ComparadorInverso<>(comparadorString);
		
		System.out.println("El orden de la lista actual: ");
		for(String palabra: listaDePalabras){
			System.out.println(palabra);
		}
		System.out.println(" ");
		System.out.println("Con el orden invertido: ");
		
//		listaDePalabras.(comparadorInvertido);
		listaDePalabras.setOrden(comparadorInvertido);
		for(String palabra: listaDePalabras){
			System.out.println(palabra);
		}
		
		//PUNTO I
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("--------- EL PUNTO I ---------");
		System.out.println(" ");
		
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
		
		Alumno isaac = new Alumno("Isaac", "Newton", 12343565 , 29);
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
		
		//Olimpiadas Matematicas
		olimpiadas.addElemento(matea2);
		olimpiadas.addElemento(losFibo);
		
		matea2.addElemento(juan);
		matea2.addElemento(julio);
		
		losFibo.addElemento(bernardino);
		losFibo.addElemento(jose);
		losFibo.addElemento(isaac);
		
//		unicen.imprimirEstructura();
		System.out.println(unicen);
		System.out.println(" ");
//		olimpiadas.imprimirEstructura();
		System.out.println(olimpiadas);
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("La universidad " + unicen.getNombre() + " tiene esta cantidad de alumnos:" + unicen.contarAlumnos());
		System.out.println("El grupo " + olimpiadas.getNombre() + " tiene esta cantidad de alumnos:" + olimpiadas.contarAlumnos());
		System.out.println(" ");
		
		ComparadorElementoUniversidad comparadorUniversidad = new ComparadorElementoUniversidad();
		ComparadorInverso<ElementoUniversidad> comparadorInvertidoUniversidad = new ComparadorInverso<>(comparadorUniversidad);
		ListaVinculada<ElementoUniversidad> listaUniversidad = new ListaVinculada<ElementoUniversidad>(comparadorInvertidoUniversidad);
		
		listaUniversidad.insertarOrdenado(olimpiadas);
		listaUniversidad.insertarOrdenado(unicen);
		
		System.out.println(listaUniversidad);
		
	}

}
