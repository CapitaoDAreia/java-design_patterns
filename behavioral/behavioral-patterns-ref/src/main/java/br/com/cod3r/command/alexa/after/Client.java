package br.com.cod3r.command.alexa.after;

import br.com.cod3r.command.alexa.after.alexa.Alexa;
import br.com.cod3r.command.alexa.after.commands.TurnLightOffCommand;
import br.com.cod3r.command.alexa.after.commands.TurnLightOnCommand;
import br.com.cod3r.command.alexa.after.lights.PhillipsHueLight;
import br.com.cod3r.command.alexa.after.lights.XiaomiLight;

// TODO: review COMMAND
/*
	A intenção do padrão command é encapsular uma solicitação como um objeto, desta forma, será possível parametrizar
	clientes com diferentes solicitações, enfileirando ou fazendo registros(logs).
	- No caso em questão, temos  como exemplo uma simulação do que seria a Alexa, da Amazon.
	As integrações com luzes elétricas são adicionadas na alexa, e para isso, utilizamos uma key, um comando e uma lista de keywords.
	A key representa o comando em si, e as keywords são formas de identificar o comando em uma frase específica.
	Quando fazemos uma request que possuam as keywords, o comando é disparado. 

	- Certo, mas onde está o padrão?
	Neste caso, o padrão command se materializa quando temos uma interface que espera um comando genérico, e assim podemos
	passar o comando que desejarmos para qualquer tipo de integração que for feita, não importando se é uma luz da marca x ou y.
	Dessa forma, tratamos as solicitações como objetos.
*/

public class Client {

	public static void configureAlexa(Alexa alexa) {
		PhillipsHueLight livingRoom = new PhillipsHueLight();
		XiaomiLight kitchen = new XiaomiLight();
		
		alexa.addIntegration("Turn on the Living room light", new TurnLightOnCommand(livingRoom), "on", "Living room", "light");
		alexa.addIntegration("Turn off the Living room light", new TurnLightOffCommand(livingRoom), "off", "Living room", "light");
		alexa.addIntegration("Turn on the Kitchen light", new TurnLightOnCommand(kitchen), "on", "Kitchen", "light");
		alexa.addIntegration("Turn off the Kitchen light", new TurnLightOffCommand(kitchen), "off", "Kitchen", "light");
	}
	
	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		configureAlexa(alexa);
		
		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");
		
		alexa.sendRequest("Please, could you Turn off the Living room light?");
	}
}
