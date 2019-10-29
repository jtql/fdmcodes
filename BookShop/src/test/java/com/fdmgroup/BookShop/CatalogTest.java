 package com.fdmgroup.BookShop;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;

public class CatalogTest {
	@Test
	public void test_GetAllBook_ReturnsAListOfZero_WhenTheCatalogHasNoBooksAdded() {
		Catalog catalog = new Catalog();
		List<Book> booksInCatalog = catalog.getAllBook();
		assertEquals(0,booksInCatalog.size());
	}
}
