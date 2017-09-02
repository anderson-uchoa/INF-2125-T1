package br.puc.pss.command.command;

import br.puc.pss.command.receiver.Acoes;

public class ArrematarAcoes implements ICommand {

	private Acoes acoes;

	public ArrematarAcoes(Acoes acoes) {
		this.acoes = acoes;

	}

	@Override
	public void execute() {
		acoes.arrematar();

	}

}
