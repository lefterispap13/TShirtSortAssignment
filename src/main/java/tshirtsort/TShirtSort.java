/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import models.RandomTShirt;
import models.TShirt;
import sorting.*;

import java.util.ArrayList;
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
        for(int i = 0; i < 20; i++) {
            randomTShirts.add(new RandomTShirt());
        }
        System.out.println("----UnSorted------");
        for (RandomTShirt randomTShirt : randomTShirts) {
            System.out.println(randomTShirt);
        }
        
//        /*              RandomQS
//        For sorting with Sort need to set - true the variable isASC->if you want ASC order
//                                             or false -> if you want DESC order
//         Also you have to set the "sortAttribute" variable with 0: if you want to sort your list depending on Size
//                                                                1: depending on Color
//                                                            and 2: depending on Fabric
//         */
//        List<RandomTShirt> randomTShirts2 = new ArrayList<>(randomTShirts);
//        qsRand.sort(randomTShirts2, 0, randomTShirts2.size()-1, true, 2);
//        System.out.println("\n------SortedQS------");
//        for (RandomTShirt randomTShirt : randomTShirts2) {
//            System.out.println(randomTShirt);
//        }


        /* This is what we need to sort the list with the random numbers
           first by Size and then by Color
         */
        List<TShirt> randomTShirts1 = new ArrayList<>(randomTShirts);
        qs.bucketSortTShirtsBySizeThenColorThenFabric(randomTShirts1,false);


//        /*              RandomBS
//        For sorting with BubbleSort need to set - true the variable isASC->if you want ASC order
//                                             or false -> if you want DESC order
//         Also you have to set the "sortAttribute" variable with 0: if you want to sort your list depending on Size
//                                                                1: depending on Color
//                                                            and 2: depending on Fabric
//         */
//        List<RandomTShirt> randomTShirts3=new ArrayList<>(randomTShirts);
//        // sortAttribute: 0->Size 1->Color 2-> Fabric
//        bsRand.bubbleSort(randomTShirts3,false,1);
//        System.out.println("\n------SortedBS------");
//        for (RandomTShirt randomTShirt: randomTShirts3){
//            System.out.println(randomTShirt);
//        }


        /*              RandomBUS
        For sorting with BucketSort need to set - true the variable isASC->if you want ASC order
                                             or false -> if you want DESC order
         Also you have to set the "sortAttribute" variable with 0: if you want to sort your list depending on Size
                                                                1: depending on Color
                                                            and 2: depending on Fabric
         */
//        List<RandomTShirt> randomTShirts4=new ArrayList<>(randomTShirts);
//        busRand.bucketSortTShirts(randomTShirts4,true,2);

        
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
