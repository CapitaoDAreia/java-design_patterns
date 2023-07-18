package br.com.cod3r.facade.callCenter.after;

import br.com.cod3r.facade.callCenter.after.facade.CallCenterFacade;
import br.com.cod3r.facade.callCenter.after.model.Card;

//TODO: review Facade
/*
	A intenção do padrão Facade é oferecer uma interface única para um conjunto de interfaces de um subsistema.
	- Isso é observável no exemplo abaixo, onde temos um conjunto de serviços diferentes que são todos
	acessados através de uma Facade 'CallCenterFacade'. Isso nos ajuda a reduzir o nível de acoplamento e a promover
	um nível de encapsulamento. A probabilidade de sofrimento para o cliente é menor caso algo mude nos serviços
	requisitados.
*/

public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		
		Card card = facade.getCardByUser(123456L);
		System.out.println(card);
		
		facade.getSumary(card);
		
		facade.getPaymentInfoByCard(card);
		
		facade.cancelLastRegister(card);
		
		Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}
