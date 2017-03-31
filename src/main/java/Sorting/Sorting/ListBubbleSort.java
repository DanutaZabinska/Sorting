package Sorting.Sorting;

import java.util.List;

public class ListBubbleSort <T extends Comparable<T>> implements SortList<T>{

	private List<T> list;

	public ListBubbleSort(List<T> list) {

		this.list = list;
	}

	public 	List<T> sortAsc() {
		
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

	@Override
	public List<T> sortDesc() {
		// TODO Auto-generated method stub
		//return null;
		throw new UnsupportedOperationException();
	}


	
}
