package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public abstract class Reboque extends VeiculoTerrestre {
    private Veiculo veiculo;

    protected Reboque(long numeroPassageiros, String matricula) {
        super(numeroPassageiros, 2, matricula);
    }

    protected Reboque(long numeroPassageiros, String matricula, Veiculo veiculo) {
        super(numeroPassageiros, 2, matricula);

        associar(veiculo);
    }

    protected void associar(Veiculo veiculo)
    {
        this.veiculo = veiculo;
    }

    final public void desassociar()
    {
        this.veiculo = null;
    }

    final public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        String ret;

        if(veiculo == null)
            ret = "Sem veiculo rebocado";
        else
            ret = "A rebocar: " + veiculo.toString();

        return "Reboque " + super.toString() + "\n" + ret;
    }
}
