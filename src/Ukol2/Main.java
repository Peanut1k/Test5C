package Ukol2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hrac> hraci = new ArrayList<>();
        hraci.add(new Hrac("Pepa", "utocnik", 2));
        hraci.add(new Hrac("Marek", "brankar", 0));
        hraci.add(new Hrac("Honza", "utocnik", 3));
        hraci.add(new Hrac("Chleba", "zaloha", 1));
        hraci.add(new Hrac("Mrkev", "obrana", 1));
        hraci.add(new Hrac("Lopata", "obrana", 0));
        hraci.add(new Hrac("Mikrovlnka", "utocnik", 3));

        int SumGoalu = 0;
        Hrac maxGolu = null;

        System.out.println("Utocnici: ");
        for (Hrac hrac : hraci) {
            if (hrac.getPozice().equals("utocnik"))
                System.out.println(hrac);
            SumGoalu += hrac.getGoly();
        }
        System.out.println("**************************************");
//        maxGolu = hraci.stream().max(Comparator.comparing(Hrac::getGoly)).get();
//        System.out.println(maxGolu);

        hraci.removeIf(hrac -> hrac.getGoly() == 0);

        List<Hrac> hraciCopy = new ArrayList<>(hraci);
        List<Hrac> highestGoals = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Hrac newMax = hraciCopy.stream().max(Comparator.comparing(Hrac::getGoly)).get();
            highestGoals.add(newMax);
            hraciCopy.remove(newMax);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + ". nejvyssi pocet v golech: " + highestGoals.get(i));
        }

        System.out.println("***********************************");
        System.out.println("Konecny seznam: ");
        hraci.forEach(System.out::println);
    }
}
