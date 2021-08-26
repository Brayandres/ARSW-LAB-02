package arsw.threads;

public class RegistroLlegada {

	private int ultimaPosicionAlcanzada=1;

	private String ganador=null;
	
	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

	public int getUltimaPosicionAlcanzada() {
		return ultimaPosicionAlcanzada;
	}

	public synchronized int setUltimaPosicionAlcanzada() {
		this.ultimaPosicionAlcanzada = getUltimaPosicionAlcanzada()+1;
		return ultimaPosicionAlcanzada-1;
	}

	
	
}
