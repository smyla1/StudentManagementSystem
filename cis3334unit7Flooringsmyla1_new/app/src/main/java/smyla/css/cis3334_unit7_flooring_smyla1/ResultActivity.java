package smyla.css.cis3334_unit7_flooring_smyla1;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle(getResources().getText(R.string.app2_name));

         TextView tvResult =  (TextView) findViewById(R.id.textViewResult);
         Intent intent = getIntent();
        String resultText = intent.getStringExtra("ResultText");
        tvResult.setText(resultText);



    }
}
