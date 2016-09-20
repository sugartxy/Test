package com.example.mactang.hello;

import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
//change 1
    //change3
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=
                (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToSecondActivity();
            }
        });
    }
    private void goToSecondActivity() {

        Intent intent = new Intent(this, Main2Activity.class);

        startActivity(intent);

    }
}
