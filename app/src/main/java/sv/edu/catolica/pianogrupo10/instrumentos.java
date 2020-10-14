package sv.edu.catolica.pianogrupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class instrumentos extends AppCompatActivity {
    MediaPlayer nota1,nota2,nota3,nota4,nota5,nota6,nota7;
    private static final int TIEMPO = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrumentos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.piano:
                Intent ventana= new Intent(instrumentos.this,piano_tradicional.class);
                startActivity(ventana);
                break;
            case R.id.animales:
                Intent ventana2= new Intent(instrumentos.this,animales.class);
                startActivity(ventana2);
                break;
            case R.id.instrumentos:
                Intent ventana3= new Intent(instrumentos.this,instrumentos.class);
                startActivity(ventana3);
                break;
            case R.id.imformacion:
                Intent ventana4= new Intent(instrumentos.this,acerca_de.class);
                startActivity(ventana4);
                break;
            case R.id.salir:
                finishAffinity();
                super.onDestroy();
                android.os.Process.killProcess(android.os.Process.myPid());
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void one(View v){
        nota1=MediaPlayer.create(this,R.raw.guitarra);
        nota1.start();
        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(this, "Pulsaste Guitarra", TIEMPO);

        toast.show();
    }
    public void dos(View v){
        nota2=MediaPlayer.create(this,R.raw.trompeta);
        nota2.start();
        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(this, "Pulsaste Trompeta", TIEMPO);
        toast.show();
    }
    public void tres(View v){
        nota3=MediaPlayer.create(this,R.raw.campana);
        nota3.start();
        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(this, "Pulsaste Campana", TIEMPO);
        toast.show();
    }
    public void cuatro(View v){
        nota4=MediaPlayer.create(this,R.raw.trombon);
        nota4.start();
        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(this, "Pulsaste Trombon", TIEMPO);
        toast.show();
    }

    public void cinco(View v){
        nota5=MediaPlayer.create(this,R.raw.violin);
        nota5.start();
        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(this, "Pulsaste Violin", TIEMPO);
        toast.show();
    }
    public void seis(View v){
        nota6=MediaPlayer.create(this,R.raw.saxo);
        nota6.start();
        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(this, "Pulsaste Saxo", TIEMPO);
        toast.show();
    }
    public void siete(View v){
        nota7=MediaPlayer.create(this,R.raw.tambor);
        nota7.start();
        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(this, "Pulsaste Tambor", TIEMPO);
        toast.show();
    }

}