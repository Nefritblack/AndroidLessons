package ru.startandroid.develop.resvalues;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LinearLayout llBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBottom.setText(R.string.btnBottomText);
    }
}
