package graphs;

import java.util.LinkedList;

public class WeightedAdjListDemo {
    public static void main(String[] args) {
	WeightedAdjList list = new WeightedAdjList(5);
	list.add(0, 2, 1);
	list.add(1, 3, 2);
	list.add(1, 1, 3);
	list.add(2, 1, 3);
	list.add(2, 2, 4);
	list.add(3, 5, 4);

	list.disp();
    }
}

class WeightedAdjList {
    final int SIZE;
    final LinkedList<Node>[] list;

    WeightedAdjList(int size) {
	this.SIZE = size;
	list = new LinkedList[SIZE];
	for (int i = 0; i < SIZE; i++) {
	    list[i] = new LinkedList<Node>();
	}
    }

    void add(int source, int cost, int dest) {
	list[source].add(new Node(dest, cost));
    }

    void disp() {
	for (int i = 0; i < SIZE; i++) {
	    System.out.println(i + ": " + list[i].toString());
	}
    }

}

class Node {
    int label;
    int cost;

    public Node(int label, int cost) {
	super();
	this.label = label;
	this.cost = cost;
    }

    @Override
    public String toString() {
	return "  --" + cost + "--> {" + label + "} ";
    }

}
