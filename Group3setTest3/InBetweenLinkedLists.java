package Group3setTest3;


import java.util.*;
public class InBetweenLinkedLists {
    
   // public class Solution {
        public static LinkedListNode<Integer> mergeInBetween(LinkedListNode<Integer> list1, int a, int b, LinkedListNode<Integer> list2) {
            // Find the node before the ath node
            LinkedListNode<Integer> prev = list1;
            for (int i = 0; i < a - 1; i++) {
                prev = prev.next;
            }
            
            // Find the node after the bth node
            LinkedListNode<Integer> curr = prev.next;
            for (int i = 0; i < b - a + 1; i++) {
                curr = curr.next;
            }
            
            // Connect the node before ath node to the head of list2
            prev.next = list2;
            
            // Find the tail of list2
            while (list2.next != null) {
                list2 = list2.next;
            }
            
            // Connect the tail of list2 to the node after bth node
            list2.next = curr;
            
            return list1;
        }
    }

