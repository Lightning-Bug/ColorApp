package comnitt.boston.colors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.rgb;



public class MainActivity extends AppCompatActivity {

    int r,g,b;
    View view;
    Button radd,badd,gadd,reset;
    TextView disr,disb,disg;
    int color = Color.rgb( r, g, b);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.rgb( 91, 158, 246));

        r = 0;
        b = 0;
        g = 0;



        radd = (Button) findViewById(R.id.button);
        badd = (Button) findViewById(R.id.button2);
        gadd = (Button) findViewById(R.id.button3);
        reset= (Button) findViewById(R.id.button4);

        disr = (TextView) findViewById(R.id.textView4);
        disg = (TextView) findViewById(R.id.textView);
        disb = (TextView) findViewById(R.id.textView3);

        radd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                r=r+36;
                if(r<252)
                {
                    disr.setText("Range " + r);
                    view.setBackgroundColor(Color.rgb( r, g, b));
                }
                else if(r==252)
                {

                    disr.setText("MAX");
                    view.setBackgroundColor(Color.rgb( r, g, b));
                    r=0;
                }


            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b+36;
                if(b<252)
                {
                    disb.setText("Range " + b);
                    view.setBackgroundColor(Color.rgb( r, g, b));
                }
                else if(b==252)
                {

                    disb.setText("MAX");
                    view.setBackgroundColor(Color.rgb( r, g, b));
                    b=0;
                }
            }
        });

        gadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                g=g+36;
                if(g<252)
                {
                    disg.setText("Range " + g);
                    view.setBackgroundColor(Color.rgb( r, g, b));
                }
                else if(g==252)
                {

                    disg.setText("MAX");
                    view.setBackgroundColor(Color.rgb( r, g, b));
                    g=0;
                }
            }
        });




        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                r=0;
                b=0;
                g=0;
                view.setBackgroundColor(Color.rgb( r, g, b));
                disr.setText("Range "+ r);
                disb.setText("Range "+ b);
                disg.setText("Range "+ g);

            }

        });







    }

}
