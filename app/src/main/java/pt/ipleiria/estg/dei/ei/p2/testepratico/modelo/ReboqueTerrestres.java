package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class ReboqueTerrestres extends Reboque {
    protected ReboqueTerrestres(long numeroPassageiros, String matricula) {
        super(numeroPassageiros, matricula);
    }

    protected ReboqueTerrestres(long numeroPassageiros, String matricula, VeiculoTerrestre veiculoTerrestre) {
        super(numeroPassageiros, matricula, veiculoTerrestre);
    }

    public void associar(VeiculoTerrestre veiculoTerrestre)
    {
        super.associar(veiculoTerrestre);
    }
}
