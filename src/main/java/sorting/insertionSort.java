package sorting;

import java.util.ArrayList;
import sorting.sort;
import java.util.List;

public class insertionSort extends sort{

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
			for(int items2=0;items2<pos && curPos!=-1;items2++){
				if(subList.get(items2)>item){
					tmp2=item;
					for(int shift=items2;shift<pos;shift++){
						tmp=subList.get(shift);
						arr.set(shift,tmp2);
						tmp2=tmp;
					
						
					}//Shift all right by one

					arr.set(pos,tmp2);
					curPos=-1;
					continue;
				}
				
			}

		}
		
		return arr;
    }
}
