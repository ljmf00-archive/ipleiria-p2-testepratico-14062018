package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Veiculo {
    protected long numeroPassageiros;
    protected long limitePassageiros;

    public Veiculo(long numeroPassageiros, long limitePassageiros)
    {
        this.numeroPassageiros = numeroPassageiros;
        this.limitePassageiros = limitePassageiros;
    }


    final public long getNumeroPassageiros() {
        return numeroPassageiros;
    }

    final public long getLimitePassageiros() {
        return limitePassageiros;
    }

    @Override
    public String toString() {
        return " ("+numeroPassageiros +"/"+limitePassageiros + " passageiros)";
    }
}
