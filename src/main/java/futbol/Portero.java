package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	@Override
	public int compareTo(Object futbolista) {
		Portero portero = (Portero) futbolista;
		if (Integer.compare(this.getGolesRecibidos(), portero.getGolesRecibidos())>0) {
			return this.getGolesRecibidos()-portero.getGolesRecibidos();
		}
		else if (Integer.compare(this.getGolesRecibidos(), portero.getGolesRecibidos())==0) {
			return 0;
		}
		else {
			return portero.getGolesRecibidos()-this.getGolesRecibidos();
		}
	}
	
	@Override
	public String toString() {
		String r = "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Le han marcado "+this.golesRecibidos;
		return r;
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
}