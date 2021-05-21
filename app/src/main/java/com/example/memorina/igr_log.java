package com.example.memorina;



import android.Manifest;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.core.content.ContextCompat;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class igr_log {


    private  static boolean flag = false;

    //эта переменная будет засчитывать каждое нажатие(а именно делать так, что бы их было не больше чем 2
    private static boolean schetchik = false;

    //очень смешной костыль,  интовские переменные в которых при вызове функции добавляется еденичка, и если они становятся равными 2, то пикчи удаляются , а переменные обнуляются
    //изначально тут были булевские переменные, но так как функция проходила дважды, то и численное изменение проходило дважды, а булевская переменная не изменялась
    //грубо говоря я использую инт как булеан с 3 возможными позициями (0,1,2)
    private static boolean perv = false;
    private static boolean vtor = false;
    private static boolean tret = false;
    private static boolean chet = false;
    private static boolean pyat = false;
    private static boolean shest = false;


    //кнопка запомненная кнопка, запоминает кнопку из прошлого вызова для сравнения и удаления
    private static ImageButton zap_knop ;
    private static int schet = 0;




    private static final int id_stn =R.drawable.rubashka2;

    private  static final int id_0 = R.drawable.shlyapa_0;
    private  static final int id1 = R.drawable.shlyapa_1;
    private  static final int id2 = R.drawable.shlyapa_2;



    private  static final int ids0 = R.drawable.simv1;
    private  static final int ids1 = R.drawable.simv10;
    private  static final int ids2 = R.drawable.simv3;
    private  static final int ids3 = R.drawable.simv4;


    private  static  final int i0 = R.drawable.zhiv1;
    private  static final int i1 = R.drawable.zhiv2;
    private  static final int i2 = R.drawable.zhiv3;
    private  static final int i3 = R.drawable.zhiv4;
    private  static final int i4 = R.drawable.zhiv5;


    private  static final int d0 = R.drawable.orn1;
    private  static final int d1 = R.drawable.orn12;
    private  static final int d2 = R.drawable.orn13;
    private  static final int d3 = R.drawable.orn4;
    private  static final int d4 = R.drawable.orn3;
    private  static final int d5 = R.drawable.orn9;




    public  int sravnilka(int pikcha, int[] mas_srav){
        int id;


        if(pikcha == mas_srav[0]){
            //тут сравнивается элемент из упорядоченного массива  с элементом полученным кнопкой, если всё сходится то начинается функция по поиску второй пикчи
            id = mas_srav[0];
            return id;
            //if-овское сравнение с каждым айдишником, передает айдишник в igra
        }else if(pikcha == mas_srav[2]){
            id = mas_srav[2];
            return id;
            //
        }else if(pikcha == mas_srav[4]){
            id = mas_srav[4];
            return id;
        }
        return 0;
    }

    public  int sravnilka9(int pikcha, int[] mas_srav){
        int id;

        if(pikcha == mas_srav[0]){
            //тут сравнивается элемент из упорядоченного массива  с элементом полученным кнопкой, если всё сходится то начинается функция по поиску второй пикчи
            id = mas_srav[0];
            return id;
            //if-овское сравнение с каждым айдишником, передает айдишник в igra
        }else if(pikcha == mas_srav[2]){
            id = mas_srav[2];
            return id;
            //
        }else if(pikcha == mas_srav[4]){
            id = mas_srav[4];
            return id;
        }else if(pikcha == mas_srav[6]){
            id = mas_srav[6];
            return id;
        }

        return 0;
    }

    public  int sravnilka10(int pikcha, int[] mas_srav){
        int id;

        if(pikcha == mas_srav[0]){
            //тут сравнивается элемент из упорядоченного массива  с элементом полученным кнопкой, если всё сходится то начинается функция по поиску второй пикчи
            id = mas_srav[0];
            return id;
            //if-овское сравнение с каждым айдишником, передает айдишник в igra
        }else if(pikcha == mas_srav[2]){
            id = mas_srav[2];
            return id;
            //
        }else if(pikcha == mas_srav[4]){
            id = mas_srav[4];
            return id;
        }else if(pikcha == mas_srav[6]){
            id = mas_srav[6];
            return id;
        }else if(pikcha == mas_srav[8]){
            id = mas_srav[8];
            return id;
        }

        return 0;
    }

    public  int sravnilka12(int pikcha, int[] mas_srav){
        int id;

        if(pikcha == mas_srav[0]){
            //тут сравнивается элемент из упорядоченного массива  с элементом полученным кнопкой, если всё сходится то начинается функция по поиску второй пикчи
            id = mas_srav[0];
            return id;
            //if-овское сравнение с каждым айдишником, передает айдишник в igra
        }else if(pikcha == mas_srav[2]){
            id = mas_srav[2];
            return id;
            //
        }else if(pikcha == mas_srav[4]){
            id = mas_srav[4];
            return id;
        }else if(pikcha == mas_srav[6]){
            id = mas_srav[6];
            return id;
        }else if(pikcha == mas_srav[8]){
            id = mas_srav[8];
            return id;
        }else if(pikcha == mas_srav[10]){
            id = mas_srav[10];
            return id;
        }

        return 0;
    }



    public  void udalyator(ImageButton imageButton, int kart) {

        //не очень крутой метод с очень крутым названием)
        //принимает в себя кнопку на которую было произведено нажатие и айди картинки
        //метод до сих пор в нерабочем состоянии
        //не работает : задержка
        switch (kart){

            case id_0:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                   zap_knop= (ImageButton) registrNaj_1(imageButton);
                    perv = flajok(false);
                    vtor = false;
                    tret = false;
                   schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, perv, 3);
                    perv = false;
                    schetchik =false;
                }
                break;

            //
            case id1:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    vtor = flajok(flag);
                    perv = false;
                    tret = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, vtor,3 );
                    vtor = false;
                    schetchik =false;
                }
                break;
                //

            case id2:
                if (!schetchik ) {
                //если счетчик фолс, то это первый вызов функции
                zap_knop= (ImageButton)registrNaj_1(imageButton);
                tret = flajok(flag);
                perv=false;
                vtor =false;
                schetchik= true;

            } else {

                registrNaj_2(zap_knop, imageButton, tret, 3);
                schetchik =false;
                tret = false;
            }
                break;
        }
        }

    public  void udalyator9(ImageButton imageButton, int kart) {

        //не очень крутой метод с очень крутым названием)
        //принимает в себя кнопку на которую было произведено нажатие и айди картинки
        //метод до сих пор в нерабочем состоянии
        //не работает : задержка
        switch (kart){

            case ids0:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton) registrNaj_1(imageButton);
                    perv = flajok(false);
                    vtor = false;
                    tret = false;
                    chet = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, perv, 4);
                    perv = false;
                    schetchik =false;
                }
                break;

            //
            case ids1:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    vtor = flajok(flag);
                    perv = false;
                    tret = false;
                    chet = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, vtor,4 );
                    vtor = false;
                    schetchik =false;
                }
                break;
            //

            case ids2:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    tret = flajok(flag);
                    perv=false;
                    vtor =false;
                    chet=false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, tret, 4);
                    schetchik =false;
                    tret = false;
                }
                break;

            case ids3:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    chet = flajok(flag);
                    perv=false;
                    vtor =false;
                    tret = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, chet, 4);
                    schetchik =false;
                    chet = false;
                }
                break;
        }
    }

    public  void udalyator10(ImageButton imageButton, int kart) {

        //не очень крутой метод с очень крутым названием)
        //принимает в себя кнопку на которую было произведено нажатие и айди картинки
        //метод до сих пор в нерабочем состоянии
        //не работает : задержка
        switch (kart){

            case i0:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton) registrNaj_1(imageButton);
                    perv = flajok(false);
                    vtor = false;
                    tret = false;
                    chet = false;
                    pyat = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, perv, 5);
                    perv = false;
                    schetchik =false;
                }
                break;

            //
            case i1:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    vtor = flajok(flag);
                    perv = false;
                    tret = false;
                    chet = false;
                    pyat = false;

                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, vtor,5);
                    vtor = false;
                    schetchik =false;
                }
                break;
            //

            case i2:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    tret = flajok(flag);
                    perv=false;
                    vtor =false;
                    chet=false;
                    pyat = false;

                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, tret, 5);
                    schetchik =false;
                    tret = false;
                }
                break;

            case i3:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    chet = flajok(flag);
                    perv=false;
                    vtor =false;
                    tret = false;
                    pyat = false;

                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, chet, 5);
                    schetchik =false;
                    chet = false;
                }
                break;


            case i4:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    pyat = flajok(flag);
                    perv=false;
                    vtor =false;
                    tret = false;
                    chet = false;

                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, pyat, 5);
                    schetchik =false;
                    pyat = false;
                }
                break;


        }
    }

    public  void udalyator12(ImageButton imageButton, int kart) {

        //не очень крутой метод с очень крутым названием)
        //принимает в себя кнопку на которую было произведено нажатие и айди картинки
        //метод до сих пор в нерабочем состоянии
        //не работает : задержка
        switch (kart){

            case d0:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton) registrNaj_1(imageButton);
                    perv = flajok(false);
                    vtor = false;
                    tret = false;
                    chet = false;
                    pyat = false;
                    shest = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, perv, 6);
                    perv = false;
                    schetchik =false;
                }
                break;

            //
            case d1:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    vtor = flajok(flag);
                    perv = false;
                    tret = false;
                    chet = false;
                    pyat = false;
                    shest = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, vtor,6);
                    vtor = false;
                    schetchik =false;
                }
                break;
            //

            case d2:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    tret = flajok(flag);
                    perv=false;
                    vtor =false;
                    chet=false;
                    pyat = false;
                    shest = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, tret, 6);
                    schetchik =false;
                    tret = false;
                }
                break;

            case d3:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    chet = flajok(flag);
                    perv=false;
                    vtor =false;
                    tret = false;
                    pyat = false;
                    shest = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, chet, 6);
                    schetchik =false;
                    chet = false;
                }
                break;


            case d4:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    pyat = flajok(flag);
                    perv=false;
                    vtor =false;
                    tret = false;
                    chet = false;
                    shest = false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, pyat, 6);
                    schetchik =false;
                    pyat = false;
                }
                break;



            case d5:
                if (!schetchik ) {
                    //если счетчик фолс, то это первый вызов функции
                    zap_knop= (ImageButton)registrNaj_1(imageButton);
                    shest = flajok(flag);
                    perv=false;
                    vtor =false;
                    tret = false;
                    chet = false;
                    pyat= false;
                    schetchik= true;

                } else {

                    registrNaj_2(zap_knop, imageButton, shest, 6);
                    schetchik =false;
                    shest = false;
                }
                break;
        }
    }



    public  boolean flajok(boolean flag){
        //просто функция для очистки кода, делает флажок тру
        flag = true;
        return flag;
    }


       public  ImageButton registrNaj_1(ImageButton imageButton){
        //регистриурет первое нажатие, просто создаёт зап_кноп
        zap_knop = (ImageButton)imageButton;
        return  zap_knop;
       }

       public  void registrNaj_2(ImageButton star_knop, ImageButton  nov_knop, boolean flag, int rej){
        //регистриурет второе нажатие, по заданным условиям , если всё ок то удаляет, если не ок то ставит стандратную пикчу

        if(nov_knop != star_knop ){

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    if(flag){
                        star_knop.setVisibility(View.INVISIBLE);
                        nov_knop.setVisibility(View.INVISIBLE);
                        schet++;
                        if(schet == rej){

                            konec(rej);

                            schet=0;
                        }
                    }else {
                        star_knop.setImageResource(id_stn);
                        nov_knop.setImageResource(id_stn);
                    }
                }
            }, 500);

        }else{
            nov_knop.setImageResource(id_stn);
        }
       }


        void konec(int rej)  {
        switch (rej){
            case 3:
                try {
                    Igra_6.cenok();
                }catch (IOException e){

                }
                break;

            case 4:
                try {
                    Igra_9.cenok();
                }catch (IOException e){

                }
                break;

            case 5:
                try {
                    Igra_10.cenok();
                }catch (IOException e){

                }
                break;

            case 6:
                try {
                    Igra_12.cenok();
                }catch (IOException e){

                }
                break;
        }
       }

    public  void write(String path, double vr) throws IOException {
        FileWriter fw = new FileWriter(path, true);
        fw.write(vr + "\n");
        fw.close();


    }

}
