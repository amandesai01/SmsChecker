package com.example.demo.smssender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etMessage, etPhone;
    Button btnSend;

    protected void setOnclick(){
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = etMessage.getText().toString();
                String ph = etPhone.getText().toString();
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(ph, null, msg, null, null);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend = findViewById(R.id.btnSend);
        etMessage = findViewById(R.id.etMessage);
        etPhone = findViewById(R.id.etPhone);


    }
}
