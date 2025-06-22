package recursvidade;

public class treeNosFolhas {

	public static void main(String[] args) {

		Node node6 = new Node(20, null, null);
		Node node5 = new Node(7, null, null);
		Node node4 = new Node(2, null, null);
		Node node3 = new Node(15,null,node6);
		Node node2 = new Node(5,node4,node5);
		Node node = new Node(10, node2, node3);
		System.out.println(nosFolhas(node));
	}
	
	public static int nosFolhas(Node node) {
		if(node == null) return 0;
		int count = node.esquerda == null && node.direita == null? 1: 0;
		return count + nosFolhas(node.esquerda) + nosFolhas(node.direita);
	}
}
