package br.puc.pss.command.command;

import br.puc.pss.command.receiver.Acoes;

public class VenderAcoes implements ICommand {

	private Acoes acoes;

	public VenderAcoes(Acoes acoes) {
		this.acoes = acoes;
	}

	@Override
	public void execute() {
		acoes.vender();
	}

}
