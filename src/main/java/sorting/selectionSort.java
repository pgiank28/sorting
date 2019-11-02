package sorting;

import java.util.ArrayList;

public class selectionSort extends sort{
    public ArrayList<Integer> sorting(ArrayList<Integer> arr){
        int curmin,tmp;
		for(int j=0;j<arr.size();j++){
			curmin = findIndexOfMinimum(arr, j);
			tmp = arr.get(j);
			arr.set(j,arr.get(curmin));
			arr.set(curmin,tmp);
		}
		return arr;	
	}

	public int findIndexOfMinimum(ArrayList<Integer> arr,int i){
		int min=59000;
		int indexofmin=-1;

		while(i<arr.size()){
			if(arr.get(i)<min){
				min=arr.get(i);
				indexofmin=i;
			}
			i=i+1;
		}
		
		return indexofmin;
    }
}