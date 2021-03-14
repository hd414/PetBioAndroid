package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView bioImage;
    private TextView Title;
    private TextView Details;
    private Bundle extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        bioImage = (ImageView) findViewById(R.id.ImgaeId);
        Title = (TextView) findViewById(R.id.TitleId);
        Details = (TextView) findViewById(R.id.Biodetails);

        extra = getIntent().getExtras();

        if(extra!= null){
            String type = extra.getString("type");
            String name = extra.getString("name");
            String bio = extra.getString("bio");

            setup(type,name,bio);
        }
    }

    public void setup(String type,String name,String bio){
        if(type.equals("dog")){
            bioImage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            Title.setText(name);
            Details.setText(bio);
        }
        else if(type.equals("cat")){
            bioImage.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            Title.setText(name);
            Details.setText(bio);
        }
    }

}