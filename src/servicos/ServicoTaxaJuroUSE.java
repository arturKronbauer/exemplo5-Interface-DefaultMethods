package servicos;

public class ServicoTaxaJuroUSE implements ServicoTaxaJuro {
	private double taxaJuro;

	public ServicoTaxaJuroUSE(double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}

	@Override
	public double getTaxaJuro() {
		return taxaJuro;
	}
}
