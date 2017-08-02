package com.lightingcontour.codemechine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DecodeChoose extends AppCompatActivity
implements TextWatcher{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decode_choose);
        getSupportActionBar().hide();
        EditText deinputcodes = (EditText) findViewById(R.id.deinputcodes);
        deinputcodes.addTextChangedListener(this);
    }

    //    设置一变量demethod指示使用哪种解码方法
    int demethod = 0;
    //    设置String变量用于解码
    String Detextbefore,Detextafter;

    //    实现demethod指示解码方法
    public void deuse(View v) {
        RadioGroup demethodch =(RadioGroup) findViewById(R.id.demethodcho);
        switch (demethodch.getCheckedRadioButtonId()) {
            case R.id.deascbutton:
                demethod = 1;
                break;
            case R.id.demorbutton:
                demethod = 2;
                break;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

        Detextbefore = s.toString();
        char[] ch = Detextbefore.toCharArray();
        int rem =0;
        for (int i = 0;(i < ch.length );i++) {
            if (ch[i] == '/') {
                StringBuffer tbe = new StringBuffer();
                for (int count = rem;count<i;count++) {
                    tbe.append(ch[count]);
                }
                String Detexton = tbe.toString();
                rem = i+1;
                if (demethod == 1) {
                    check(ascde(Detexton));
                }
                if (demethod == 2) {
                    check(morsede(Detexton));
                }
            }
        }
        TextView detextshow = (TextView) findViewById(R.id.detextshow);
        detextshow.setText(Detextafter);
        Detextafter = "";
    }

    //    使用check方法检验是否为Unknown输入
    private  void check(char v) {
        if (v == ' ') {
            Detextafter = Detextafter + " " + "UKN";
        } else {
            Detextafter = Detextafter + " " + v;
        }
    }

    //    使用Morse解码
    private char morsede(String v) {
        char m;
        switch (v) {
            case ".-":
                m = 'A';
                break;
            case "-...":
                m ='B';
                break;
            case "-.-.":
                m ='C';
                break;
            case "-..":
                m ='D';
                break;
            case ".":
                m ='E';
                break;
            case "..-.":
                m ='F';
                break;
            case "--.":
                m ='G';
                break;
            case "....":
                m ='H';
                break;
            case "..":
                m ='I';
                break;
            case  ".---":
                m ='J';
                break;
            case  "-.-":
                m ='K';
                break;
            case  ".-..":
                m ='L';
                break;
            case  "--":
                m ='M';
                break;
            case  "-.":
                m ='N';
                break;
            case  "---":
                m ='O';
                break;
            case  ".--.":
                m ='P';
                break;
            case "--.-":
                m ='Q';
                break;
            case ".-.":
                m ='R';
                break;
            case "...":
                m ='S';
                break;
            case  "-":
                m ='T';
                break;
            case  "..-":
                m ='U';
                break;
            case  "...-":
                m ='V';
                break;
            case ".--":
                m ='W';
                break;
            case "-..-":
                m ='X';
                break;
            case "-.--":
                m ='Y';
                break;
            case "--..":
                m ='Z';
                break;
            case "-----":
                m ='0';
                break;
            case ".----":
                m ='1';
                break;
            case "..---":
                m ='2';
                break;
            case  "...--":
                m ='3';
                break;
            case "....-":
                m ='4';
                break;
            case ".....":
                m ='5';
                break;
            case "-....":
                m ='6';
                break;
            case "--...":
                m ='7';
                break;
            case "---..":
                m ='8';
                break;
            case "----.":
                m ='9';
                break;
            case ".-.-.-":
                m ='.';
                break;
            case "---...":
                m =':';
                break;
            case "--..--":
                m =',';
                break;
            case "-.-.-.":
                m =';';
                break;
            case "..--..":
                m ='?';
                break;
            case "-...-":
                m ='=';
                break;
            case ".----.":
                m ='\'';
                break;
            case "-..-.":
                m ='/';
                break;
            case "-.-.--":
                m ='!';
                break;
            case "-....-":
                m ='-';
                break;
            case "..--.-":
                m ='_';
                break;
            case ".-..-.":
                m ='"';
                break;
            case "-.--.":
                m ='(';
                break;
            case "-.--.-":
                m =')';
                break;
            case "...-..-":
                m ='$';
                break;
            case ".--.-.":
                m ='@';
                break;
            default:
                m = ' ';
                break;
        }
        return m;
    }

    //    使用ASCⅡ解码
    private char ascde(String v) {
        char m;
        switch (v) {
            case "21":
                m ='!';
                break;
            case "30":
                m  ='0';
                break;
            case "31":
                m ='1';
                break;
            case "32":
                m ='2';
                break;
            case "33":
                m ='3';
                break;
            case "34":
                m ='4';
                break;
            case "35":
                m ='5';
                break;
            case "36":
                m ='6';
                break;
            case "37":
                m ='7';
                break;
            case "38":
                m ='8';
                break;
            case "39":
                m ='9';
                break;
            case "3A":
                m =':';
                break;
            case "3B":
                m =';';
                break;
            case "3C":
                m ='<';
                break;
            case "3D":
                m ='=';
                break;
            case "3E":
                m ='>';
                break;
            case "3F":
                m ='?';
                break;
            case "40":
                m ='@';
                break;
            case "41":
                m ='A';
                break;
            case "42":
                m ='B';
                break;
            case "43":
                m ='C';
                break;
            case "44":
                m ='D';
                break;
            case "45":
                m ='E';
                break;
            case "46":
                m ='F';
                break;
            case "47":
                m ='G';
                break;
            case "48":
                m ='H';
                break;
            case "49":
                m ='I';
                break;
            case "4A":
                m ='J';
                break;
            case "4B":
                m ='K';
                break;
            case "4C":
                m ='L';
                break;
            case "4D":
                m ='M';
                break;
            case "4E":
                m ='N';
                break;
            case "4F":
                m ='O';
                break;
            case "50":
                m ='P';
                break;
            case "51":
                m ='Q';
                break;
            case "52":
                m ='R';
                break;
            case "53":
                m ='S';
                break;
            case "54":
                m ='T';
                break;
            case "55":
                m ='U';
                break;
            case "56":
                m ='V';
                break;
            case "57":
                m ='W';
                break;
            case "58":
                m ='X';
                break;
            case "59":
                m ='Y';
                break;
            case "5A":
                m ='Z';
                break;
            case "5B":
                m ='[';
                break;
            case "5C":
                m ='\\';
                break;
            case "5D":
                m =']';
                break;
            case "5E":
                m ='^';
                break;
            case "5F":
                m ='_';
                break;
            case "60":
                m ='`';
                break;
            case "61":
                m ='a';
                break;
            case "62":
                m ='b';
                break;
            case "63":
                m ='c';
                break;
            case "64":
                m ='d';
                break;
            case "65":
                m ='e';
                break;
            case "66":
                m ='f';
                break;
            case "67":
                m ='g';
                break;
            case "68":
                m ='h';
                break;
            case "69":
                m ='i';
                break;
            case "6A":
                m ='j';
                break;
            case "6B":
                m ='k';
                break;
            case "6C":
                m ='l';
                break;
            case "6D":
                m ='m';
                break;
            case "6E":
                m ='n';
                break;
            case "6F":
                m ='o';
                break;
            case "70":
                m ='p';
                break;
            case "71":
                m ='q';
                break;
            case "72":
                m ='r';
                break;
            case "73":
                m ='s';
                break;
            case "74":
                m ='t';
                break;
            case "75":
                m ='u';
                break;
            case "76":
                m ='v';
                break;
            case "77":
                m ='w';
                break;
            case "78":
                m ='x';
                break;
            case "79":
                m ='y';
                break;
            case "7A":
                m ='z';
                break;
            default:
                m =' ';
                break;
        }
        return m;
    }
}