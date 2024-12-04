package src.Personagem.Acoes;

import src.Personagem.Personagem;

public class Curar {


    public static void curar(Personagem curador, Personagem curado, int cura) throws Exception {
        int saudeCurada = curado.getSaude() + cura;

        curarExceptions(curador, curado, cura);

        if (curado.getSaude() == 0) {
            curado.setEstaVivo(false);
            System.out.println("O personagem esta morto e nao pode ser curado");

        } else if (saudeCurada >= 1000) {
            curado.setSaude(1000);
            System.out.println("Voce se curou, e o maximo de saude do seu personagem é " + curado.getSaude());

        } else {
            curado.setSaude(saudeCurada);
            System.out.println("A saude do personagem curado ficou " + curado.getSaude());
        }
    }

    private static void curarExceptions(Personagem curador, Personagem curado, int cura) throws Exception{
        if (curador != curado) {
            throw new Exception("O personagem só pode curar a si mesmo");
        }
        if (cura <= 0) {
            throw new Exception("Voce nao pode curar com o valor 0 ou valor negativo");
        }
    }
}
