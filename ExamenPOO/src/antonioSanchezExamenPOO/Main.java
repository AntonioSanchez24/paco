package antonioSanchezExamenPOO;

public class Main {
	public static void main(String args[]) {
		Asignatura[] asignaturas = {
		new Asignatura("Matematicas", 1),
		new Asignatura("Lengua", 2),
		new Asignatura("Programación", 3)
		};
		Profesor manuel = new Profesor(23499, "Manuel Gomez","123456789N", asignaturas);
		PAS mario = new PAS("Mario López", "987654321O", Especialidad.Gestion_Aulas);
		Estudiante jacinto = new Estudiante("Jacinto Salas", "888777565R", asignaturas);
		ProfesorEmerito joselu = new ProfesorEmerito(87000, "Jose Luis Puertas", "123123123W", asignaturas);
		System.out.println(asignaturas[0]);
		System.out.println(manuel);
		System.out.println(mario);
		System.out.println(jacinto);
		System.out.println(joselu);
		manuel.saludar();
		mario.saludar();
		jacinto.saludar();
		joselu.saludar();
		System.out.println(Integer.toString(joselu.getNumeroCharlas()));
		joselu.darCharla();
		joselu.setAsignatura(0, asignaturas[3]);
		joselu.darCharla();
		System.out.println(Integer.toString(joselu.getNumeroCharlas()));
		System.out.println(Integer.toString(ProfesorEmerito.getNumeroCharlasTotales()));

	}
}
