/*
Given a tree and an integer x, find and return number of Nodes which are greater than x.

Input format :
Single Line : First Integer denotes x and rest of the elements in level order form separated by space. 
Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Count of nodes greater than x

Sample Input 1 :
35 10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
3
Sample Input 2 :
10 10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 2:
5
*/

package Generic;
import java.util.*;

public class Numberofnodes {
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here	
        if(root==null)
            return 0;
		// Write your code here		
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        //added 1st level here 
        queue.add(root);
        queue.add(null);
		int ans=0;
        
        // if(x<root.data)
        //     ans++;
        
        while(!queue.isEmpty())
        {
            TreeNode<Integer> frontNode = queue.remove();
            if(frontNode == null){
                if(queue.isEmpty()){
                    break;
                }
                
                queue.add(null);
            }else{
               			 if(x<frontNode.data)
           			 		ans++;
                //System.out.print(frontNode.data+" ");
                for(int i=0;i<frontNode.children.size();i++){
                    queue.add(frontNode.children.get(i));
                }
            }
            
        }
        
        return ans;


	}
}