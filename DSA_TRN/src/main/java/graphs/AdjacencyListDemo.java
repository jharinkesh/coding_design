package graphs;

import java.util.LinkedList;

public class AdjacencyListDemo {

  public static void main(String[] args) {
    AdjacencyList ls = new AdjacencyList(4);
    ls.add(0, 1);
    ls.add(0, 2);
    ls.add(1, 2);
    ls.add(2, 3);
    ls.disp();

    ls.remove(2, 3);
    ls.disp();
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

}
