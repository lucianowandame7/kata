package src.Personagem;

public class Lutadores extends Personagem {
    private final int alcance = 2;

    public Lutadores(int saude, int nivelPersonagem, boolean estaVivo,int posicao) {
        super(saude, nivelPersonagem, estaVivo ,posicao, 2);

    }

    public int getAlcance() {
        return alcance;
    }
}
