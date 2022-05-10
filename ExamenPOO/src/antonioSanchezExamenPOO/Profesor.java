package antonioSanchezExamenPOO;

import java.util.ArrayList;

public class Profesor extends Personal {
	
	private ArrayList<Asignatura> asignaturas;
	
	public Profesor(String nombre, String DNI) {
		super(nombre, DNI);
		this.asignaturas = new ArrayList<Asignatura>();
	}
	public Profesor(int salario, String nombre, String DNI) {
		super(salario, nombre, DNI);
		this.asignaturas = new ArrayList<Asignatura>();
	}
	
	public void setAsignatura(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
	}
	
	public void setAsignatura(int i, Asignatura asignatura) {
		this.asignaturas.add(i, asignatura);
	}
	
	public String getAsignatura(int i) {
		return asignaturas.get(i).toString();
	}
	
	public String toString() {
		String str = "El profesor " + this.getNombre() + ", cuyo DNI es " + this.getDNI() + " imparte las asignaturas ";
		int i = 0;
		do {
			str += asignaturas.get(i).toString() + ", ";
			i++;
		}while (i < asignaturas.size());
		str += ". Su salario actual es " + this.getSalario() + ".";
		return str;
	}
}
