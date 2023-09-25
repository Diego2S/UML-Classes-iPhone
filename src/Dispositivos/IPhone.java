package Dispositivos;

import Funcionalidades.AparelhoTelefone;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class IPhone implements AparelhoTelefone, ReprodutorMusical, NavegadorInternet {

    private String nome;
    private long imei;

    public IPhone(String nome, long imei) {
        this.nome = nome;
        this.imei = imei;
    }

    public String getNome() {
        return nome;
    }

    public long getImei() {
        return imei;
    }

    @Override
    public void ligar() {
        System.out.println(String.format("Estou realizando uma ligação com %s.",getNome()));
    }

    @Override
    public void atender() {
        System.out.println(String.format("Estou atendendo uma ligação com %s.",getNome()));
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println(String.format("Ouvindo um Correio de Voz com %s",getNome()));
    }

    @Override
    public void tocar() {
        System.out.println(String.format("Tocando musica no %s",getNome()));
    }

    @Override
    public void pausar() {
        System.out.println(String.format("Musica pausada no %s",getNome()));
    }

    @Override
    public void selecionarMusica() {
        System.out.println(String.format("Selecionando musica no %s",getNome()));
    }

    @Override
    public void exibirPagina() {
        System.out.println(String.format("Exibindo Pagina Web no %s",getNome()));
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println(String.format("Adicionando nova aba Web no %s",getNome()));
    }

    @Override
    public void atualizarPagina() {
        System.out.println(String.format("Atualizando Pagina Web no %s",getNome()));
    }
}
