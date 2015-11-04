package com.example.user.calculadora;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public void sumar(View view){
        EditText numberOne = (EditText) findViewById(R.id.number_one);
        int numOne = Integer.parseInt(numberOne.getText().toString());
        EditText numberTwo = (EditText) findViewById(R.id.number_two);
        int numTwo = Integer.parseInt(numberTwo.getText().toString());
        TextView answer = (TextView) findViewById(R.id.sum_numbers);
        answer.setText(numOne+numTwo+"");
        System.out.println(numOne+numTwo+"");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
