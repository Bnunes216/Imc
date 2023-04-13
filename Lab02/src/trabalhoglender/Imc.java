package trabalhoglender;
import java.util.Scanner;
public class Imc {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pessoa eq = new Pessoa();
		
		String  nome, sobrenome, obesidade;
		int idade;
		double altura, peso, imc = 0;
		
		System.out.print("Informe seu nome: ");
	    nome = input.nextLine();
	    eq.setNome(nome);

	    System.out.print("Informe seu sobrenome: ");
	    sobrenome = input.nextLine();
	    eq.setSobrenome(sobrenome);
	    
	    System.out.print("Informe sua idade: ");
	    idade = input.nextInt();
	    eq.setIdade(idade);
		
	    System.out.print("Informe seu peso: ");
	    peso = input.nextDouble();
	    eq.setPeso(peso);
	    
	    System.out.print("Informe sua altura: ");
	    altura = input.nextDouble();
	    eq.setAltura(altura);
	    
	    imc = eq.calculaIMC(imc);
        obesidade = eq.informaObesidade();

        System.out.println("Nome: " + nome + " " + sobrenome +
        "\nIdade: " + idade + 
        "\nPeso: " + peso +
        "\nAltura: " + altura +
        "\nseu IMC: " + imc + 
        "\nVocê está: " + obesidade);    
    }
}
