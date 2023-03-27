package ExerciciosGen;

public class TesteFuncionario {

	public static void main(String[] args) {
		
Funcionario[] lista = new Funcionario[5];
		
		lista[0] = new Funcionario("Lucas vinicius",10000);
		lista[1] = new Funcionario("Rafael Galvão",15000);
		lista[2] = new Funcionario("caio henrrique",20000);
		lista[3] = new Funcionario("chris kaufman",25000);
		lista[4] = new Funcionario("William Reis",30000);
		
		
		
		for(Funcionario roda:lista) {
			roda.imprimir();
		}
		System.out.println("******************************************");
		for(Funcionario roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}


	}

}
