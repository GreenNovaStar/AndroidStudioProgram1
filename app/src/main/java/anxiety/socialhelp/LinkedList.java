package anxiety.socialhelp;

public class LinkedList
{
    Node head;

    LinkedList()
    {
        head= null;
    }

    LinkedList(Pipe i)
    {
        head= new Node(i);
    }

    void insert(Node temp)
    {
        temp.link= this.head;
        head= temp;
    }

    void insert(Pipe i)
    {
        Node temp= new Node(i);
        insert(temp);
    }

    Node remove()
    {
        Node temp= head;
        if(head == null)
            return null;
        else
            head= head.link;

        return temp;
    }

    public String toString()
    {
        String s= "";
        Node temp= head;
        if(temp == null)
            return null;

        while(temp != null)
        {
            s= s + " " + temp.toString();
            temp= temp.link;
        }
        return s;
    }
}
