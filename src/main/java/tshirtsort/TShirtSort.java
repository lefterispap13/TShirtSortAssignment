/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import models.RandomTShirt;
import models.TShirt;
import sorting.*;
import timer.Timer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TShirtSort {

    public static void main(String[] args) {

        Sort qs = new Sort();
        BubbleSort bs = new BubbleSort();
        BucketSort bus = new BucketSort();
        QuickSortRandomTShirt qsRand = new QuickSortRandomTShirt();
        BubbleSortRandomTShirt bsRand= new BubbleSortRandomTShirt();
        BucketSortRandomTShirt busRand=new BucketSortRandomTShirt();
        
//        int[] qsArray = myArray.clone(); //Arrays.copyOf(myArray, myArray.length);
//        doIntQuickSort(qs, qsArray, 0, qsArray.length - 1);
//        
//        int[] bsArray = myArray.clone(); Arrays.copyOf(myArray, myArray.length);
//        doIntBubbleSort(bs, bsArray);
//        
//        int[] busArray = myArray.clone();
//        doIntBucketSort(bus, busArray);
        
        //RandomTShirt rTShirt1 = new RandomTShirt();
        List<RandomTShirt> randomTShirts = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            randomTShirts.add(new RandomTShirt());
        }
        System.out.println("----UnSorted------");
        for (RandomTShirt randomTShirt : randomTShirts) {
            System.out.println(randomTShirt);
        }


        //testing comparator
        //size comparator
        Comparator<RandomTShirt> compareBySize = Comparator.comparing( RandomTShirt::getSize );

        //color comparator
        Comparator<RandomTShirt> compareByColor = Comparator.comparing( RandomTShirt::getColor );

        //fabric comparator
        Comparator<RandomTShirt> compareByFabric = Comparator.comparing( RandomTShirt::getFabric );

        //Compare by size , then color ,then fabric (multiple fields)
        Comparator<RandomTShirt> compareByAll = compareBySize.thenComparing(compareByColor).thenComparing(compareByFabric);

        //Use Comparator
        Collections.sort(randomTShirts, compareByAll);
        System.out.println("\nSort Size, Color, fabric\n");
        for (int i=0; i<randomTShirts.size(); i++) {
            System.out.println(randomTShirts.get(i));
        }
//        /*              RandomQS
//        For sorting with Sort need to set - true the variable isASC->if you want ASC order
//                                             or false -> if you want DESC order
//         Also you have to set the "sortAttribute" variable with 0: if you want to sort your list depending on Size
//                                                                1: depending on Color
//                                                            and 2: depending on Fabric
//         */
//        Timer quickTimer = new Timer();  //timer
//        List<RandomTShirt> randomTShirts2 = new ArrayList<>(randomTShirts);
//        qsRand.sort(randomTShirts2, 0, randomTShirts2.size()-1, true, 2);
//        quickTimer.stop();
//        System.out.println("\n------SortedQS------");
//        for (RandomTShirt randomTShirt : randomTShirts2) {
//            System.out.println(randomTShirt);
//        }
//        System.out.println("===Quick Sort Time: " + quickTimer.elapsedTime()+" ===");




        /* This is what we need to sort the list with the random numbers
           first by Size and then by Color
         */
//        Timer mixTimer = new Timer();  //timer
//        List<TShirt> randomTShirts1 = new ArrayList<>(randomTShirts);
//        qs.bucketSortTShirtsBySizeThenColorThenFabric(randomTShirts1,true);
//        mixTimer.stop();
//        System.out.println("===Mix Sort Time: " + mixTimer.elapsedTime()+" ===");


//        /*              RandomBS
//        For sorting with BubbleSort need to set - true the variable isASC->if you want ASC order
//                                             or false -> if you want DESC order
//         Also you have to set the "sortAttribute" variable with 0: if you want to sort your list depending on Size
//                                                                1: depending on Color
//                                                            and 2: depending on Fabric
//         */
//        Timer bubbleTimer = new Timer();  //timer
//        List<RandomTShirt> randomTShirts3=new ArrayList<>(randomTShirts);
//        // sortAttribute: 0->Size 1->Color 2-> Fabric
//        bsRand.bubbleSort(randomTShirts3,false,1);
//        bubbleTimer.stop();
//        System.out.println("\n------SortedBS------");
//        for (RandomTShirt randomTShirt: randomTShirts3){
//            System.out.println(randomTShirt);
//        }
//        System.out.println("===Bubble Sort Time: " + bubbleTimer.elapsedTime()+" ===");



        /*              RandomBUS
        For sorting with BucketSort need to set - true the variable isASC->if you want ASC order
                                             or false -> if you want DESC order
         Also you have to set the "sortAttribute" variable with 0: if you want to sort your list depending on Size
                                                                1: depending on Color
                                                            and 2: depending on Fabric
         */
//        Timer bucketTimer = new Timer();  //timer
//        List<RandomTShirt> randomTShirts4=new ArrayList<>(randomTShirts);
//        busRand.bucketSortTShirts(randomTShirts4,true,2);
//        bucketTimer.stop();
//        System.out.println("===Bucket Sort Time: " + bucketTimer.elapsedTime()+" ===");
    }
    
//    static void doIntQuickSort(Sort qs, int[] myArray, int low, int high) {
//        System.out.println("-----------QS------------");
//         System.out.println(Arrays.toString(myArray));
//        qs.sort(myArray, 0, myArray.length - 1);
//        System.out.println("-------------------------");
//         System.out.println(Arrays.toString(myArray));
//    }
//
//    static void doIntBubbleSort(BubbleSort bs, int[] myArray) {
//        System.out.println("-----------BS------------");
//         System.out.println(Arrays.toString(myArray));
//        bs.bubbleSort(myArray);
//        System.out.println("-------------------------");
//         System.out.println(Arrays.toString(myArray));
//    }
//
//    static void doIntBucketSort(BucketSort bus, int[] myArray) {
//        System.out.println("-----------BUS-----------");
//        System.out.println(Arrays.toString(myArray));
//        int[] busArray = bus.sort(myArray, bus.max_value(myArray));
//        System.out.println("-------------------------");
//        System.out.println(Arrays.toString(busArray));
//    }
//
//    private static void printArray(int[] myArray) {
//        for (int i : myArray) {
//            System.out.println(i);
//        }
//    }

}
