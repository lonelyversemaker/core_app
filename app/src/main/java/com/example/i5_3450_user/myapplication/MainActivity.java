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
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.buttonGetResult);
        mResultEditText = (EditText)findViewById(R.id.editText);
        mInfoTextView = (TextView)findViewById(R.id.textViewInfo);
    }

    public void onClick(View view) {
        mResultEditText.setText("Test");
    }
}
