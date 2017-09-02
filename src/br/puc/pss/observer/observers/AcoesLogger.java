package br.puc.pss.observer.observers;

import br.puc.pss.observer.subject.CarteiraAcoes;

public class AcoesLogger implements IObserver {

	private CarteiraAcoes carteiraAcoes;

	public AcoesLogger(CarteiraAcoes carteiraAcoes) {
		this.carteiraAcoes = carteiraAcoes;
		this.carteiraAcoes.registrarObservador(this);
	}

	@Override
	public void mudancaQuantidade(String acao, Integer quantidade) {
		System.out.println("Alterada a quantidade da ação: " + acao + " para " + quantidade);
	}

}
