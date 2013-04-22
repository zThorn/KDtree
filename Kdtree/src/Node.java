
public class Node 
{
	Node leftNode,rightNode, root;
	int x,y;
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public Node getLeftNode(){ return leftNode;}
	public Node getRightNode(){ return rightNode;}
	public Node getRootNode(){ return root; }
	
	public Node(int x, int y, Node root)
	{
		this.x=x;
		this.y=y;
		this.root=root;
		this.leftNode=null;
		this.rightNode=null;
	}

	
	

}
