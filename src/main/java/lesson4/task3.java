package lesson4;

// разворот однонаправленного списка
public class task3 {
    public ListNode reverseList(ListNode head) {
        ListNode pred = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = pred;
            pred = current;
            current = temp;
        }
        return pred;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

