package comparator;

import models.RandomTShirt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

    public void sortRandomTShirtsByColorSizeFabric(boolean isASC){
        List<RandomTShirt> randomTShirts = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            randomTShirts.add(new RandomTShirt());
        }
        System.out.println("----UnSorted------");
        for (RandomTShirt randomTShirt : randomTShirts) {
            System.out.println(randomTShirt);
        }
        if (isASC) {

            //testing comparator
            //size comparator
            Comparator<RandomTShirt> compareBySize = Comparator.comparing(RandomTShirt::getSize);

            //color comparator
            Comparator<RandomTShirt> compareByColor = Comparator.comparing(RandomTShirt::getColor);

            //fabric comparator
            Comparator<RandomTShirt> compareByFabric = Comparator.comparing(RandomTShirt::getFabric);

            //Compare by size , then color ,then fabric (multiple fields)
            Comparator<RandomTShirt> compareByAll = compareBySize.thenComparing(compareByColor).thenComparing(compareByFabric);

            //Use Comparator
            Collections.sort(randomTShirts, compareByAll);
            System.out.println("\nSorting Random TShirts first By Size,then Color and then fabric in Ascending Order\n");
            for (int i = 0; i < randomTShirts.size(); i++) {
                System.out.println(randomTShirts.get(i));
            }
        }else {
            //testing comparator
            //size comparator
            Comparator<RandomTShirt> compareBySize = Comparator.comparing( RandomTShirt::getSize ).reversed();

            //color comparator
            Comparator<RandomTShirt> compareByColor = Comparator.comparing( RandomTShirt::getColor ).reversed();

            //fabric comparator
            Comparator<RandomTShirt> compareByFabric = Comparator.comparing( RandomTShirt::getFabric ).reversed();

            //Compare by size , then color ,then fabric (multiple fields)
            Comparator<RandomTShirt> compareByAll = compareBySize.thenComparing(compareByColor).thenComparing(compareByFabric);

            //Use Comparator
            Collections.sort(randomTShirts, compareByAll);
            System.out.println("\nSorting Random TShirts first By Size,then Color and then fabric in Descending order\n");
            for (int i=0; i<randomTShirts.size(); i++) {
                System.out.println(randomTShirts.get(i));
            }
        }
    }
}
