package com.chenming.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class TxtIo implements ITxtIo{

	@Override
	public List<String> readByLine(String filename) {
		return readByLineWithContains(filename, null, true);
	}

	@Override
	public List<String> readByLineWithContains(String filename, String[] contains, boolean isAnd) {
		List<String> lines = new ArrayList<>();
		File file = new File(filename);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (canAdd(line, contains, isAnd)) {
					lines.add(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		return lines;
	}

	@Override
	public void readByLineWithContains(String filename, String outfilename, String[] contains, boolean isAnd) {
		File file = new File(filename);
		File outfile = new File(outfilename);
		BufferedReader reader = null;
		BufferedWriter writer = null;
		StringBuffer writeStr = new StringBuffer();
		try {
			reader = new BufferedReader(new FileReader(file));
			writer = new BufferedWriter(new FileWriter(outfile));
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (canAdd(line, contains, isAnd)) {
					writeStr.append(line + "\n");
				}
			}
			writer.write(writeStr.toString());
			writer.flush(); //刷新数据到文件
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	private boolean canAdd(String str, String []contains, boolean isAnd) {
		boolean isContain = false;
		if (str == null) {
			return false;
		}
		if (contains == null) {
			return true;
		}
		for (String contain : contains) {
			isContain = str.indexOf(contain) != -1; 
			if (isContain && !isAnd) {
				return true;
			} else if (!isContain && isAnd) {
				return false;
			}
		}
		return isAnd;
	}
}
