package com.test.arraylist;

import java.util.Arrays;

public class MyArrayList<T> {

	private int size;
	private Object[] list;

	public MyArrayList(int size) {
		list = new Object[size];
	}

	public void add(T element) {
		if (size >= list.length / 2) {
			increaseListSize();
		}
		list[size++] = element;
	}

	public T get(int index) {
		if (index < size) {
			return getData(index);
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public T remove(int index) {
		if (index < size) {
			T elementAtToBeRemovedIndex = getData(index);
			int tmp = index;
			while (tmp < size) {
				list[tmp] = list[tmp + 1];
				list[tmp + 1] = null;
				tmp++;
			}
			size--;
			return elementAtToBeRemovedIndex;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	@SuppressWarnings("unchecked")
	private T getData(int index) {
		return (T) list[index];
	}

	private void increaseListSize() {
		list = Arrays.copyOf(list, list.length * 2);
	}

	private int getSize() {
		return size;
	}

	public static void main(String a[]) {
		MyArrayList<Integer> mal = new MyArrayList<Integer>(10);
		mal.add(new Integer(2));
		mal.add(new Integer(5));
		mal.add(new Integer(1));
		mal.add(new Integer(23));
		mal.add(new Integer(14));
		mal.add(new Integer(15));
		mal.add(new Integer(16));
		for (int i = 0; i < mal.getSize(); i++) {
			System.out.print(mal.get(i) + " ");
		}
		mal.add(new Integer(29));
		System.out.println();
		System.out.println("Element at Index 5:" + mal.get(5));
		System.out.println("List size: " + mal.getSize());
		System.out.println("Removing element at index 2: " + mal.remove(2));
		for (int i = 0; i < mal.getSize(); i++) {
			System.out.print(mal.get(i) + " ");
		}
	}
}
