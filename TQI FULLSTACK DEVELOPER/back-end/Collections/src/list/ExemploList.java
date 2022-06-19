package list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(9.5);
        notas.add(8.5);
        notas.add(6.3);
        notas.add(5.4);
        notas.add(7.8);
        notas.add(9.4);


        //ordenação por inserção
        System.out.println(notas);
        //ordem aleatoria
        Collections.shuffle(notas);
        System.out.println(notas);

        for (int i = 0; i < notas.size(); i++) {
            System.out.println("nota: " + i + " - " + notas.get(i));
        }
        System.out.println(notas);
        System.out.println("indice removido: " + notas.remove(2));
        System.out.println(notas);
        System.out.println("Maior nota: " + Collections.max(notas));
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println(notas);
        notas.add(2, 7.6);
        System.out.println("indice é: " + notas.indexOf(9.4));
        for (Double nota : notas) {
            System.out.print(" nota: " + nota);
        }
        System.out.println();
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma da notas são: " + soma);
        System.out.println("media das notas: " + (soma / notas.size()));
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println("notas maiores que 7: ");
        System.out.println(notas);

        //ordem natural
        System.out.println("Ordernação da notas: ");
        Collections.sort(notas);
        System.out.println(notas);
    }


}
