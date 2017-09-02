package br.puc.pss.observer.subject;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import br.puc.pss.observer.observers.IObserver;

public class CarteiraAcoes implements ISubject {

	private Map<String, Integer> acoes;
	private List<IObserver> observadors;

	public CarteiraAcoes() {
		acoes = new HashMap<>();
		observadors = new ArrayList<>();
	}

	public Map<String, Integer> getAcoes() {
		return acoes;
	}

	public void adcionarAcoes(String nomeAcao, Integer valor) {

		if (acoes.containsKey(nomeAcao)) {
			valor = valor + acoes.get(nomeAcao);
		}

		acoes.put(nomeAcao, valor);

		notificar(nomeAcao, valor);
	}

	@Override
	public void registrarObservador(IObserver observador) {
		observadors.add(observador);
	}

	@Override
	public void desregistrarObservador(IObserver observador) {
		observadors.remove(observador);
	}

	@Override
	public void notificar(String nomeAcao, Integer valor) {
		for (IObserver observador : observadors) {
			observador.mudancaQuantidade(nomeAcao, valor);

		}
	}
}
