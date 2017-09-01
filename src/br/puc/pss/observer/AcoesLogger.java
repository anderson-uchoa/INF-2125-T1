package br.puc.pss.observer;
public class AcoesLogger implements Observador {

	
	@Override
	public void mudancaQuantidade(String acao, Integer quantidade) {
		System.out.println("Alterada a quantidade da ação: " + acao + " para " + quantidade);
	}

}
