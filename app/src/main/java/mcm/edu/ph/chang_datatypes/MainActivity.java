package mcm.edu.ph.chang_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);

        String firstname = "Cian Alserg";
        String middleinitial = "Z.";
        String lastname = "Chang";
        int myAge = 18;
        float myDreamTVLGrade = 98.0f;
        double myMoney = 691215.07;

        //String.valueOf(myMoney);
        display.setText("My name is " +firstname+ " "
                +String.valueOf(middleinitial)+ " "
                +lastname+ "\nand my age is "
                +myAge+  ".\nI want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;
    }
}