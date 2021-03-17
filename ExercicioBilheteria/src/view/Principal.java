package view;

import controller.Cliente;

public class Principal {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 300; i++){
			Cliente cliente = new Cliente(i);
			cliente.start();
		}
	}

}
