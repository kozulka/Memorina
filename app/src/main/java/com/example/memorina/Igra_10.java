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

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Igra_10  extends AppCompatActivity {

    ImageButton iB_1, iB_2, iB_3, iB_4, iB_5, iB_6, iB_7, iB_8, iB_9, iB_10;
    public  static Button bt;
    public static TextView TV1;
    public static Chronometer chronometer;


    public static  String path;
    int id_kart;
    static int y;
    static igr_log igr_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.igr_pole10);


        igr_log = new igr_log();

        y = ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE);
        path = getFilesDir().toString() + "/igra10.txt";

        iB_1 = (ImageButton) findViewById(R.id.iB_11);
        iB_2 = (ImageButton) findViewById(R.id.iB_12);
        iB_3 = (ImageButton) findViewById(R.id.iB_13);
        iB_4 = (ImageButton) findViewById(R.id.iB_14);
        iB_5 = (ImageButton) findViewById(R.id.iB_15);
        iB_6 = (ImageButton) findViewById(R.id.iB_16);
        iB_7 = (ImageButton) findViewById(R.id.iB_17);
        iB_8 = (ImageButton) findViewById(R.id.iB_18);
        iB_9 = (ImageButton) findViewById(R.id.iB_19);
        iB_10 = (ImageButton) findViewById(R.id.iB_20);



        bt = (Button) findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bt.setVisibility(View.INVISIBLE);


        chronometer = (Chronometer) findViewById(R.id.chronometer4);
        chronometer.setVisibility(View.INVISIBLE);
        long startTime = SystemClock.elapsedRealtime();
        chronometer.setBase(startTime);
        chronometer.start();


        TV1 = (TextView) findViewById(R.id.textView5);
        Typeface face = ResourcesCompat.getFont(this, R.font.a_bremendcfr);
        TV1.setTypeface(face);
        TV1.setVisibility(View.INVISIBLE);




        int id_stn = R.drawable.rubashka;
        final int id0 = R.drawable.zhiv1;
        final int id1 = R.drawable.zhiv2;
        final int id2 = R.drawable.zhiv3;
        final int id3 = R.drawable.zhiv4;
        final int id4 = R.drawable.zhiv5;






        ArrayList pikchi = new ArrayList( Arrays.asList(id0, id0, id1, id1, id2, id2, id3, id3, id4, id4));
        int[] massive_srav ={id0, id0, id1, id1, id2, id2, id3, id3, id4,id4};
        //массив в котором элементы упорядочены, из него будет вызываться 0, 2 и 4 элементы id0, id1, id2,id3
        Collections.shuffle(pikchi);




        iB_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //перегруженные условия на каждой кнопке ага

                //если флаг на кнопке false, то ставится картинка из массива картинок
                iB_1.setImageResource((Integer) pikchi.get(0));

                //флаг становится true
                id_kart =igr_log.sravnilka10((Integer) pikchi.get(0), massive_srav);
                igr_log.udalyator10(iB_1, id_kart);


            }

        });

        //оно опять всё сломалось
        iB_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iB_2.setImageResource((Integer) pikchi.get(1));

                //флаг становится true
                id_kart= igr_log.sravnilka10((Integer) pikchi.get(1), massive_srav);
                igr_log.udalyator10(iB_2,id_kart );

            }

        });
        iB_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iB_3.setImageResource((Integer) pikchi.get(2));

                id_kart= igr_log.sravnilka10((Integer) pikchi.get(2), massive_srav);
                igr_log.udalyator10(iB_3,id_kart );

            }

        });
        iB_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iB_4.setImageResource((Integer) pikchi.get(3));

                id_kart= igr_log.sravnilka10((Integer) pikchi.get(3), massive_srav);
                igr_log.udalyator10(iB_4,id_kart );

            }

        });
        iB_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iB_5.setImageResource((Integer) pikchi.get(4));

                id_kart= igr_log.sravnilka10((Integer) pikchi.get(4), massive_srav);
                igr_log.udalyator10(iB_5,id_kart );

            }

        });
        iB_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                iB_6.setImageResource((Integer) pikchi.get(5));

                id_kart= igr_log.sravnilka10((Integer) pikchi.get(5), massive_srav);
                igr_log.udalyator10(iB_6,id_kart );


            }

        });

        iB_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                iB_7.setImageResource((Integer) pikchi.get(6));

                id_kart= igr_log.sravnilka10((Integer) pikchi.get(6), massive_srav);
                igr_log.udalyator10(iB_7,id_kart );


            }

        });


        iB_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                iB_8.setImageResource((Integer) pikchi.get(7));

                id_kart= igr_log.sravnilka10((Integer) pikchi.get(7), massive_srav);
                igr_log.udalyator10(iB_8,id_kart );


            }

        });


        iB_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                iB_9.setImageResource((Integer) pikchi.get(8));

                id_kart= igr_log.sravnilka10((Integer) pikchi.get(8), massive_srav);
                igr_log.udalyator10(iB_9,id_kart );


            }

        });


        iB_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                iB_10.setImageResource((Integer) pikchi.get(9));

                id_kart= igr_log.sravnilka10((Integer) pikchi.get(9), massive_srav);
                igr_log.udalyator10(iB_10,id_kart );


            }

        });





    }

    static public void cenok() throws IOException {
        TV1.setTextSize(50);
        TV1.setText("Конец игры");
        TV1.setVisibility(View.VISIBLE);
        bt.setVisibility(View.VISIBLE);

        long elapsedMillis = SystemClock.elapsedRealtime()
                - chronometer.getBase();
        double bbb = ((double) elapsedMillis) / 1000;

        if(y == PackageManager.PERMISSION_GRANTED)
            igr_log.write(path, bbb);


        //     chronometer.isTheFinalCountDown();
        chronometer.setVisibility(View.VISIBLE);

        chronometer.stop();


    }


}

