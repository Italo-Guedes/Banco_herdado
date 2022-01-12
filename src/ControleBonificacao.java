
public class ControleBonificacao {
	
	private double soma;
	
		
	public void registra(Funcionario f) {//Todas as classes são filhas/derdam da classe Funcionário
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}	
	
	public double getSoma() {
		return soma;
	}

}
