package recursvidade;

public class countTreeNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node3 = new Node(2, null, null);
		Node node4 = new Node(7, null, null);
		Node node2 = new Node(5,node3,node4);

		Node node6 = new Node(20, null, null);
		Node node5 = new Node(15,null,node6);
		Node node = new Node(10, node2, node5);
		System.out.println(countTreeNodes(node));
	}
	
	public static int countTreeNodes(Node node) {
		if(node == null) return 0;
		return node.valor + countTreeNodes(node.esquerda) + countTreeNodes(node.direita);
	}

}

class Node {
    int valor;
    Node esquerda;
    Node direita;

    Node(int valor, Node esquerda, Node direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }
}

