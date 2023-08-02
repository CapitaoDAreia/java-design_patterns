package br.com.cod3r.strategy.calc.after;

import br.com.cod3r.strategy.calc.after.strategies.AdditionOperation;
import br.com.cod3r.strategy.calc.after.strategies.DivisionOperation;
import br.com.cod3r.strategy.calc.after.strategies.MultiplicationOperation;
import br.com.cod3r.strategy.calc.after.strategies.SubtractionOperation;

//Todo: review Padrão Strategy
/*
	A intenção do Padrão Strategy é encapsular uma família de algoritmos em objetos permitindo
	que possam ser utilizados de forma intercambiável, ou seja, o algoritmo específico pode
	ser trocado sem que o módulo usuário desse algoritmo precise ser alterado.
	- Neste exemplo prático isso acontece quando, para retornar o resultado de uma determinada operação,
	já possuindo os valores, a objeto calc recebe somente o algoritmo para efetuar o calculo, ou a
	estratégia para efetuar a operação em questão. As estratégias estão todas definidas previamente.
*/

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}
