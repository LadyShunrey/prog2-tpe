package punto1;


import java.util.Comparator;
import java.util.Iterator;

public class ListaVinculada<T> implements Iterable<T>{
	
	Nodo<T> cabeza;
	Comparator<T> orden;
	private int size;
	
	public ListaVinculada(Comparator<T> orden) {
		this.cabeza=null;
		this.size=0;
		this.orden=orden;
	}
	
	public ListaVinculada() {
		this.cabeza=null;
		this.size=0;
//		this.orden=orden;
	}

	//TODO: Tener en cuenta que inserta ordenado, está asumiendo siempre que el orden es ascendente (de menor a mayor).
	public void InsertarOrdenado(T obj) {
		Nodo<T> nuevo= new Nodo<T>(obj);
		if(estaVacia()) {
			cabeza = nuevo;
		}else {
			Nodo<T> anterior=null;
			Nodo<T> temp=this.cabeza;
			while(temp!=null && orden.compare(temp.obtenerValor(), obj)<0) { //nuevo es mayor que temp avanzo
				anterior = temp;
				temp=temp.obtenerSiguiente();		
			}
			
			if(temp==null&&anterior!=null) {
				anterior.enlazarSiguiente(nuevo);	//al anterior le enlaza el nuevo;
			}else {
				nuevo.enlazarSiguiente(temp); // pone al nuevo antes que el temporal
				if(temp==this.cabeza) {
					this.cabeza=nuevo;	//si no habia anterior al nuevo lo pone como cabeza
				}else {
					anterior.enlazarSiguiente(nuevo);	//si habia anterior le enlaza el nuevo
				}
			}
		}
		size++; 
	}
	
	//FIXME: Este método no debería ser necesario, SALVO que se cambie el orden, en cuyo caso hay que reordenar (pero no insertando)
	private void ordenar() {
		Nodo<T>aux= this.cabeza;
		this.cabeza=null;
		while(this.cabeza!=null) {
			this.InsertarOrdenado(aux.obtenerValor());
			aux=aux.obtenerSiguiente();
		}
		
	}
	
//	public Object obtener(Integer index) {
//		int contador =0;
//		Nodo temp= cabeza;
//		while(contador<index) {
//			temp= temp.obtenerSiguiente();
//			contador ++;
//		}
//		return temp.obtenerValor();
//	}
	

	//FIXME: que pasa si index > size? en ese caso no borra nada (deberia verificarse al principio y retornar). Size se mantiene como está
	public void eliminarSegunPosicion(Integer index) {
		int contador = 0;
		if(index==0) {
			cabeza=cabeza.obtenerSiguiente();
		}else {
			Nodo<T> temporal = cabeza;
			while(contador<index-1) {
				temporal = temporal.obtenerSiguiente();
				contador ++;
			}	
			temporal.enlazarSiguiente(
					temporal.obtenerSiguiente().obtenerSiguiente());	
		}
		size--;
	}
	
	
	public Integer obtenerPosicion(T valor) {
		Nodo<T> aux=cabeza;
		int contador=0;
		while(aux!=null && aux.obtenerValor()!=valor) { //FIXME: no sería mejor usar equals?
			aux=aux.obtenerSiguiente();
			contador++;
		}
		if(aux==null) {
			//TODO: prestar atención a este null, porque hay que chequearlo después. otra opción es que sea int y devolver -1
			return null; 
		}else {
			return contador;
		}
	}
	
	
	public void eliminarOcurrencias(T valor) {
		Nodo<T> aux= this.cabeza;
		while(aux.obtenerValor().equals(valor)&& aux!=null) {
			this.cabeza=cabeza.obtenerSiguiente();	
			size--;
			aux=aux.obtenerSiguiente();
			}
		if(aux!=null) {
			aux=aux.obtenerSiguiente();
		}else {
			cabeza=null;
		}
	
	}
	
	public boolean estaVacia() {
		return (this.cabeza==null);
	}
	
	public int getSize() {
		return size;
	}
	
	public void setOrden(Comparator<T> orden) {
		this.orden = orden;
		ordenar();
	}

	public Iterator<T> iterator(){
		return new IteradorNodo<T>(this.cabeza);
	}
	
	public void mostrarLista() {
		IteradorNodo<T> iterador = new IteradorNodo<T>(cabeza);
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}	
	}
	

	//FIXME: Usar POS, sized de la lista y devolver pos-1 cuando pide next
	private class IteradorNodo<T> implements Iterator<T>{
		private Nodo<T> puntero;
		
		public IteradorNodo(Nodo<T> puntero) {
			this.puntero=puntero;
		}
		@Override
		public boolean hasNext() {
			return puntero.obtenerSiguiente()!=null;
		}
		
		@Override
		public T next() {
			T valor= puntero.obtenerValor();
			puntero = puntero.obtenerSiguiente();
			return valor; 
		}
	}

	
	
	
	
}
