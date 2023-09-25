package banco2;

public class Principal {
	public static void main(String[]args){
		
		Titular titularConta1 = new Titular("Ruan Jarso", "562.357.589-48");
		Data dataConta1 =  new Data(01,01,2023);
		Conta  c1 = new Conta(titularConta1, 123456, "0001-x", dataConta1);
		c1.setSaldo(100.00);
		
		
		Titular titularConta2 = new Titular("Julio", "123.456.789.10");
		Data dataConta2 = new Data(22,01,2002);
		Conta  c2 = new Conta(titularConta2, 456123,"0001-x", dataConta2);
		c2.setSaldo(150.00);
		
		c1.imprimirDados();
		c1.doacao();
		
		
		c2.imprimirDados();
		c2.doacao();
		
		c1.imprimirTotalContas();
		
		
		if (c1.getSaldo() > c2.getSaldo()) {
			System.out.println(titularConta1.nome + " Possui o saldo maior.");
		}else{
			System.out.println(titularConta2.nome + " Possui o saldo maior.");
		}
		
		for (int i = 0; i < 5; i++) {
            c1.depositar(100.00);
        }
		
		System.out.println("O novo saldo de Ruan Jarso é de: " + c1.getSaldo());
		
	}
}
