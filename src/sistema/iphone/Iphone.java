package sistema.iphone;

import sistema.internet.Browser;
import sistema.multimidia.ReprodutorMultimidia;
import sistema.telefonia.Telefone;

public class Iphone implements ReprodutorMultimidia , Telefone , Browser {

	public void tocarMusica() {
		System.out.println("TOCANDO MUSICA NO IPHONE");
		
	}
	public void pausarMusica() {
		System.out.println("PAUSANDO MUSICA NO IPHONE");	
	}
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA NO IPHONE");	
	}
	
	public void ligar() {
		System.out.println("LIGANDO NO IPHONE");
		
	}

	public void atender() {
		System.out.println("ATENDENDO IPHONE");
		
	}
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");	
	}

	
	public void exibirPaginas() {
		System.out.println("EXIBINDO PAGINAS WEB NO IPHONE");
		
	}
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO ABA DE NAVEGADOR NO IPHONE");
	}

	@Override
	public void atualizarPaginas() {
		System.out.println("ATUALIZANDO PAGINAS WEB NO IPHONE");	
	}

}
