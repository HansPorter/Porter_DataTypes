package mcm.edu.ph.porter_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        diplay = findViewById(R.id.displayTxt);

        String firstname = " Hans Thomas ";
        char middleInitial ='A';
        String Lastname = "Porter";
        int myAge = 19;
        float myDreamTVLGrade = "80.0"
        double myMoney =100;



        //String.valueOf(myMoney);
        display.setText("My name is "+firstname+ " "
                +String.valueOf(middleInitial)+ " "
                +Lastname+ "\nand my age is "
                +myAge+ "\nI want my grade to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;


    }
}