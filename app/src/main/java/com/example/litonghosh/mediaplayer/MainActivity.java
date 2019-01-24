package com.example.litonghosh.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

private Button Audio;
    private Button Video;
    private Button AudioStream;
    private  Button AboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Audio = (Button) findViewById(R.id.Audio);

        Audio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAudioActivity();
            }

    });



        Video = (Button) findViewById(R.id.Video);
        Video.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openVideoActivity();
            }

        });





        AudioStream = (Button) findViewById(R.id.AudioStream);
        AudioStream.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAudioStream();
            }

        });


        AboutUs = (Button) findViewById(R.id.About_Us);
        AboutUs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAboutusActivity();
            }

        });




    }
    public void openAudioActivity(){
        Intent intent = new Intent( this,AudioActivity.class );
        startActivity(intent);
    }



    public void openVideoActivity(){
        Intent intent = new Intent( this,VideoActivity.class );
        startActivity(intent);
    }




    public void openAudioStream(){
        Intent intent = new Intent( this,AudioStream.class );
        startActivity(intent);
    }



    public void openAboutusActivity(){
        Intent intent = new Intent( this,AboutusActivity.class );
        startActivity(intent);
    }
}
