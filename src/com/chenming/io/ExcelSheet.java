package com.chenming.io;

import java.util.ArrayList;

public class ExcelSheet {
	private String sheetName;
	private ArrayList<ArrayList<String>> data = null;
	
	public ExcelSheet(String sheetName) {
		this.sheetName = sheetName;
		this.data = new ArrayList<>();
	}
	public ExcelSheet(String sheetName, ArrayList<ArrayList<String>> data) {
		if (data == null) {
			data = new ArrayList<>();
		}
		this.data = data;
	}
	public String getSheetName() {
		return sheetName;
	}
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}
	public ArrayList<ArrayList<String>> getData() {
		return data;
	}
	public void setData(ArrayList<ArrayList<String>> data) {
		this.data = data;
	}
	public void addRow (ArrayList<String> row) {
		data.add(row);
	}
}
