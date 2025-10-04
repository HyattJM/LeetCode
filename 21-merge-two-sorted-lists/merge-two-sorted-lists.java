class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. Create a dummy node to act as a placeholder.
        ListNode dummy = new ListNode(-1);
        // 'current' will be used to build the new list.
        ListNode current = dummy;

        // 2. Loop as long as both lists have nodes.
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                // If list1's node is smaller, attach it.
                current.next = list1;
                // Move the list1 pointer forward.
                list1 = list1.next;
            } else {
                // Otherwise, attach list2's node.
                current.next = list2;
                // Move the list2 pointer forward.
                list2 = list2.next;
            }
            // Move the 'current' pointer to the node we just added.
            current = current.next;
        }

        // 3. Attach the remaining nodes from either list1 or list2.
        // At this point, one of the lists is exhausted, and the other has the rest.
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // 4. The merged list starts after the dummy node.
        return dummy.next;
    }
}