package com.chenming.io;

import java.util.List;

public interface ITxtIo {
	//��ȡ�ļ�
	public abstract List<String> readByLine(String filename); 
	//��ȡ�ļ�   ���˳�contains�Ӵ�    isAnd ��ʾand����or
	public abstract List<String> readByLineWithContains(String filename, String[]contains, boolean isAnd);
	//��ȡ�ļ�   ���˳�contains�Ӵ�    isAnd ��ʾand����or �������ļ�
	public abstract void readByLineWithContains(String filename, String outfilename, String[]contains, boolean isAnd);
}
