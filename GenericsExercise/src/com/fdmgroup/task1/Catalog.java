package com.fdmgroup.task1;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.task1.Catalog;

public class Catalog<T extends iCommon> {
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

	public T getItem(int id) {
		for (T temp : allItems) {
			if (temp.getUniqueId()==(id)) {
				return temp;
			}
		}
		return null;
	}

}
