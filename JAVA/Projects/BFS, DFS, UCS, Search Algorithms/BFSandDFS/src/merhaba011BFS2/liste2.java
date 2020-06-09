package merhaba011BFS2;

public class liste2 {

	public static void main(String[] args) {
			node tree = sample_tree();
			System.out.println("BFS BASLIYOR");
			BFS.dolasým(tree);
			System.out.println("DFS BASLIYOR");
			DFS.dolasým(tree);

	}

	private static node sample_tree() {
		node root = new node("A",
				new node ("B",
						new node ("D",
								new node ("H"), new node ("I")), 
						new node ("E", 
								new node ("J"), new node ("K"))), 
				new node ("C",
						new node ("F",
								new node ("L"), new node ("M")), 
						new node ("G", 
								new node ("N"), new node ("O"))));
		return root;
	}
}
