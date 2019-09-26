package com.example.percentage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import formula.CalculatePercentage;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     private EditText etName, etAPI, etAndroid, etIPC;
     private Button btnPercentage;
     private TextView txtData;
     private String name;
     private int marksAPI, marksAndroid, marksIPC, percentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etAPI = findViewById(R.id.etAPI);
        etIPC = findViewById(R.id.etIPC);
        etAndroid = findViewById(R.id.etAndriod);
        btnPercentage = findViewById(R.id.btnPercentage);

        etName = findViewById(R.id.etName);
        txtData = findViewById(R.id.txtData);
        btnPercentage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnPercentage){
            name = etName.getText().toString();
            marksAPI = Integer.parseInt(etAPI.getText().toString());
            marksAndroid = Integer.parseInt(etAndroid.getText().toString());
            marksIPC = Integer.parseInt(etIPC.getText().toString());

            CalculatePercentage cal = new CalculatePercentage(marksIPC , marksAndroid , marksAPI);
                percentage = cal.Percentage();
                appendStuffs();
                etName.getText().clear();
                etAPI.getText().clear();
                etAndroid.getText().clear();
                etIPC.getText().clear();

        }

    }
    private void appendStuffs(){
        txtData.append("Name: "+name +", Percentage:"+ Integer.toString(percentage)+ "\n");
    }
}
