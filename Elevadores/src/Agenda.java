import java.util.ArrayList;
public class Agenda {
    public Prédio prédio;
    public ArrayList<Chamado> chamados = new ArrayList<Chamado>();

    public Agenda (Prédio prédio) {
        this.prédio = prédio;
    }
    
    public void adicionarChamado (int origem, int destino) { //Chamado
        if (origem < 1 || origem > prédio.getnAndares()) {
            throw new IllegalArgumentException();
        }
        if (destino < 1 || destino > prédio.getnAndares()) {
            throw new IllegalArgumentException();
        }
        Chamado chamado = new Chamado(origem, destino);
        //return chamado;
        if (destino != origem) {
            chamados.add(chamado);
        }
    }

    public void realizarChamados () {
        while(chamados.size() != 0) {
            Chamado chamado = chamados.get(0);
            int origem = chamado.origem;
            int i = 0;
            int andar = i;
            int menorDif = prédio.getnElevadores();
            while(i < prédio.getnElevadores()) {
                int andarAtual = prédio.Elevadores.get(i).andarAtual;
                if (origem == andarAtual) {
                    andar = i;
                    i = prédio.getnElevadores();
                } else {
                    int dif = origem - andarAtual;
                    if(dif < 0) { dif = dif*-1; };
                    if(dif < menorDif) {
                        menorDif = dif;
                        andar = i;
                    };
                }
                i++;
            }
            Elevador elevador = prédio.Elevadores.get(andar);
            System.out.println("O elevador "+elevador.id+" veio do "+elevador.andarAtual+" e levou passageiros do "+chamado.origem+"° andar para o "+ chamado.destino+"° andar.");
            elevador.andarAtual = chamado.destino;
            Chamado chamadoRemovido = chamados.remove(0);
        }
    }
}
