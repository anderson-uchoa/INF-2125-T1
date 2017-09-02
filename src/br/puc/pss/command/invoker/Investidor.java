package br.puc.pss.command.invoker;

import br.puc.pss.command.command.ICommand;

public class Investidor {

	private ICommand[] commandsInvestidor;

	public Investidor() {
		this.commandsInvestidor = new ICommand[5];

		for (int i = 0; i < 5; i++) {
			commandsInvestidor[i] = null;
		}
	}

	public void setCommand(int slot, ICommand comandInvestidor) {
		commandsInvestidor[slot] = comandInvestidor;
	}

	public void commandInvestidor(int slot) {
		commandsInvestidor[slot].execute();
	}
}
