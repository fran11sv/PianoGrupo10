package sv.edu.catolica.pianogrupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class instrumentos extends AppCompatActivity {

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
                Intent ventana= new Intent(instrumentos.this,piano.class);
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
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}