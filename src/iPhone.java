public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    @Override
    public void ligar(String numero) {
        System.out.println("Estou ligando para o telefone: " + numero);

    }

    @Override
    public void atender() {
        System.out.println("Estou atendendo uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }



    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);

    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();


        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine");

        // Testando AparelhoTelefonico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();


    }

}
