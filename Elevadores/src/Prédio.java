import java.util.ArrayList;
import java.util.Scanner;

public class Prédio {

    private int nAndares;
    private int nElevadores;
    public ArrayList<Elevador> Elevadores = new ArrayList<Elevador>();

    public Prédio (int nAndares,int nElevadores ) {
        setnAndares(nAndares);
        setnElevadores(nElevadores);
    }

    public void setnAndares(int nAndares) {
        if (nAndares <= 1 || nAndares > 100) {
            throw new IllegalArgumentException();
        }
        this.nAndares = nAndares;
    }

    public void setnElevadores(int nElevadores) {
        if (nElevadores <= 1 || nElevadores > 10) {
            throw new IllegalArgumentException();
        }
        this.nElevadores = nElevadores;
    }

    public int getnAndares() {
        return nAndares;
    }

    public int getnElevadores() {
        return nElevadores;
    }

    public void andarDosElevadores() {
        for(int i = 0; i < Elevadores.size(); i++) {
            int id = Elevadores.get(i).id;
            int andar = Elevadores.get(i).andarAtual;
            System.out.println("Elevador "+id+" se encontra no andar "+andar);
        }
    }
}
