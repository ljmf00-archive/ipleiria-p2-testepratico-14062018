package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

import java.util.LinkedList;

public enum GestorVeiculos {
    INSTANCIA;

    private LinkedList<Reboque> reboques;
    private LinkedList<Automovel> automoveis;
    private LinkedList<Barco> barcos;

    GestorVeiculos() {
        reboques = new LinkedList<>();
        automoveis = new LinkedList<>();
        barcos = new LinkedList<>();

        Automovel artur = new Automovel(3,4, "AA-11-55");

        reboques.add(new Reboque<VeiculoAquatico>(1, "AT-43-11"));
        reboques.add(new Reboque<VeiculoTerrestre>(2, "AS-41-34"));
        reboques.add(new Reboque<VeiculoTerrestre>(1, "ZX-91-00", artur));

        automoveis.add(new Automovel(1,5, "FF-11-44"));
        automoveis.add(new Automovel(5,5, "FF-11-55"));
        automoveis.add(artur);

        barcos.add(new Barco(3,10, 2000));
        barcos.add(new Barco(15,50, 2004));
    }

    public LinkedList<Reboque> getReboques() {
        return new LinkedList<>(reboques);
    }

    public LinkedList<Automovel> getAutomoveis() {
        return new LinkedList<>(automoveis);
    }

    public LinkedList<Barco> getBarcos() {
        return new LinkedList<>(barcos);
    }
}
