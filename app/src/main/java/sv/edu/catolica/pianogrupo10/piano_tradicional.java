package sv.edu.catolica.pianogrupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class piano_tradicional extends AppCompatActivity {
    MediaPlayer notas1,notas2,notas3,notas4,notas5,notas6,notas7,n1,n2,n3,n4,n5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_tradicional);
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
                Intent ventana= new Intent(piano_tradicional.this,piano.class);
                startActivity(ventana);
                break;
            case R.id.animales:
                Intent ventana2= new Intent(piano_tradicional.this,animales.class);
                startActivity(ventana2);
                break;
            case R.id.instrumentos:
                Intent ventana3= new Intent(piano_tradicional.this,instrumentos.class);
                startActivity(ventana3);
                break;
            case R.id.imformacion:
                Intent ventana4= new Intent(piano_tradicional.this,acerca_de.class);
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
        notas1=MediaPlayer.create(this,R.raw.notado);
        notas1.start();

        Toast toast = Toast.makeText(this, "Pulsaste Do", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void dos(View v){
        notas2=MediaPlayer.create(this,R.raw.re);
        notas2.start();
        Toast toast = Toast.makeText(this, "Pulsaste Re", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void tres(View v){
        notas3=MediaPlayer.create(this,R.raw.mi);
        notas3.start();
        Toast toast = Toast.makeText(this, "Pulsaste Mi", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void cuatro(View v){
        notas4=MediaPlayer.create(this,R.raw.fa);
        notas4.start();
        Toast toast = Toast.makeText(this, "Pulsaste Fa", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void cinco(View v){
        notas5=MediaPlayer.create(this,R.raw.sol);
        notas5.start();
        Toast toast = Toast.makeText(this, "Pulsaste Sol", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void seis(View v){
        notas6=MediaPlayer.create(this,R.raw.la);
        notas6.start();
        Toast toast = Toast.makeText(this, "Pulsaste La", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void siete(View v){
        notas7=MediaPlayer.create(this,R.raw.si);
        notas7.start();
        Toast toast = Toast.makeText(this, "Pulsaste Si", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void n1(View v){
        n1=MediaPlayer.create(this,R.raw.dosharp);
        n1.start();

        Toast toast = Toast.makeText(this, "Pulsaste DoSos", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void n2(View v){
        n2=MediaPlayer.create(this,R.raw.resharp);
        n2.start();
        Toast toast = Toast.makeText(this, "Pulsaste ReSos", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void n3(View v){
        n3=MediaPlayer.create(this,R.raw.fasharp);
        n3.start();
        Toast toast = Toast.makeText(this, "Pulsaste FaSos", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void n4(View v){
        n4=MediaPlayer.create(this,R.raw.solsharp);
        n4.start();
        Toast toast = Toast.makeText(this, "Pulsaste SolSos", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void n5(View v){
        n5=MediaPlayer.create(this,R.raw.lasharp);
        n5.start();
        Toast toast = Toast.makeText(this, "Pulsaste LaSos", Toast.LENGTH_SHORT);
        toast.show();
    }
}