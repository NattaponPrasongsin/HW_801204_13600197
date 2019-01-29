package homework2.phattranit.ict.su.ac.th.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvRGB;
    private TextView tvShowing;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRGB = findViewById(R.id.tvRGB);
        tvShowing = findViewById(R.id.tvShowing);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowing.setText("235-255-221");
                tvShowing.setBackgroundColor(Color.parseColor("#FFE9E1DE"));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowing.setText("236-203-202");
                tvShowing.setBackgroundColor(Color.parseColor("#ecbec4"));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowing.setText("106-121-148");
                tvShowing.setBackgroundColor(Color.parseColor("#6a7994"));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowing.setText("153-169-191");
                tvShowing.setBackgroundColor(Color.parseColor("#8fa1b8"));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowing.setText("195-204-216");
                tvShowing.setBackgroundColor(Color.parseColor("#bcc7d1"));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowing.setText("221-226-269");
                tvShowing.setBackgroundColor(Color.parseColor("#dadfe3"));
            }
        });


    }
}
