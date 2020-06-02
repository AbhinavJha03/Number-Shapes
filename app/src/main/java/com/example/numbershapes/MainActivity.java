package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Numbers{
        int numb;
        public boolean isSquare()
        {
            double sqrt= Math.sqrt(numb);
            if(sqrt==Math.floor(sqrt))
            {
                return true;
            }
            else{
                return false;
            }
        }

        public boolean isTriangular(){
            int x=1;
            int triangle=1;
            while(triangle<numb)
            {
                x++;
                triangle+=x;
            }
            if(triangle==numb)
            {
                return true;
            }
            else{
                return false;
            }

        }

    }


    public void checkFunction(View view) {
        Log.i("Info", "Button Pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        String message;
        if (editText.getText().toString().isEmpty()) {
            message = " Please enter a number";
        } else {
            int n = Integer.parseInt(editText.getText().toString());
            Numbers no = new Numbers();
            no.numb = n;
            message = editText.getText().toString();
            if (no.isTriangular() && no.isSquare()) {
                message += " is both Triagualar and Square";
            } else if (no.isSquare()) {
                message += " is Square";
            } else if (no.isTriangular()) {
                message += " is Triagualar";
            } else {
                message += " is neither Triagular nor Square";
            }
        }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
