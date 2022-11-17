package punto4;

import punto1.*;
import punto2.*;
import punto3.*;

public class MainPunto4 {

	public static void main(String[] args) {
		
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
	}

}
