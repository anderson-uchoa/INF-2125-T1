package br.puc.pss.command.command;

import br.puc.pss.command.receiver.Acoes;

public class ComprarAcoes implements ICommand {

	private Acoes acoes;

	public ComprarAcoes(Acoes acoes) {
		this.acoes = acoes;

	}

	@Override
	public void execute() {
		acoes.comprar();

	}

}
