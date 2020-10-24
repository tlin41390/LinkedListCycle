import java.util.*;

public class LinkedListCycle<T> 
{
    class ListNode
    {
        T value;
        ListNode next;
        ListNode tail;

        ListNode (T value)
        {
            this.value = value;
            next = null;
        }
    }

    public int hasCycle(ListNode head)
    {
        ListNode curr = head;
        List<ListNode> mappedValue = new ArrayList<ListNode>();
        while (curr!=null)
        {
            if(mappedValue.contains(curr))
            {
                return mappedValue.indexOf(curr);
            }
            else{
                mappedValue.add(curr);
            }
            curr = curr.next;
        }
        return -1;
    }
}
