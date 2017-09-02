package br.puc.pss.observer.subject;

import br.puc.pss.observer.observers.IObserver;

public interface ISubject {
	
	public void registrarObservador(IObserver observador);
	public void desregistrarObservador(IObserver observador);
	public void notificar(String nomeAcao, Integer valor);

}
