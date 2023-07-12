package practica1;

import java.util.Scanner;

public class Main {
	/**
	 * pre: --- 
	 * Post: Este metodo genera 11 jugadores diferentes.
	 */
	public static Jugador[] generadorJugadores(int ape) {
		Jugador[] jugadores = new Jugador[11];
		String[] nombre = { "Juan", "Jóse", "Carlos", "Diego", "David", "Josef", "Karim", "Turam", "Enrique", "Nacho",
				"Luka" };
		String[] apellido = { "Velazquez", "Sebastian", "Hernandez", "Muñoz", "Colas", "Yutube", "Ibe", "Ronaldo",
				"Aidoo", "Carrasco", "Yabusele", "Teret", "Bada", "Titity", "Petrovic" };
		for (int i = 0; i < 11; i++) {
			int goles = (int) Math.floor(Math.random() * 30);
			jugadores[i] = new Jugador(nombre[i] + " " + apellido[ape], (int) Math.floor(Math.random() * 99), goles,
					(int) Math.floor(Math.random() * 6), (int) Math.floor(Math.random() * 15));
		}
		return jugadores;
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo genera 15 equipos diferentes
	 */
	public static Equipo[] generadorEquipo() {
		Equipo[] equipos = new Equipo[15];
		String[] nombresEquipos = { "Athletic de Bilbao", "Atlético de Madrid", "Barcelona", "Real Betis", "Cádiz",
				"Celta de Vigo", "Villarreal", "Sevilla", "Elche", "Getafe", "Granada", "Levante", "Osasuna",
				"Real Madrid", "Real Sociedad" };
		String[] nombresEstadios = { "San Mamés", "Wanda Metropolitano", "Camp Nou", "Benito Villamarín",
				"Ramón de Carranza", "Abanca-Balaídos", "Estadio de la Cerámica", "Ramón Sánchez Pizjuán",
				"Martínez Valero", "Coliseum Alfonso Pérez", "Nuevo Los Cármenes", "Ciutat de València", "El Sadar",
				"Santiago Bernabéu", "Reale Arena" };
		for (int i = 0; i < equipos.length; i++) {
			int ganados = (int) Math.floor(Math.random() * 28);
			int perdidos = (int) Math.floor(Math.random() * (28 - ganados));
			int empatados = 28 - (ganados + perdidos);
			int fundacion = (int) Math.floor(Math.random() * (2022 - 1700)) + 1700;
			int puntos = ((ganados * 3) + (empatados * 1));
			equipos[i] = new Equipo(nombresEquipos[i], nombresEstadios[i], fundacion, generadorJugadores(i), puntos,
					ganados, perdidos, empatados);
		}
		return equipos;
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo pide al usuario que eliga entre 4 opciones y
	 * muestra por pantalla informacion de la liga creada en el metodo
	 * generadorLiga()
	 */
	public static void main(String[] args) {
		Liga liga = new Liga("LaLiga",generadorEquipo());
		Scanner entrada = new Scanner(System.in);
		System.out.println("¡Bienvenidos a LaLiga!");

		System.out.println("---------------------------------------------------------"
				+ "------------------------------------------------------------------" + "--------------------");
		for (int i = 0; i == 0;) { // Entramos en un bucle infinito
			System.out.println("");
			System.out.println("0.- Apagar programa");
			System.out.println("1.- Visualizar clasificación ordenada por puntos");
			System.out.println("2.- Visualizar los 5 máximos goleadores");
			System.out.println("3.- Visualizar los 5 jugadores con más expulsiones");
			System.out.println("4.- Obtener los 3 equipos más goleadores");
			System.out.print("\n¿Que opcion deseas ejecutar?: ");
			int numero = entrada.nextInt();
			System.out.print(
					"\n------------------------------------------------------------------------------------------------------\n");
			if (numero > 4 || numero < 0) { // Mostramos el error en caso de introducir una opcion inexistente
				System.out.println("Error, elija una de las opciones validas");
			} else if (numero == 0) { // Paramos el programa al introducir 0
				System.out.print("Has apagado el programa");
				break;
			} else if (numero == 1) { // Llamamos al metodo clasificacion y le enviamos la tabla clasificacion
				liga.clasificacion();
			} else if (numero == 2) { // Llamamos al metodo maximosGoleadores y le enviamos la tabla clasificacion
				liga.maximosGoleadores();
			} else if (numero == 3) { // Llamamos al metodo masExpulsados y le enviamos la tabla clasificacion
				liga.masExpulsados();
			} else if (numero == 4) { // Llamamos al metodo masGoleadores y le enviamos la tabla clasificacion
				liga.masGoleadores();
			}
		}
	}
}
