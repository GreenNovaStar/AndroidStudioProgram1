package anxiety.socialhelp;

public class World
{
    int gravity;
    int scoreCounter;
    int maxHeight;
    int maxWidth;
    Bird bird;
    PStack st;

    World(int height, int width)
    {
        bird= new Bird();
        scoreCounter= 0;
        maxHeight= height;
        maxWidth= width;
        st= new PStack();
    }

}
