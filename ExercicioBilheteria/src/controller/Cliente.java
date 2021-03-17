package controller;

import view.Principal;

public class Cliente extends Thread {

	int pessoaId;
	int ingresso = 100;
	int qtd;
	
	Principal principal = new Principal();
	
	public Cliente (int i) {
		pessoaId = i + 1;
	}
	
	@Override
	public void run() {
		if (Login() == false) {
			System.out.println("Cliente #" + pessoaId + " Não pôde efetuar login");
		} else {
			System.out.println("Cliente #" + pessoaId + " Efetuou login" );
			}
		
		if (Compra() == false){
			System.out.println("Cliente #"+ pessoaId + " Não pôde efetuar a compra");
		} else {
		System.out.println("Cliente #" + pessoaId + " Compra em andamento.");
	}
		
		if (Final() == true){
			System.out.println("Cliente #" + pessoaId + " Comprou " + qtd + " ingressos");
		} else {
			System.out.println("Ingressos esgotados");
		}
	}

	private static boolean Login() {
	
		int tempo = (int) ((Math.random()*2001) + 500);

		if (tempo > 1000){
			return false;
		} else {

		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
		}
	}
	
	private static boolean Compra() {
	    
		int tempo = (int) ((Math.random()*2001) + 1000);
	        
		if (tempo>2500){
			return false;
		} else {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	    }
	}
	
	public boolean Final() {

		int quantd = (int) ((Math.random() * 4) + 1);
		
		if (quantd <= ingresso){
		ingresso -= quantd;
		qtd = quantd;
		
		return true;
		
		} else {
			
		return false;
		
	    }
	}
}
