package jokenpo;

public class Jokenpo {
    // 1 = TESOURA, 2 = PAPEL, 3 = PEDRA
    // retorna: 0 = empate, 1 = jogador1 vence, 2 = jogador2 vence
    public int jogar(int j1, int j2) {
        if (j1 == j2) return 0;
        boolean j1Vence =
            (j1 == 1 && j2 == 2) || // Tesoura > Papel
            (j1 == 2 && j2 == 3) || // Papel > Pedra
            (j1 == 3 && j2 == 1);   // Pedra > Tesoura
        return j1Vence ? 1 : 2;
    }
}
