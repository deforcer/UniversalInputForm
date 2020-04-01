package ru.deforce.universalinputform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOkClick(View v) {
        EditText text1 = findViewById(R.id.name);
        EditText text2 = findViewById(R.id.email);
        TextView resText = findViewById(R.id.textView);

        String name = text1.getText().toString();
        String email = text2.getText().toString();

        if ((name.trim().length() == 0) || (email.trim().length() == 0)) {
            resText.setText("Заполните все поля пожалуйста и повторите попытку");
        } else {
            resText.setText("Подписка на рассылку успешно оформлена для пользователя " + name + " на электронный адрес " + email);
        }

    }

    public void onClearClick(View v) {
        EditText text1 = findViewById(R.id.name);
        EditText text2 = findViewById(R.id.email);
        text1.setText("");
        text2.setText("");
    }

}
