package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     private ImageView firstImg;
     private ImageView secondImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstImg = (ImageView) findViewById(R.id.firstId);
        secondImg = (ImageView) findViewById(R.id.secondId);

        firstImg.setOnClickListener(this);
        secondImg.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.firstId:
                Intent catIntent = new Intent(MainActivity.this,BioActivity.class);
                catIntent.putExtra("type","cat");
                catIntent.putExtra("name","meow");
                catIntent.putExtra("bio","very lovely cat");
                startActivity(catIntent);
//                Toast.makeText(MainActivity.this,"cat",Toast.LENGTH_LONG).show();
                break;

            case R.id.secondId:
                Intent dogIntent = new Intent(MainActivity.this,BioActivity.class);
                dogIntent.putExtra("type","dog");
                dogIntent.putExtra("name","bark");
                dogIntent.putExtra("bio","very lovely dog");
                startActivity(dogIntent);
//                Toast.makeText(MainActivity.this,"Dog",Toast.LENGTH_LONG).show();
                break;
        }
    }
}