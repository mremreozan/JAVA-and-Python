package merhaba011BFS2;

public class DFS {
	public static void dolasım(node dugum)
	{
		if (dugum == null)
			return;
		System.out.println(dugum.data);
		dolasım(dugum.left);
		dolasım(dugum.right);
	}
}
