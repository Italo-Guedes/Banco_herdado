
public class ControleBonificacao {
	
	private double soma;
	
		
	public void registra(Funcionario f) {//Todas as classes s�o filhas/derdam da classe Funcion�rio
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}	
	
	public double getSoma() {
		return soma;
	}

}
