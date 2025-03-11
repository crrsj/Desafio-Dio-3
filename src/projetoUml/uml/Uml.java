package projetoUml.uml;

public class Uml {

	
	interface ReprodutorMusical {
	    void tocar();
	    void pausar();
	    void selecionarMusica(String musica);
	}

	interface AparelhoTelefonico {
	    void ligar(String numero);
	    void atender();
	    void iniciarCorreioVoz();
	}

	interface NavegadorInternet {
	    void exibirPagina(String url);
	    void adicionarNovaAba();
	    void atualizarPagina();
	}

	class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	    @Override
	    public void tocar() {
	        System.out.println("Reproduzindo música...");
	    }

	    @Override
	    public void pausar() {
	        System.out.println("Música pausada.");
	    }

	    @Override
	    public void selecionarMusica(String musica) {
	        System.out.println("Música selecionada: " + musica);
	    }

	    @Override
	    public void ligar(String numero) {
	        System.out.println("Ligando para " + numero + "...");
	    }

	    @Override
	    public void atender() {
	        System.out.println("Atendendo a chamada...");
	    }

	    @Override
	    public void iniciarCorreioVoz() {
	        System.out.println("Iniciando correio de voz...");
	    }

	    @Override
	    public void exibirPagina(String url) {
	        System.out.println("Exibindo página: " + url);
	    }

	    @Override
	    public void adicionarNovaAba() {
	        System.out.println("Nova aba aberta no navegador.");
	    }

	    @Override
	    public void atualizarPagina() {
	        System.out.println("Página atualizada.");
	    }
	}
}
