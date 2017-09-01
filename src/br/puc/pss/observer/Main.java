package br.puc.pss.observer;

public class Main {

	public static void main(String[] args) {

		GraficoBarras graficoBarras = new GraficoBarras();
		AcoesLogger acoesLogger = new AcoesLogger();
		CarteiraAcoes carteiraAcoes = new CarteiraAcoes();
		carteiraAcoes.addObservador(graficoBarras);
		carteiraAcoes.addObservador(acoesLogger);

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
