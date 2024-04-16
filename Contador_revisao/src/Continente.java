
public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public int getDimensaoTotal() {
        return paises.size();
    }

    public long getPopulacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double getDensidadePopulacional() {
        long populacaoTotal = getPopulacaoTotal();
        int dimensaoTotal = getDimensaoTotal();

        if (dimensaoTotal == 0) {
            return 0; // Evita divisão por zero
        }

        return (double) populacaoTotal / dimensaoTotal;
    }

    public Pais getPaisComMaiorPopulacao() {
        if (paises.isEmpty()) {
            return null;
        }

        return Collections.max(paises, Comparator.comparing(Pais::getPopulacao));
    }

    public Pais getPaisComMenorPopulacao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais paisComMenorPopulacao = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getPopulacao() < paisComMenorPopulacao.getPopulacao()) {
                paisComMenorPopulacao = pais;
            }
        }

        return paisComMenorPopulacao;
    }

    public Pais getPaisDeMaiorDimensao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais paisDeMaiorDimensao = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getDimensaoTerritorial() > paisDeMaiorDimensao.getDimensaoTerritorial()) {
                paisDeMaiorDimensao = pais;
            }
        }

        return paisDeMaiorDimensao;
    }

    public Pais getPaisDeMenorDimensao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais paisDeMenorDimensao = paises.get(0);

        for (Pais pais : paises) {
            if (pais.getDimensaoTerritorial() < paisDeMenorDimensao.getDimensaoTerritorial()) {
                paisDeMenorDimensao = pais;
            }
        }

        return paisDeMenorDimensao;
    }

    public double getRazaoTerritorialMaiorMenor() {
        Pais paisMaiorDimensao = getPaisDeMaiorDimensao();
        Pais paisMenorDimensao = getPaisDeMenorDimensao();

        if (paisMaiorDimensao == null || paisMenorDimensao == null || paisMenorDimensao.getDimensaoTerritorial() == 0) {
            return 0;
        }

        return (double) paisMaiorDimensao.getDimensaoTerritorial() / paisMenorDimensao.getDimensaoTerritorial();
    }
}

