package practica1;

import java.util.Arrays;

public class Liga {
	protected String Nombre;
	protected Equipo[] Clasificacion;

	public Liga(String nombre, Equipo[] clasificacion) {
		this.Nombre = nombre;
		this.Clasificacion = clasificacion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public Equipo[] getClasificacion() {
		return Clasificacion;
	}

	public void setClasificacion(Equipo[] clasificacion) {
		this.Clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return "Liga Nombre = " + Nombre + ", Clasificacion = \n" + Arrays.toString(Clasificacion) + "";
	}

	/**
	 * pre: --- 
	 * Post: Este metodo muestra por pantallauna clasificacion de la liga
	 * por orden de puntos de mayor a menor
	 */
	public void clasificacion() {
		int golesequipo = 0;
		for (int i = 0; i < this.Clasificacion.length; i++) { // Bucle para ordenar la tabla de equipos
			for (int j = i + 1; j < this.Clasificacion.length; j++) {
				if (this.Clasificacion[i].getPuntos() < this.Clasificacion[j].getPuntos()) {
					Equipo cambio;
					cambio = this.Clasificacion[j];
					this.Clasificacion[j] = this.Clasificacion[i];
					this.Clasificacion[i] = cambio;
				}
			}
		}
		for (int i = 0; i <= 14; i++) {
			for (int j = 0; j < 11; j++) {
				golesequipo = golesequipo + this.Clasificacion[i].getJugadores()[j].getGoles();
			}
			System.out.println("Equipo = " + this.Clasificacion[i].getNombre() + ", Puntos = " + this.Clasificacion[i].getPuntos()
					+ ", Partidos ganados = " + this.Clasificacion[i].getPartidosGanados() + ", Partidos perdidos = "
					+ this.Clasificacion[i].getPartidosPerdidos() + ", Partidos empatados = " + this.Clasificacion[i].getPartidosEmpatados()
					+ ", Goles del equipo = " + golesequipo
					+ "\n------------------------------------------------------------------------------------------------------\n");
			golesequipo = 0;
		}
	}

	/**
	 * pre: --- 
	 * Post: Este metodo ordena los jugadores por los mas goleadores y
	 * muestra por pantalla los 5 mas goleadores
	 */
	public void maximosGoleadores() {
		int f = 0;
		Jugador[] goleadores = new Jugador[165];
		for (int i = 0; i < this.Clasificacion.length; i++) {
			for (int j = 0; j < 11; j++) {
				goleadores[f] = this.Clasificacion[i].getJugadores()[j];
				f++;
			}
		}
		for (int i = 0; i < goleadores.length; i++) { // Bucle para ordenar la tabla de goleadores
			for (int j = i + 1; j < goleadores.length; j++) {
				if (goleadores[i].getGoles() < goleadores[j].getGoles()) {
					Jugador cambio;
					cambio = goleadores[j];
					goleadores[j] = goleadores[i];
					goleadores[i] = cambio;
				}
			}
		}
		for (int x = 0; x < 5; x++) {
			System.out.print("Jugador = " + goleadores[x].getNombre() + ", Goles = " + goleadores[x].getGoles()
					+ "\n------------------------------------------------------------------------------------------------------\n");
		}
	}

	/**
	 * pre: --- 
	 * Post: Este metodo ordena los jugadores por mas expulsiones y muestra
	 * por pantalla los 5 primeros
	 */
	public void masExpulsados() {
		int f = 0;
		Jugador[] expulsados = new Jugador[165];
		for (int i = 0; i < this.Clasificacion.length; i++) {
			for (int j = 0; j < 11; j++) {
				expulsados[f] = this.Clasificacion[i].getJugadores()[j];
				f++;
			}
		}
		for (int i = 0; i < expulsados.length; i++) { // Bucle para ordenar la tabla de expulsados
			for (int j = i + 1; j < expulsados.length; j++) {
				if (expulsados[i].getTarjetasRojas() < expulsados[j].getTarjetasRojas()) {
					Jugador cambio;
					cambio = expulsados[j];
					expulsados[j] = expulsados[i];
					expulsados[i] = cambio;
				}
			}
		}
		for (int x = 0; x < 5; x++) {
			System.out.print("Jugador = " + expulsados[x].getNombre() + ", Expulsiones = "
					+ expulsados[x].getTarjetasRojas()
					+ "\n------------------------------------------------------------------------------------------------------\n");
		}
	}

	/**
	 * pre: --- 
	 * Post: Este metodo calcula los goles a favor de cada equipo y ordena
	 * una clasificacion de mayor a menor segun sus goles
	 */
	public void masGoleadores() {
		int golesequipo = 0;
		int[] tablagoles = new int[15];
		for (int i = 0; i <= 14; i++) {
			for (int j = 0; j < 11; j++) {
				golesequipo = golesequipo + this.Clasificacion[i].getJugadores()[j].getGoles();
			}
			tablagoles[i] = golesequipo;
			golesequipo = 0;
		}
		for (int i = 0; i < this.Clasificacion.length; i++) { // Bucle para ordenar las tablas de goles y la de equipos
			for (int j = i + 1; j < this.Clasificacion.length; j++) {
				if (tablagoles[i] < tablagoles[j]) {
					Equipo cambio;
					cambio = this.Clasificacion[j];
					this.Clasificacion[j] = this.Clasificacion[i];
					this.Clasificacion[i] = cambio;
					int x;
					x = tablagoles[j];
					tablagoles[j] = tablagoles[i];
					tablagoles[i] = x;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("\nNombre = " + this.Clasificacion[i].getNombre() + ", Goles del equipo = " + tablagoles[i]
					+ "\n------------------------------------------------------------------------------------------------------");
		}
	}
}
