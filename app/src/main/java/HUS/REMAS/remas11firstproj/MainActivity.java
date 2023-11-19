package HUS.REMAS.remas11firstproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_Output;
    private Button btn_Go;
    private EditText et_Input;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_Output = findViewById(R.id.tvOutput);
        et_Input = findViewById(R.id.etInput);
        btn_Go = findViewById(R.id.btnGo);
        //koko wawa
    }
}