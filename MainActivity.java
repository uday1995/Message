package com.example.uday.message;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button sendSMSBtn;
    EditText toPhoneNumberET;
    EditText smsMessageET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendSMSBtn = (Button) findViewById(R.id.button);
        toPhoneNumberET = (EditText) findViewById(R.id.e1);
        smsMessageET = (EditText) findViewById(R.id.e2);
        sendSMSBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSMS();
            }
        });
    }
    protected void sendSMS(){
        String forprint=toPhoneNumberET.getText().toString();
        String forprint2=smsMessageET.getText().toString();
        try {
            SmsManager a=SmsManager.getDefault().getDefault();
            a.sendTextMessage(forprint,null,forprint2,null,null);
            Toast.makeText(getApplicationContext(), "sms sent", Toast.LENGTH_LONG).show();


        } catch (Exception e){
            Toast.makeText(getApplicationContext(),"sms sent failed",Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
