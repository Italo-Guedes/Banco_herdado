//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel eh um Autenticavel.
public class Gerente extends Funcionario implements Autenticavel  { //herda a classe funcionario, ou seja, todos os atributos que tem em funcionario são replicados em Gerente (evita escrever muitos códigos e ajuda a simplificar).	
	

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();//return super.getBonificacao() + super.getSalario(); // A bonificação do gerente tem de ser a bonificação padrao (definida na classe mãe) + o salário do gerente//Usando o super posso aproveitar os métodos da classe mãe, deixando os atributos privados//retorna a bonificação da calsse Funcionário (5%) + o salário estanciado para a classe gerente //"this" faz referência a classe em que está já o "super" faz referência a classe super ou classe mãe // salario na classe Funcionario é private, com isso não é acessível para a classe Gerente, mesmo Gerente sendo uma extensão. O que são acessíveis são os atributos no objeto, justamente por ser uma extensão.
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}	

}
