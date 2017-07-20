package mamapps.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // Declare the view variables
    private TextView mFactTextView;
    private Button mshowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign the views from the layoutfile to the correspondin variable
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mshowFactButton = (Button) findViewById(R.id.ShowFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] facts = {
                        "Ants stretch when they wake up in the morning.",
                        "Ostriches can run faster than horses.",
                        "Olympic gold medals are actually made mostly of silver.",
                        "You are born with 300 bones; by the time you are an adult you will have 206.",
                        "It takes about 8 minutes for light from the Sun to reach Earth.",
                        "Some bamboo plants can grow almost a meter in just one day.",
                        "The state of Florida is bigger than England.",
                        "Some penguins can leap 2-3 meters out of the water.",
                        "On average, it takes 66 days to form a new habit.",
                        "Mammoths still walked the earth when the Great Pyramid was being built." };
                // the button was clicked update the fact view with a new fact
                String fact = "";
                // randomly select a fact
                Random randomGen = new Random();
                int randomNumb = randomGen.nextInt(facts.length);
                fact = facts[randomNumb];
                //update the screen with our dynamic fact
                mFactTextView.setText(fact);
            }
        };
        mshowFactButton.setOnClickListener(listener);



    }
}
