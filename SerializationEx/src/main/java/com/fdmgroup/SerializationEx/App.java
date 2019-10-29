package com.fdmgroup.SerializationEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        Board board = new Board();
        
        Wizard w1 = new Wizard("joshua");
        Wizard w2 = new Wizard("kevin");
        
        board.attack(w1, w2);
        
        try {
			FileOutputStream fos = new FileOutputStream("players.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(w1);
			os.close();
			
			FileInputStream fis = new FileInputStream("players.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			w1 = (Wizard)ois.readObject();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("player1: "+ w1);
        
    }
}
