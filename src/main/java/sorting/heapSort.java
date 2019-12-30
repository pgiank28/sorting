package sorting;

import java.util.ArrayList;
import java.lang.Math;

public class heapSort implements sort{

  public ArrayList<Integer> sorting(ArrayList<Integer> arr){
    Heap h = new Heap(arr);
    h = h.makeMaxHeap();
    int tmp;
    h.heap.forEach(y->System.out.println(y));
    for(int j=h.heap.size()-1;j>0;j--){
      tmp = h.heap.get(0);
      h.heap.set(0,h.heap.get(j));
      h.heap.set(j,tmp);
      h.Max_Heapify(0,j);
    }
    return h.heap;
  }

  private class Heap{
    ArrayList<Integer> heap;
    private Heap(ArrayList<Integer> arr){
      this.heap = new ArrayList<Integer>(arr);
    }
    private Heap Max_Heapify(int i,int heapsize){
      int l = leftChild(i);
      int r = rightChild(i);

      int largest = i;
      if((l<heapsize) && (heap.get(l)>heap.get(i))){
        largest = l;
      }else{
        largest = i;
      }
      if((r<heapsize) && (heap.get(r)>heap.get(largest))){
        largest = r;
      }
      if(largest != i){
        int tmp = heap.get(largest);
        heap.set(largest,heap.get(i));
        heap.set(i,tmp);
        return Max_Heapify(largest,heapsize);
      }
      return this;
    }

    private Heap makeMaxHeap(){
      for(int i=heap.size()/2;i>=0;i--){
        this.Max_Heapify(i,heap.size());
      }
      return this;
    }
    private int parent(int p){
      return p-1/2;
    }
    private int leftChild(int p){
      return 2*p+1;
    }
    private int rightChild(int p){
      return 2*p+2;
    }
  }
}
