package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public abstract class VeiculoAquatico extends Veiculo {
    protected long anoConstrucao;

    public VeiculoAquatico(long numeroPassageiros, long limitePassageiros, long anoConstrucao)
    {
        super(numeroPassageiros, limitePassageiros);
        this.anoConstrucao = anoConstrucao;
    }

    @Override
    public String toString() {
        return anoConstrucao + super.toString();
    }

    final public long getAnoConstrucao() {
        return anoConstrucao;
    }
}
