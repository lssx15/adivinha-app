package br.com.etecia.advinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private Button botaoLimpar;
    private TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    botaoJogar=findViewById(R.id.botaoJogar);
    textoResultado=findViewById(R.id.textoResultado);
    botaoLimpar=findViewById(R.id.botaoLimpar);

    botaoJogar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Random random=new Random();
            int resultado= random.nextInt(10);
            textoResultado.setText("O resultado é:"+resultado);
        }
    });
    botaoLimpar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textoResultado.setText("");
        }
    });


    }

}
