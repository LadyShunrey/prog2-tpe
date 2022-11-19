package punto2;
import punto1.*;

/**
 * 
 * MAIN PARA EJEMPLIFICAR LA IMPLEMENTACION DEL PUNTO 2
 *
 * Creamos una lista de alumnos para que se muestre ordenada según los criterios pedidos en el punto dos:
 * que se ordenen primero por apellido, si este se repitiera que se ordenen por nombre, y si el mismo también
 * se repitiese se ordene por DNI. Si dicho criterio quisiese cambiarse o agregar nuevos a futuro, se podría hacer sin problemas.
 *  
 */

public class MainPunto2 {

	public static void main(String[] args) {
		ComparadorAlumnoApellido comparadorApellido = new ComparadorAlumnoApellido();
		ComparadorAlumnoNombre comparadorNombre = new ComparadorAlumnoNombre();
		ComparadorDNI comparadorDNI = new ComparadorDNI();
		
		ComparadorAND comparadorNombreDNI = new ComparadorAND(comparadorNombre, comparadorDNI);
		
		ComparadorAND comparadorApellidoAND = new ComparadorAND(comparadorApellido, comparadorNombreDNI);
		
		ListaVinculada<Alumno> listadoDeAlumnos = new ListaVinculada<>(comparadorApellidoAND);
		
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
		
		Alumno mora2 = new Alumno("Mora", "Diaz", 37124427 , 21);
		
		Alumno mora3 = new Alumno("Mora", "Diaz", 37124424 , 21);
		
		listadoDeAlumnos.insertarOrdenado(john);
		listadoDeAlumnos.insertarOrdenado(fede);
		listadoDeAlumnos.insertarOrdenado(juana);
		listadoDeAlumnos.insertarOrdenado(mora);
		listadoDeAlumnos.insertarOrdenado(flora);
		listadoDeAlumnos.insertarOrdenado(martin);
		listadoDeAlumnos.insertarOrdenado(roman);
		listadoDeAlumnos.insertarOrdenado(juan);
		listadoDeAlumnos.insertarOrdenado(julio);
		listadoDeAlumnos.insertarOrdenado(bernardino);
		listadoDeAlumnos.insertarOrdenado(jose);
		listadoDeAlumnos.insertarOrdenado(isaac);
		listadoDeAlumnos.insertarOrdenado(mora3);
		listadoDeAlumnos.insertarOrdenado(mora2);
		
		System.out.println(listadoDeAlumnos);
		
	}
}