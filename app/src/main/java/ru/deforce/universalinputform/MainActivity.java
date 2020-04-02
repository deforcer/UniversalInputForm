package ru.deforce.universalinputform;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private EditText text2;
    private TextView resText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews() {
        text1 = findViewById(R.id.name);
        text2 = findViewById(R.id.email);
        resText = findViewById(R.id.textView);
    }

    public void onOkClick(View v) {

        String name = text1.getText().toString();
        String email = text2.getText().toString();

        if ((name.trim().length() == 0) || (email.trim().length() == 0)) {
            resText.setText(R.string.emptyfields);
        } else {
            resText.setText(getString(R.string.success_message, name, email));
        }

    }

    public void onClearClick(View v) {
        text1.setText("");
        text2.setText("");
        resText.setText("");
    }

}
