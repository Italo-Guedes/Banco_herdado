//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario { //herda a classe funcionario, ou seja, todos os atributos que tem em funcionario s�o replicados em Gerente (evita escrever muitos c�digos e ajuda a simplificar).	
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Designer");
		return 200; // A bonifica��o do gerente tem de ser a bonifica��o padrao (definida na classe m�e) + o sal�rio do gerente//Usando o super posso aproveitar os m�todos da classe m�e, deixando os atributos privados//retorna a bonifica��o da calsse Funcion�rio (5%) + o sal�rio estanciado para a classe gerente //"this" faz refer�ncia a classe em que est� j� o "super" faz refer�ncia a classe super ou classe m�e // salario na classe Funcionario � private, com isso n�o � acess�vel para a classe Gerente, mesmo Gerente sendo uma extens�o. O que s�o acess�veis s�o os atributos no objeto, justamente por ser uma extens�o.
	}
	

}
