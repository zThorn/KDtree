
public class KDtree 
{
	
	public static void main(String[] args)
	{
		System.out.println("This is an example of a KDtree");
		Node root = new Node(50,40,(Node)null);
		
		
		insert(root,new Node(40,70,root),false);
		insert(root,new Node(80,20,root),false);
		insert(root,new Node(90,10,root),false);
		insert(root,new Node(60,30,root),false);
	}
	
	public static void insert(Node root, Node insert, boolean checkY)
	{	
		
		if(checkY==false && insert.x<root.x && root.leftNode!=null)
			insert(root.leftNode,insert,true);
		else if(checkY==false && root.leftNode == null)
				{
					root.leftNode=insert;
					System.out.println("Inserted "+insert.x+","+insert.y+" to the left of "+root.x+","+root.y);
					return;
				}
				
		if(checkY==false && insert.x>root.x && root.rightNode != null)
			insert(root.rightNode,insert,true);
		else if(checkY==false && root.rightNode == null)
		{
				root.rightNode=insert;
				System.out.println("Inserted "+insert.x+","+insert.y+" to the right of "+root.x+","+root.y);
				return;
		}
		
		
		//Handles the y checking
		if(checkY==true && insert.y<root.y && root.leftNode!=null)
			insert(root.leftNode,insert,false);
		else if(checkY==true && root.leftNode == null)
		{
				root.leftNode=insert;
				System.out.println("Inserted "+insert.x+","+insert.y+" to the left of "+root.x+","+root.y);
				return;
		}
		
		if(checkY==true && insert.y>root.y && root.rightNode!=null)
			insert(root.rightNode,insert,false);
		else if(checkY==true && root.rightNode == null)
		{
				root.rightNode=insert;
				System.out.println("Inserted "+insert.x+","+insert.y+" to the right of "+root.x+","+root.y);
				return;
		}
			
	}
}
