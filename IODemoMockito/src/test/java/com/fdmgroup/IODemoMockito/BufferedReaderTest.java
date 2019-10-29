package com.fdmgroup.IODemoMockito;

public class BufferedReaderTest {
	@Test
	public void CallsReadWholeFileAtLeastOfBufferedReaderExactlyOnceWhenCalled() {
		//Arrange
		BufferedReaderIO bufferedreader = new BufferedReaderIO();
		
		//Act
		bufferedreader.readWholeFileasList();
		
		//Assert
		
	}

}
