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
		rootNode = addStringRecursive(str, rootNode);
	} //addString method accepts string and uses  addStringPlus method to place the string in the correct part of the tree.
	
	public void printTree() 
	{
		System.out.println("The components of the tree in alphabetical order are: ");
		
		printTreeRecursive(rootNode);
	}//method to print the output tree in alphabetical order, calls on printTreePlus
	
	private Node addStringRecursive(String str, Node present) // recursive method called by addString
	{
		Node brief = new Node(str); //make new node
		
		if(present == null)
			present = brief;
		else if(str.compareTo(present.value) < 0) //if the node is not null, then compare it to current string,  if not, put the new
			present.left = addStringRecursive(str, present.left); //if it's less, put the new node to the left,
		else present.right = addStringRecursive(str, present.right); //if it's not, put it to the right
		
		return present;
	}
	
	private void printTreeRecursive(Node present) // recursive method to called by printTree
	{
		if(present != null) 
		{
			printTreeRecursive(present.left); //again, if the current node is not null, print the left child/leaf
			System.out.println(present.value);//print the current node
			printTreeRecursive(present.right);//then print the right child/leaf
		}
	}

}
