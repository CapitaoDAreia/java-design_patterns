package br.com.cod3r.prototype.deepShallow;

import br.com.cod3r.prototype.deepShallow.model.Address;
import br.com.cod3r.prototype.deepShallow.model.User;

// TODO: Prototype review
/*
	- A intentção do padrão Prototype é especificar os tipos de objetos a serem criados usando
	uma instância-protótipo e criar novos objetos pela cópia desse protótipo.
	- No caso em questão, o objeto user é clonado no trecho 'User cloneUser = user.clone()',
	fazendo o uso de um recurso do próprio Java para este tipo de operação.
	- Vale a pena destacar que existem dois tipos de cópia de objetos. a deep copy e a shallow copy.
	- Shallow copy se refere a uma cópia mais superficial dos objetos, outros objetos que integrarem o objeto
	copiado neste modelo terão suas referências compartilhadas ao invés de clonadas.
	- No caso da deep copy, o que acontecerá é o clone de todos os objetos que integrarem o objeto copiado.
	Neste modelo, os objetos integrantes devem implementar a interface 'Cloneabe' afim de usar o método
	nativo 'clone'. 
*/

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("Clone", 25, new Address("ABC Street", 1000));
		System.out.println(user);
		
		User cloneUser = user.clone();
		cloneUser.name = "Clone x2";
		cloneUser.address.street = "Double Street";
		System.out.println(user);
		System.out.println(cloneUser);
	}
}
