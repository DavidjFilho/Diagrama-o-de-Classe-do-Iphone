package aparelho;

public class Main {

    public static void main(String[] args) {
        AparelhoMultiuso aparelho = new AparelhoMultiuso();

        System.out.println("---------------");
        System.out.println("Música a tocar!");
        aparelho.selecionarMusica("Exaltasamba");
        aparelho.tocar();
        aparelho.pausar();

        System.out.println("---------------");

        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(888844559);

        System.out.println("---------------");
        aparelho.exibirPagina();
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();

        System.out.println("---------------");
    }

}