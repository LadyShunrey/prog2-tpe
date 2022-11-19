package punto1;

import java.util.Comparator;
import java.util.Iterator;

public class ListaVinculada<T> implements Iterable<T>{
	private Nodo<T> primerNodo;
	private Comparator<T> orden;
	private int size;
	
	//constructor con posibilidad de setear el criterio de orden
	public ListaVinculada(Comparator<T> orden) {
		this.primerNodo=null;
		this.size=0;
		this.orden=orden;
	}
	
	//constructor sin posibilidad de setear el criterio de orden
	public ListaVinculada() {
		this.primerNodo=null;
		this.size=0;
	}

	//insertarOrdenado siempre inserta con el orden elegido en el constructor y sino por defecto ascendente.
	public void insertarOrdenado(T valor) {
		Nodo<T> nuevo= new Nodo<T>(valor);
		if(estaVacia()) {
			primerNodo = nuevo;
		}else {
			Nodo<T> anterior=null;
			Nodo<T> temp=this.primerNodo;
			while(temp!=null && orden.compare(temp.obtenerValor(), valor)<0) { 
				anterior = temp;
				temp=temp.obtenerSiguiente();
			}
			
			if(temp==null&&anterior!=null) {
				anterior.enlazarSiguiente(nuevo);	
			}else {
				nuevo.enlazarSiguiente(temp); 
				if(temp==this.primerNodo) {
					this.primerNodo=nuevo;
				}else {
					anterior.enlazarSiguiente(nuevo);
				}
			}
		}
		size++; 
	}
	
	//insertar comun que agrega al final de la lista
	public void insertar(T valor) {
		Nodo<T> nuevo = new Nodo<T>(valor); 
		if(estaVacia()) {
			this.primerNodo=nuevo;
		}
		else {
			Nodo<T> temp= this.primerNodo;
			Nodo<T> ant= null;
			while(temp!=null) {
				ant=temp;
				temp=temp.obtenerSiguiente();
			}
			if(temp==null && ant!=null) {
				ant.enlazarSiguiente(nuevo);
			}
		}
		size++;
	}
	
	//metodo que reordena la lista segun un nuevo criterio seteado con el setOrden() ;
	//FIXME: Este método no debería ser necesario, SALVO que se cambie el orden, en cuyo caso hay que reordenar (pero no insertando)
	private void ordenar() {
		Nodo<T>aux= this.primerNodo;
		this.primerNodo=null;
		while(aux!=null) {
			this.insertarOrdenado(aux.obtenerValor());
			aux=aux.obtenerSiguiente();
			size--;
		}
		
	}
	
	//Elimina un valor al pasarle su posicion
	public void eliminarSegunPosicion(Integer index) {
		int contador = 0;
		if(index<size){
			if(index==0) {
				primerNodo=primerNodo.obtenerSiguiente();
			}else {
				Nodo<T> temporal = primerNodo;
				while(contador<index-1) {
					temporal = temporal.obtenerSiguiente();
					contador ++;
				}	
				temporal.enlazarSiguiente(
						temporal.obtenerSiguiente().obtenerSiguiente());	
			}
			size--;
		}
	}
	
	//Elemina una unica ocurrencia (la primera que encuentre)
	public void eliminarSegunValor(T numeroAeliminar) {
        if (primerNodo!= null) {
            Nodo<T> aux = primerNodo;
            Nodo<T> anterior = null;
            while ((aux != null) && (!aux.obtenerValor().equals(numeroAeliminar))) {
                anterior = aux;
                aux = aux.obtenerSiguiente();
            }
            if (aux==primerNodo){
                primerNodo=aux.obtenerSiguiente();
            }else if ((aux != null) && (aux.obtenerValor().equals(numeroAeliminar))) {
                anterior.enlazarSiguiente(aux.obtenerSiguiente());
                this.size--;
            }
        }

    }

	//Devuelve un valor al pasarle una posicion
	public T obtenerValor(Integer index) {
		int contador =0;
		Nodo<T> temp= primerNodo;
		while(contador<index ) {
			
			temp= temp.obtenerSiguiente();
			contador ++;
		}
		return temp.obtenerValor();
	}
	
	//Devuelve la posicion de la primer ocurrencia que encuentre
	public Integer obtenerPosicion(T valor) {
		if(estaVacia()) {
			return -1;
		}else {
			Nodo<T> aux=primerNodo;
			int contador=0;
			while(aux!=null && aux.obtenerValor()!=valor) { //FIXME: no sería mejor usar equals?
				aux=aux.obtenerSiguiente();
				contador++;
			}
			if(aux==null) {
				return -1; 
			}else {
				return contador;
			}
		}
	}
	
	//Borra todas las ocurrencias que encuentre
	public void eliminarOcurrencias(T valor) {
		if(!estaVacia() && primerNodo.obtenerValor().equals(valor)) {
			while((primerNodo != null) && (primerNodo.obtenerValor().equals(valor))) {
				primerNodo=primerNodo.obtenerSiguiente();
				size--;
			}
		}
		else {
			Nodo<T> temp=this.primerNodo;
			while(temp.obtenerSiguiente()!=null) {
					if(temp.obtenerSiguiente().obtenerValor().equals(valor)) {
						temp.enlazarSiguiente(temp.obtenerSiguiente().obtenerSiguiente());
						size--;
					}else {
						temp= temp.obtenerSiguiente();
				}
			}
		}
	}
	
	
	//chequea si la lista está vacia
	public boolean estaVacia() {
		return (this.primerNodo==null);
	}
	
	//cambia el orden por uno nuevo y reordena
	public void setOrden(Comparator<T> orden) {
		this.orden = orden;
		ordenar();
	}
	
	//retorna un nuevo iterador
	public Iterator<T> iterator(){
		return new IteradorNodo<T>(this.primerNodo, this.size);
	}
	
	public int getSize() {
		return size;
	}
	
	 @Override
	public String toString() {
		String resultado = "Esta lista vinculada adentro tiene todo esto: \n";
		IteradorNodo<T> iterador = new IteradorNodo<T>(primerNodo, size);
		while(iterador.hasNext()) {
			resultado += iterador.next() + "\n";
		}
		return resultado;
	}

	//Clase interna que permite recorrer la lista
	private class IteradorNodo<T> implements Iterator<T>{
		private Nodo<T> puntero;
		private int pos;
		
		public IteradorNodo(Nodo<T> puntero, int pos) {
			this.puntero=puntero;
			this.pos = pos;
		}
		
		//pregunta si hay siguiente
		@Override
		public boolean hasNext() {
			return pos>0;
		}
		
		//trae el siguiente si lo hubiera
		@Override
		public T next() {
			pos--;
			T valor= puntero.obtenerValor();
			puntero = puntero.obtenerSiguiente();
			return valor; 
		}
	}
	
}
