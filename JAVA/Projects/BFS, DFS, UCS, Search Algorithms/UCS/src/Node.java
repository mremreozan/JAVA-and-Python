

public class Node {

	public final String value; // node un isim deðiþkeni
    public double pathCost;    // baþlangç noktasýndan o node a gelene kadar oluþan pathcost
	public Edge[] adjacencies; // node un komþularý - sonra bu adjacencies leri 2 deðiþkenli (target ve cost) bir sýnýf olarak düðüme baðlýyoruz.
    public Node parent;        // node un atalarý

    public Node(String val){

        value = val;

    }

    public String toString(){
        return value;
    }
}
