package br.puc.pss.observer;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class CarteiraAcoes {

	private Map<String, Integer> acoes = new HashMap<>();
	private List<Observador> observadors = new ArrayList<>();

	public void adcionarAcoes(String acao, Integer quantidade) {
		if (acoes.containsKey(acao)) {
			quantidade = quantidade + acoes.get(acao);
		}
		acoes.put(acao, quantidade);
		notificar(acao, quantidade);
	}

	private void notificar(String acao, Integer quantidade) {

		for (Observador observador : observadors) {
			observador.mudancaQuantidade(acao, quantidade);
		}
	}

	public void addObservador(Observador observador) {
		observadors.add(observador);
	}
}
