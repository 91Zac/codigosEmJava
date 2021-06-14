
public class Terceiro extends Funcionario {
	private double adicional;
	public Terceiro() {
		super();
	}
	public Terceiro(String cod, double horas, double valorHora, double adicional) {
		super(cod, horas, valorHora);
		this.adicional = adicional;
	}
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	@Override
	public double pagamentoSalario() {
		
		return (this.valorHora * this.horas)+this.adicional;
		
	}
	
	
	
}