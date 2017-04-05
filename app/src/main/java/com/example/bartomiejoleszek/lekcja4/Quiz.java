package com.example.bartomiejoleszek.lekcja4;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Bartłomiej Oleszek on 04.04.2017.
 */

public class Quiz extends MainActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);


    }

    public int wynik=0;
    public void owoc1(View view)
    {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
        RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);

        int zaznaczonyId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton)findViewById(zaznaczonyId);


        if(radioButton.equals(radio1))
        {
            wynik++;
        }


    }

    public void owoc2(View view)
    {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup2);
        RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton3);


        int zaznaczonyId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton)findViewById(zaznaczonyId);


        if(radioButton.equals(radio1))
        {
            wynik++;
        }


    }

    public void owoc3(View view)
    {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup3);
        RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton6);

        int zaznaczonyId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton)findViewById(zaznaczonyId);


        if(radioButton.equals(radio1))
        {
            wynik++;
        }


    }

    public void owoc4(View view)
    {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup4);
        RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton8);


        int zaznaczonyId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton)findViewById(zaznaczonyId);


        if(radioButton.equals(radio1))
        {
            wynik++;
        }


    }

    public void owoc5(View view)
    {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup5);
        RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton9);


        int zaznaczonyId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton)findViewById(zaznaczonyId);


        if(radioButton.equals(radio1))
        {
            wynik++;
        }

    }

    public  void Wyswietl(View view)
    {
        int results=wynik;
        Toast.makeText(getApplicationContext(),"Twój wynik:"+wynik,Toast.LENGTH_SHORT).show();
}   }
