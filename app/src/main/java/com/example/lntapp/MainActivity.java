package com.example.lntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onpause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onresume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    public void clickHandler(View view) {
        /*Toast.makeText(this, "Welcome Preethika", Toast.LENGTH_SHORT).show();
        TextView welcomeTextView;
        EditText nameEditText;
        nameEditText = findViewById(R.id.editTextName);
        String input = nameEditText.getText().toString();*/
       // welcomeTextView = findViewById(R.id.textViewWelcome);
        //welcomeTextView.setText(input);
        Log.e(TAG,"clickHandler");
       /* switch (view.getId()){
            case R.id.buttonlogin:
                startHome();
                break;
            case R.id.buttoncancel:
                Intent dialIntent =new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.google.com"));
                //"//http://www.google.com"));
                //new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567"));
                startActivity(dialIntent);
                break;

        }*/
        //startHome();


    }

    private void startHome() {
        Intent hIntent;
        hIntent = new Intent(MainActivity.this, HomeActivity.class);
        hIntent.putExtra("myKey","Preethika");
        //int c = add(10,20);
        startActivity(hIntent);
    }

    /*private int add(int a, int b)
    {
        return a+b;
    }*/
}