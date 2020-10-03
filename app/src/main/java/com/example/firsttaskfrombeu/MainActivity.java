package com.example.firsttaskfrombeu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview_click);
        button = findViewById(R.id.button);
    }

    public void clickMe(View view){
        textView.setText(R.string.textview_after_clicked_button);
        textView.setTextColor(getResources().getColor(R.color.red));
        button.setText(R.string.button_after_clicked_button);
        button.setEnabled(false);

        Toast.makeText(this, R.string.toast_message_button, Toast.LENGTH_SHORT).show();
    }
}