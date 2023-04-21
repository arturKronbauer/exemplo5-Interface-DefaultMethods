package aplicacao;

import java.util.Scanner;

import servicos.ServicoTaxaJuro;
import servicos.ServicoTaxaJuroBR;
import servicos.ServicoTaxaJuroUSE;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pagamento;
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		System.out.println("O empréstimo é no (1)Brasil ou (2)USE? ");
		int pais = sc.nextInt();
		if (pais == 1) {
			ServicoTaxaJuro stj = new ServicoTaxaJuroBR(2.0);
			pagamento = stj.pagamento(valor, meses);
		}
		else {
			ServicoTaxaJuro stj = new ServicoTaxaJuroUSE(1.0);
			pagamento = stj.pagamento(valor, meses);
		}
				
		System.out.println("Pagamento após " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();
	}
}
