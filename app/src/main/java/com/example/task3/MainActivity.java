package com.example.task3;
import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;

import android.text.TextWatcher;

import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView label;

    EditText rvalue, gvalue,bvalue;



    int rval,gval, bval;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        label = (TextView) findViewById(R.id.label);

        rvalue =(EditText) findViewById(R.id.rvalue);

        gvalue =(EditText)findViewById(R.id.gvalue);

        bvalue = (EditText) findViewById(R.id.bvalue);

        rvalue.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if((charSequence.length()>0 && charSequence.charAt(0)=='-') && charSequence.length()>=2)

                {

                    rval =Integer.parseInt(charSequence.toString());

                    if(rval>255)

                        rval = 255;

                    if(rval<0)

                        rval = 0;

                }

                if((charSequence.length()>0 && charSequence.charAt(0)!='-'))

                {

                    rval =Integer.parseInt(charSequence.toString());

                    if(rval>255)

                        rval = 255;

                    if(rval<0)

                        rval = 0;

                }

                if(rval>=0 && rval<=255 && gval>=0 && gval<=255 && bval>=0 && bval<=255)

                    label.setBackgroundColor(Color.rgb(rval, gval, bval));

            }

            @Override

            public void afterTextChanged(Editable editable) {

            }

        });

        gvalue.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {



                if((charSequence.length()>0 && charSequence.charAt(0)=='-') && charSequence.length()>=2)

                {



                    gval =Integer.parseInt(charSequence.toString());



                    if(gval>255)

                        gval = 255;

                    if(gval<0)

                        gval = 0;

                }

                if((charSequence.length()>0 && charSequence.charAt(0)!='-'))

                {

                    if(!charSequence.toString().equalsIgnoreCase("") ) {

                        gval =Integer.parseInt(charSequence.toString());

                        if(gval>255)

                            gval = 255;

                        if(gval<0)

                            gval = 0;

                    }

                }

                if(rval>=0 && rval<=255 && gval>=0 && gval<=255 && bval>=0 && bval<=255)

                    label.setBackgroundColor(Color.rgb(rval, gval, bval));

            }

            @Override

            public void afterTextChanged(Editable editable) {
            }
        });
        bvalue.addTextChangedListener(new TextWatcher() {
            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if((charSequence.length()>0 && charSequence.charAt(0)=='-')&& charSequence.length()>=2 )

                {



                    bval =Integer.parseInt(charSequence.toString());

                    if(bval>255)

                        bval = 255;

                    if(bval<0)

                        bval = 0;

                }

                if((charSequence.length()>0 && charSequence.charAt(0)!='-'))

                {



                    bval =Integer.parseInt(charSequence.toString());

                    if(bval>255)

                        bval = 255;

                    if(bval<0)

                        bval = 0;

                }

                if(rval>=0 && rval<=255 && gval>=0 && gval<=255 && bval>=0 && bval<=255)

                    label.setBackgroundColor(Color.rgb(rval, gval, bval));

            }

            @Override

            public void afterTextChanged(Editable editable) {

            }

        });

    }

}

