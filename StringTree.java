//*********************************************************************************************************************************//
//StringTree.java 				Author: Debra Ragland 				CPSC50100													   //
//																																   //
//Class containing methods to be used in Tree.java 																				   //
//*********************************************************************************************************************************//

public class StringTree {

	Node rootNode;
	//call the node class.
	
	public void addString(String str) 
	{
		rootNode = addStringPlus(str, rootNode);
	} //addString method accepts string and uses  addStringPlus method to place the string in the correct part of the tree.
	
	public void printTree() 
	{
		System.out.println("The components of the tree in alphabetical order are: ");
		
		printTreePlus(rootNode);
	}//method to print the output tree in alphabetical order, calls on printTreePlus
	
	private Node addStringPlus(String str, Node present) // recursive method called by addString
	{
		Node brief = new Node(str); //make new node
		
		if(present == null)
			present = brief;
		else if(str.compareTo(present.value) < 0) //if the node is not null, then compare it to current string,  if not, put the new
			present.left = addStringPlus(str, present.left); //if it's less, put the new node to the left,
		else present.right = addStringPlus(str, present.right); //if it's not, put it to the right
		
		return present;
	}
	
	private void printTreePlus(Node present) // recursive method to called by printTree
	{
		if(present != null) 
		{
			printTreePlus(present.left); //again, if the current node is not null, print the left child/leaf
			System.out.println(present.value);//print the current node
			printTreePlus(present.right);//then print the right child/leaf
		}
	}

}
