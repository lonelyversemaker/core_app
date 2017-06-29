package com.example.i5_3450_user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private EditText mResultEditText;
    private EditText mResultEditText2;
    private EditText mResultEditText3;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.buttonGetResult);
        mResultEditText = (EditText)findViewById(R.id.editText);
        mResultEditText2 = (EditText)findViewById(R.id.editText2);
        mResultEditText3 = (EditText)findViewById(R.id.editText3);
        mInfoTextView = (TextView)findViewById(R.id.textViewInfo);
    }

    public void onClick(View view) {
        Box catBox = new Box();
        String valueString1 = mResultEditText.getText().toString(), valueString2 = mResultEditText2.getText().toString(), valueString3 = mResultEditText3.getText().toString();
        int value1 = Integer.parseInt(valueString1), value2 = Integer.parseInt(valueString2), value3 = Integer.parseInt(valueString3);

        HeavyBox hBox = new HeavyBox(2, 3, 4, 5);

        ColorBox cBox = new ColorBox(2, 3, 4, 5, 666);


        catBox.setValue(value1, value2, value3);
        mInfoTextView.setText("" + cBox.getValue() + " Вес " + cBox.weight + " Цвет #" + cBox.color);

    }
}
