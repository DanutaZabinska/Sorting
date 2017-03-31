package Sorting.Sorting;

import java.util.List;

public class ListSortByChoice <T extends Comparable<T>> implements SortList<T> {

	private List<T> list;

	public ListSortByChoice(List<T> list) {

		this.list = list;
	}



	public List<T> sortAsc() {

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
	public List<T> sortDesc() {

		

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
