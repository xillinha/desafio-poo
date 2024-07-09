public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando no Reprodutor Musical");
    }

    public void pausar() {
        System.out.println("Pausando no Reprodutor Musical");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada no Reprodutor Musical");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " no Aparelho Telefonico");
    }

    public void atender() {
        System.out.println("Atendendo no Aparelho Telefonico");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Aparelho Telefonico");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a url " + url + " no Navegador Internet");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Navegador Internet");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no Navegador Internet");
    }
}
