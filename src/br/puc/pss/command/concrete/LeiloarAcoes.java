package br.puc.pss.command.concrete;

import br.puc.pss.command.command.ICommand;
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
