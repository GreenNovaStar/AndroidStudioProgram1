package anxiety.socialhelp;

import android.content.res.Resources;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

import static android.content.res.Resources.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display display= getWindowManager().getDefaultDisplay();
        Point size= new Point();
        display.getSize(size);
        int h= size.x;
        int w= size.y;
        World world= new World(h, w);
    }



}
