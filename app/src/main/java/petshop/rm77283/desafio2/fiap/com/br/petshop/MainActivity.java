package petshop.rm77283.desafio2.fiap.com.br.petshop;


import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static petshop.rm77283.desafio2.fiap.com.br.petshop.R.id.c1;

public class MainActivity extends AppCompatActivity {

    CheckBox femea, adestrado, vacina;
    RadioGroup rGroup;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rGroup = (RadioGroup)findViewById(R.id.rGroup);
        resultado = (TextView)findViewById(R.id.calculcar);
        femea = (CheckBox)findViewById(R.id.femea);
        adestrado = (CheckBox)findViewById(R.id.adestrado);
        vacina = (CheckBox)findViewById(R.id.vacina);
    }

            public void botao(View v) {

                double preco = 0;
                double somar = 0;

                int rg = rGroup.getCheckedRadioButtonId();
                if(rg == R.id.c1){
                    preco = 800;
                    resultado.setText("R$ " + preco);
                }else if(rg == R.id.c2){
                    preco = 750;
                    resultado.setText("R$ " + preco);
                }else if(rg == R.id.c3){
                    preco = 700;
                    resultado.setText(",R$ " + preco);
                }else if(rg == R.id.c4){
                    preco = 800;
                    resultado.setText("R$ " + preco);
                }else{
                    preco = 00.00;
                    resultado.setText("R$ " + preco);
                }

                if(femea.isChecked()){

                    preco = (preco + 180);
                    resultado.setText("R$ " + preco);
                }
                if(adestrado.isChecked()){

                    preco = (preco + 400);
                    resultado.setText("R$ " + preco);
                }
                if(vacina.isChecked()){

                    preco = (preco + 200);
                    resultado.setText("R$ " + preco);
                }

                if(femea.isChecked() == false && adestrado.isChecked() == false && vacina.isChecked() == false){
                    somar = 0;
                    preco = (preco + somar);
                    resultado.setText("R$ " + preco);
                }




}



}
