package anxiety.socialhelp;

public class Node
{
    Pipe p;
    Node link;

    Node()
    {
        p= new Pipe();
        link= null;
    }

    Node(Pipe temp)
    {
        p= temp;
        link= null;
    }
}
