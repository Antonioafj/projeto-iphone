package sistema.telefonia;

public class AparelhoTelefonico implements Telefone {
	public void ligar() {
		System.out.println("LIGANDO");		
	}
	public void atender() {
		System.out.println("ATENDENDO");		
	}
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");		
	}
}
