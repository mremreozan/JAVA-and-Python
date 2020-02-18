package merhaba023denemepriorit_ve_comparator;

import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class UCS {
	
	public static void main(String[] args) {

		Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        Node n7 = new Node("G");
        Node n8 = new Node("H");
        Node n9 = new Node("I");
        Node n10 = new Node("J");
        Node n11 = new Node("K");
        Node n12 = new Node("L");
        Node n13 = new Node("M");
        Node n14 = new Node("N");
        Node n15 = new Node("O");
        Node n16 = new Node("P");
        Node n17 = new Node("R");
        Node n18 = new Node("S");
        Node n19 = new Node("T");
        Node n20 = new Node("U");
        Node n21 = new Node("V");
        Node n22 = new Node("Y");

        //initialize the edges
        n1.adjacencies = new Edge[]{
            new Edge(n2,3),
            new Edge(n3,40)
        };
        n2.adjacencies = new Edge[]{
            new Edge(n1,3),
        	new Edge(n4,2),
            new Edge(n5,3)
        };
        n3.adjacencies = new Edge[]{
        	new Edge(n1,40),
        	new Edge(n6,4),
            new Edge(n7,15)
        };
        n4.adjacencies = new Edge[]{
            new Edge(n2,2),
            new Edge(n8,2),
            new Edge(n9,4)
        };
        n5.adjacencies = new Edge[]{
            new Edge(n2,3),
            new Edge(n9,20),
            new Edge(n10,1)
        };
        n6.adjacencies = new Edge[]{
            new Edge(n3,4),
            new Edge(n10,2),
            new Edge(n11,3)
        };
        n7.adjacencies = new Edge[]{
	            new Edge(n3,15),
	            new Edge(n11,2),
	            new Edge(n12,1)
	    };
        n8.adjacencies = new Edge[]{
	            new Edge(n4,2),
	            new Edge(n13,25)
	    };
        n9.adjacencies = new Edge[]{
	            new Edge(n4,4),
	            new Edge(n5,20),
	            new Edge(n13,12),
	            new Edge(n14,1)
	    };
        n10.adjacencies = new Edge[]{
	            new Edge(n5,1),
	            new Edge(n6,2),
	            new Edge(n14,5),
	            new Edge(n15,8)
	    };
        n11.adjacencies = new Edge[]{
	            new Edge(n6,3),
	            new Edge(n7,2),
	            new Edge(n15,15),
	            new Edge(n16,10)
	    };
        n12.adjacencies = new Edge[]{
	            new Edge(n7,1),
	            new Edge(n16,10)
	    };
        n13.adjacencies = new Edge[]{
	            new Edge(n8,25),
	            new Edge(n9,12),
	            new Edge(n17,5)
	    };
        n14.adjacencies = new Edge[]{
	            new Edge(n9,1),
	            new Edge(n10,5),
	            new Edge(n17,4),
	            new Edge(n18,3)
	    };
        n15.adjacencies = new Edge[]{
	            new Edge(n10,8),
	            new Edge(n11,10),
	            new Edge(n18,2),
	            new Edge(n19,1)
	    };
        n16.adjacencies = new Edge[]{
	            new Edge(n11,15),
	            new Edge(n12,10),
	            new Edge(n19,4)
	    };
        n17.adjacencies = new Edge[]{
	            new Edge(n13,5),
	            new Edge(n14,4),
	            new Edge(n20,35)
	    };
        n18.adjacencies = new Edge[]{
	            new Edge(n14,3),
	            new Edge(n15,2),
	            new Edge(n20,15),
	            new Edge(n21,3)
        };
        n19.adjacencies = new Edge[]{
	            new Edge(n15,1),
	            new Edge(n16,4),
	            new Edge(n21,10)
	    };
        n20.adjacencies = new Edge[]{
	            new Edge(n17,35),
	            new Edge(n18,15),
	            new Edge(n22,1)
	    };
        n21.adjacencies = new Edge[]{
	            new Edge(n18,3),
	            new Edge(n19,10),
	            new Edge(n22,2)
	    };
        n22.adjacencies = new Edge[]{
	            new Edge(n20,1),
	            new Edge(n21,2)
	    };

        astar(n1,n22);
        List<Node> path = printPath(n22);
        System.out.println("Path: " + path);      
}

	public static void astar(Node source, Node goal){
		source.pathCost = 0;
		Queue<Node> sýra = new PriorityQueue<Node>(costdegeri);
		sýra.add(source);
		Set<Node> explored = new HashSet<Node>();

		@SuppressWarnings("unused")
		boolean found = false;

	    do{
	       Node current = sýra.poll();
	       explored.add(current);

	       if(current.value.equals(goal.value)){
	            found = true;
	       }

	       for(Edge e: current.adjacencies){
	    	   Node child = e.target;
	           double cost = e.cost;
	           child.pathCost = current.pathCost + cost;

	           if(!explored.contains(child) && !sýra.contains(child)){
	           child.parent = current;
	           sýra.add(child);
	           }
	           else if((sýra.contains(child))&&(child.pathCost>current.pathCost)){
	           child.parent=current;
               current = child;
	           }
	       }
	    }
	    while(!sýra.isEmpty());
	}
          
    public static Comparator<Node> costdegeri = new Comparator<Node>(){
			
   		@Override
   		public int compare(Node dügüm1, Node dügüm2) { 
   			return dügüm1.pathCost > dügüm2.pathCost ? 1 : -1; 
   		}
   	};

   	public static List<Node> printPath(Node target){ 
   		List<Node> path = new ArrayList<Node>();  
   		for(Node node = target; node!=null; node = node.parent){ 
   			path.add(node); 
   		}	
    Collections.reverse(path);

    return path;
   	}
}