package com.rosstox26.aramis.projectaramis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class TermsConditions extends Activity implements View.OnClickListener {

    private CheckBox checkBoxAccept;
    private Button buttonContinue;
    private Button buttonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_conditions);

        checkBoxAccept = (CheckBox) findViewById(R.id.checkBoxAccept);
        buttonContinue = (Button) findViewById(R.id.buttonContinue);
        buttonBack = (Button) findViewById(R.id.buttonBack);


        buttonContinue.setOnClickListener(this);
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == buttonContinue) {

            if (checkBoxAccept.isChecked()) {
                //where should this take you?
                //Intent intentContinue = new Intent(TermsConditions.this, )
            } else {
                Toast.makeText(this, "Please review and accept the Terms & Conditions to continue", Toast.LENGTH_SHORT).show();
            }
        } else if (view == buttonBack) {
            //where should this take you?
            //Intent intentBack = new Intent(TermsConditions.this, )
        }

    }
}

