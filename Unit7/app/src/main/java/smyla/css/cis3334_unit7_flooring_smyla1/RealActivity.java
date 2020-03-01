package smyla.css.cis3334_unit7_flooring_smyla1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);
        setTitle(getResources().getText(R.string.app2_name));
        TextView tvResult =  (TextView) findViewById(R.id.textViewResult);
        Intent intent = getIntent();
        String resultText = intent.getStringExtra("ResultText");
        tvResult.setText(resultText);
    }
}
