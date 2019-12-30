package sorting;

import java.util.ArrayList;
import sorting.sort;

public class mergeSort implements sort{
    public ArrayList<Integer> sorting (ArrayList<Integer> arr){
        return mergeSort(arr,0,arr.size()-1);
    }

    public  ArrayList mergeSort(ArrayList<Integer> arr,int i,int j){

        if(i==(j-1)||i==j){
            return arr;
        }

        arr = mergeSort(arr,i,Math.round((i+j)/2));
        arr = mergeSort(arr,Math.round((i+j)/2),j);

        return merge(arr,i,Math.round((i+j)/2),j);
    }


    public ArrayList merge(ArrayList<Integer> arr,int p,int q,int r){

        ArrayList<Integer> leftSorted = new ArrayList<Integer>(arr.subList(p,q));
        ArrayList<Integer> rightSorted= new ArrayList<Integer>(arr.subList(q,r));
        int i=0,j=0;

        while(p<r){
                //The right array has copied to the general array.
                if(rightSorted.size()==j ){
                    arr.set(p,leftSorted.get(i));
                    i++;
                    p++;
                    continue;
                }

                //The left array has copied to the general array
                if(leftSorted.size()==i){
                    arr.set(p,rightSorted.get(j));
                    j++;
                    p++;
                    continue;
                }
                
                if(leftSorted.get(i)>rightSorted.get(j)){
                    arr.set(p,rightSorted.get(j));
                    j++;
                    p++;
                    continue;
                }
                if(leftSorted.get(i)<rightSorted.get(j)){
                    arr.set(p,leftSorted.get(i));
                    i++;
                    p++;
                    continue;
                }
        }
        return arr;
    }
}
