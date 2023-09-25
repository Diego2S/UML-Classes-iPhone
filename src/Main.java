import Dispositivos.IPhone;

public class Main {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 7",123456789123456L);

        //Implementações da interface AparelhoTelefone
        iPhone.iniciarCorreioVoz();
        iPhone.atender();
        iPhone.ligar();

        //Implementações da interface ReprodutorMusical
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();

        //Implementações da interface NavegadorInternet
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
