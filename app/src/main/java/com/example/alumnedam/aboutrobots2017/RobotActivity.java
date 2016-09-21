package com.example.alumnedam.aboutrobots2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RobotActivity extends AppCompatActivity implements View.OnClickListener {

    private int numeroVeces = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot);

        //  busco el botón y se inicializa

        Button btnNoTocar = (Button) findViewById(R.id.btnNoTocar);
        //btonNoTocar.setText("");
        btnNoTocar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        Button btnNoTocar = (Button) v;
        TextView textView = (TextView) findViewById (R.id.textView);

        numeroVeces++;

        if(numeroVeces==1){
            btnNoTocar.setText("Que no me toques!!!");
            textView.setText("Parece ser que los humanos no son muy listos.");
        }

    }

}
