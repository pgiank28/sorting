package sorting;

import java.util.ArrayList;
import java.util.Random;

import sorting.insertionSort;
import sorting.selectionSort;
import sorting.mergeSort;
import sorting.bubbleSort;
import sorting.heapSort;

public class mainclass{

    public static void main(String[] args){
    Random rand = new Random();
    ArrayList<Integer> myList = new ArrayList<Integer>();
		for(int i=0;i<10000;i++){
      myList.add(rand.nextInt(75000));
    }

    /*insertionSort is = new insertionSort();
		mergeSort ms = new mergeSort();
		selectionSort ss = new selectionSort();
		bubbleSort bs = new bubbleSort();
    heapSort hs = new heapSort();*/
    quickSort qs = new quickSort();

    /*
		ArrayList<Integer> insort;
		ArrayList<Integer> mesort;
		ArrayList<Integer> sesort;
		ArrayList<Integer> bbsort;
    ArrayList<Integer> hhsort;*/
    ArrayList<Integer> qqsort;

    /*
		insort = is.sorting(myList);
		mesort = ms.sorting(myList);
		sesort = ss.sorting(myList);
		bbsort = bs.sorting(myList);
    hhsort = hs.sorting(myList);*/
    qqsort = qs.sorting(myList);

    /*
		insort.forEach(tt->System.out.println(tt));
    System.out.println("--------------------");
		mesort.forEach(tt->System.out.println(tt));
    System.out.println("--------------------");
		sesort.forEach(tt->System.out.println(tt));
    System.out.println("--------------------");
		bbsort.forEach(tt->System.out.println(tt));
    System.out.println("---------------------");
    hhsort.forEach(hh->System.out.println(hh));*/
    qqsort.forEach(qq->System.out.println(qq));
    }
}
