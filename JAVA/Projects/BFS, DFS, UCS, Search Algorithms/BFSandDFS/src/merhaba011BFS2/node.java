package merhaba011BFS2;

public class node {
	
	node left;
	node right;
	String data;
	
	public node(String data) {
		this.data = data;	
	}

	public node(String data, node left, node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
