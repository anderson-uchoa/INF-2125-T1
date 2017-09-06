package br.puc.pss.command.client;

import br.puc.pss.command.concrete.ArrematarAcoes;
import br.puc.pss.command.concrete.ComprarAcoes;
import br.puc.pss.command.concrete.DoarAcoes;
import br.puc.pss.command.concrete.LeiloarAcoes;
import br.puc.pss.command.concrete.VenderAcoes;
import br.puc.pss.command.invoker.Investidor;
import br.puc.pss.command.receiver.Acoes;

public class Main {

	public static void main(String[] args) {

		Acoes acoes = new Acoes();
		
		Investidor investidor = new Investidor();

		investidor.setCommand(0, new ArrematarAcoes(acoes));
		investidor.setCommand(1, new ComprarAcoes(acoes));
		investidor.setCommand(2, new DoarAcoes(acoes));
		investidor.setCommand(3, new LeiloarAcoes(acoes));
		investidor.setCommand(4, new VenderAcoes(acoes));
		
		
		investidor.commandInvestidor(0);
		investidor.commandInvestidor(1);
		investidor.commandInvestidor(2);
		investidor.commandInvestidor(3);
		investidor.commandInvestidor(4);
		
	
	
	}

}
