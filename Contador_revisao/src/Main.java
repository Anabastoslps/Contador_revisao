import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação do continente
        Continente americaDoSul = new Continente("América do Sul");

        // Adição de países ao continente
        americaDoSul.adicionarPaises(new Pais("Brasil", 213_993_437, 8_515_767)); // População em habitantes, dimensão em km²
        americaDoSul.adicionarPaises(new Pais("Argentina", 45_376_763, 2_780_400)); // População em habitantes, dimensão em km²
        americaDoSul.adicionarPaises(new Pais("Chile", 19_458_310, 756_102)); // População em habitantes, dimensão em km²

        // Dimensão total do continente
        int dimensaoTotal = americaDoSul.getDimensaoTotal();
        System.out.println("Dimensão total do continente: " + dimensaoTotal + " países");

        // População total do continente
        long populacaoTotal = americaDoSul.getPopulacaoTotal();
        System.out.println("População total do continente: " + populacaoTotal + " habitantes");

        // Densidade populacional do continente
        double densidadePopulacional = americaDoSul.getDensidadePopulacional();
        System.out.println("Densidade populacional do continente: " + densidadePopulacional + " habitantes por km²");

        // País com maior população no continente
        Pais paisComMaiorPopulacao = americaDoSul.getPaisComMaiorPopulacao();
        System.out.println("País com maior população no continente: " + paisComMaiorPopulacao.getNome());

        // País com menor população no continente
        Pais paisComMenorPopulacao = americaDoSul.getPaisComMenorPopulacao();
        System.out.println("País com menor população no continente: " + paisComMenorPopulacao.getNome());

        // País de maior dimensão territorial no continente
        Pais paisDeMaiorDimensao = americaDoSul.getPaisDeMaiorDimensao();
        System.out.println("País de maior dimensão territorial no continente: " + paisDeMaiorDimensao.getNome());

        // País de menor dimensão territorial no continente
        Pais paisDeMenorDimensao = americaDoSul.getPaisDeMenorDimensao();
        System.out.println("País de menor dimensão territorial no continente: " + paisDeMenorDimensao.getNome());

        // Razão territorial do maior país em relação ao menor país
        double razaoTerritorial = americaDoSul.getRazaoTerritorialMaiorMenor();
        System.out.println("Razão territorial do maior país em relação ao menor país: " + razaoTerritorial);
    }
}