package antonioSanchezExamenPOO;

public abstract class Personal extends Miembro{
	protected int salario;
	private static int salarioMinimo = 10000;
	
	public Personal(int salario, String nombre, String DNI) {
		super(nombre, DNI);
		this.salario = salario;
	}
	
	public Personal(String nombre, String DNI) {
		super(nombre, DNI);
		this.salario = salarioMinimo;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public static int getSalarioMinimo() {
		return salarioMinimo;
	}

	public static void setSalarioMinimo(int salarioMinimo) { //Se podrá cambiar anualmente.
		Personal.salarioMinimo = salarioMinimo;
	}

	@Override
	public void saludar() {
		System.out.println("Buenos días.");
	}
}
