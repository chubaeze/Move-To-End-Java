package moveToEnd;

import java.util.*;

// {2, 1, 2, 2, 2, 3, 4, 2}
//toMove = 2

//[1, 3, 4, 2, 2, 2, 2, 2]
public class moveToEnd{
	
	public static List<Integer> moveEnd(List<Integer> array, int toMove){

				int i = 0;
				int j = array.size() - 1;
				
				while (i < j) {
					if (array.get(j) == toMove) {
						j--;
					}
						
					if (array.get(i) == toMove && array.get(j) != toMove) {
							swap(i, j, array);
							i++;
							j--;
						}
						else i++;
					
				}
					return array;
	}
	
	public static void swap(int i, int j, List<Integer> array) {
		
		int temp = array.get(j);
		array.set(j, array.get(i));
		array.set(i, temp);
		
	}
	
}
