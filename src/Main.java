package src;/*
FALTA FAZER A ITERAÇÃO 2 TOPICO 3


 */


import src.Personagem.Atirador;
import src.Personagem.Lutadores;
import src.Personagem.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Atirador(950, 5, true, 30);
        Personagem p2 = new Lutadores(500, 10, true, 15);

        try {
           // p2.atacar(p1, 90);
            p1.curar(p2, 30);





        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}