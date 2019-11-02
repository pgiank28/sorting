package sorting;

import java.util.ArrayList;

import sorting.insertionSort;
import sorting.selectionSort;
import sorting.mergeSort;

public class mainclass{

    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(13);
		myList.add(5);
		myList.add(73);
		myList.add(117);
		myList.add(-23);
		myList.add(88);
        myList.add(566);
        
        insertionSort is = new insertionSort();
		mergeSort ms = new mergeSort();
		selectionSort ss = new selectionSort();

		ArrayList<Integer> insort;
		ArrayList<Integer> mesort;
		ArrayList<Integer> sesort;

		insort = is.sorting(myList);
		mesort = ms.sorting(myList);
		sesort = ss.sorting(myList);


		insort.forEach(tt->System.out.println(tt));
		mesort.forEach(tt->System.out.println(tt));
		sesort.forEach(tt->System.out.println(tt));

    }
}