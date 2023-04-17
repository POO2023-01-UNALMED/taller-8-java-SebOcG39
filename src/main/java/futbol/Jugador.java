package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	@Override
	public int compareTo(Object f) {
		Futbolista futbolista = (Futbolista)f;
		if (Integer.compare(this.getEdad(), futbolista.getEdad())>0) {
			return this.getEdad()-futbolista.getEdad();
		}
		else if (Integer.compare(this.getEdad(), futbolista.getEdad())==0) {
			return 0;
		}
		else {
			return futbolista.getEdad()-this.getEdad();
		}
	}
	
	@Override
	public String toString() {
		String r = "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesMarcados;
		return r;
	}
	
	@Override
	public boolean jugarConLasManos() {
		return false;
	}

	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
	
}
