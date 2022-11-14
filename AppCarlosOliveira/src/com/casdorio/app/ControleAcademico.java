package com.casdorio.app;
import java.util.Scanner;

public class ControleAcademico {
	
	private static String[] nomes;
	private static float[] av1;
	private static float[] av2;
	
	private static final int TAMANHO = 100; 	
	
	public static void main(String[] args){

		nomes = new String[TAMANHO];
		av1 = new float[TAMANHO];
		av2 = new float[TAMANHO];
		Scanner in = new Scanner(System.in);
		String opcao;

		do {
			System.out.println("[1] Registrar as notas de um novo aluno");
			System.out.println("[2] Consultar boletim de um aluno");
			System.out.println("[3] Consultar notas da turma");
			System.out.println("[4] Sair");
			
			System.out.print("Informe a opção desejada: ");						
			opcao = in.next();					

			
			switch (opcao) {
			case "1":
				System.out.println("Registrar as notas de um novo aluno: ");
				break;

			case "2":
				System.out.println("Consultar boletim de um aluno: ");
				break;

			case "3":
				System.out.println("Consultar notas da turma: ");
				break;

			case "4":
				System.out.println("sair: ");
				break;

			default:
				System.out.println("nem uma");
				break;
			}
		} while (!"4".equalsIgnoreCase(opcao));
				
		in.close();
		
		
		
	}	
}
