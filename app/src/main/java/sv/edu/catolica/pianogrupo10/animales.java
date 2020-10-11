package sv.edu.catolica.pianogrupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class animales extends AppCompatActivity {

    MediaPlayer notasTigre,notasMono,notasGallina,notasVaca,notasPerro,notasGato,notasElefante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
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
                Intent ventana= new Intent(animales.this,piano.class);
                startActivity(ventana);
                break;
            case R.id.animales:
                Intent ventana2= new Intent(animales.this,animales.class);
                startActivity(ventana2);
                break;
            case R.id.instrumentos:
                Intent ventana3= new Intent(animales.this,instrumentos.class);
                startActivity(ventana3);
                break;
            case R.id.imformacion:
                Intent ventana4= new Intent(animales.this,acerca_de.class);
                startActivity(ventana4);
                break;
            case R.id.salir:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void tonoTigre(View v){
        notasTigre= MediaPlayer.create(this,R.raw.sound_tigre);
        notasTigre.start();
    }
    public void tonoMono(View v){
        notasMono=MediaPlayer.create(this,R.raw.sound_mono);
        notasMono.start();
    }
    public void tonoGallina(View v){
        notasGallina=MediaPlayer.create(this,R.raw.sound_gallina);
        notasGallina.start();
    }
    public void tonoVaca(View v){
        notasVaca=MediaPlayer.create(this,R.raw.sound_vaca);
        notasVaca.start();
    }

    public void tonoPerro(View v){
        notasPerro=MediaPlayer.create(this,R.raw.sound_perro);
        notasPerro.start();
    }
    public void tonoGato(View v){
        notasGato=MediaPlayer.create(this,R.raw.sound_gato);
        notasGato.start();
    }
    public void tonoElefante(View v){
        notasElefante=MediaPlayer.create(this,R.raw.sound_elefante);
        notasElefante.start();
    }
}