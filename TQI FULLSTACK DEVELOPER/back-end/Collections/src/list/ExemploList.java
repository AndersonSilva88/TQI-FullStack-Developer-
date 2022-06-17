package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(9.5);
        notas.add(8.5);

        for (int i = 0; i< notas.size(); i++) {
            System.out.println("nota: "+ i + " - "+ notas.get(i));
        }
        System.out.println(notas);
        System.out.println(Collections.max(notas));
        System.out.println(Collections.min(notas));


    }
}
