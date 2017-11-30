package com.androiddev.mvppeershape.service.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androiddev.mvppeershape.R;
import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxTextView;


public class MainActivity extends AppCompatActivity {

    public boolean value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText_One = (EditText) findViewById(R.id.editText);
        EditText editText_Two = (EditText) findViewById(R.id.edittext_two);


        Helper h = new Helper();
        //h.setType(true);

        RxView.clicks(button).subscribe(aVoid -> {

            h.setType(false);

        });
        RxTextView.textChanges(editText_One)
                .subscribe(charSequence -> {

                });
    }


}
