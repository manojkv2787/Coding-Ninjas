/*
Given a generic tree, count and return the number of leaf nodes present in the given tree.

Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element.
 
Output Format :
Count of leaf nodes
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
4
*/

package Generic;

public class CountleafNode {
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
        int leaf = 0;
        
    if (root == null )
    {
    return 0;
    }
        
        
    if (root.children.size() == 0)
    {
    return 1;
    }
        

        
   for (TreeNode<Integer> child : root.children) 
   {
    leaf += countLeafNodes(child);
  	}
        
   return leaf ;
        
        
        

	}
}