package com.fdmgroup.DAOs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.factories.DBSingleton;
import com.fdmgroup.items.Book;

public class BookDaoSqlImpl implements itemDao<Book> {

	private static DBSingleton dbSingleton;

	public BookDaoSqlImpl(DBSingleton dbSingleton) {
		BookDaoSqlImpl.dbSingleton = dbSingleton;
	}

	public void addItem(Book item) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT into BOOKS(title, author, isbn, price, numofpages) VALUES (?,?,?,?,?)");
		try {
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(sb.toString());
			ps.setString(1, item.getTitle());
			ps.setString(2, item.getAuthor());
			ps.setString(3, item.getIsbn());
			ps.setDouble(4, item.getPrice());
			ps.setInt(5, item.getNumOfPages());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addAllItems(List<Book> items) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT into BOOKS(title, author, isbn, price, numofpages) VALUES (?,?,?,?,?)");
		try {
			dbSingleton.getConnection().setAutoCommit(false);
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(sb.toString());
			for (Book item : items) {
				ps.setString(1, item.getTitle());
				ps.setString(2, item.getAuthor());
				ps.setString(3, item.getIsbn());
				ps.setDouble(4, item.getPrice());
				ps.setInt(5, item.getNumOfPages());
				ps.addBatch();
			}
			ps.executeBatch();
			dbSingleton.getConnection().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeItem(Book item) {
		// TODO Auto-generated method stub

	}

	public void updateItem(Book item) {
		// TODO Auto-generated method stub

	}

	public Book getItem(Book item) {
		String query = "SELECT * FROM Books WHERE title = \"" + item.getTitle() + "\"";
		Book b = new Book();
		try {
			dbSingleton.getConnection();
			Statement s = dbSingleton.getConnection().createStatement();
			ResultSet rs = s.executeQuery(query);
			b.setTitle(rs.getString("title"));
			b.setAuthor(rs.getString("author"));
			b.setIsbn(rs.getString("isbn"));
			b.setPrice(rs.getDouble("price"));
			b.setNumOfPages(rs.getInt("numOfPages"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return b;
	}

	public List<Book> returnAllItems() {
		List<Book> books = new ArrayList<Book>();
		String query = "SELECT * FROM Books";
		ResultSet rs;
		try {
			dbSingleton.getConnection();
			Statement s = dbSingleton.getConnection().createStatement();
			rs = s.executeQuery(query);
			while (rs.next()) {
				Book b = new Book();
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setIsbn(rs.getString("isbn"));
				b.setPrice(rs.getDouble("price"));
				b.setNumOfPages(rs.getInt("numOfPages"));
				books.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}
}
