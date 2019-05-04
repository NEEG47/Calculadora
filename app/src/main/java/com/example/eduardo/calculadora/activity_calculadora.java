package com.example.eduardo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_calculadora extends AppCompatActivity implements View.OnClickListener{

    TextView txtSalida;
    Button btnC;
    Button btnDel;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btnDiv;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btnMult;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnRest;
    Button btn0;
    Button btnPunto;
    Button btnSum;
    Button btnIgu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnSaludo=(Button)findViewById(R.id.btnSaludo);
        tvSaludo=(TextView)findViewById(R.id.tvSaludo);

        btnSaludo.setOnClickListener(this); //this se refiere a la clase actual
        btnDespedida.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnSaludo) {
            tvSaludo.setText("Hola" + etUsuario.getText());
        }
        else if (view.getId()==R.id.btnDespedida){
            tvDespedida.setText("¡Nos Vemos Pronto!" + etUsuario.getText());
        }
    }

}
