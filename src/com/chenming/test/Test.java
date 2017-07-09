package com.chenming.test;


import java.util.Queue;

import javax.imageio.spi.ServiceRegistry;

import com.chenming.algorithm.Fibonacci;
import com.chenming.datastructure.GraphClass;
import com.chenming.datastructure.StackClass;
import com.chenming.sort.Sort;

public class Test {
	
	//ջ
	public static void main(String[] args) {
		StackClass stackClass = new StackClass() ;
		stackClass.push(3);
		stackClass.push(4);
		stackClass.push(5);
		stackClass.pop() ;
		while(stackClass.size()!=0){
			System.out.print(stackClass.pop()+" ");
		}
	}
	
	/*//쳲���������
	public static void main(String[] args) {
		System.out.println("�ݹ鷽�������"+Fibonacci.fibonacci1(10));
		System.out.println("���Ʒ��������"+Fibonacci.fibonacci2(10));
	}*/
	/*
	 * ͼ
	public static void main(String[] args) {
		int[][] racs = new int[][]{
            {0,1,0,0,0,0,0,0,0},
            {1,0,1,0,1,1,1,0,0},
            {0,1,0,1,1,1,0,0,0},
            {0,0,1,0,0,1,0,1,0},
            {0,1,1,0,0,0,0,0,1},
            {0,1,0,1,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,0},
            {0,0,0,1,0,0,0,0,0},
            {0,0,0,0,1,0,0,0,0}
		};
		String []infos = {"V0","V1","V2","V3","V4","V5","V6","V7","V8"};
		GraphClass graphClass = new GraphClass(racs, infos) ;
		Queue<String> result = graphClass.BFS();
		System.out.println("������������"+result);
		result = graphClass.DFS();
		System.out.println("��ȶ����������"+result);
	}*/
	
}
