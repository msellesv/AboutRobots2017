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

}


