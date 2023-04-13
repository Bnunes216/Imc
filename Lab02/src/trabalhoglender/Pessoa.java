package trabalhoglender;
public class Pessoa {

	private String nome;
	private String sobrenome;
	private String obesidade;
	private int idade;
	private double altura;
	private double peso;
	private double imc;
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getObesidade() {
		return obesidade;
	}
	public void setObesidade(String obesidade) {
		this.obesidade = obesidade;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}

	public double calculaIMC(double imc2){
	    this.imc = this.peso / Math.pow(altura, 2);
	    return this.imc;
	}

    public String informaObesidade(){
        if(imc < 18.5){
            obesidade = "Abaixo do Peso";
        }else if(imc >= 18.5 && imc <= 24.9){
            obesidade = "Normal";
        }else if(imc >= 25 && imc <= 29.9){
            obesidade = "Sobrepeso";
        }else if(imc >= 30 && imc <= 34.9){
            obesidade = "Obesidade grau 1";
        }else if(imc >= 35 && imc <= 39.9){
            obesidade = "Obesidade grau 2";
        }else if(imc > 40){
            obesidade = "Obesidade grau 3";
        }
        return obesidade;
    }
	
}
