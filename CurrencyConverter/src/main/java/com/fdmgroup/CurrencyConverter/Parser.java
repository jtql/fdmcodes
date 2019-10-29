package com.fdmgroup.CurrencyConverter;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class Parser {
	public String[] getCurrency() {
		String currency[] = null;

		try {
			File inputFile = new File("eurofxref-daily.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			// System.out.println("Root element :" +
			// doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("Curr");
			// System.out.println("----------------------------");
			currency = new String[nList.getLength()];
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				// System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					currency[temp] = eElement.getAttribute("currency");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currency;
	}

	public double[] getRate() {
		double rate[] = null;

		try {
			File inputFile = new File("eurofxref-daily.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			// System.out.println("Root element :" +
			// doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("Curr");
			// System.out.println("----------------------------");
			rate = new double[nList.getLength()];

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				// System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					rate[temp] = Double.parseDouble(eElement.getAttribute("rate"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rate;
	}

}
