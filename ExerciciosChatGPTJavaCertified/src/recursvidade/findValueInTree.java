package recursvidade;

public class findValueInTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node6 = new Node(20, null, null);
		Node node5 = new Node(7, null, null);
		Node node4 = new Node(2, null, null);
		Node node3 = new Node(15,null,node6);
		Node node2 = new Node(5,node4,node5);
		Node node = new Node(10, node2, node3);
		System.out.println(findValueInTree(node, 40));

	}
	
	public static boolean findValueInTree(Node node, int target) {
		if(node == null) return false;
		boolean contem = node.valor == target;
		return contem || findValueInTree(node.esquerda, target) || findValueInTree(node.direita, target);
	}

}
