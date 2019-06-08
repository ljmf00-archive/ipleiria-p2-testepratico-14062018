package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class ReboqueAquaticos extends Reboque {
    protected ReboqueAquaticos(long numeroPassageiros, String matricula) {
        super(numeroPassageiros, matricula);
    }

    protected ReboqueAquaticos(long numeroPassageiros, String matricula, VeiculoAquatico veiculoAquatico) {
        super(numeroPassageiros, matricula, veiculoAquatico);
    }

    public void associar(VeiculoAquatico veiculoAquatico)
    {
        super.associar(veiculoAquatico);
    }
}
