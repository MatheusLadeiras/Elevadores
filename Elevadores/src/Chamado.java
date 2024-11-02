public class Chamado {
    public int origem;
    public int destino;

    public Chamado (int origem, int destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public void setDestino(int destino) {
        if (destino <= 1 || destino > 100) {
            throw new IllegalArgumentException();
        }
    }

    public void setOrigem(int origem) {
        if (origem <= 1 || origem > 100) {
            throw new IllegalArgumentException();
        }
    }
}
