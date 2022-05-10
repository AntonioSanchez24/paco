package antonioSanchezExamenPOO;

public class Asignatura { //He decidido hacer que la asignatura sea un objeto, para poder manejar bien tanto el t�tulo como el c�digo.
	private String titulo;
	private int codigo;
	
	public Asignatura(String titulo, int codigo) {
		if (titulo != null) {
		this.titulo = titulo;
		}
		this.codigo = codigo;
	}
	// M�todos, en este caso los getters y setters b�sicos.

	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return this.getTitulo() + ", cuyo c�digo es " + Integer.toString(this.getCodigo());
		}
}
