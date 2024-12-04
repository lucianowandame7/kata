package src.Personagem;

import src.Personagem.Acoes.Curar;

public class Personagem {
    protected int saude;
    protected int nivelPersonagem;
    protected boolean estaVivo;
    protected int posicao;
    protected int alcance;


    public Personagem(int saude, int nivelPersonagem, boolean estaVivo, int posicao, int alcance) {
        this.saude = saude;
        this.nivelPersonagem = nivelPersonagem;
        this.estaVivo = estaVivo;
        this.posicao = posicao;
        this.alcance = alcance;
    }

    public void atacar(Personagem p, int dano) throws Exception {
        int diferencaNivel = p.getNivelPersonagem() - this.getNivelPersonagem();

        if (this == p) {
            throw new Exception("O personagem não pode atacar a si mesmo");
        }

        if (!p.getEstaVivo()) {
            throw new Exception("Ele esta morto e nao pode ser atacado");
        }

        if(dano <=0){
            throw new Exception("Voce nao pode atacar com o valor 0 ou valor negativo");
        }


        int maiorPosicao = Math.max(p.getPosicao(), this.posicao);
        int menorPosicao = Math.min(p.getPosicao(), this.posicao);

        int difDiferca = maiorPosicao - menorPosicao;

        if (difDiferca - this.alcance > 0){
            throw new Exception("Voce esta muito distancia para poder atacar o inimigo");
        }

        if (diferencaNivel >= 5) {
            dano = (int) (dano * 0.5);
        }
        else if (diferencaNivel  < -5) {
            dano = (int) (dano * 1.5);
        }

        p.setSaude(p.getSaude() - dano);
        System.out.println("O personagem atacou com " + dano + " de dano.");
        System.out.println("O inimigo atacado agora tem " + p.getSaude() + " de saude.");
    }

    public void curar(Personagem p, int cura) throws Exception{
        Curar.curar(this, p, cura);

    }



    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getNivelPersonagem() {
        return nivelPersonagem;
    }

    public void setNivelPersonagem(int nivelPersonagem) {
        this.nivelPersonagem = nivelPersonagem;
    }

    public boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "src.Personagem.Acoes.src.Personagem{" +
                "saude=" + saude +
                ", nivelPersonagem=" + nivelPersonagem +
                ", estaVivo=" + estaVivo +
                '}';
    }



}


