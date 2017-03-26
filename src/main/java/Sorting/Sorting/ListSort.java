package Sorting.Sorting;

import java.util.List;

public class ListSort <T extends Comparable<T>> {

	private List<T> list;

	public ListSort(List<T> list) {

		this.list = list;
	}

	public 	List<T> bubbleSort() {
		
			for (int w = 0; w < list.size()-1; w++) {
				for (int i = 0; i < list.size()-1; i++) {

					if (list.get(i).compareTo(list.get(i + 1)) > 0) {
						T temp=list.get(i);
						list.set(i, list.get(i + 1));
						list.set(i + 1, temp);
					}
				}
			}
		
		
		return list;

	}

	public List<T> sortByChoice() {

			for (int i = 0; i <= list.size() - 1; i++) {
				
				Integer min = i;
				for (int j = i + 1; j <= list.size() - 1; j++) {
					if (list.get(min).compareTo(list.get(j)) > 0) {
						T temp = list.get(min);
						list.set(min, list.get(j));
						list.set(j, temp);
					}
				}
			}
		
		
		return list;
	}
	public List<T> sortByChoiceDecent() {

		

			for (int i = 0; i < list.size() - 1; i++) {
				int max = i;
				for (int j = i + 1; j <= list.size() - 1; j++) {
					if (list.get(max).compareTo(list.get(j)) < 0) {
						T temp = list.get(max);
						list.set(max, list.get(j));
						list.set(j, temp);
					}
				}
			}
		
		
		return list;
	}
}
