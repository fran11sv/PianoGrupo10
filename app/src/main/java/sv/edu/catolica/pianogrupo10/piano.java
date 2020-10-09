package sv.edu.catolica.pianogrupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class piano extends AppCompatActivity {

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


}