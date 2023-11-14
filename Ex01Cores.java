package JavaExercicios.Modulo12CollectionsEstruturaDados;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01Cores {

	public static void main(String[] args) {
		
		int x;
		
		Scanner leia = new Scanner (System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for(x=0;x<5;x++) {
			System.out.println("Adicione a "+(x+1)+"ª cor: ");
			String cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("\n\tLista de todas as cores:");
		System.out.println(cores);
		
		Collections.sort(cores, String.CASE_INSENSITIVE_ORDER);
		System.out.println("\n\tLista com as cores ordenadas:");
		System.out.println(cores);
		
		leia.close();
	} 

}