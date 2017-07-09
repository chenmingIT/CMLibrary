package com.chenming.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.omg.PortableInterceptor.IORInterceptor;

/*
 * ͼ�㷨
 * ע�⣺�����ڵ�û�������Ļ����Ѳ����� ���Կ���һ��ʼ����һ�� �����ļ�������ÿ��initVisitd��ʱ��ֱ�Ӹ�ֵtrue
 */
public class GraphClass {
	private int [][] racs ; //�ڽӾ���
	private String [] infos ;  //ÿ���ڵ����Ϣ
	private int num ;  //�ڵ�ĸ���
	private boolean []visited ; //�洢�Ƿ����
	private int [] currDist ; //���·���㷨��������¼ÿ���ڵ�ĵ�ǰ·������
	
	public GraphClass(int [][]racs,String []infos){
		this.racs = racs ;
		this.infos = infos ;
		num = infos.length ;
		visited = new boolean[num] ;
		initVisited(); 
	}
	private void initVisited(){
		for(int i=0;i<num;i++)
			visited[i] = false ;  //δ������
	}
	//Ѱ�ҵ�һ��δ���ʵĽڵ�
	private int findNotVisited() {
		for(int i=0;i<num;i++){
			if(visited[i]==false)
				return i ;
		}
		return -1 ; 
	}
	//����������� Breadth-First-Search
	//���ر���֮��Ķ��е�˳��
	//��Ҫ����һ������
	public Queue<String> BFS(){
		initVisited(); 
		Queue<Integer> temps = new LinkedList<>() ; //��ʱ����
		Queue<String> results = new LinkedList<>() ;  //��Ž��
		int now = findNotVisited() ;
		while(now!=-1){
			visited[now] = true ;
			results.offer(infos[now]) ;  //offer ����������쳣��add
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
	//�����������  Depth-First-Search
	//���ر���֮��Ķ��е�˳��
	//�ݹ�
	public Queue<String> DFS(){
		initVisited();
		Queue<String> results = new LinkedList<>() ;  //��Ž��
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









