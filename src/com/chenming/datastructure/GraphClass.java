package com.chenming.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.omg.PortableInterceptor.IORInterceptor;

/*
 * 图算法
 * 注意：单独节点没有人连的话是搜不到的 可以考虑一开始遍历一遍 单独的记下来，每次initVisitd的时候直接赋值true
 */
public class GraphClass {
	private int [][] racs ; //邻接矩阵
	private String [] infos ;  //每个节点的信息
	private int num ;  //节点的个数
	private boolean []visited ; //存储是否访问
	private int [] currDist ; //最短路径算法中用来记录每个节点的当前路径长度
	
	public GraphClass(int [][]racs,String []infos){
		this.racs = racs ;
		this.infos = infos ;
		num = infos.length ;
		visited = new boolean[num] ;
		initVisited(); 
	}
	private void initVisited(){
		for(int i=0;i<num;i++)
			visited[i] = false ;  //未被访问
	}
	//寻找第一个未访问的节点
	private int findNotVisited() {
		for(int i=0;i<num;i++){
			if(visited[i]==false)
				return i ;
		}
		return -1 ; 
	}
	//广度优先搜索 Breadth-First-Search
	//返回遍历之后的队列的顺序
	//需要借助一个队列
	public Queue<String> BFS(){
		initVisited(); 
		Queue<Integer> temps = new LinkedList<>() ; //临时队列
		Queue<String> results = new LinkedList<>() ;  //存放结果
		int now = findNotVisited() ;
		while(now!=-1){
			visited[now] = true ;
			results.offer(infos[now]) ;  //offer 溢出不会抛异常的add
			temps.offer(now) ;
			while(!temps.isEmpty()){
				now = temps.poll() ;
				for(int i=0;i<num;i++){
					if(racs[now][i]!=0 && visited[i]==false){
						visited[i] = true ;
						temps.offer(i) ;
						results.offer(infos[i]) ;
					}
				}
			}
			now = findNotVisited() ;
		}
		return results ;
	}
	//深度优先搜索  Depth-First-Search
	//返回遍历之后的队列的顺序
	//递归
	public Queue<String> DFS(){
		initVisited();
		Queue<String> results = new LinkedList<>() ;  //存放结果
		int now = findNotVisited() ;
		while(now!=-1){
			DFSSearch(now, results);
			now = findNotVisited() ;
		}
		return results ;
	}
	private void DFSSearch(int begin,Queue<String> results){
		visited[begin] = true ;
		results.offer(infos[begin]) ;
		for(int i=0;i<num;i++){
			if(racs[begin][i]==1 && visited[i] == false ){
				DFSSearch(i, results);
			}
		}
	}
}









