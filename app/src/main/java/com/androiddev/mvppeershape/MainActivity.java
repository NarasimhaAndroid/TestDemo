package com.androiddev.mvppeershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxTextView;
git

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        //button.setOnClickListener(v -> Log.d("siddi","ButtonClicked"));
        RxView.clicks(button).subscribe(aVoid -> {
            Log.d("siddi","ButtonClicked");
        });
        RxTextView.textChanges(editText)
                .subscribe(charSequence -> {

        });
    }
}
