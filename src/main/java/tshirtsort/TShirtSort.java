/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import comparator.ComparatorSort;
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
        ComparatorSort cs=new ComparatorSort();
        

        
        List<RandomTShirt> randomTShirts = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            randomTShirts.add(new RandomTShirt());
        }
        System.out.println("----UnSorted------");
        for (RandomTShirt randomTShirt : randomTShirts) {
            System.out.println(randomTShirt);
        }



//        /*              RandomQS
//        For sorting with QuickSort need to set - true the variable isASC->if you want ASC order
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


        /* This is what we need to sort the list with the random numbers
           first by Size and then by Color with mix types of sorting(quick sort,bucket sort)
         */
//        Timer mixTimer = new Timer();  //timer
//        List<TShirt> randomTShirts1 = new ArrayList<>(randomTShirts);
//        qs.bucketSortTShirtsBySizeThenColorThenFabric(randomTShirts1,true);
//        mixTimer.stop();
//        System.out.println("===Mix Sort Time: " + mixTimer.elapsedTime()+" ===");


        /* This is the method that sorting the Random TShirts first by Size then
            by Color and then By Fabric in Ascending order
            And you need to comment out the creation of RandomTShirts at the beginning of the main
            in order to avoid the printing of random tshirts twice because the method bellow has
            its own creation of randomTShirts.
         */
//        Timer comparatorTimer = new Timer();  //timer
//        cs.sortRandomTShirtsByColorSizeFabric(false);  //if you want Ascending order input true or false for descending
//        comparatorTimer.stop();
//        System.out.println("===Comparator Sort Time: " + comparatorTimer.elapsedTime()+" ===");

    }

}
