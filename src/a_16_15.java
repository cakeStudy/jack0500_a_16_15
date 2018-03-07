import java.util.ArrayList;

public class a_16_15
{
    /* Write a method called notEquals that accepts a second list as a parameter, returns true if the two lists are not
    equal, and returns false otherwise. Two lists are considered unequal if they store the different values in any random
    order and do not have the same length.*/

    //initiate standard variables
    private ListNode front;

    //too test the method
    public void run()
    {
        //I have made an add-method to ListNode
        addNodeToList(0,1);
        addNodeToList(1,8);
        addNodeToList(2,19);
        addNodeToList(3,4);
        addNodeToList(4,17);

        //I have made a print list data method
        System.out.println(notEquals(front));
        printList();
    }

    //checks if the two list are not equals
    public boolean notEquals(ListNode secFront)
    {
        //initiate variables
        boolean notEquals = false;
        ListNode curSecFront = secFront;

        //the for-loop checks if both list data or length is not equals with if-statements.
        for (ListNode current = front; current != null; current = current.next)
        {
            if (curSecFront.next != null && current.next == null)
            {
                notEquals = true;
            }
            if (curSecFront.data != current.data)
            {
                notEquals = true;
            }
            curSecFront = curSecFront.next;
        }
        return notEquals;
    }

    //an add-method to ListNode that adds a value to the list
    public void addNodeToList(int index, int value)
    {
        //if index is 0, then add value to front
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        // else add a value to the end of list
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }

    //prints the list
    public void printList()
    {
        //the for-loop that prints the list data out
        System.out.print("[ ");
        for (ListNode current = front; current != null; current = current.next)
        {
            System.out.print(current.data + ", ");
        }
        System.out.println("]" + "\n");
    }
}
