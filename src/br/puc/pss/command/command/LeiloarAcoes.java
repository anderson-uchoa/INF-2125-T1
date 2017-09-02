package br.puc.pss.command.command;

import br.puc.pss.command.receiver.Acoes;

public class LeiloarAcoes implements ICommand {

	private Acoes acoes;

	public LeiloarAcoes(Acoes acoes) {
		this.acoes = acoes;
	}

	@Override
	public void execute() {
		acoes.leiloar();

	}

}
