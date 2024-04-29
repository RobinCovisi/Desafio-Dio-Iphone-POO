
import java.util.List;

class iPhone {
    private ReprodutorMusical reprodutorMusical;
    @SuppressWarnings("rawtypes")
    private AparelhoTelefone aparelhoTelefone;
    private NavegadorWeb navegadorWeb;

    @SuppressWarnings("rawtypes")
    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefone = new AparelhoTelefone();
        navegadorWeb = new NavegadorWeb();
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(Musica musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    public void fazerChamada(Contato contato) {
        aparelhoTelefone.fazerChamada(contato);
    }

    public void atenderChamada() {
        aparelhoTelefone.atenderChamada();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefone.iniciarCorreioVoz();
    }

    public void exibirPaginaWeb(String url) {
        navegadorWeb.exibirPagina(url);
    }

    public void adicionarNovaAba(String url) {
        navegadorWeb.adicionarNovaAba(url);
    }

    public void atualizarPagina() {
        navegadorWeb.atualizarPagina();
    }
}

// Classe ReprodutorMusical
class ReprodutorMusical {
    @SuppressWarnings("unused")
    private List<Musica> playlist;
    @SuppressWarnings("unused")
    private Musica musicaAtual;

    public void tocar() {
    
    }

    public void pausar() {
   
    }

    public void selecionarMusica(Musica musica) {
        musicaAtual = musica;
    
    }
}

// Classe AparelhoTelefone
class AparelhoTelefone<Chamada> {
    @SuppressWarnings("unused")
    private List<Contato> contatos;
    @SuppressWarnings("unused")
    private Chamada chamadaAtual;

    public void fazerChamada(Contato contato) {
      
    }

    public void atenderChamada() {
     
    }

    public void iniciarCorreioVoz() {
     
    }
}

// Classe NavegadorWeb
class NavegadorWeb {
    @SuppressWarnings("unused")
    private String paginaAtual;
    private List<Aba> abas;

    public void exibirPagina(String url) {
        paginaAtual = url;
       
    }

    public void adicionarNovaAba(String url) {
        Aba novaAba = new Aba(url);
        abas.add(novaAba);
      
    }

    public void atualizarPagina() {
        
    }
}

// Classe Musica
class Musica {
    @SuppressWarnings("unused")
    private String titulo;
    @SuppressWarnings("unused")
    private String artista;
    @SuppressWarnings("unused")
    private int duracao;

}

// Classe Contato
class Contato {
    @SuppressWarnings("unused")
    private String nome;
    @SuppressWarnings("unused")
    private String numeroTelefone;


}

// Classe Aba
class Aba {
    @SuppressWarnings("unused")
    private String url;

    public Aba(String url) {
        this.url = url;
    }

}