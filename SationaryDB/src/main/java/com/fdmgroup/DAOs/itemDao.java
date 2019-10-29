package com.fdmgroup.DAOs;

import java.util.List;

import com.fdmgroup.items.Item;

public interface itemDao<T extends Item> {
	void addItem(T item);

	void removeItem(T item);

	void updateItem(T item);

	T getItem(T item);

	List<T> returnAllItems();
}
