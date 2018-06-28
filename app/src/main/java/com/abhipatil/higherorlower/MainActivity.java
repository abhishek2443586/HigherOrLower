package com.abhipatil.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void MakeToast(String string){
        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();

    }

    public void guess(View view){

        EditText number = (EditText)findViewById( R.id.editText );

        int guessInt = Integer.parseInt(number.getText().toString());
        if(guessInt > randomNumber){
            //Toast.makeText(MainActivity.this,"Lower!",Toast.LENGTH_SHORT).show();
            //or
            MakeToast( "Lower!" );
        }
        else if(guessInt < randomNumber){
            //Toast.makeText(MainActivity.this,"Higher!",Toast.LENGTH_SHORT).show();
            MakeToast( "Higher" );
            }
        else{
            //Toast.makeText(MainActivity.this,"That's Right! Try Again!",Toast.LENGTH_SHORT).show();
            MakeToast( "Thats Right! Try again" );
            Random rand = new Random(  );
            randomNumber = rand.nextInt(20) + 1;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}
