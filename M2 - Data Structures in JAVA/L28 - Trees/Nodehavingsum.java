/*
Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. 
In the sum, data of node itself and data of immediate children is to be taken.

Input format :
Line 1 : Elements in level order form separated by space (as per done in class). Order is -
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
Output format : Node with maximum sum.

Sample Input 1 :
5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
Sample Output 1 :
1
*/

package Generic;

public class Nodehavingsum {
	public static TreeNode<Integer> ans;
	public static int max=0;
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		if(root.children.size()==0){
            return root;
        }
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
        }
        if(sum>max){
            max=sum;
            ans=root;
        }
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> temp=maxSumNode(root.children.get(i));
            if(temp.data>max){
                max=temp.data;
                ans=root.children.get(i);
            }
        }
        return ans;
	}
}