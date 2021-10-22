package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Integer contador;
    private Button b1;
    private Button b2;
    private TextView showCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PRIMER BOTON NOTIFICAR
        b1 = findViewById(R.id.buttonToast);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(MainActivity.this, showCount.getText(), Toast.LENGTH_SHORT).show();
                }
        });
        //SEGUNDO BOTON CONTAR Y CAMBIAR TEXTO
        b2 = findViewById(R.id.buttonCount);
        showCount = (TextView) findViewById(R.id.showCount);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = Integer.parseInt(showCount.getText().toString());
                contador ++;
                showCount.setText(contador.toString());
            }
        });
    }
}
