package Sorting.Sorting;

import java.util.ArrayList;

public class ListSort {

	private ArrayList<Integer> list;

	public ListSort(ArrayList<Integer> list) {

		this.list = list;
	}

	public ArrayList<Integer> bubbleSort() {
		
			for (int l = 0; l < list.size()-1; l++) {
				for (int i = 0; i < list.size()-1; i++) {

					if (list.get(i).compareTo(list.get(i + 1)) > 0) {
						Integer temp=list.get(i);
						list.set(i, list.get(i + 1));
						list.set(i + 1, temp);
					}
				}
			}
		
		
		return list;

	}

	public ArrayList<Integer> sortByChoice() {

			for (int i = 0; i <= list.size() - 1; i++) {
				
				Integer min = i;
				for (int j = i + 1; j <= list.size() - 1; j++) {
					if (list.get(min).compareTo(list.get(j)) > 0) {
						Integer temp = list.get(min);
						list.set(min, list.get(j));
						list.set(j, temp);
					}
				}
			}
		
		
		return list;
	}
	public ArrayList<Integer> sortByChoiceDecent() {

		

			for (int i = 0; i < list.size() - 1; i++) {
				Integer max = i;
				for (int j = i + 1; j <= list.size() - 1; j++) {
					if (list.get(max).compareTo(list.get(j)) < 0) {
						Integer temp = list.get(max);
						list.set(max, list.get(j));
						list.set(j, temp);
					}
				}
			}
		
		
		return list;
	}
}
