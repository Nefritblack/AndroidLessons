package ru.startandroid.develop.onclickbuttons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        OnClickListener oclBtnOk = (v) -> {tvOut.setText("Нажата кнопка OK");};

        btnOk.setOnClickListener(oclBtnOk);

        OnClickListener oclBtnCancel = (v) -> {tvOut.setText("Нажата кнопка Cancel");};

        btnCancel.setOnClickListener(oclBtnCancel);
    }
}
