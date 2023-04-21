package servicos;

import java.security.InvalidParameterException;

public interface ServicoTaxaJuro {
	double getTaxaJuro();

	default double pagamento(double valor, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("O total de meses deve ser maior que zero");
		}
		return valor * Math.pow(1.0 + getTaxaJuro() / 100.0, meses);
	}
}
