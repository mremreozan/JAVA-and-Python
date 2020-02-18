package merhaba023denemepriorit_ve_comparator;

public class Edge {

	public final double cost;
    public final Node target;

    public Edge(Node targetNode, double costVal){
        cost = costVal;
        target = targetNode;
    }
}
