package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.Button;
import android.view.MotionEvent;
import android.view.View;

public class SoundBoardActivity extends AppCompatActivity implements View.OnClickListener
{
    private SoundPool soundPool;
    private int soundID;
    private boolean isSoundPoolLoaded;
    private Button KeyA;
    private Button KeyBflat;
    private Button KeyB;
    private int aNote;
    private int bFlatNote;
    private int bNote;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);
        // Set the hardware buttons to control the music
        // Load the sound
        wireWidgets();
        initializeSoundPool();
        SetListeners();
    }

    private void intializeSoundPool() {
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,0)
        soundPool.setOnLoadCompleteListener((soundPoolsampleId,status) {
            isSoundPoolLoaded = true;
     });
        aNote = SoundPool.load(this,R.raw.scalea,1);
        bFlatNote = SoundPool.load(this,R.raw.scalebb,1);
        bNote = SoundPool.load(this,R.raw.scalea,1);
    }
    private void wireWidgets(){
        KeyA = findViewById(R.id.button_main_A);
        KeyBflat = findViewById(R.id.button_main_Bflat);
        KeyB = findViewById(R.id.button_main_B);
    }
    private void initializeSoundPool() {

    }
    buttonA.setOnClickListener
    private void SetListeners() {

        KeyA.setOnClickListener(new View.OnClickListener() {
                if(isSoundPoolLoaded) {
                    soundPool.play(aNote,1,1,1,0,1);
                }
        KeyBflat.setOnClickListener(new View.OnClickListener() {
                    if(isSoundPoolLoaded) {
                        soundPool.play(bFlatNote,1,1,1,0,1);
                    }
                }
            });
            KeyB.setOnClickListener(new View.OnClickListener() {
                    if(isSoundPoolLoaded) {
                        soundPool.play(bNote,1,1,1,0,1);
                    }
                });
    }
}