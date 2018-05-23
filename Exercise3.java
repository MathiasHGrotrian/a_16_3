package Chapter16;

public class Exercise3
{

    /*
    Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
otherwise. An empty list is considered to be sorted.
     */

    public static ListNode front;

    public static void main(String[] args)
    {

        addNodeToList(0,9);
        addNodeToList(1,1);
        addNodeToList(2,9);
        addNodeToList(3,3);


        System.out.println(isSorted());
    }

    private static boolean isSorted()
    {
        boolean isSorted = true;

        for (ListNode current = front; current != null; current = current.next)
        {
            if(current.next != null)
            {
                if (current.data > current.next.data)
                {
                    isSorted = false;
                }
            }
        }

        return isSorted;
    }

    private static void addNodeToList(int index, int value)
    {
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1 ; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
