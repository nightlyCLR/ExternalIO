package mcm.edu.ph.myfirstandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        byte age = 18;
        short birthmonth = 1;
        int birthyear = 2001;
        double myCash = 0;
        boolean inARelationship = true;
        char middleInitial ='M';

        TextView ageTxt =  findViewById(R.id.ageTxt7);
        TextView monthTxt =  findViewById(R.id.monthTxt);
        TextView yearTxt =  findViewById(R.id.yearTxt);
        TextView cashTxt =  findViewById(R.id.cashTxt);
        TextView tfTxt =  findViewById(R.id.tfTxt);
        TextView miTxt =  findViewById(R.id.miTxt);

        ageTxt.setText(String.valueOf(age));
        monthTxt.setText(String.valueOf(birthmonth));
        yearTxt.setText(String.valueOf(birthyear));
        cashTxt.setText(Double.toString(myCash));
        tfTxt.setText(Boolean.toString(inARelationship));
        miTxt.setText(String.valueOf(middleInitial));


    }
}
