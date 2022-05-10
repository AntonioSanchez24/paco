package antonioSanchezExamenPOO;

public class Estudiante extends Miembro{
	private Asignatura[] asignaturas;
	
	public Estudiante(String nombre, String DNI, Asignatura[] asignaturas) {
		super(nombre, DNI);
		this.asignaturas = asignaturas;
	}
		
	public void setAsignatura(int i, Asignatura asignatura) {
		if (asignatura != null) {
			asignaturas[i] = asignatura;
			}
	}
	
	public Asignatura getAsignatura(int i) {
		return asignaturas[i];
	}
	@Override
	public void saludar() {
		System.out.println("¡Hola!");
	}
	
	@Override
	public String toString() {
		String str = "El alumno " + this.getNombre() + ", cuyo DNI es " + this.getDNI() + " cursa en las asignaturas ";
		int i = 0;
		do {
			str += asignaturas[i].toString() + ", ";
			i++;
		}while (i < asignaturas.length);
		return str;
	}
}
