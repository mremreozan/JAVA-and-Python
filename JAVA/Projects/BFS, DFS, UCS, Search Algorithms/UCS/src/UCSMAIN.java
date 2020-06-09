

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UCSMAIN {

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
        
        //düðümlerin sýnýrlarýný tanýmlýyorum.
        n1.adjacencies = new Edge[]{
            new Edge(n2,3),
            new Edge(n3,40)
        };
        n2.adjacencies = new Edge[]{
            new Edge(n1,3),
        	new Edge(n4,2),
            new Edge(n5,33)
        };
        n3.adjacencies = new Edge[]{
        	new Edge(n1,40),
        	new Edge(n6,44),
            new Edge(n7,15)
        };
        n4.adjacencies = new Edge[]{
            new Edge(n2,2),
            new Edge(n8,22),
            new Edge(n9,4)
        };
        n5.adjacencies = new Edge[]{
            new Edge(n2,33),
            new Edge(n9,2),
            new Edge(n10,1)
        };
        n6.adjacencies = new Edge[]{
            new Edge(n3,44),
            new Edge(n10,2),
            new Edge(n11,3)
        };
        n7.adjacencies = new Edge[]{
	            new Edge(n3,15),
	            new Edge(n11,2),
	            new Edge(n12,1)
	    };
        n8.adjacencies = new Edge[]{
	            new Edge(n4,22)
	    };
        n9.adjacencies = new Edge[]{
	            new Edge(n4,4),
	            new Edge(n5,2)
	    };
        n10.adjacencies = new Edge[]{
	            new Edge(n5,1),
	            new Edge(n6,2)
	    };
        n11.adjacencies = new Edge[]{
	            new Edge(n6,3),
	            new Edge(n7,2)
	    };
        n12.adjacencies = new Edge[]{
	            new Edge(n7,1)
	    };
        
        YOL(n1,n12);              // baþlangýç ve bitiþ node larýný buraya yazýyoruz.
        ArrayList<Node> GUZERGAH  = printPath(n12);   // YOL fonksiyonu ile elde ettiðimiz myQ liste sinin NODE larýný printhpath fonksiyonuna tanýtacaðýz ve sonra yazdracaðýz.
        System.out.println("Güzergah: " + GUZERGAH);
	}
	
	public static void YOL (Node source, Node goal){
		source.pathCost=0;

		PriorityQueue<Node> myQ = new PriorityQueue<Node>(12, costComparator);
		
		myQ.add(source);
		
		Set<Node> explored = new HashSet<Node>(); // HashSet sýra falan gözetmez kimi görürse kümenin içine alýr, explored listesini böyle tanýmlarýz.
        
		@SuppressWarnings("unused")
		boolean found = false;
        //while frontier is not empty
        do{
            Node current = myQ.poll();  // myQ baðlý listesinden poll edeceðimiz elemaný node tipindeki current a eþitleriz.
            explored.add(current);      // her current düðümünü explored kümesine ekleriz.

            if(current.value.equals(goal.value)){   //current düðümü, aradýðýmýz goal düðüm ise found u true yap. olayý bitir. deðilse devam.
                found = true;						
            }

            for(Edge e: current.adjacencies){      // current node unun komþularýný çýkar.
                Node child = e.target;             // komþu node u edge class ýndaki target yap. target node a child deðiþkenini eþitle.
                double cost = e.cost;			  	
                child.pathCost = current.pathCost + cost; 

            if(!explored.contains(child) && !myQ.contains(child)){ // eðer child explored da veya myQ da yoksa
            	
                child.parent = current;          // Listenin parent larýný burada belirliyoruz, daha sonra printhpath de kullanýcaz.
                myQ.add(child);
            }

            else if((myQ.contains(child))&&(child.pathCost>current.pathCost)){

                child.parent=current;           // Listenin parent larýný burada belirliyoruz, daha sonra printhpath de kullanýcaz.
            }
        }           
	}
	while(!myQ.isEmpty()); 
	}
	
	public static Comparator<Node> costComparator = new Comparator<Node>(){
		public int compare(Node c1, Node c2) {
            if(c1.pathCost > c2.pathCost){
                return 1;
            }
            else if (c1.pathCost < c2.pathCost){
                return -1;
            }
            else{
                return 0;
            }
		}
	};
	public static ArrayList<Node> printPath(Node target){
		ArrayList<Node> path = new ArrayList<Node>();
		for(Node node = target; node!=null; node = node.parent){
			path.add(node);        
		}
		Collections.reverse(path);
		return path; 

	}
}
