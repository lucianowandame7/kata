package src.Personagem;

public class Atirador extends Personagem {
    private final int alcance = 20;

    public Atirador(int saude, int nivelPersonagem, boolean estaVivo,int posicao) {
        super(saude, nivelPersonagem, estaVivo ,posicao, 20);

    }

    public int getAlcance() {
        return alcance;
    }
}
