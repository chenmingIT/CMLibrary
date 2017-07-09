package com.chenming.algorithm;
/*
 * 斐波那契数列的两种实现：
 * 1、递归
 * 2、递推
 * f(0)=0  f(1)=1  f(n)=f(n-1)+f(n-2)
 */
public class Fibonacci {
	
	//1、递归方法
	//分析：有冗余计算问题
	public static int fibonacci1(int n){
		if(n==0) return 0 ;
		if(n==1) return 1 ;
		return fibonacci1(n-1)+fibonacci1(n-2) ;
	}
	//2、递推
	//分析：解决冗余计算问题
	public static int fibonacci2(int n){
		if(n==0) return 0 ;
		if(n==1) return 1 ;
		int x = 0 ;  //f(0)
		int y = 1 ;  //f(1)
		int z = 0 ;
		for(int i=2;i<=n;i++){
			z = x+y ;
			x = y ; 
			y = z ;
		}
		return z ;
	}
}
