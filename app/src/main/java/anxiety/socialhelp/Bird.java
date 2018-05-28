package anxiety.socialhelp;

public class Bird
{
    boolean alive;
    int posX;
    int posY;


    Bird()
    {
        alive= true;
        posX= 0;
        posY= 300;
    }

    Bird(int height, int width)
    {
        alive= true;
        posX= 3/width;
        posY= height/2;
    }


}
