package br.puc.pss.command.command;

import br.puc.pss.command.receiver.Acoes;

public class DoarAcoes implements ICommand {

	private Acoes acoes;

	public DoarAcoes(Acoes acoes) {
		this.acoes = acoes;

	}

	@Override
	public void execute() {
		acoes.doar();

	}

}
