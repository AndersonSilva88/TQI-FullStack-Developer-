package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>();
        notas.add(9.8);
        notas.add(8.6);
        notas.add(7.2);
        notas.add(6.3);
        notas.add(8.9);
        notas.add(9.2);
        notas.add(5.4);
        System.out.println("sem ordem de inserção: " + notas.toString());

        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("Maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das notas: " + soma);

        System.out.println("Média das notas: " + (soma / notas.size()));

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println("Notas maiores que 7: " + notas);

        //ordenação de inserção
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(9.8);
        notas2.add(8.6);
        notas2.add(7.2);
        notas2.add(6.3);
        notas2.add(8.9);
        notas2.add(9.2);
        notas2.add(5.4);
        System.out.println("ordem de inserção: " + notas2);

        //ordenção crescente com treeSet
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Odenação crescente: " + notas3);

        System.out.println("----- Series -----");
        Set<Serie> minhaSerie = new HashSet<>() {{
            add(new Serie("Vikings", "Ação", 52));
            add(new Serie("Sons of Anarch", "Ação", 50));
            add(new Serie("The las Kingdom", "Ação", 32));
        }};
        for (Serie serie : minhaSerie) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("------ Ordem de inserção ----");
        Set<Serie> minhaSerie1 = new LinkedHashSet<>() {{
            add(new Serie("Vikings", "Ação", 52));
            add(new Serie("Sons of Anarch", "Ação", 50));
            add(new Serie("The las Kingdom", "Ação", 32));
        }};
        for (Serie serie : minhaSerie1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("---- ordem natural tempo episodio-----");
        Set<Serie> minhaSeries2 = new TreeSet<>(minhaSerie);
        for (Serie serie : minhaSeries2) {
            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
        }

    }
}

class Serie implements Comparable<Serie> {

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.getTempoEpisodio(), serie.tempoEpisodio);
    }
}