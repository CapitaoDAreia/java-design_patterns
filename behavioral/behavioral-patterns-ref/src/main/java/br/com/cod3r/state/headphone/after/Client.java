package br.com.cod3r.state.headphone.after;

//Todo: review Padrão State
/*
	A intenção do Padrão State é permitir a um objeto alterar o seu comportamento quando o seu estado
	interno mudar. O objeto irá aparentar mudar de classe.
	- No caso em questão, temos o exemplo de um HeadPhone. Esse HeadPhone possui os estados desligado, ligado e tocando.
	O que acontece é que o cliente faz a alteração desses estados e, quando essa alteração acontece,
	uma nova instância de singleton é adicionada a essa classe HeadPhone, fazendo com que, apesar de seus 
	métodos permanecerem o mesmo, suas implementações mudem de acordo com cada instância, já que as 
	diferentes instâncias representam diferentes estados.
*/

public class Client {

	public static void main(String[] args) {
		HeadPhone phone = new HeadPhone();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
		phone.onClick();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
	}
}
