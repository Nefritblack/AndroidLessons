package ru.startandroid.develop.logandmess;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity implements OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Найдем View-элементы
        Log.d(TAG, "Найдем View-элементы");
        tvOut = (TextView) findViewById(R.id.text_tv_out);
        btnOk = (Button) findViewById(R.id.button_ok);
        btnCancel = (Button) findViewById(R.id.button_cancel);

        // Присваиваем обработчик кнопкам
        Log.d(TAG, "Присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // По id определяем кнопку, вызвавшую этот обработчик
        Log.d(TAG, "По id определяем кнопку, вызвавшую обработчик");
        switch (v.getId()){
            case R.id.button_ok:
                Log.d(TAG, "Кнопка OK");
                tvOut.setText("Нажата кнопка OK");
                Toast.makeText(this, "Нажата кнопка OK", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_cancel:
                Log.d(TAG, "Кнопка Cancel");
                tvOut.setText("Нажата кнопка Cancel");
                Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
