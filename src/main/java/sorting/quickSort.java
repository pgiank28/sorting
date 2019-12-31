package sorting;

import java.util.ArrayList;

public class quickSort implements sort{

  public ArrayList<Integer> sorting(ArrayList<Integer> arr){
    return quicksort(arr,0,arr.size()-1);
  }

  public ArrayList<Integer> quicksort(ArrayList<Integer>a,int p,int r){
    if(p<r){
      int q = partition(a,p,r);
      System.out.println("q = "+q);
      a = quicksort(a,p,q-1);
      a = quicksort(a,q+1,r);
    }
      return a;
  }

  public int partition(ArrayList<Integer>arr,int p,int r){
    int pivot = arr.get(r);
    int tmp;
    int i = p;

    for(int j=p;j<r;j++){
      if(arr.get(j)<= pivot){
        tmp = arr.get(j);
        arr.set(j,arr.get(i));
        arr.set(i,tmp);
        i = i + 1;
      }
    }
    arr.set(r,arr.get(i));
    arr.set(i,pivot);
    return i;
  }
}
