public class Pais {
    private String nome;
    private long populacao;
    private long dimensaoTerritorial;

    // Construtor
    public Pais(String nome, long populacao, long dimensaoTerritorial) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensaoTerritorial = dimensaoTerritorial;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public long getDimensaoTerritorial() {
        return dimensaoTerritorial;
    }
}
