package br.com.cod3r.mediator.swing.after;

//Todo: review Padrão Mediator
/*
	A intenção do Padrão Mediator é definir um objeto que encapsula como um conjunto de objetos
	interagem. Promove o acoplamento fraco ao manter objetos que não se referem um ao outro explicitamente, 
	permitindo variar sua interação independentemente.
	- No caso em questão, o mediator está atuando como um intermediário para coordenar as ações entre
	os componentes sem que eles tenham conhecimento direto uns dos outros. O mediator conhece todos, 
	mas a interação entre eles é baixa, o que reduz muito o nível de acoplamento em comparação a como
	seria se o mediator não fizesse essa ligação, deixando com que diversos objetos se referenciassem entre si.
*/

public class Client {
	
	public static void main(String[] args) {
		Screens screens = new Screens();
		screens.init();
	}
}
