//Não pode instanciar objetos dessa classe, pq é abstrata.
public abstract class Funcionario {//classe abstrata conceito, relacionado com herança
	
	
	private String nome;
	private String cpf;
	private double salario;//protetec está entre o private e public, significa que é público para as classes filhos.
		
	//método sem corpo, não há uma implementação AQUI (somente nos filhos)
	public abstract double getBonificacao(); //Assinatura do método.
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
