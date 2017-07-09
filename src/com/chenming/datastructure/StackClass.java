package com.chenming.datastructure;
/*
 * ��ʽ�ṹʵ��ջ
 */

import java.util.LinkedList;

public class StackClass {
	LinkedList<Integer> list ;
	public StackClass(){
		list = new LinkedList<>() ;
	}
	//��ջ
	public int pop(){
		return list.removeLast() ;
	}
	//��ջ
	public void push(int e){
		list.add(e) ;
	}
	//����ջ��Ԫ��
	public int getTop(){
		return list.getLast() ;
	}
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return list.size()==0 ;
	}
	//ջ��С
	public int size(){
		return list.size() ;
	}
}
