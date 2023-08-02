package br.com.cod3r.observer.party.after;

import br.com.cod3r.observer.party.after.observers.Friend;
import br.com.cod3r.observer.party.after.observers.Wife;
import br.com.cod3r.observer.party.after.subject.Doorman;

//Todo: review Padrão Observer
/*
	A intenção do padrão Observer é definir uma relação de dependência entre objetos, de modo
	a garantir que, quando algum evento ocorrer, todos os objetos dependentes sejam notificados.
	- No exemplo em questão, nosso Observer é o Doorman, que extends de Subject.
	Este Doorman possui uma lista de dependentes a serem adicionados, e posteriormente, itera sobre
	eles os notificando quando algo acontece.

	Pense como seria se, cada um dos dependentes precisassem requisitar essa informação do Observer a 
	cada 5 minutos para poderem efetuar suas operações. Tendo isso em mente, fica claro o problema que o
	Observer resolve.
*/

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());
		
		System.out.println("Husband is comming");
		doorman.setStatus(true);
	}
}
