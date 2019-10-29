package com.fdmgroup.Generics;

import java.util.ArrayList;
import java.util.List;

public class allCatalogue<T> {
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

	public T getBook(String id) {
		for (T temp : allItems) {
			if (((Book) temp).getUniqueId().equals(id))
				return (T) ((Book) temp).getTitle();
		}
		return null;
	}

	public T getDvd(String id) {
		for (T temp : allItems) {
			if (((dvd) temp).getUniqueId().equals(id))
				return (T) ((dvd) temp).getTitle();
		}
		return null;
	}
	
//	public void removeItem(String id) {
//		for (int i = 0; i < allItems.size(); i++) {
//			if (allItems.get(i).getUniqueId().equals(id))
//				allItems.remove(i);
//		}
//	}

}
