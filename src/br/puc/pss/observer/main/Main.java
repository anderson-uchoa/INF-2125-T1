package br.puc.pss.observer.main;

import br.puc.pss.observer.observers.AcoesLogger;
import br.puc.pss.observer.observers.GraficoBarras;
import br.puc.pss.observer.subject.CarteiraAcoes;

public class Main {

	public static void main(String[] args) {
		
		CarteiraAcoes carteiraAcoes = new CarteiraAcoes();
		GraficoBarras graficoBarras = new GraficoBarras(carteiraAcoes);
		AcoesLogger acoesLogger = new AcoesLogger(carteiraAcoes);
		
		
		try {
			carteiraAcoes.adcionarAcoes("COMP02", 200);
			Thread.sleep(2000);
			carteiraAcoes.adcionarAcoes("EMP34", 400);
			Thread.sleep(2000);
			carteiraAcoes.adcionarAcoes("ACDF89", 300);
			Thread.sleep(2000);
			carteiraAcoes.adcionarAcoes("EMP34", -200);
			Thread.sleep(2000);
			carteiraAcoes.adcionarAcoes("COMP02", 150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
