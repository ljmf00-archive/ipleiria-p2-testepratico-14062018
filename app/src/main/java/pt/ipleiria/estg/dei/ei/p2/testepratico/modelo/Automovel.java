package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Automovel extends VeiculoTerrestre implements VeiculoCarregavel {
    private Carga carga;

    public Automovel(long numeroPassageiros, long limitePassageiros, String matricula) {
        super(numeroPassageiros, limitePassageiros, matricula);
        carga = new Carga();
    }

    public Automovel(long numeroPassageiros, long limitePassageiros, String matricula, long peso) {
        super(numeroPassageiros, limitePassageiros, matricula);

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
        return "Automovel " + super.toString();
    }
}
