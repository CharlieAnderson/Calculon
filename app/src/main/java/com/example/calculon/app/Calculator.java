package com.example.calculon.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;
import android.widget.TextView;

public class Calculator extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    private int total=0;
    private int number=0;
    private int value=0;
    private boolean add = false;
    private boolean mult = false;
    private boolean div = false;
    private boolean sub = false;


    public void onButtonClick(View v) {
        Button button = (Button) v;
        String bText = (String) button.getText();
if(add==false && mult==false && div==false && sub==false)
    {
    number=0;
    number = number * 10 + Integer.parseInt(bText);
    TextView myTextView = (TextView) findViewById(R.id.textView);
    myTextView.setText(Integer.toString(number));
    }
else
    {
    value = value*10+Integer.parseInt(bText);
    TextView myTextView = (TextView) findViewById(R.id.textView);
    myTextView.setText(Integer.toString(value));
    }


    }


    public void onButtonClickEquals(View v) {
        Button button = (Button) v;
        String bText = (String) button.getText();

         if(add==true)
        {
            number+=value;
            TextView myTextView = (TextView) findViewById(R.id.textView);
            myTextView.setText(Integer.toString(number));
            value=0;
        }

        else if(sub==true)
        {
            number-=value;
            TextView myTextView = (TextView) findViewById(R.id.textView);
            myTextView.setText(Integer.toString(number));
            value=0;
        }

        else if(mult==true)
        {
            number*=value;
            TextView myTextView = (TextView) findViewById(R.id.textView);
            myTextView.setText(Integer.toString(number));
            value=0;
        }

        else if(div==true)
        {
            number/=value;
            TextView myTextView = (TextView) findViewById(R.id.textView);
            myTextView.setText(Integer.toString(number));
            value=0;
        }
        add=false;
        mult = false;
        div = false;
        sub = false;
    }


    public void onButtonClickplus(View v) {
        Button button = (Button) v;
        add=true;
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("+");
        mult = false;
        div = false;
        sub = false;
    }

    public void onButtonClickmult(View v) {
        Button button = (Button) v;
        mult=true;
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("*");
        add = false;
        div = false;
        sub = false;
    }

    public void onButtonClickdiv(View v) {
        Button button = (Button) v;
        div=true;
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("/");
        mult = false;
        add = false;
        sub = false;
    }

    public void onButtonClicksub(View v) {
        Button button = (Button) v;
        sub=true;
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("-");
        mult = false;
        div = false;
        add = false;
    }


}