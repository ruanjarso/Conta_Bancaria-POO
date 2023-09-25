package banco2;

public class Conta {
	
/*----------------------------------- ATRIBUTOS: CARACTERÍSTICAS DA CONTA -------------------------------------*/
	 
	  private Titular titular;
	  private int numero;
	  private String agencia;
	  private Double saldo = 0.0;
	  private Data dataAbertura;
	  private static int totalContas = 0;
	  
	  
	  
/*--------------- CONSTRUTOR DA CONTA: VAI EXIGIR QUE EU COLOQUE OS VALORES AO CONSTRUIR O OBJETO ------------*/
	  
	  Conta(Titular titular, int numero, String agencia, Data dataAbertura){
		 this.titular = titular; 
		 this.numero = numero;
		 this.agencia = agencia;
		 this.dataAbertura = dataAbertura;
		 totalContas ++;
	  }
	  
/*----------------------- MÉTODOS GETTERS E SETTERS PARA ACESAR OS ATRIBUTOS ---------------------------------*/

	 
	  public void setTitular(String nome, String cpf){
		  titular.nome = nome;
		  titular.cpf = cpf;
	  }
	   
	  
	  public void setNumero(int num){
		  numero = num;
	  }
	  
	  public  int getNumero(){
		  return numero;
	  }
	  
	  public void setAgencia(String agencia){
		  this.agencia = agencia;
	  }
	  
	  public String getAgencia(){
		  return agencia;
	  }
	  
	  public void setSaldo(Double valor) {
		  saldo = valor;
	  }
	  
	  public Double getSaldo(){
		  return saldo;
	  }
	  
	  
	  public void setDataAbertura(int dia, int mes, int ano){
		  this.dataAbertura.dia = dia;
		  this.dataAbertura.mes = mes;
		  this.dataAbertura.ano = ano;
	  }
	  
	  
	  
	  
/*------------------------------------------ MÉTODOS DA CLASSE CONTA -------------------------------------------*/	
	  
	  public void sacar(Double valor){
		  if(valor < saldo){saldo -= valor;}
		  else {System.out.println("Saldo insuficiente!");}
	  }
	  
	  public void depositar(Double valor){
		  saldo += valor;
	  }
	  
	  public void calcularRendimento(){
			 saldo *= 0.1;			 
	  }
	  
	  public void doacao(){
		  if(saldo >= 1){
			  saldo -= 1;
			  System.out.println("seu novo saldo após a Doação é de: " + saldo);
			 }else{System.out.println("Saldo é insuficiente!");}
		  }
	  
/*---------------------------------------------------- IMPRESSÕES ---------------------------------------------*/	  
	  
	  private void imprimirDataAbertura(){
		  System.out.println("Data de abertura: " + dataAbertura.dia + "." + dataAbertura.mes + "." + dataAbertura.ano);
	  } 
	  
	  private void imprimirTitular(){
		  System.out.println("Nome do Titular: " + titular.nome);
		  System.out.println("CPF do Titular: " + titular.cpf);
	  }
	  
	  public void imprimirTotalContas() {
		  System.out.println("------------------------------------------------");
		  System.out.println("O total de contas criadas foi de: " + totalContas);
		  System.out.println("------------------------------------------------");
	  }
	  
	  public void imprimirDados() {
		  System.out.println("------------------------------------------------");
		  imprimirTitular();
		  System.out.println("NUMERO DA CONTA: " + numero);
		  System.out.println("AGÊNCIA: " + agencia);
		  System.out.println("SEU SALDO É DE: " + saldo);
		  imprimirDataAbertura();
		  System.out.println("------------------------------------------------");
	  }
}
