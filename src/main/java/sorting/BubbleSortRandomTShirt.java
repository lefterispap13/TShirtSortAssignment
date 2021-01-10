package sorting;

import models.RandomTShirt;

import java.util.List;

public class BubbleSortRandomTShirt {

    public void bubbleSort(List<RandomTShirt> arr, boolean isASC, int sortAttribute) {
        int n = arr.size();
        // sorting with size ASC
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                switch (sortAttribute) {
                    //size
                    case 0:
                        if (isASC){
                            if (arr.get(j).getSize().compareTo(arr.get(j + 1).getSize()) > 0) // ASC order
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        else {
                            if (arr.get(j).getSize().compareTo(arr.get(j + 1).getSize()) < 0) // DESC order
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }break;
                        // color
                    case 1:
                        if (isASC){
                            if (arr.get(j).getColor().compareTo(arr.get(j + 1).getColor()) > 0) // ASC order
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        else {
                            if (arr.get(j).getColor().compareTo(arr.get(j + 1).getColor()) < 0) // DESC order
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }break;
                        // fabric
                    case 2:
                        if (isASC){
                            if (arr.get(j).getFabric().compareTo(arr.get(j + 1).getFabric()) > 0) // ASC order
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }
                        else {
                            if (arr.get(j).getFabric().compareTo(arr.get(j + 1).getFabric()) < 0) // DESC order
                            {
                                RandomTShirt temp = arr.get(j + 1);
                                arr.set(j + 1, arr.get(j));
                                arr.set(j, temp);
                            }
                        }break;
                }
            }
        }
    }

}

//for (int i= 0; i< list.size() ; i++){
//
//        for(int j=0; j< list.size() - i-1; j++){
//
//        a = list.get(j).getLastName().toUpperCase().trim();
//        b = list.get(j+1).getLastName().toUpperCase().trim();
//
//        c = list.get(j);
//        d = list.get(j+1);
//
//        if ( a.compareTo(b) > 0)  {
//
//        Person temp = d;
//        list.set(j+1, c);
//        list.set(j, temp);
//
//        }
//        }
