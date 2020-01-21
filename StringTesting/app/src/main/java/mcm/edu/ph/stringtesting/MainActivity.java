package mcm.edu.ph.stringtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView fname = findViewById(R.id.firstname);
        TextView lname = findViewById(R.id.lastname);

        String firstname="Charlize";
        String lastname="Rivera";

        fname.setText(firstname);
        lname.setText(lastname);
    }
}
