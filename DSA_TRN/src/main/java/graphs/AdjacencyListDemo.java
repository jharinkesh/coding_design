package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyListDemo {

  public static void main(String[] args) {
    AdjacencyList ls = new AdjacencyList(5);
//    ls.add(0, 1);
//    ls.add(0, 2);
//    ls.add(1, 2);
//    ls.add(2, 3);
//    ls.disp();
//
//    ls.remove(2, 3);
//    ls.disp();
    
    ls.add(0,1);
    ls.add(0,2);
    ls.add(0,4);
    ls.add(3, 4);
    
    ls.disp();
    ls.bfs(0);
    
  }
}

class AdjacencyList {
  final int n;
  final LinkedList<Integer>[] list;

  AdjacencyList(int n) {
    this.n = n;
    list = new LinkedList[n];
    for (int i = 0; i < list.length; i++) {
      list[i] = new LinkedList<Integer>();
    }
  }

  public void add(int u, int v) {
    list[u].add(v);
    list[v].add(u);
  }

  public void remove(Integer u, Integer v) {
    list[u].remove(v);
    list[v].remove(u);
  }

  public void disp() {
    for (int i = 0; i < n; i++) {
      System.out.println(i + " : " + list[i]);
    }
  }
  
  public void bfs(int startNode) {
	  boolean visited[] = new boolean[n];
	  Queue<Integer> q = new LinkedList<Integer>();
	  q.add(startNode);
	  visited[startNode] = true;
	  while(!q.isEmpty()) {
		  int v = q.poll();
		  System.out.println(v);
		  for(int u:list[v]) {
			  if(!visited[u]) {
				  q.add(u);
				  visited[u] = true;
			  }
		  }
	  }
  }

}
