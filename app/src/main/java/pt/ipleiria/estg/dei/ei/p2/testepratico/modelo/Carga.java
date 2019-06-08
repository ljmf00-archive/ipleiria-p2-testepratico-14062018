package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public final class Carga {
    private long peso;

    public Carga()
    {
        this.peso = 0;
    }

    public Carga(long peso)
    {
        this.peso = peso;
    }


    public long getPeso() {
        return peso;
    }

    public void adicionar(long quantidade) {
        peso = Math.max(0, peso + quantidade);
    }

    public void remover(long quantidade) {
        peso = Math.max(0, peso - quantidade);
    }
}
