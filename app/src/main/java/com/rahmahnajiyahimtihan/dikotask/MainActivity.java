package com.rahmahnajiyahimtihan.dikotask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    EditText editText;
    TextView txtKm, txtHm, txtDam, txtM, txtDm, txtCm, txtMm;

    private String[] list = {
            "km", "hm", "dam", "m", "dm", "cm", "mm"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinnerPnjg);
        editText = (EditText) findViewById(R.id.edtInput);
        txtKm = (TextView) findViewById(R.id.angkaKm);
        txtHm = (TextView) findViewById(R.id.angkaHm);
        txtDam = (TextView) findViewById(R.id.angkaDam);
        txtM = (TextView) findViewById(R.id.angkaM);
        txtDm = (TextView) findViewById(R.id.angkaDm);
        txtCm = (TextView) findViewById(R.id.angkaCm);
        txtMm = (TextView) findViewById(R.id.angkaMm);


        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        int a = 0; //dibuat global
        try{ //mencoba dulu dia adalah integer apa bkn? yg dibawah ini klo dia bkn int berarti dia ngasih tau klo itu number format exception, try butuh catch
            a = Integer.parseInt(editText.getText().toString());
        } catch (NumberFormatException e){
            Log.e("error", "" + e);
        }


        if (list[i] == "km"){
            double km = a * 1;
            txtKm.setText(""+km);
            double hm = a * 10;
            txtHm.setText(""+hm);
            double dam = a * 100;
            txtDam.setText(""+dam);
            double m = a * 1000;
            txtM.setText(""+m);
            double dm = a * 10000;
            txtDm.setText(""+dm);
            double cm = a * 100000;
            txtCm.setText(""+cm);
            double mm = a * 1000000;
            txtMm.setText(""+mm);


        }
        else if (list[i] == "hm"){
            double km = a * 0.1;
            txtKm.setText(""+km);
            double hm = a * 1;
            txtHm.setText(""+hm);
            double dam = a * 10;
            txtDam.setText(""+dam);
            double m = a * 100;
            txtM.setText(""+m);
            double dm = a * 1000;
            txtDm.setText(""+dm);
            double cm = a * 10000;
            txtCm.setText(""+cm);
            double mm = a * 100000;
            txtMm.setText(""+mm);
        }
        else if (list[i] == "dam"){
            double km = a * 0.01;
            txtKm.setText(""+km);
            double hm = a * 0.1;
            txtHm.setText(""+hm);
            double dam = a * 1;
            txtDam.setText(""+dam);
            double m = a * 10;
            txtM.setText(""+m);
            double dm = a * 100;
            txtDm.setText(""+dm);
            double cm = a * 1000;
            txtCm.setText(""+cm);
            double mm = a * 10000;
            txtMm.setText(""+mm);
        }
        else if (list[i] == "m"){
            double km = a * 0.001;
            txtKm.setText(""+km);
            double hm = a * 0.01;
            txtHm.setText(""+hm);
            double dam = a * 0.1;
            txtDam.setText(""+dam);
            double m = a * 1;
            txtM.setText(""+m);
            double dm = a * 10;
            txtDm.setText(""+dm);
            double cm = a * 100;
            txtCm.setText(""+cm);
            double mm = a * 1000;
            txtMm.setText(""+mm);
        }
        else if (list[i] == "dm"){
            double km = a * 0.0001;
            txtKm.setText(""+km);
            double hm = a * 0.001;
            txtHm.setText(""+hm);
            double dam = a * 0.01;
            txtDam.setText(""+dam);
            double m = a * 0.1;
            txtM.setText(""+m);
            double dm = a * 1;
            txtDm.setText(""+dm);
            double cm = a * 10;
            txtCm.setText(""+cm);
            double mm = a * 100;
            txtMm.setText(""+mm);
        }
        else if (list[i] == "cm"){
            double km = a * 0.00001;
            txtKm.setText(""+km);
            double hm = a * 0.0001;
            txtHm.setText(""+hm);
            double dam = a * 0.001;
            txtDam.setText(""+dam);
            double m = a * 0.01;
            txtM.setText(""+m);
            double dm = a * 0.1;
            txtDm.setText(""+dm);
            double cm = a * 1;
            txtCm.setText(""+cm);
            double mm = a * 10;
            txtMm.setText(""+mm);


        }
        else if (list[i] == "mm"){
            double km = a * 0.000001;
            txtKm.setText(""+km);
            double hm = a * 0.00001;
            txtHm.setText(""+hm);
            double dam = a * 0.0001;
            txtDam.setText(""+dam);
            double m = a * 0.001;
            txtM.setText(""+m);
            double dm = a * 0.01;
            txtDm.setText(""+dm);
            double cm = a * 0.1;
            txtCm.setText(""+cm);
            double mm = a * 1;
            txtMm.setText(""+mm);


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
