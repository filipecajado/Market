package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("informe uma opção");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1: 
				
				break;
			default:
				System.err.println("[OPS] - Opção inválida!");
			break;
			}
			
		}while(opcao==0);
	}

}
