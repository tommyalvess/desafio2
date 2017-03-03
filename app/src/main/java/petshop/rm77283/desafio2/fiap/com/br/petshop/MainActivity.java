package petshop.rm77283.desafio2.fiap.com.br.petshop;


import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    CheckBox femea, adestrado, vacina;


    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        femea = (CheckBox) findViewById(R.id.femea);
        adestrado = (CheckBox) findViewById(R.id.adestrado);
        vacina = (CheckBox) findViewById(R.id.vacina);
        resultado = (TextView) findViewById(R.id.calculcar);
        c1 = (RadioButton) findViewById(R.id.c1);


    }

            public void botao(View v) {

                double resultado = 0;
                if (c1.isChecked() && femea.isChecked()) {
                    resultado = 800.00 + 180.00;
                }

            }



}
