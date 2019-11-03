package sorting;

import java.util.ArrayList;

public class bubbleSort extends sort{

    public ArrayList<Integer> sorting(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            for(int j=arr.size()-1;j>=0;j--){
                if(arr.get(i)>arr.get(j)){
                    int tmp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,tmp);
                }
            }
        }
        return arr;
    }
}