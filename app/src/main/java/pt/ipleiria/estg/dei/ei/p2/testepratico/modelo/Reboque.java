package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Reboque<T extends Veiculo> extends VeiculoTerrestre {
    private T veiculo;

    public Reboque(long numeroPassageiros, String matricula) {
        super(numeroPassageiros, 2, matricula);
    }

    public Reboque(long numeroPassageiros, String matricula, T veiculo) {
        super(numeroPassageiros, 2, matricula);

        associar(veiculo);
    }

    public void associar(T veiculo)
    {
        this.veiculo = veiculo;
    }

    final public void desassociar()
    {
        this.veiculo = null;
    }

    final public T getVeiculo() {
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
