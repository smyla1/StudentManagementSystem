package smyla.css.cis3334_unit7_flooring_smyla1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button btnResult;
    private EditText etLength,etWidth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Intilize controls
        btnResult = (Button) findViewById(R.id.buttonShowResult);
        etLength = (EditText)  findViewById(R.id.editTextRoomLength);
        etWidth = (EditText)  findViewById(R.id.editTextRoomWidth) ;

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double length ,width , area ;
                DecimalFormat df2 = new DecimalFormat("#.##");

                String strLength = TextUtils.isEmpty(etLength.getText())? "0.00" : String.valueOf(etLength.getText());
                String strWidth = TextUtils.isEmpty(etWidth.getText())? "0.00" : String.valueOf(etWidth.getText());
                length = Double.parseDouble(strLength);
                width = Double.parseDouble(strWidth);
                area = length * width;

                final   String resultText;
                resultText = String.format("Width is %s and Length is %s and flooring needed is %s",  df2.format(width), df2.format(length), String.format("%.1f", area));


                Intent detailActIntent = new Intent(MainActivity.this, RealActivity.class);
                detailActIntent.putExtra("ResultText", resultText);
                startActivity(detailActIntent);



            }
        });

    }
}
