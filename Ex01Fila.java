package JavaExercicios.Modulo12CollectionsEstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Fila {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner (System.in);
		
		Queue<String> fila = new LinkedList <String>();
		
		do {
			
			System.out.println("\n***********************************************");
			System.out.println("\n\t1 - Adicionar Cliente na fila");
			System.out.println("\t2 - Listar todos os Clientes");
			System.out.println("\t3 - Retirar Cliente da fila");
			System.out.println("\t0 - Sair");
			System.out.println("\n***********************************************");
			System.out.println("\nEntre com a opção desejada: ");
			System.out.println();	
			op = leia.nextInt();

			switch(op) {
			
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;
			
			case 2:
				leia.nextLine();
				System.out.println("\nLista de clientes na Fila: ");
				System.out.println(fila);
				break;
			
			case 3:
				leia.nextLine();
				System.out.println("\n\tCliente "+fila.poll()+" foi chamade!");
				System.out.println("\nFila atualizada:"+fila);
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
			
			}
		}while(op !=0);
		
		
	}

}
