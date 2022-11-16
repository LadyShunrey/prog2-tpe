package punto1;

public class Nodo<T> {
	T valor;
	Nodo<T> siguienteNodo;
	
	public Nodo(T valor){
		this.valor = valor;
	}
}
