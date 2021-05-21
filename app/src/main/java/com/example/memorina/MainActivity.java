package com.example.memorina;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final int PERMISSION_WRITE_EXTERNAL_STORAGE = 2 ;
    Button bt_game, bt_tr;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void permission(){
        int permissionStatus_write = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if(permissionStatus_write == PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    PERMISSION_WRITE_EXTERNAL_STORAGE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        bt_game = (Button) findViewById(R.id.bt_gm);
        bt_tr = (Button) findViewById(R.id.button9);


            permission();

        bt_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //заглушка, тут будут крутые фрагменты выбора режима игры, а из них будет запускаться сами классы игры
                Intent intent = new Intent(MainActivity.this , vubor_rej.class);
                startActivityForResult(intent,0);
                //TODO
            }
        });



        bt_tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //заглушка, тут будут крутые фрагменты выбора режима игры, а из них будет запускаться сами классы игры
                Intent intent = new Intent(MainActivity.this , stata.class);
                startActivityForResult(intent,1);
                //TODO
            }
        });

    }
}