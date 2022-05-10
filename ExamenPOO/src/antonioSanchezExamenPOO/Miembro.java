package antonioSanchezExamenPOO;

public abstract class Miembro { //Los atributos de Miembro son los listados para el examen.  
	protected String nombre;
	protected String DNI;
	
	public Miembro(String nombre, String DNI) {
		if (nombre != null) {
			this.nombre = nombre;
		}
		if (DNI != null) {
			this.DNI = DNI;
		}
	}
	// M�todos, en este caso los getters y setters b�sicos.
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;
		}
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public void setDNI(String DNI) {
		if (DNI != null) {
			this.DNI = DNI;
		}
	}
	
	abstract public void saludar();
	/*Se coloca saludar en Miembro porque en s�, todas las personas pueden saludar.
	 Se har� override y se sobreescribir� en cada caso concreto.*/
}
