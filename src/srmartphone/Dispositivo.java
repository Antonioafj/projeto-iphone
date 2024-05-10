package srmartphone;

import sistema.internet.Browser;
import sistema.iphone.Iphone;
import sistema.multimidia.Ipod;
import sistema.multimidia.ReprodutorMultimidia;
import sistema.telefonia.Telefone;

public class Dispositivo {
	public static void main(String[] args) {
		Iphone gadget  = new Iphone();
		
		ReprodutorMultimidia reprodutormultimidia = gadget;
		Browser browser = gadget;
		Telefone telefone = gadget;
		
		reprodutormultimidia.tocarMusica();
		browser.exibirPaginas();
		telefone.ligar();
			
	}

}
