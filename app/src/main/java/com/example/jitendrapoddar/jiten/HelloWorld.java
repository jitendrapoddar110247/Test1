package com.example.jitendrapoddar.jiten;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jitendra Poddar on 5/3/2016.
 */
public class HelloWorld extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("programmmer");
        setContentView(textview);
    }
}
