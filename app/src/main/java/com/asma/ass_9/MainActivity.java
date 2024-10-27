package com.asma.ass_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech t1, t2, t3,t5;
    TextView tx1, tx2, tx3,tx5;
    Button b1, b2, b3,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = findViewById(R.id.textView1);
        b1 = findViewById(R.id.button1);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = tx1.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();

                // Stop
                if (t2 != null && t2.isSpeaking()) {
                    t2.stop();
                }
                if (t3 != null && t3.isSpeaking()) {
                    t3.stop();
                }
                if (t5 != null && t5.isSpeaking()) {
                    t5.stop();
                }

                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        tx2 = findViewById(R.id.textView4);
        b2 = findViewById(R.id.button3);

        t2 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t2.setLanguage(Locale.UK);
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = tx2.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();

                // Stop
                if (t1 != null && t1.isSpeaking()) {
                    t1.stop();
                }
                if (t3 != null && t3.isSpeaking()) {
                    t3.stop();
                }
                if (t5 != null && t5.isSpeaking()) {
                    t5.stop();
                }

                t2.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        tx3 = findViewById(R.id.textView2);
        b3 = findViewById(R.id.button2);

        t3 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t3.setLanguage(Locale.UK);
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = tx3.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();

                // Stop
                if (t1 != null && t1.isSpeaking()) {
                    t1.stop();
                }
                if (t2 != null && t2.isSpeaking()) {
                    t2.stop();
                }
                if (t5 != null && t5.isSpeaking()) {
                    t5.stop();
                }

                t3.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });



        tx5 = findViewById(R.id.textView5);
        b5 = findViewById(R.id.button5);

        t5 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t5.setLanguage(Locale.UK);
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = tx5.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();

                // Stop
                if (t2 != null && t2.isSpeaking()) {
                    t2.stop();
                }
                if (t3 != null && t3.isSpeaking()) {
                    t3.stop();
                }
                if (t1 != null && t1.isSpeaking()) {
                    t1.stop();
                }

                t5.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }

    public void onPause()
    {
        if (t1 != null) {
            t1.stop();
            t1.shutdown();
        }

        if (t2 != null) {
            t2.stop();
            t2.shutdown();
        }
        if (t3 != null) {
            t3.stop();
            t3.shutdown();
        }
        super.onPause();
    }
}