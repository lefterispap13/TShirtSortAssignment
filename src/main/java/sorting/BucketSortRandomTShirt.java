package sorting;

import models.RandomTShirt;
import models.Size;

import java.util.ArrayList;
import java.util.List;

public class BucketSortRandomTShirt {

    public void bucketSortTShirts(List<RandomTShirt> randomTShirts, boolean isASC, int sortAttribute){
        // Step 1 - Create buckets, Size.length
        int noOfBuckets=Size.values().length;

        List<RandomTShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i=0; i< noOfBuckets; i++) { //noOfBuckets
            buckets[i] = new ArrayList<RandomTShirt>(); //initialize the buckets
        }
        switch (sortAttribute) {

            // case 0 for size
            case 0:
                if (isASC){

                    // Step 2, divide into buckets
                    for (RandomTShirt tShirt : randomTShirts) {
//                System.out.println(tShirt.getSize().ordinal());
                        buckets[tShirt.getSize().ordinal()].add(tShirt);
                    }

                    //step 3,print
                    System.out.println("\n------SortedBUS------");

                    for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                        for (int j = 0; j < buckets[i].size(); j++) {

                            System.out.println(buckets[i].get(j));
                        }
                    }
                } else {
                    // Step 2, divide into buckets
                    for (RandomTShirt tShirt : randomTShirts) {
//                System.out.println(tShirt.getSize().ordinal());
                        buckets[tShirt.getSize().ordinal()].add(tShirt);
                    }

                    //step 3,print
                    System.out.println("\n------SortedBUS------");

                    for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
                        }
                    }
                } break;
                // case 1 for color
            case 1:
                if (isASC){

                    // Step 2, divide into buckets
                    for (RandomTShirt tShirt : randomTShirts) {
//                System.out.println(tShirt.getSize().ordinal());
                        buckets[tShirt.getColor().ordinal()].add(tShirt);
                    }

                    //step 3,print
                    System.out.println("\n------SortedBUS------");

                    // this is for ASC order
                    for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                        for (int j = 0; j < buckets[i].size(); j++) {

                            System.out.println(buckets[i].get(j));
                        }
                    }
                } else {
                    // Step 2, divide into buckets
                    for (RandomTShirt tShirt : randomTShirts) {
//                System.out.println(tShirt.getSize().ordinal());
                        buckets[tShirt.getColor().ordinal()].add(tShirt);
                    }

                    //step 3,print
                    System.out.println("\n------SortedBUS------");
                    // this is for DESC order
                    for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
                        }
                    }
                } break;
                // case 2 for fabric
            case 2:
                if (isASC){

                    // Step 2, divide into buckets
                    for (RandomTShirt tShirt : randomTShirts) {
//                System.out.println(tShirt.getSize().ordinal());
                        buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    }

                    //step 3,print
                    System.out.println("\n------SortedBUS------");

                    // this is for ASC order
                    for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                        for (int j = 0; j < buckets[i].size(); j++) {

                            System.out.println(buckets[i].get(j));
                        }
                    }
                } else {
                    // Step 2, divide into buckets
                    for (RandomTShirt tShirt : randomTShirts) {
//                System.out.println(tShirt.getSize().ordinal());
                        buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    }

                    //step 3,print
                    System.out.println("\n------SortedBUS------");
                    // this is for DESC order
                    for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                        for (int j = 0; j < buckets[i].size(); j++) {
                            System.out.println(buckets[i].get(j));
                        }
                    }
                } break;
        }
    }
}
