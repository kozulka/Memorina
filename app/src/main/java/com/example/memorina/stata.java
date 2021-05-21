package com.example.memorina;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Scanner;


public class stata extends AppCompatActivity {



    public static Button button7;
    public static TextView view1,view2,view3,view4;

   public static String path6, path9, path10,path12;


    public static final String IGR6 = "vremya6";

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stata);

        path6 = getFilesDir().toString() + "/igra6.txt";
        path9 = getFilesDir().toString() + "/igra9.txt";
        path10= getFilesDir().toString() + "/igra10.txt";
        path12 = getFilesDir().toString() + "/igra12.txt";


        view1 = (TextView) findViewById(R.id.view1);
        view2 = (TextView) findViewById(R.id.view2);
        view3 = (TextView) findViewById(R.id.view3);
        view4 = (TextView) findViewById(R.id.view4);


        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        try {
            reader6();
            reader9();
            reader10();
            reader12();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }




        public void reader6() throws FileNotFoundException {
        int count = 0;
        double summa = 0;
        FileReader fr = new FileReader(path6);
            Scanner sc = new Scanner (fr);
            while (sc.hasNext()){
                double x = Double.parseDouble(sc.next());
                 summa += x;
                 count++;
            }
            summa /= count;

            view1.setText(String.format("%.3f",summa));
        }

    public void reader9() throws FileNotFoundException {
        int count = 0;
        double summa = 0;
        FileReader fr = new FileReader(path9);
        Scanner sc = new Scanner (fr);
        while (sc.hasNext()){
            double x = Double.parseDouble(sc.next());
            summa += x;
            count++;
        }
        summa /= count;

        view2.setText(String.format("%.3f",summa));
    }



    public void reader10() throws FileNotFoundException {
        int count = 0;
        double summa = 0;
        FileReader fr = new FileReader(path10);
        Scanner sc = new Scanner (fr);
        while (sc.hasNext()){
            double x = Double.parseDouble(sc.next());
            summa += x;
            count++;
        }
        summa /= count;

        view3.setText(String.format("%.3f",summa));
    }


    public void reader12() throws FileNotFoundException {
        int count = 0;
        double summa = 0;
        FileReader fr = new FileReader(path12);
        Scanner sc = new Scanner (fr);
        while (sc.hasNext()){
            double x = Double.parseDouble(sc.next());
            summa += x;
            count++;
        }
        summa /= count;

        view4.setText(String.format("%.3f",summa));
    }






}
