package br.com.cod3r.proxy.bank;

import br.com.cod3r.proxy.bank.services.ATM;
import br.com.cod3r.proxy.bank.services.Bank;
import br.com.cod3r.proxy.bank.services.BankOperations;

//TODO: review Proxy
/*
	- A intenção do padrão Proxy é prover um substituto ou ponto através
	do qual um objeto possa controlar o acesso a outro objeto.
	- No caso em questão, o objeto acessado é o 'Bank', e o proxy, controlador, é
	o objeto 'ATM'. A implementação do Proxy pode variar de acordo com seu objetivo.
	Por exemplo, um Remote Proxy controla o acesso a obejetos remotos. Já o Smart Proxy
	possui como objetivo a adição/modificação de funcionalidades, além do controle de acesso.
*/

public class Client {

	public static void main(String[] args) {
		BankOperations bank = new Bank();
		bank.deposit(123L, 500L);
		bank.withdraw(456L, "8888", 50L);
		bank.withdraw(456L, "9999", 50L);
		bank.withdraw(123L, "1234", 2000L);
		bank.changePassword(123L, "1111", "4321");
		bank.changePassword(123L, "1234", "4321");
		bank.withdraw(123L, "4321", 700L);
		
		System.out.println("------------- ATM -------------");
		BankOperations atm = new ATM(bank);
		atm.deposit(123L, 500L);
		atm.withdraw(456L, "8888", 50L);
		atm.withdraw(456L, "9999", 50L);
		atm.withdraw(123L, "1234", 2000L);
		atm.changePassword(123L, "1111", "4321");
		atm.changePassword(123L, "1234", "4321");
		atm.withdraw(123L, "4321", 700L);
	}
}
