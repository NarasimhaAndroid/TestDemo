package com.androiddev.mvppeershape.service.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androiddev.mvppeershape.R;
import com.androiddev.mvppeershape.service.Helper;
import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxTextView;


public class MainActivity extends AppCompatActivity {

    public Boolean value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        

        Helper h=new Helper();
        h.setType(true);

        //boolean b=h.setType2();

        //Log.d("Main",Boolean.toString(b));
        String s=h.getValue();
        Log.d("TAG",s);


        //button.setOnClickListener(v -> Log.d("siddi","ButtonClicked"));
        RxView.clicks(button).subscribe(aVoid -> {
            //Log.d("siddi","ButtonClicked");

            h.setType(false);
            //boolean b1=h.setType2();

            //Log.d("Main",Boolean.toString(b1));
            String s1=h.getValue();
            Log.d("TAG",s1);

        });
        RxTextView.textChanges(editText)
                .subscribe(charSequence -> {

        });
    }


}
