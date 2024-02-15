package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView nombreUsuario;
   Button btn1,btn2,btnsend;
   String Tag = "Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btnsend = findViewById(R.id.btnsend);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Uno");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Dos");
            }
        });

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasarInformacion();                
            }
        });


    }

    private void pasarInformacion(){
        String textoactual = nombreUsuario.getText().toString();
        String nombre = "Juan Carlos"
        Intent pasarinfo = new Intent(this,Pantallados.class);
        pasarinfo.putExtra("name",nombre);
        startActivity(pasarinfo);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"Estoy en OnStart");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"Estoy en OnResume");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"Estoy en OnPause");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"Estoy en OnStop");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en OnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"Estoy en OnRestart");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en OnStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"Estoy en OnDestroy");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en OnStart");
    }
}