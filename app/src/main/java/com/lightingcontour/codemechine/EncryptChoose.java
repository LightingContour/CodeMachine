package com.lightingcontour.codemechine;

import android.content.ClipData;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.content.ClipboardManager;

public class EncryptChoose extends AppCompatActivity
implements TextWatcher{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt_choose);
        getSupportActionBar().hide();
        EditText eninputcodes =(EditText) findViewById(R.id.eninputcodes);
        eninputcodes.addTextChangedListener(this);
    }

    //    设置一变量enmethod指示使用哪种译码方法
    int enmethod = 0;
    //    设置String变量用于译码
    String Detextbefore,Detextafter;

    //    实现enmethod指示译码方法
    public void enuse(View v) {
        RadioGroup enmethodch =(RadioGroup) findViewById(R.id.enmethodcho);
        switch (enmethodch.getCheckedRadioButtonId()) {
            case R.id.enascbutton:
                enmethod = 1;
                break;
            case R.id.enmorbutton:
                enmethod = 2;
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
                if (enmethod == 1) {
                    check(ascen(Detexton));
                }
                if (enmethod == 2) {
                    check(moren(Detexton));
                }

            }
        }
        EditText entextshow = (EditText) findViewById(R.id.entextshow);
        entextshow.setText(Detextafter);
        Detextafter = "";
    }

    //    使用check方法检验是否为Unknown输入
    private  void check(String v) {
        if (v == " ") {
            Detextafter = Detextafter + "/" + "UKN";
        } else {
            Detextafter = Detextafter + "/" + v;
        }
    }

    public void paste(){
        ClipboardManager enclipboard;
        enclipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        ClipData enclip;
        enclip = ClipData.newPlainText("kkk","kkkkkkkkk");
        enclipboard.setPrimaryClip(enclip);
    }

    private String ascen(String v) {
        String m;
        switch (v) {
            case "!":
                m ="21";
                break;
            case "0":
                m ="30";
                break;
            case "1":
                m ="31";
                break;
            case "2":
                m ="32";
                break;
            case "3":
                m ="33";
                break;
            case "4":
                m ="34";
                break;
            case "5":
                m ="35";
                break;
            case "6":
                m ="36";
                break;
            case "7":
                m ="37";
                break;
            case "8":
                m ="38";
                break;
            case "9":
                m ="39";
                break;
            case ":":
                m ="3A";
                break;
            case ";":
                m ="3B";
                break;
            case "<":
                m ="3C";
                break;
            case "=":
                m ="3D";
                break;
            case ">":
                m ="3E";
                break;
            case "?":
                m ="3F";
                break;
            case "@":
                m ="40";
                break;
            case "A":
                m ="41";
                break;
            case "B":
                m ="42";
                break;
            case "C":
                m ="43";
                break;
            case "D":
                m ="44";
                break;
            case "E":
                m ="45";
                break;
            case "F":
                m ="46";
                break;
            case "G":
                m ="47";
                break;
            case "H":
                m ="48";
                break;
            case "I":
                m ="49";
                break;
            case "J":
                m ="4A";
                break;
            case "K":
                m ="4B";
                break;
            case "L":
                m ="4C";
                break;
            case "M":
                m ="4D";
                break;
            case "N":
                m ="4E";
                break;
            case "O":
                m ="4F";
                break;
            case "P":
                m ="50";
                break;
            case "Q":
                m ="51";
                break;
            case "R":
                m ="52";
                break;
            case "S":
                m ="53";
                break;
            case "T":
                m ="54";
                break;
            case "U":
                m ="55";
                break;
            case "V":
                m ="56";
                break;
            case "W":
                m ="57";
                break;
            case "X":
                m ="58";
                break;
            case "Y":
                m ="59";
                break;
            case "Z":
                m ="5A";
                break;
            case "[":
                m ="5B";
                break;
            case "\\":
                m ="5C";
                break;
            case "]":
                m ="5D";
                break;
            case "^":
                m ="5E";
                break;
            case "_":
                m ="5F";
                break;
            case "`":
                m ="60";
                break;
            case "a":
                m ="61";
                break;
            case "b":
                m ="62";
                break;
            case "c":
                m ="63";
                break;
            case "d":
                m ="64";
                break;
            case "e":
                m ="65";
                break;
            case "f":
                m ="66";
                break;
            case "g":
                m ="67";
                break;
            case "h":
                m ="68";
                break;
            case "i":
                m ="69";
                break;
            case "j":
                m ="6A";
                break;
            case "k":
                m ="6B";
                break;
            case "l":
                m ="6C";
                break;
            case "m":
                m ="6D";
                break;
            case "n":
                m ="6E";
                break;
            case "o":
                m ="6F";
                break;
            case "p":
                m ="70";
                break;
            case "q":
                m ="71";
                break;
            case "r":
                m ="72";
                break;
            case "s":
                m ="73";
                break;
            case "t":
                m ="74";
                break;
            case "u":
                m ="75";
                break;
            case "v":
                m ="76";
                break;
            case "w":
                m ="77";
                break;
            case "x":
                m ="78";
                break;
            case "y":
                m ="79";
                break;
            case "z":
                m ="7A";
                break;
            default:
                m =" ";
                break;
        }
        return m;
    }

    private String moren(String v) {
        String m;
        switch (v) {
            case "A":
                m =".-";
                break;
            case "B":
                m ="-...";
                break;
            case "C":
                m ="-.-.";
                break;
            case "D":
                m ="-..";
                break;
            case "E":
                m =".";
                break;
            case "F":
                m ="..-.";
                break;
            case "G":
                m ="--.";
                break;
            case "H":
                m ="....";
                break;
            case "I":
                m ="..";
                break;
            case "J":
                m =".---";
                break;
            case "K":
                m ="-.-";
                break;
            case "L":
                m =".-..";
                break;
            case "M":
                m ="--";
                break;
            case "N":
                m ="-.";
                break;
            case "O":
                m ="-----";
                break;
            case "P":
                m =".--.";
                break;
            case "Q":
                m ="--.-";
                break;
            case "R":
                m =".-.";
                break;
            case "S":
                m ="...";
                break;
            case "T":
                m ="-";
                break;
            case "U":
                m ="..-";
                break;
            case "V":
                m ="...-";
                break;
            case "W":
                m =".--";
                break;
            case "X":
                m ="-..-";
                break;
            case "Y":
                m ="-.--";
                break;
            case "Z":
                m ="--..";
                break;
            case "0":
                m ="-----";
                break;
            case "1":
                m =".----";
                break;
            case "2":
                m ="..---";
                break;
            case "3":
                m ="...--";
                break;
            case "4":
                m ="....-";
                break;
            case "5":
                m =".....";
                break;
            case "6":
                m ="-....";
                break;
            case "7":
                m ="--...";
                break;
            case "8":
                m ="---..";
                break;
            case "9":
                m ="----.";
                break;
            case ".":
                m =".-.-.-";
                break;
            case ":":
                m ="---...";
                break;
            case ",":
                m ="--..--";
                break;
            case ";":
                m ="-.-.-.";
                break;
            case "?":
                m ="..--..";
                break;
            case "=":
                m ="-...-";
                break;
            case "\'":
                m =".----.";
                break;
            case "/":
                m ="-..-.";
                break;
            case "!":
                m ="-.-.--";
                break;
            case "-":
                m ="..--.-";
                break;
            case "\"":
                m =".-..-.";
                break;
            case "(":
                m ="-.--.";
                break;
            case ")":
                m ="-.--.-";
                break;
            case "$":
                m ="...-..-";
                break;
            case "@":
                m =".--.-.";
                break;
            default:
                m =" ";
                break;
        }
        return m;
    }
}
