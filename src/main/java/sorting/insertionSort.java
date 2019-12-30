package sorting;

import java.util.ArrayList;
import sorting.sort;
import java.util.List;

public class insertionSort implements sort{

    public ArrayList<Integer> sorting(ArrayList<Integer> arr){

    List<Integer> subList;

		int tmp;
		int tmp2;
		int curPos;
		int item;

		for(int pos=1;pos<arr.size();pos++){
			subList = arr.subList(0,pos);
			curPos=0;
			item=arr.get(pos);

      //Iterate through the sorted left part of the list
			for(int items2=0;items2<pos;items2++){

        //Find the position where the new item must occupy
				if(subList.get(items2)>item){
					tmp2=item;

          //Shift right the rest of the sorted items
					for(int shift=items2;shift<pos;shift++){
						tmp=subList.get(shift);
						arr.set(shift,tmp2);
						tmp2=tmp;
					}

					arr.set(pos,tmp2);
					items2 = pos;//To escape the inner loop
					continue;
				}

			}

		}

		return arr;
    }
}
