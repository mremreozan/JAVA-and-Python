package merhaba011BFS2;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public static void dolasým(node dugum)
	{
		Queue<node> q =new LinkedList<node>();
		
		q.add(dugum);
		while(!q.isEmpty())
		{
			dugum = q.remove();
			
			System.out.println(dugum.data +" ");
			
			if (dugum.left != null)
				q.add(dugum.left);
			
			if(dugum.right != null)
				q.add(dugum.right);			
		}
		
	}

}
