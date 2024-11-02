import java.util.ArrayList;

public class Agenda {
    public Prédio prédio;
    public ArrayList<Chamado> chamados = new ArrayList<Chamado>();

    public Agenda (Prédio prédio) {
        this.prédio = prédio;
    }
    
    public Chamado criarChamado (int origem, int destino) {
        if (origem <= 1 || origem > prédio.getnAndares()) {
            throw new IllegalArgumentException();
        }
        if (destino <= 1 || destino > prédio.getnAndares()) {
            throw new IllegalArgumentException();
        }
        Chamado chamado = new Chamado(origem, destino);
        return chamado;
    }
}
