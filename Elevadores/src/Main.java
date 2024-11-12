public class Main {
    public static void main(String[] args) {
        Prédio EdifícioComercial = new Prédio(100, 10);
        Agenda agenda = new Agenda(EdifícioComercial);

        EdifícioComercial.andarDosElevadores();
        agenda.adicionarChamado(1, 10);
        //agenda.adicionarChamado(-1, 10);
        agenda.adicionarChamado(1, 98);
        agenda.adicionarChamado(1, 100);
        agenda.adicionarChamado(10, 10);
        //agenda.adicionarChamado(1, 1000);
        agenda.adicionarChamado(3, 55);
        agenda.adicionarChamado(23, 55);
        agenda.adicionarChamado(10, 1);
        agenda.realizarChamados();
        EdifícioComercial.andarDosElevadores();
    }
}