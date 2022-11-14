package com.casdorio.app;
import java.util.Scanner;

public class ControleAcademico {
	
	private static String[] nomes;
	private static float[] av1;
	private static float[] av2;
	
	private static final int TAMANHO = 100; 	
	
	private static String obterStatus(float media){		
		if(media < 4) {
			return "Reprovado";
		}else if(media < 7){
			return "Prova final";
		}		
		return "Aprovado";
	}
	
	private static float media(float av1, float av2) {		
		return (av1+av2)/2;
	}
	
	private static void imprimir() {		
		for (int i = 0; i < TAMANHO; i++) {
			if(nomes[i] != null) {
				imprimir(i);
			}
		}
	}
	private static void imprimir(int indice) {
		
		System.out.println("| "+indice+" | " + 
							nomes[indice] + " | AV1: " + 
							av1[indice] + " AV2: " + 
							av2[indice] + " MEDIA: " +
							media(av1[indice], av2[indice]) + " SITUAÇÃO: " +
							obterStatus(media(av1[indice], av2[indice]))
							);
	}
	public static void main(String[] args){

		nomes = new String[TAMANHO];
		av1 = new float[TAMANHO];
		av2 = new float[TAMANHO];

		Scanner in = new Scanner(System.in);
		
		String opcao;
		int pos = 0;

		do {
			System.out.println("[1] Registrar as notas de um novo aluno");
			System.out.println("[2] Consultar boletim de um aluno");
			System.out.println("[3] Consultar notas da turma");
			System.out.println("[4] Sair");
			
			System.out.print("Informe a opção desejada: ");						
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				if(pos < TAMANHO) {
					System.out.print("Informe o nome do aluno: ");	
					nomes[pos] = in.next();
	
					System.out.print("Informe a nota da AV1: ");	
					av1[pos] = in.nextFloat();
	
					System.out.print("Informe a nota da AV2: ");	
					av2[pos] = in.nextFloat();
					
					imprimir(pos);

					pos++;
				} else {
					System.out.println("Tamanho maximo de alunos cadastrado atingido!");
				}
				break;

			case "2":
				System.out.print("Informe o numero do aluno: ");						
				int id = in.nextInt();

				if(id >= 0 && id < pos) {
					imprimir(id);
				} else {
					System.out.println("O índice ["+id+"] é inválido!!!");
				}
				break;

			case "3":
				imprimir();
				break;

			case "4":
				System.out.println("Saída");
				break;

			default:
				System.out.println("A opção ["+opcao+"] inválida");
				break;
			}
		} while (!"4".equalsIgnoreCase(opcao));
				
		System.out.println("Processamento finalizado!!!");
		
		in.close();
		
		
		
	}	
}
