package punto1;

public class ListaVinculada<T> {
	Nodo<T> primerNodo;
	//orden Comparador
	
	public void mostrarLista(){
//		T nodo;
		//aca solo voy a declaarar un iterador para poder ir mostrandolo
		Iterador<T> iterador = new Iterador<T>(primerNodo); //así se declara u niterador
		while(iterador.hasNext()){
			System.out.println(iterador.next());
//			iterador.next();
		}
	}
	
	public void ordenar(){
		Nodo<T> auxiliar = new Nodo<T>();
		for(int i = 0; i < this.getSize(); i++){
//			Nodo<T>
		}
	}
	
	public int getSize(){
		return 1;
	}
}
