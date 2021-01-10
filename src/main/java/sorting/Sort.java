/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;


import models.Size;
import models.TShirt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Sort {//implements Comparator<TShirt> {

//    @Override
//    public int compare(TShirt tShirt1, TShirt tShirt2) {
//        return new CompareToBuilder()
//                .append(tShirt1.getSize(), tShirt2.getSize())
//                .append(tShirt1.getColor(), tShirt2.getColor())
//                .append(tShirt1.getFabric(), tShirt2.getFabric()).toComparison();
//    }

    int partition(List<TShirt> arr, int low, int high, int sortByAttribute, int sortingType) {
        TShirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (sortingType == 0) { // ASC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot
                        if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            } else { // DESC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot
                        if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j]
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            }

        }

        // swap arr[i+1] and arr[high] (or pivot)
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    public void quickSortTShirts(List<TShirt> arr, int low, int high, int sortByAttribute, int sortingType) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = 0;
            switch (sortingType) {
                // ASC
                case 0:
                    pi = partition(arr, low, high, sortByAttribute, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before
                    // partition and after partition
                    quickSortTShirts(arr, low, pi - 1, sortByAttribute, 0);
                    quickSortTShirts(arr, pi + 1, high, sortByAttribute, 0);
                    break;
                // DESC
                case 1:
                    pi = partition(arr, low, high, sortByAttribute, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before
                    // partition and after partition
                    quickSortTShirts(arr, low, pi - 1, sortByAttribute, 1);
                    quickSortTShirts(arr, pi + 1, high, sortByAttribute, 1);
                    break;
            }
        }
    }

    public void bucketSortTShirtsBySizeThenColorThenFabric(List<TShirt> randomTShirts, boolean isASC) {
        if (isASC){
            List<TShirt> tShirts = new ArrayList<>();
            // Step 1 - Create noOfBuckets buckets, Size.length
            int noOfBuckets = Size.values().length;

            List<TShirt>[] buckets = new ArrayList[noOfBuckets];
            for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
            }

            // Step 2, divide into buckets, Sort By Size
            for (TShirt tShirt : randomTShirts) {
                buckets[tShirt.getSize().ordinal()].add(tShirt);
            }

            // Step 3, Sort By Color
            for (List<TShirt> bucket : buckets) {
                List<TShirt> bucketByFabric = new ArrayList<>(bucket);
                bucketSortTShirts(bucketByFabric, 2, 0);
                quickSortTShirts(bucketByFabric, 0, bucketByFabric.size() - 1, 2, 0);
                bucket = bucketByFabric;
            }

            // combine all the buckets to 1 List
            for (List<TShirt> bucket : buckets) {
                for (TShirt tShirt : bucket) {
                    tShirts.add(tShirt);
                }
            }

            System.out.println("\n--Bucket Sorted Array By Size Ascending , then By Color Ascending and then By Fabric--\n");
            for (TShirt tShirt : tShirts) {
                System.out.println(tShirt);
            }
        }else{
            List<TShirt> tShirts = new ArrayList<>();
            // Step 1 - Create noOfBuckets buckets, Size.length
            int noOfBuckets = Size.values().length;

            List<TShirt>[] buckets = new ArrayList[noOfBuckets];

            for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                buckets[i] = new ArrayList<TShirt>(); // initialize the buckets

            }

            // Step 2, divide into buckets, Sort By Size
            for (TShirt tShirt : randomTShirts) {
                buckets[tShirt.getSize().ordinal()].add(tShirt);
            }

            // Step 3, Sort By Color
            for (List<TShirt> bucket : buckets) {
                List<TShirt> bucketByFabric = new ArrayList<>(bucket);
                bucketSortTShirts(bucketByFabric, 2, 1);
                quickSortTShirts(bucketByFabric, 0, bucketByFabric.size() - 1, 2, 1);
                bucket = bucketByFabric;
            }

            // combine all the buckets to 1 List
            for (List<TShirt> bucket : buckets) {
                for (TShirt tShirt : bucket) {
                    tShirts.add(tShirt);
                }
            }

            System.out.println("\n--Bucket Sorted Array By Size Ascending and By Color Descending--\n");
            for (TShirt tShirt : tShirts) {
                System.out.println(tShirt);
            }
        }
    }

    //testing

    public void bucketTestSortTShirtsBySizeThenColorThenFabric(List<TShirt> randomTShirts, boolean isASC) {
        if (isASC) {
            List<TShirt> tShirts = new ArrayList<>();
            // Step 1 - Create noOfBuckets buckets, Size.length
            int noOfBuckets = Size.values().length;

            List<TShirt>[] buckets = new ArrayList[noOfBuckets];
            for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
            }

            // Step 2, divide into buckets, Sort By Size
            for (TShirt tShirt : randomTShirts) {
                buckets[tShirt.getSize().ordinal()].add(tShirt);
            }
            for (TShirt tShirt1:randomTShirts){
                buckets[tShirt1.getFabric().ordinal()].add(tShirt1);
            }
            // Step 3, Sort By Color
            for (List<TShirt> bucket : buckets) {
                quickSortTShirts(bucket, 0, bucket.size() - 1, 1, 0);

                // Step 4, Sort By Fabric
                List<TShirt> bucketByFabric = new ArrayList<>(bucket);
                bucketSortTShirts(bucketByFabric, 2, 0);
                quickSortTShirts(bucketByFabric, 0, bucketByFabric.size() - 1, 2, 0);
                bucket = bucketByFabric;
            }

            // combine all the buckets to 1 List
            for (List<TShirt> bucket : buckets) {
                for (TShirt tShirt : bucket) {
                    tShirts.add(tShirt);
                }
            }

            System.out.println("\n--Bucket Sorted Array By Size Ascending and By Color Ascending--\n");
            for (TShirt tShirt : tShirts) {
                System.out.println(tShirt);
            }
        }
    }

    public void bucketSortTShirts(List<TShirt> randomTShirts, int sortByAttribute, int sortingType) {
        // Step 1 - Create buckets, Size.length
        int noOfBuckets = Size.values().length;

        // Step 1, create noOfBuckets buckets
        List<TShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets
        for (TShirt tShirt : randomTShirts) {
//              System.out.println(tShirt.getSize().ordinal()); // 3
            switch (sortByAttribute) {
                case 0:
                    buckets[tShirt.getSize().ordinal()].add(tShirt);
                    break;
                case 1:
                    buckets[tShirt.getColor().ordinal()].add(tShirt);
                    break;
                case 2:
                    buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    break;
            }
        }

        // Step 3, print
        // just print the contents of each bucket
        if (sortingType == 0) {
//            for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
//                for (int j = 0; j < buckets[i].size(); j++) {
//                    System.out.println(buckets[i].get(j));
//                }
//            }
        } else {
//            for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
//                for (int j = 0; j < buckets[i].size(); j++) {
//                    System.out.println(buckets[i].get(j));
//                }
//            }
        }
    }
}
