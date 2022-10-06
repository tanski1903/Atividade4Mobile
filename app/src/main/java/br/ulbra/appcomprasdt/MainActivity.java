package br.ulbra.appcomprasdt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    CheckBox cbItem1, cbItem2, cbItem3, cbItem4;
    Button btTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbItem1 = (CheckBox) findViewById(R.id.cbItem1);
        cbItem2 = (CheckBox) findViewById(R.id.cbItem2);
        cbItem3 = (CheckBox) findViewById(R.id.cbItem3);
        cbItem4 = (CheckBox) findViewById(R.id.cbItem4);
        btTotal = (Button) findViewById(R.id.btTotal);
        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0;
                DecimalFormat f = new DecimalFormat("#.##");
                if (cbItem1.isChecked()){total += 2.69;}
                if (cbItem2.isChecked()) {total += 5.00;}
                if (cbItem3.isChecked()) {total += 9.7;}
                if (cbItem4.isChecked()) {total += 2.3;}

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Aviso");
                    dialogo.setMessage("Valor total da compra: " + String.valueOf(f.format(total)));
                    dialogo.setNeutralButton("Ok",null);
                    dialogo.show();
            }
        });
    }
}