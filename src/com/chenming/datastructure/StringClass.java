package com.chenming.datastructure;

import java.util.Arrays;

public class StringClass {
	public static void main(String []args){
		String string = "chenming" ; 
		System.out.print("ת��char���飺");
		//ת��char����
		char []ch = string.toCharArray() ;
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
		System.out.print("\n"+"��������");
		//��������
		int[] data = {12,34,2,56,23,90,4} ;
		Arrays.sort(data);
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
		//����ת�ַ���
		System.out.print("\n"+"����ת�ַ�����");
		String dataStr = Arrays.toString(data);
		System.out.print(dataStr);
		//���ĳ�����������ַ� 
		System.out.print("\n"+"���ĳ�����������ַ� ��");
		System.out.print(string.charAt(2));
		//������ַ���
		System.out.print("\n"+"������ַ��� ��");
		System.out.print( string.substring(2, 4));
		//�ַ���ת����
		String intData = "123" ;
		System.out.print("\n"+"�ַ���ת���� ��");
		System.out.print( Integer.valueOf(intData));
	}
}







