package sorting;

import java.util.ArrayList;

import sorting.insertionSort;
import sorting.selectionSort;
import sorting.mergeSort;
import sorting.bubbleSort;
import sorting.heapSort;

public class mainclass{

    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(113);
		myList.add(152);
		myList.add(73);
		myList.add(117);
		myList.add(23);
		myList.add(848);
    myList.add(41);
		myList.add(6);
    myList.add(11);
    myList.add(4);
    myList.add(9);

    /*insertionSort is = new insertionSort();
		mergeSort ms = new mergeSort();
		selectionSort ss = new selectionSort();
		bubbleSort bs = new bubbleSort();*/
    heapSort hs = new heapSort();

    /*
		ArrayList<Integer> insort;
		ArrayList<Integer> mesort;
		ArrayList<Integer> sesort;
		ArrayList<Integer> bbsort;*/
    ArrayList<Integer> hhsort;

    /*
		insort = is.sorting(myList);
		mesort = ms.sorting(myList);
		sesort = ss.sorting(myList);
		bbsort = bs.sorting(myList);*/
    hhsort = hs.sorting(myList);

    /*
		insort.forEach(tt->System.out.println(tt));
    System.out.println("--------------------");
		mesort.forEach(tt->System.out.println(tt));
    System.out.println("--------------------");
		sesort.forEach(tt->System.out.println(tt));
    System.out.println("--------------------");
		bbsort.forEach(tt->System.out.println(tt));*/
    System.out.println("---------------------");
    hhsort.forEach(hh->System.out.println(hh));
    }
}
