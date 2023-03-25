/*
Given a large number represented in the form of a linked list. Write code to increment the number by 1 
in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.

Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements 

Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 
*/

package Generic;

public class NextNumber {
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> last = null;
        LinkedListNode<Integer> cur = head;

        // Iterate till the last node
        while (cur.next != null) {
            if (cur.data != 9) {
                last = cur;
            }
            cur = cur.next;
        }

        // If last node is not equal to 9
        // add 1 to it and return the head
        if (cur.data != 9) {
            cur.data++;
            return head;
        }

        // If list is of the type 9 . 9 . 9 ...
        if (last == null) {
            last = new LinkedListNode<>(0);
            last.next = head;
            head = last;
        }

        // For cases when the rightmost node which
        // is not equal to 9 is not the last
        // node in the linked list
        last.data++;
        last = last.next;

        while (last != null) {
            last.data = 0;
            last = last.next;
        }
        return head;
    }
}