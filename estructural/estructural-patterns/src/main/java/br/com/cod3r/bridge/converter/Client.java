package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

// TODO: Bridge review
/*
	O padrão Bridge possui como intenção desacoplar abstrações e implementações, permitindo
	que ambas variem de forma independente.
	- Isso pode ser alcançado quando definimos um conjunto hierárquico para ambos os lados, abstração
	e implementação.
	- No caso abaixo, as classes CSVConverter e JsonConverter são implementações concretas do conversor 
	e a classe abstrata Converter define a interface comum para os conversores.
	- No método main(), são criadas instâncias dos conversores CSVConverter e JsonConverter e, em seguida, 
	são usadas para formatar os objetos 'it' e 'po', que representam funcionários. Os métodos getEmployeeFormated() 
	são chamados nos objetos csvConverter e jsonConverter para obter as representações formatadas dos 
	funcionários nos diferentes formatos (CSV e JSON).
*/

public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		ITGuy it = new ITGuy("Igor", 24, 3000.0);
		ProjectManager po = new ProjectManager("Igor", 24, 3000.0);
		
		String formattedCSV = csvConverter.getEmployeeFormated(it);
		String formattedJSON = jsonConverter.getEmployeeFormated(po);
		
		System.out.println(
			"CSV: " + formattedCSV + "\n" + 
			"JSON: " + formattedJSON
		);
	}
}
