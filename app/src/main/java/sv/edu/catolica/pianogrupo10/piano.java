package sv.edu.catolica.pianogrupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class piano extends AppCompatActivity {
    MediaPlayer notas1,notas2,notas3,notas4,notas5,notas6,notas7,n1,n2,n3,n4,n5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);
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

                break;
            case R.id.animales:

                break;
            case R.id.instrumentos:

                break;
            case R.id.imformacion:
                Intent ventana= new Intent(piano.this,acerca_de.class);
                startActivity(ventana);
                break;
            case R.id.salir:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void one(View v){
        notas1=MediaPlayer.create(this,R.raw.notado);
        notas1.start();
    }
    public void dos(View v){
        notas2=MediaPlayer.create(this,R.raw.re);
        notas2.start();
    }
    public void tres(View v){
        notas3=MediaPlayer.create(this,R.raw.mi);
        notas3.start();
    }
    public void cuatro(View v){
        notas4=MediaPlayer.create(this,R.raw.fa);
        notas4.start();
    }

    public void cinco(View v){
        notas5=MediaPlayer.create(this,R.raw.sol);
        notas5.start();
    }
    public void seis(View v){
        notas6=MediaPlayer.create(this,R.raw.la);
        notas6.start();
    }
    public void siete(View v){
        notas7=MediaPlayer.create(this,R.raw.si);
        notas7.start();
    }


    public void n1(View v){
        n1=MediaPlayer.create(this,R.raw.dosharp);
        n1.start();
    }
    public void n2(View v){
        n2=MediaPlayer.create(this,R.raw.resharp);
        n2.start();
    }
    public void n3(View v){
        n3=MediaPlayer.create(this,R.raw.fasharp);
        n3.start();
    }
    public void n4(View v){
        n4=MediaPlayer.create(this,R.raw.solsharp);
        n4.start();
    }
    public void n5(View v){
        n5=MediaPlayer.create(this,R.raw.lasharp);
        n5.start();
    }


}