package antonioSanchezExamenPOO;

public class PAS extends Personal{
	private Especialidad especialidad;
	
	public PAS(String nombre, String DNI, Especialidad especialidad) {
		super(nombre, DNI);
		if(especialidad != null) {
			this.especialidad = especialidad;
			}
	}
	public PAS(int salario, String nombre, String DNI, Especialidad especialidad) {
		super(salario, nombre, DNI);
		if(especialidad != null) {
		this.especialidad = especialidad;
		}
	}
	
	public void setEspecialidad(Especialidad especialidad) {
		if(especialidad != null) {
			this.especialidad = especialidad;
			}
	}
	
	public Especialidad getEspecialidad() {
		return this.especialidad;
	}
	
	public String toString() {
		String str = "El miembro del personal de administración y servicios " + this.getNombre() + ", cuyo DNI es " 
	+ this.getDNI() + " se especializa en " + this.getEspecialidad() + ". Su salario actual es " + this.getSalario() + ".";
		return str;
	}
}
