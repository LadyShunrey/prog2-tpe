package punto1;

import java.util.Iterator;

public class Iterador<T> implements Iterator<T>{
	Nodo<T> puntero;
	
	public Iterador(Nodo<T> puntero){
		this.puntero = puntero;
	}

	@Override
	public boolean hasNext() {
		return this.puntero!=null;
	}

	@Override
	public T next() {
		//no devuelve el nodo sino el valor del nodo
		return null;
	}

}
