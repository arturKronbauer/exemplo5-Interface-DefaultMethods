package servicos;

public class ServicoTaxaJuroBR implements ServicoTaxaJuro {
	private double taxaJuro;

	public ServicoTaxaJuroBR(double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}

	@Override
	public double getTaxaJuro() {
		return taxaJuro;
	}
}
