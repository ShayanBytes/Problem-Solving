// Guided skeleton for Linked List Insertion Sort
// Fill each TODO one by one. Don't jump ahead.

// Definition for singly-linked list node (LeetCode usually provides this outside the class)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode insertionSortList(ListNode head) {
        // STEP 0: Edge cases
        // If the list has 0 or 1 node, it's already sorted.
        // TODO: Write the if-condition that returns early.
        if (head == null || head.next == null) return head;

        // STEP 1: Create a dummy node.
        // Why? It simplifies inserting at the beginning.
        // Dummy's next will always point to the head of the sorted portion.
        // TODO: Create 'dummy' (value can be anything, e.g., 0). Initially dummy.next = null.
        ListNode dummy = new ListNode(0);
        dummy.next=null;
        // STEP 2: We'll iterate through the original list using 'curr'.
        // At each loop, 'curr' is the node we want to insert into the sorted part.
        // TODO: Initialize 'curr' to the origina l head.
        ListNode curr = head;
        // LOOP STRUCTURE (outline)
        while (curr != null) {
        //     2.1 Save next node (nextNode = curr.next) BEFORE changing curr.next
        //     2.2 Find insertion position starting from dummy (use a pointer 'prev')
        //     2.3 While prev.next exists and prev.next.val < curr.val: move prev forward
        //     2.4 Insert curr between prev and prev.next
        //     2.5 Move curr to nextNode
                ListNode nextNode = curr.next;
                break;
        }
        // TODO: Write the while loop header only. Inside, place placeholder comments for each sub-step.

        // STEP 3: Return the start of the sorted list (which dummy.next points to)
        // TODO: Return the correct pointer instead of null.
        return null; // placeholder – replace at STEP 3
    }
}

/*
FILLING ORDER GUIDE (do not skip order):
1. Write the early return for 0/1 node.
2. Create dummy node.
3. Initialize curr.
4. Add while (curr != null) with comments for sub-steps.
5. Implement 2.1 (store nextNode).
6. Implement 2.2 + 2.3 (find spot using prev).
7. Implement 2.4 (do the insertion pointer rewiring).
8. Implement 2.5 (advance curr).
9. Implement final return.

Ask after each step if unsure.
*/