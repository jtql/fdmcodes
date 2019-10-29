package com.fdmgroup.BookShopMockito;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class StockCheckerTest {
	@Test
	public void numberInStock_CallsReadQuantityMethodOfDatabaseReaderExactlyOnceWhenCalled() {
		// Arrange
		DatabaseReader mockDatabaseReader = mock(DatabaseReader.class);
		StockChecker stockchecker = new StockChecker(mockDatabaseReader);
		String isbn = "AFDFDFDF4651";

		// Act
		stockchecker.numberInStock(isbn);

		// Assert
		 verify(mockDatabaseReader, times(1)).readQuantity(anyString()); //Method 1
//		verify(mockDatabaseReader.readQuantity(isbn)); // There was no call for readQuantity

	}

	@Test
	public void numberInStock_callsReadQuantityMethodOfDatabaseReader_and_return_3_WhenCalled() {
		// Arrange
		DatabaseReader mockDatabaseReader = mock(DatabaseReader.class);
		StockChecker stockchecker = new StockChecker(mockDatabaseReader);
		String isbn = "AFDFDFDF4651";

		when(mockDatabaseReader.readQuantity(isbn)).thenReturn(3);

		// Act
		int numInStock = stockchecker.numberInStock(isbn);

		// Assert
		assertEquals(3, numInStock);
	}

}
