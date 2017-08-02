package com.lightingcontour.codemechine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getSupportActionBar().hide();
    }

    public void inputsizechange(View v) {
        EditText deinputcodes =(EditText) findViewById(R.id.deinputcodes);
        EditText eninputcodes =(EditText)findViewById(R.id.eninputcodes);
        RadioGroup in =(RadioGroup)findViewById(R.id.inputsizeradio);
        switch (in.getCheckedRadioButtonId()) {
            case R.id.input14:
                deinputcodes.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                eninputcodes.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                break;
            case R.id.input18:
                deinputcodes.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                eninputcodes.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                break;
        }
    }

    public void outputsizechange(View v) {
        TextView detextshow =(TextView)findViewById(R.id.detextshow);
        TextView entextshow =(TextView)findViewById(R.id.entextshow);
        RadioGroup out =(RadioGroup)findViewById(R.id.outputsizeradio);
        switch (out.getCheckedRadioButtonId()) {
            case R.id.output14:
                detextshow.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                entextshow.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
                break;
            case R.id.output18:
                detextshow.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                entextshow.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                break;
        }
    }
}
