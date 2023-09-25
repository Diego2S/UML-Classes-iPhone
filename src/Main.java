import Dispositivos.IPhone;

public class Main {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 7",123456789123456L);

        iPhone.iniciarCorreioVoz();
        iPhone.atender();
        iPhone.ligar();
    }
}
