package punto1;

public class ListaVinculadaNico {

		private Nodo<T> primerNodo;
		private int size;

		public ListaEnlazada() {
			primerNodo = null;
			size = 0;
		}
		

		public void eliminarOcurrencias(Nodo<T> nodo) { //Eliminar todas las ocurrencias de un elemento de la estructura dado el elemento
			int contador=0;
			Nodo<T> temporal = primerNodo;
			//if(==0) {
				primerNodo = primerNodo.obtenerSiguiente();
			//}
			while(contador< size-1) {
				temporal = temporal.obtenerSiguiente();
				contador++;
				if(temporal.obtenerValor().equals(nodo.obtenerValor())) {
					temporal.enlazarSiguiente(
							temporal.obtenerSiguiente().obtenerSiguiente());
				}
			}
			
			
		}
		
		public void eliminar(int index) { // Eliminar un elemento de la estructura dado una posición.
			int contador=0;
			Nodo<T> temporal = primerNodo;
			if(index==0) {
				primerNodo = primerNodo.obtenerSiguiente();
			}
			while(contador< index-1) {
				temporal = temporal.obtenerSiguiente();
				contador++;
			}
			temporal.enlazarSiguiente(
					temporal.obtenerSiguiente().obtenerSiguiente());
		}
		
		public void eliminarPrimero() {
			primerNodo = primerNodo.obtenerSiguiente();
			size--;
		}
		
		public void addPrimero(Nodo<T> pri) {  // para insertar un nuevo elemento en la estructura
			if(primerNodo==null) {
				primerNodo = pri;
			}else {
				Nodo<T> temp = primerNodo;
				Nodo<T> nuevo = pri;
				nuevo.enlazarSiguiente(temp);
				primerNodo= nuevo;
			}	
			size++;
		}
		
		public void add(Nodo<T> pri) { // para insertar un nuevo elemento en la estructura
			int contador = 0 ;	
			Nodo<T> temp = primerNodo;
			Nodo<T> nuevo = pri;
			if(primerNodo==null) {
				primerNodo = pri;
			}else {
				while(contador<size-1) {
					temp = primerNodo.obtenerSiguiente();
					contador++;
				}
				temp.enlazarSiguiente(nuevo);
			}	
			size++;
		}
		
		public Object obtenerValor(int index) { //Obtener la posición de la primera ocurrencia de un elemento dado
			int contador = 0;
			Nodo<T> temp = primerNodo;
			while(contador<index) {
				temp = temp.obtenerSiguiente();
				contador++;
			}
			return temp.obtenerValor();
		}
		


		

	}

