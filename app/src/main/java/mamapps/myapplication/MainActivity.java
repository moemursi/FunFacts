package mamapps.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declare the view variables
    private ColorWheel mColorWheel = new ColorWheel();
    private FactBook mFactBook = new FactBook();
    private TextView mFactTextView;
    private Button mshowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign the views from the layoutfile to the correspondin variable
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mshowFactButton = (Button) findViewById(R.id.ShowFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.theLayOut);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();


                //update the screen with our dynamic fact
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mshowFactButton.setTextColor(color);
            }
        };
        mshowFactButton.setOnClickListener(listener);
        Toast.makeText(MainActivity.this, "Welcome To the Fun Facts !!! ", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "we are logging from oncreate");



    }
}
