package smyla.css.studentmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_all_students extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_students);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
