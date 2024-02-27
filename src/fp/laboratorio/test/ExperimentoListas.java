package fp.laboratorio.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import fp.laboratorio.Estudiante;
import fp.laboratorio.EstudianteImpl;

public class ExperimentoListas {

	public static void main(String[] args) {

		Estudiante e1 = new EstudianteImpl("Ada", "Lovelace", "adalov");
		Estudiante e2 = new EstudianteImpl("Grace", "Murray", "gramur");
		Estudiante e3 = new EstudianteImpl("Frances", "Allen", "fraall");
		Estudiante e4 = new EstudianteImpl("Hedy", "Lamarr", "hedlam");
		Estudiante e5 = new EstudianteImpl("Radia", "Perlman", "ritper");
		Estudiante e6 = new EstudianteImpl("Margaret", "Hamilton", "marham");

		// Crea una lista vacía de estudiantes

		
		// Añade 5 estudiantes (e1-e5) a la lista
		
		
		// Visualiza el nmero de estudiantes que tiene la lista
		
		// Visualiza los estudiantes de las posiciones 0, 1 y 5.
		
		
		// Visualiza, de los estudiantes 2 y 4 solo su uvus.
		
		// Inserta el estudiante e6 como tercer estudiante de la lista
		
		// Busca la posición de la estudiante que se llama Frances Allen.


		// Obten una sublista con los estudiantes de la posici�n 1 a la 4.

		// Visualiza ambas listas
		
		// Elimina de la sublista el segundo estudiante (�ndice 1).
		
		// Muestra ambas listas.
		
		// Muestras ambas listas, pero haciendo que haya un estudiante por línea.
		
		
	}

	private static void mostrarIterable(Iterable<Estudiante> lista) {
		for (Estudiante e : lista) {
			System.out.println(e);
		}
	}

	public static Integer buscarEstudiantePorNombreyApellidos(List<Estudiante> lista, String nombre, String apellidos) {
		int pos = -1;
		for (int i = 0; i < lista.size(); i++) {
			Estudiante e = lista.get(i);
			if (e.getNombre().equals(nombre) && e.getApellidos().equals(apellidos)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

}
