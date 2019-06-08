package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Barco extends VeiculoAquatico implements VeiculoCarregavel {
    private Carga carga;

    public Barco(long numeroPassageiros, long limitePassageiros, long anoConstrucao)
    {
        super(numeroPassageiros, limitePassageiros, anoConstrucao);
        carga = new Carga();
    }

    public Barco(long numeroPassageiros, long limitePassageiros, long anoConstrucao, long peso)
    {
        super(numeroPassageiros, limitePassageiros, anoConstrucao);
        carga = new Carga(peso);
    }

    public long getPeso() {
        return carga.getPeso();
    }

    @Override
    public void adicionarCarga(long quantidade) {
        carga.adicionar(quantidade);
    }

    @Override
    public void removerCarga(long quantidade) {
        carga.remover(quantidade);
    }

    @Override
    public String toString() {
        return "Barco " + super.toString();
    }
}