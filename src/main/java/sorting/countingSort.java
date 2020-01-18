package sorting;
import java.util.ArrayList;
import java.util.Collections;

public class countingSort implements sort{
  public int k;
  public countingSort(int k){
    this.k = k;
  }
  public ArrayList<Integer> sorting(ArrayList<Integer> arr){
    ArrayList<Integer> c = new ArrayList<Integer>(Collections.nCopies(this.k,0));
    arr.forEach(item -> {c.set(item,c.get(item)+1);});
    for(int i=1;i<k;i++){
      c.set(i,c.get(i)+c.get(i-1));
    }

    ArrayList<Integer> res = new ArrayList<Integer>(Collections.nCopies(arr.size(),0));
    for(int j=arr.size()-1;j>=0;j--){
      res.set(c.get(arr.get(j))-1,arr.get(j));
      c.set(arr.get(j),c.get(arr.get(j))-1);
    }
    return res;
  }
}
