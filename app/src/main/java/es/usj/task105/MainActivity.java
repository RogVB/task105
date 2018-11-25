package es.usj.task105;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import es.usj.libcalculos.Calculos;

public class MainActivity extends AppCompatActivity {

    EditText etValor1, etValor2;
    CheckBox cbSumar, cbRestar;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1=findViewById(R.id.etValor1);
        etValor2=findViewById(R.id.etValor2);
        tvResultado=findViewById(R.id.tvResultado);
        cbSumar=findViewById(R.id.cbSumar);
        cbRestar=findViewById(R.id.cbRestar);
    }

    public void Operar(View view){

        String valor1=etValor1.getText().toString();
        String valor2=etValor2.getText().toString();
        String resultado="";
        if (cbSumar.isChecked()) {
            resultado ="La suma es: "+ Calculos.Sumar(new String[]{valor1, valor2});
        }
        if (cbRestar.isChecked()) {
            resultado=resultado + "\nLa resta es: "+ Calculos.Restar(new String[]{valor1, valor2});
        }
        tvResultado.setText(resultado);
    }

}
