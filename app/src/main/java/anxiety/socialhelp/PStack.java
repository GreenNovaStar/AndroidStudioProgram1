package anxiety.socialhelp;

public class PStack
{
    LinkedList top;

    PStack()
    {
        top= new LinkedList();
    }

    void push(Pipe p)
    {
        top.insert(p);
    }

    Pipe pop()
    {
        Pipe temp= top.remove().p;
        return temp;
    }


}
