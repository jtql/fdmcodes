package com.fdmgroup.DAOs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.fdmgroup.factories.DBSingleton;
import com.fdmgroup.items.Laptop;

public class LaptopDaoSqlImp implements itemDao<Laptop> {
	private static DBSingleton dbSingleton;
	private static final Logger programmerLog = LogManager.getLogger("programmerLog");
	private static final Logger adminLog = LogManager.getLogger("adminLog");

	public LaptopDaoSqlImp(DBSingleton dbSingleton) {
		LaptopDaoSqlImp.dbSingleton = dbSingleton;
	}

	public void addItem(Laptop item) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT into LAPTOP(brand,productid,price,processor,storagespace)" + "VALUES(?,?,?,?,?)");
		try {
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(sb.toString());
			ps.setString(1, item.getBrand());
			ps.setString(2, item.getProductId());
			ps.setDouble(3, item.getPrice());
			ps.setString(4, item.getProcessor());
			ps.setInt(5, item.getStorageSpace());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			adminLog.info("Something happened while trying to add the laptop to the sql database");
			programmerLog.trace(e.getMessage());
		}
	}

	public void addAllItems(List<Laptop> items) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT into LAPTOP(brand, productid, price, processor, storagespace)" + "VALUES(?,?,?,?,?)");
		try {
			dbSingleton.getConnection().setAutoCommit(false);
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(sb.toString());
			for (Laptop item : items) {
				ps.setString(1, item.getBrand());
				ps.setString(2, item.getProductId());
				ps.setDouble(3, item.getPrice());
				ps.setString(4, item.getProcessor());
				ps.setInt(5, item.getStorageSpace());
				ps.addBatch();
			}
			ps.executeBatch();
			dbSingleton.getConnection().commit();
		} catch (SQLException e) {
			e.printStackTrace();
			adminLog.info("Something happened while trying to add all the laptops to the sql database");
			programmerLog.trace(e.getMessage());
		}
	}

	public void removeItem(Laptop item) {
		StringBuilder sb = new StringBuilder();
		sb.append("DELETE from LAPTOP WHERE productid = ?");
		try {
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(sb.toString());
			ps.setString(1, item.getProductId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			adminLog.info("Something happened while trying to delete the laptop from the sql database");
			programmerLog.trace(e.getMessage());
		}
	}

	public void updateItem(Laptop item) {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE LAPTOP SET brand=?, price=?, processor=?,storagespace=? WHERE productid=?");
		try {
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(sb.toString());
			ps.setString(1, item.getBrand());
			ps.setDouble(2, item.getPrice());
			ps.setString(3, item.getProcessor());
			ps.setInt(4, item.getStorageSpace());
			ps.setString(5, item.getProductId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			adminLog.info("Something happened while trying to update the LAPTOP to the sql database");
			programmerLog.trace(e.getMessage());
		}
	}

	public Laptop getItem(Laptop item) {
		return item;
	}

	public List<Laptop> returnALLItems() {
		List<Laptop> toReturn = new ArrayList<Laptop>();
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * from LAPTOP");
		try {
			PreparedStatement ps = dbSingleton.getConnection().prepareStatement(sb.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String brand = rs.getString("brand");
				String productId = rs.getString("productid");
				double price = rs.getDouble("price");
				String processor = rs.getString("processor");
				int storageSpace = rs.getInt("storagespace");
				Laptop l = new Laptop(brand, productId, price, processor, storageSpace);
				toReturn.add(l);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			adminLog.info("Something happened while trying to return all the laptops from database");
			programmerLog.trace(e.getMessage());
		}
		return toReturn;
	}

	public List<Laptop> returnAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
