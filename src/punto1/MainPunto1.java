package punto1;

/**
 * 
 * MAIN PARA EJEMPLIFICAR LA IMPLEMENTACION DEL PUNTO 1
 *
 * Creamos una lista de números para que se muestren según se insertan o se ordenen al insertarse según los criterios dados.
 * También que se reordenen de manera ascendente o descendente. 
 * Si dicho criterio quisiese cambiarse o agregar nuevos criterios de ordenamiento a futuro, se podría hacer sin problemas.
 *  
 */

public class MainPunto1 {
	//Agrego constantes para imprimir strings que se repiten a lo largo del main
	public static final String LINEAS = "------------------------------------------";
	
	public static void main(String[] args) {
		
		//EL PUNTO A
		imprimirEncabezadoPunto("A");
		System.out.println(" Insertar un nuevo elemento a la estructura ");
		
		ListaVinculada<Integer> listaDeInts = new ListaVinculada<>();
		
		ComparadorInteger<Integer> ascendente = new ComparadorInteger<>();
		ListaVinculada<Integer> listaDeIntsOrdenados = new ListaVinculada<>(ascendente);
		
		Integer numero1 = 123;
		Integer numero2 = 4;
		Integer numero3 = 1;
		Integer numero4 = 5;
		Integer numero5 = 1;
		Integer numero6 = 51;
		Integer numero7 = 5;
		Integer numero8 = 7;
		Integer numero9 = 13;
		
		System.out.println("Si creamos una lista con el criterio de orden ascendente y cargamos los elementos usando ese criterio, se ordenan automáticamente y queda: ");
		
		listaDeIntsOrdenados.insertarOrdenado(numero1);
		listaDeIntsOrdenados.insertarOrdenado(numero2);
		listaDeIntsOrdenados.insertarOrdenado(numero3);
		listaDeIntsOrdenados.insertarOrdenado(numero4);
		listaDeIntsOrdenados.insertarOrdenado(numero5);
		listaDeIntsOrdenados.insertarOrdenado(numero6);
		listaDeIntsOrdenados.insertarOrdenado(numero7);
		listaDeIntsOrdenados.insertarOrdenado(numero8);
		listaDeIntsOrdenados.insertarOrdenado(numero9);
		
		System.out.println(listaDeIntsOrdenados);
		
		System.out.println("Si por el contrario agregamos los números sin un criterio específico, quedan en el mismo orden que los hayamos cargado: ");
		
		listaDeInts.insertar(numero1);
		listaDeInts.insertar(numero2);
		listaDeInts.insertar(numero3);
		listaDeInts.insertar(numero4);
		listaDeInts.insertar(numero5);
		listaDeInts.insertar(numero6);
		listaDeInts.insertar(numero7);
		listaDeInts.insertar(numero8);
		listaDeInts.insertar(numero9);
		
		System.out.println(listaDeInts);
		
		//EL PUNTO B
		imprimirEncabezadoPunto("B");
		System.out.println(" Eliminar un elemento de la estructura dada una posición ");
		System.out.println("De la estructura anterior borramos la última posición que es la 8");
		System.out.println("Entonces nos queda: ");
		listaDeInts.eliminarSegunPosicion(8);
		System.out.println(listaDeInts);
		
		//EL PUNTO C
		imprimirEncabezadoPunto("C");
		System.out.println(" Eliminar todas las ocurrencias de un elemento ");
		System.out.println("De la estructura anterior borramos todas las ocurrencias del numero 1");
		System.out.println("Nos queda: ");
		listaDeInts.eliminarOcurrencias(1);
		System.out.println(listaDeInts);
		
		//EL PUNTO D
		imprimirEncabezadoPunto("D");
		System.out.println(" Obtener la posición de la primera ocurrencia de un elemento dado ");
		System.out.println("El número 5 se está repitiendo dos veces en la estructura, pero el primero que aparece es el que está en la posicion: ");
		int obtenerPosicionDel5 = listaDeInts.obtenerPosicion(5);
		System.out.println(obtenerPosicionDel5);
		
		//EL PUNTO E
		imprimirEncabezadoPunto("E");
		System.out.println(" Un mecanismo que permita recorrer uno a uno los elementos de la lista ");
		System.out.println("El código tiene un iterador que permite recorrer de a uno, todas las listas anteriores se recorrieron usándolo, igual que esta:");
		for(Integer numero: listaDeInts){
			System.out.println(numero);
		}
		
		//EL PUNTO F
		imprimirEncabezadoPunto("F");
		System.out.println(" Permitir cambiar la forma en la que se ordenan los elementos, reordenamiento de los elementos ya almacenados ");
		System.out.println("Dada la estructura anterior podemos reordenarla por ejemplo de manera ascendente: ");
		listaDeInts.setOrden(ascendente);
		System.out.println(listaDeInts);
		
		System.out.println("También podemos reordenarla de manera descendente: ");
		ComparadorInverso<Integer> descendente = new ComparadorInverso<Integer>(ascendente);
		listaDeInts.setOrden(descendente);
		System.out.println(listaDeInts);
	}
	
	//método interno para imprimir los nombres de los puntos
	private static void imprimirEncabezadoPunto(String punto) {
		 
		System.out.println(" ");
		System.out.println(LINEAS);
		System.out.println(LINEAS);
		System.out.println("--------------- EL PUNTO "+punto+" ---------------");
		System.out.println(" ");
		
	}
}
