package ru.startandroid.develop.listener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Найдем View - элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        // Создание обработчика
        OnClickListener oclBtn = new OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                switch(v.getId()){
                    case R.id.btnOk:
                        // Кнопка OK
                        tvOut.setText("Нажата кнопка OK");
                        break;
                    case R.id.btnCancel:
                        // Кнопка Cancel
                        tvOut.setText("Нажата кнопка Cancel");
                        break;
                }
            }
        };

        btnCancel.setOnClickListener(oclBtn);
        btnOk.setOnClickListener(oclBtn);
    }


}
