//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario { //herda a classe funcionario, ou seja, todos os atributos que tem em funcionario são replicados em Gerente (evita escrever muitos códigos e ajuda a simplificar).	
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Ediitor de video");
		return 150;		//return super.getBonificacao() + 100; // A bonificação do gerente tem de ser a bonificação padrao (definida na classe mãe) + o salário do gerente//Usando o super posso aproveitar os métodos da classe mãe, deixando os atributos privados//retorna a bonificação da classe Funcionário (5%) + o salário estanciado para a classe gerente //"this" faz referência a classe em que está já o "super" faz referência a classe super ou classe mãe // salario na classe Funcionario é private, com isso não é acessível para a classe Gerente, mesmo Gerente sendo uma extensão. O que são acessíveis são os atributos no objeto, justamente por ser uma extensão.
	}
	
	

}
