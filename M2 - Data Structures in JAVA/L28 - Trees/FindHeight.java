/*
Given a generic tree, find and return the height of given tree.

Input Format:
The first line of input contains data of the nodes of the tree in level order form. The order is: 
data for root node, number of children to root node, data of each of child nodes and so on and so 
forth for each node. The data of the nodes of the tree is separated by space.  
Output Format :
The first and only line of output prints the height of the given generic tree.

Constraints:
Time Limit: 1 sec
Sample Input 1:
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1:
3
*/

package Generic;
import java.util.*;

public class FindHeight {
	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
// int height = 0;
//     if (root == null )
//     {
//     return height;
//     }
        
//     if (root.children == null)
//     {
//     return 1;
//     }
        
//    for (TreeNode<Integer> child : root.children) 
//    {
//     height = Math.max(height,height(child));
//   	}
//    return height + 1;
        if(root == null) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < root.children.size(); i++) {
            int childSize = getHeight(root.children.get(i));
            if(childSize > count) {
                count = childSize;
            }
        }
        return count+1;
        
        
        
    }

}