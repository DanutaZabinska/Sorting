package Sorting.Sorting;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;

public class ListSortByChoiceTest {

	
	@Test
	public void isSortingChoiceWorksAsSortMethod() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> controlList = new ArrayList<Integer>();
		list.add(234);
		list.add(4343);
		list.add(43);
		list.add(0);
		list.add(455311);
		list.add(-3);
		list.add(8);

		controlList.add(234);
		controlList.add(4343);
		controlList.add(43);
		controlList.add(0);
		controlList.add(455311);
		controlList.add(-3);
		controlList.add(8);

		ListSortByChoice<Integer> newlist = new ListSortByChoice<Integer>(list);

		Collections.sort(controlList);
		System.out.println(controlList);
		System.out.println(newlist.sortAsc());
		assertThat(newlist.sortAsc(), IsIterableContainingInOrder.contains(controlList.toArray()));

	}

	@Test
	public void isSortingBWorksWith0() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> controlList = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = 0;
			list.add(a);
			controlList.add(a);
		}
		ListBubbleSort<Integer> newlist = new ListBubbleSort<Integer>(list);
		Collections.sort(controlList);
		System.out.println(controlList);
		System.out.println(newlist.sortAsc());
		assertThat(newlist.sortAsc(), IsIterableContainingInOrder.contains(controlList.toArray()));
	}

	@Test
	public void isSortingBWorksWithSize200() {
		Random mix = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> controlList = new ArrayList<Integer>();
		for (int i = 0; i < 200; i++) {
			Integer a = mix.nextInt(20);
			list.add(a);
			controlList.add(a);

		}
		ListBubbleSort<Integer> newlist = new ListBubbleSort<Integer>(list);
		Collections.sort(controlList);
		System.out.println(controlList);
		System.out.println(newlist.sortAsc());
		assertThat(newlist.sortAsc(), IsIterableContainingInOrder.contains(controlList.toArray()));

	}

	@Test(expected = java.lang.AssertionError.class)

	public void isSortingChDecentWorksAsSortMethod() {

		Random mix = new Random();
		final ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> controlList = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			Integer a = mix.nextInt(200);
			list.add(a);

			controlList.add(a);
		}
		ListSortByChoice<Integer> newlist = new ListSortByChoice<Integer>(list);

		
		Collections.sort(controlList);
		System.out.println(controlList);
		System.out.println(newlist.sortDesc());

		assertThat(newlist.sortDesc(), IsIterableContainingInOrder.contains(controlList.toArray()));
	}

}
