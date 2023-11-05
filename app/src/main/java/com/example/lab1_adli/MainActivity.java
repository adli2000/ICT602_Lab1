package com.example.lab1_adli;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab1_adli.R;


public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;

    EditText etName;
    String initialText;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.textView);
        submitButton = findViewById(R.id.button);
        etName = findViewById(R.id.editText);

    }

    @SuppressLint("SetTextI18n")
    public void displayText(View view)
    {
        String text = etName.getText().toString();
        tvMessage.setText("Welcome!" + text);

        Toast toast = Toast.makeText(this, "WELCOME", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetText(View view) {
        tvMessage.setText(initialText); // Reset TextView to the initial text
        etName.setText(""); // Clear the EditText
    }
    //am useless
    // malim gunung
}
