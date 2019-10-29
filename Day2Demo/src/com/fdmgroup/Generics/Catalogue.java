package com.fdmgroup.Generics;

import java.util.ArrayList;
import java.util.List;

public class Catalogue<T extends Book> {
	private List<T> allItems = new ArrayList<T>();

	public List<T> getAllItems() {
		return allItems;
	}

	public void setAllItems(List<T> allItems) {
		this.allItems = allItems;
	}

	public void addItem(T item) {
		allItems.add(item);
	}

//	public void removeItem(String id) {
//		for (int i = 0; i < allItems.size(); i++) {
//			if (allItems.get(i).getUniqueId().equals(id))
//				allItems.remove(i);
//		}
//	}
	
	public void removeItem(String id) {
		for (T temp : allItems) {
			if (temp.getUniqueId().equals(id))
				allItems.remove(temp);
		}
	}

	public T getItem(String id) {
		for (T temp : allItems) {
			if (temp.getUniqueId().equals(id)) {
				return temp;
			}
		}
		return null;
	}
}
