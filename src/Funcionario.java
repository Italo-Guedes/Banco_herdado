//N�o pode instanciar objetos dessa classe, pq � abstrata.
public abstract class Funcionario {//classe abstrata conceito, relacionado com heran�a
	
	
	private String nome;
	private String cpf;
	private double salario;//protetec est� entre o private e public, significa que � p�blico para as classes filhos.
		
	//m�todo sem corpo, n�o h� uma implementa��o AQUI (somente nos filhos)
	public abstract double getBonificacao(); //Assinatura do m�todo.
	
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
