package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;

// TODO: Adapter review
/*
	O padrão Adapter tem como intenção permitir que duas classes que implementam
	interfaces diferentes trabalhem em conjunto.
	- Podemos ver isso no exemplo abaixo de forma simples, tomando como base
	um monitor que possui uma entrada VGA sendo conectado em um PC que possui uma
	saída HDMI. Para que isso seja possível, temos um Adapter 'HDMIToVGAAdapter',
	que recebe uma conexão VGA e a devolve para a entrada HDMI, fazendo a mediação
	entre as duas interfaces distintas.
*/

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		OldMonitor monitor = new OldMonitor();
		Computer pc2 = new Computer();
		HDMIToVGAAdapter monitorAdapter =  new HDMIToVGAAdapter(monitor);
		pc2.connectPort(monitorAdapter);

		System.out.println("------ Monitor Class Adapter ----------");
		
	}
}
