package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class VeiculoTerrestre extends Veiculo {
    protected String matricula;

    public VeiculoTerrestre(long numeroPassageiros, long limitePassageiros, String matricula)
    {
        super(numeroPassageiros, limitePassageiros);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return matricula + super.toString();
    }
}
