//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Prédio EdifícioComercial = new Prédio(100, 10);
        for (int i = 0; i < EdifícioComercial.getnElevadores(); i++) {
            EdifícioComercial.Elevadores.add(new Elevador(1, (i+1)));
        }
        EdifícioComercial.andarDosElevadores();

    }
}