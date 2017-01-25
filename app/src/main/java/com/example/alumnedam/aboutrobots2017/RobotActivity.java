package com.example.alumnedam.aboutrobots2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RobotActivity extends AppCompatActivity implements View.OnClickListener {

    private int numeroVeces = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot);

        //  inicializar botones

        Button btnNoTocar = (Button) findViewById(R.id.btnNoTocar);
        btnNoTocar.setOnClickListener(this);

        ImageButton btnClose = (ImageButton) findViewById(R.id.btnClose);
        btnClose.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnNoTocar) {

            this.editarActividad(v);
        }

        if(v.getId() == R.id.btnClose){
            finish();
            System.exit(0);
        }

    }

    public void editarActividad(View v){

        numeroVeces++;

        Button btnNoTocar = (Button) v;
        TextView textView = (TextView) findViewById(R.id.textView);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        if (numeroVeces == 1) {
            btnNoTocar.setText("Que no me toques!!!");
            textView.setText("Parece ser que los humanos no son muy listos.");
            imageView.setImageResource(R.mipmap.bender2);
        }

        if (numeroVeces > 1) {
            btnNoTocar.setVisibility(View.INVISIBLE);
        }

    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("numeroVeces",numeroVeces);
    }

}




/*
package com.example.alumnedam.lifecycle;

import java.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String fechaInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificar("onCreate");

        if(savedInstanceState == null){

            Calendar calendarHora = Calendar.getInstance();
            int hora = calendarHora.get(Calendar.HOUR_OF_DAY);
            int minuto = calendarHora.get(Calendar.MINUTE);
            int segundo = calendarHora.get(Calendar.SECOND);
            fechaInicio = "Aplicacion iniciada a las "+ hora +":"+ minuto +":"+segundo;

        } else {

            fechaInicio = savedInstanceState.getString("fechaHora");

        }

        TextView textView = (TextView) findViewById(R.id.textFecha);
        textView.setText(fechaInicio);


    }

    protected void onStart(){
        super.onStart();
        notificar("onStart");
    }

    protected void onRestart(){
        super.onRestart();
        notificar("onRestart");
    }

    protected void onResumne(){
        super.onResume();
        notificar("onResume");
    }

    protected void onPause(){
        super.onPause();
        notificar("onPause");
    }

    protected void onStop(){
        super.onStop();
        notificar("onStop");
    }

    protected void onDestroy(){
        super.onDestroy();
        notificar("onDestroy");
    }

    public void notificar(String frase){
        Toast.makeText(this,frase,Toast.LENGTH_SHORT).show();
        Log.i(frase,frase);
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("fechaHora",fechaInicio);
    }
}

 */
