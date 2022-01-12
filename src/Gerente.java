//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel eh um Autenticavel.
public class Gerente extends Funcionario implements Autenticavel  { //herda a classe funcionario, ou seja, todos os atributos que tem em funcionario s�o replicados em Gerente (evita escrever muitos c�digos e ajuda a simplificar).	
	

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getSalario();//return super.getBonificacao() + super.getSalario(); // A bonifica��o do gerente tem de ser a bonifica��o padrao (definida na classe m�e) + o sal�rio do gerente//Usando o super posso aproveitar os m�todos da classe m�e, deixando os atributos privados//retorna a bonifica��o da calsse Funcion�rio (5%) + o sal�rio estanciado para a classe gerente //"this" faz refer�ncia a classe em que est� j� o "super" faz refer�ncia a classe super ou classe m�e // salario na classe Funcionario � private, com isso n�o � acess�vel para a classe Gerente, mesmo Gerente sendo uma extens�o. O que s�o acess�veis s�o os atributos no objeto, justamente por ser uma extens�o.
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
