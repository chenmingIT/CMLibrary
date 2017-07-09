package com.chenming.io;

import java.util.List;

public interface ITxtIo {
	//读取文件
	public abstract List<String> readByLine(String filename); 
	//读取文件   过滤出contains子串    isAnd 表示and还是or
	public abstract List<String> readByLineWithContains(String filename, String[]contains, boolean isAnd);
	//读取文件   过滤出contains子串    isAnd 表示and还是or 存入新文件
	public abstract void readByLineWithContains(String filename, String outfilename, String[]contains, boolean isAnd);
}
