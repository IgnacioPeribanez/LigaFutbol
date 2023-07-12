package practica1;

import java.util.Arrays;

public class Equipo {
	protected String Nombre;
	protected String Estadio;
	protected int Fundacion;
	protected Jugador[] Jugadores;
	protected int Puntos;
	protected int PartidosGanados;
	protected int PartidosPerdidos;
	protected int PartidosEmpatados;

	public Equipo(String nombre, String estadio, int fundacion, Jugador[] jugadores, int puntos, int partidosGanados,
			int partidosPerdidos, int partidosEmpatados) {
		this.Nombre = nombre;
		this.Estadio = estadio;
		this.Fundacion = fundacion;
		this.Jugadores = jugadores;
		this.Puntos = puntos;
		this.PartidosGanados = partidosGanados;
		this.PartidosPerdidos = partidosPerdidos;
		this.PartidosEmpatados = partidosEmpatados;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getEstadio() {
		return Estadio;
	}

	public void setEstadio(String estadio) {
		this.Estadio = estadio;
	}

	public int getFundacion() {
		return Fundacion;
	}

	public void setFundacion(int fundacion) {
		this.Fundacion = fundacion;
	}

	public Jugador[] getJugadores() {
		return Jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.Jugadores = jugadores;
	}

	public int getPuntos() {
		return Puntos;
	}

	public void setPuntos(int puntos) {
		this.Puntos = puntos;
	}

	public int getPartidosGanados() {
		return PartidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.PartidosGanados = partidosGanados;
	}

	public int getPartidosPerdidos() {
		return PartidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.PartidosPerdidos = partidosPerdidos;
	}

	public int getPartidosEmpatados() {
		return PartidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.PartidosEmpatados = partidosEmpatados;
	}

	@Override
	public String toString() {
		return "Equipo - Nombre = " + Nombre + ", Estadio = " + Estadio + ", Fundacion = " + Fundacion
				+ " \n\nJugadores" + Arrays.toString(Jugadores) + "\n\nPuntos = " + Puntos + ", PartidosGanados = "
				+ PartidosGanados + ", PartidosPerdidos = " + PartidosPerdidos + ", PartidosEmpatados = "
				+ PartidosEmpatados
				+ "\n------------------------------------------------------------------------------------------------------\n";
	}
}
