package CursoIta.Veiculos;

public class Principal {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Corsa";
        c1.potencia = 10;
        c1.velocidade = 0;

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        c1.imprimir();

    }
}
