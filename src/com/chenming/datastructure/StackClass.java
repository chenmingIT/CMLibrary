package com.chenming.datastructure;
/*
 * 链式结构实现栈
 */

import java.util.LinkedList;

public class StackClass {
	LinkedList<Integer> list ;
	public StackClass(){
		list = new LinkedList<>() ;
	}
	//出栈
	public int pop(){
		return list.removeLast() ;
	}
	//入栈
	public void push(int e){
		list.add(e) ;
	}
	//访问栈顶元素
	public int getTop(){
		return list.getLast() ;
	}
	//判断栈是否为空
	public boolean isEmpty(){
		return list.size()==0 ;
	}
	//栈大小
	public int size(){
		return list.size() ;
	}
}
