package com.example.memorina;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;


import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Igra_6 extends AppCompatActivity {

    ImageButton iB_1, iB_2, iB_3, iB_4, iB_5, iB_6;
   public static Button bt;

   public static TextView TV1;
    public static Chronometer chronometer;

    public static  String path;


    int[] pikchi;

    //массив для айдишников


    int id_kart;

    static igr_log igr_log;
    static int y;

    //флаги для открытия/закрытия картинок


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.igr_pole6);

        igr_log = new igr_log();

        y = ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE);
        path = getFilesDir().toString() + "/igra6.txt";

        //кнопошки
        iB_1 = (ImageButton) findViewById(R.id.iB_1);
        iB_2 = (ImageButton) findViewById(R.id.iB_2);
        iB_3 = (ImageButton) findViewById(R.id.iB_3);
        iB_4 = (ImageButton) findViewById(R.id.iB_4);
        iB_5 = (ImageButton) findViewById(R.id.iB_5);
        iB_6 = (ImageButton) findViewById(R.id.iB_6);

        TV1 = (TextView) findViewById(R.id.textView2);


        Typeface face = ResourcesCompat.getFont(this, R.font.a_bremendcfr);
        TV1.setTypeface(face);
        TV1.setVisibility(View.INVISIBLE);

        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bt.setVisibility(View.INVISIBLE);


        int id_stn = R.drawable.rubashka;
        final int id0 = R.drawable.shlyapa_0;
        final int id1 = R.drawable.shlyapa_1;
        final int id2 = R.drawable.shlyapa_2;


        ArrayList pikchi = new ArrayList( Arrays.asList(id0, id0, id1, id1, id2, id2));
        int[] massive_srav ={id0, id0, id1, id1, id2, id2};
        //массив в котором элементы упорядочены, из него будет вызываться 0, 2 и 4 элементы id0, id1, id2
        Collections.shuffle(pikchi);


        chronometer = (Chronometer) findViewById(R.id.chronometer);
        chronometer.setVisibility(View.INVISIBLE);
        long startTime = SystemClock.elapsedRealtime();
        chronometer.setBase(startTime);
        chronometer.start();

//картинки перемешаны, айдишники для сравнения есть


        iB_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //перегруженные условия на каждой кнопке ага

                    //если флаг на кнопке false, то ставится картинка из массива картинок
                    iB_1.setImageResource((Integer) pikchi.get(0));

                    //флаг становится true
                    id_kart =igr_log.sravnilka((Integer) pikchi.get(0), massive_srav);
                    igr_log.udalyator(iB_1, id_kart);


                }

        });

        //оно опять всё сломалось
        iB_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    iB_2.setImageResource((Integer) pikchi.get(1));

                    //флаг становится true
                   id_kart= igr_log.sravnilka((Integer) pikchi.get(1), massive_srav);
                    igr_log.udalyator(iB_2,id_kart );

                }

        });
        iB_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    iB_3.setImageResource((Integer) pikchi.get(2));

                    id_kart= igr_log.sravnilka((Integer) pikchi.get(2), massive_srav);
                    igr_log.udalyator(iB_3,id_kart );

                 }

        });
        iB_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    iB_4.setImageResource((Integer) pikchi.get(3));

                    id_kart= igr_log.sravnilka((Integer) pikchi.get(3), massive_srav);
                    igr_log.udalyator(iB_4,id_kart );

                }

        });
        iB_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    iB_5.setImageResource((Integer) pikchi.get(4));

                    id_kart= igr_log.sravnilka((Integer) pikchi.get(4), massive_srav);
                    igr_log.udalyator(iB_5,id_kart );

                }

        });
        iB_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    iB_6.setImageResource((Integer) pikchi.get(5));

                    id_kart= igr_log.sravnilka((Integer) pikchi.get(5), massive_srav);
                    igr_log.udalyator(iB_6,id_kart );


                }

        });





    }

    public static void cenok() throws IOException {
        TV1.setTextSize(50);
        TV1.setText("Конец игры");
        TV1.setVisibility(View.VISIBLE);

   //     chronometer.isTheFinalCountDown();
        chronometer.setVisibility(View.VISIBLE);

       long elapsedMillis = SystemClock.elapsedRealtime()
               - chronometer.getBase();
       double bbb = ((double) elapsedMillis) / 1000;

        if(y == PackageManager.PERMISSION_GRANTED)
             igr_log.write(path, bbb);

        chronometer.stop();
        bt.setVisibility(View.VISIBLE);

    }



}



