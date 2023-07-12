package practica1;

public class Jugador {
	protected String Nombre;
	protected int Dorsal;
	protected int Goles;
	protected int TarjetasRojas;
	protected int TarjetasAmarillas;

	public Jugador(String nombre, int dorsal, int goles, int tarjetasRojas, int tarjetasAmarillas) {
		this.Nombre = nombre;
		this.Dorsal = dorsal;
		this.Goles = goles;
		this.TarjetasRojas = tarjetasRojas;
		this.TarjetasAmarillas = tarjetasAmarillas;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public int getDorsal() {
		return Dorsal;
	}

	public void setDorsal(int dorsal) {
		this.Dorsal = dorsal;
	}

	public int getGoles() {
		return Goles;
	}

	public void setGoles(int goles) {
		this.Goles = goles;
	}

	public int getTarjetasRojas() {
		return TarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.TarjetasRojas = tarjetasRojas;
	}

	public int getTarjetasAmarillas() {
		return TarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.TarjetasAmarillas = tarjetasAmarillas;
	}

	@Override
	public String toString() {
		return "\n   Nombre = " + Nombre + ", Dorsal = " + Dorsal + ", Goles = " + Goles + ", TarjetasRojas = "
				+ TarjetasRojas + ", TarjetasAmarillas = " + TarjetasAmarillas + "";
	}
}
