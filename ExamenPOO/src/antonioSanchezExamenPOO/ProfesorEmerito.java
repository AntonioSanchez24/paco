package antonioSanchezExamenPOO;

public class ProfesorEmerito extends Profesor implements Conferenciante {
	
	private Asignatura[] asignaturas;
	private int numeroCharlas;
	private static int numeroCharlasTotales;
	
	public ProfesorEmerito(String nombre, String DNI, Asignatura[] asignaturas) {
		super(nombre, DNI);
	}
	public ProfesorEmerito(int salario, String nombre, String DNI, Asignatura[] asignaturas) {
		super(salario, nombre, DNI);
	}
	
	public int getNumeroCharlas() {
		return numeroCharlas;
	}
	public void setNumeroCharlas(int numeroCharlas) {
		this.numeroCharlas = numeroCharlas;
	}
	public static int getNumeroCharlasTotales() {
		return numeroCharlasTotales;
	}
	public static void setNumeroCharlasTotales(int numeroCharlasTotales) {
		ProfesorEmerito.numeroCharlasTotales = numeroCharlasTotales;
	}
	@Override
	public void darCharla() {
		System.out.println("Hoy vengo a hablar de " + asignaturas[0].getTitulo() + " y de " + asignaturas[1].getTitulo());
		this.numeroCharlas++;
		numeroCharlasTotales++;
		}
	
	@Override	
	public String toString() {
		String str = "El profesor emérito " + this.getNombre() + ", cuyo DNI es " + this.getDNI() + " da charlas sobre las asignaturas ";
		int i = 0;
		do {
			str += asignaturas[i].toString() + ", ";
			i++;
		}while (i < asignaturas.length);
		str += ". Su salario actual es " + this.getSalario() + ".";
		return str;
	}
}
