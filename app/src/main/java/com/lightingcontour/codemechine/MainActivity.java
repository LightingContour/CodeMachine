package com.lightingcontour.codemechine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button[] buttons = new Button[4];
    AnimatorClass animatorClass = new AnimatorClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        buttons[0] = (Button)findViewById(R.id.decode);
        buttons[1] = (Button)findViewById(R.id.encrypt);
        buttons[2] = (Button)findViewById(R.id.setting);
        buttons[3] = (Button)findViewById(R.id.Version);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(clickListener);
        }
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == buttons[0].getId())
            {
                animatorClass.buttonclickAnimator(buttons[0]);
                Intent it = new Intent(MainActivity.this,DecodeChoose.class);
                startActivity(it);
            }
            if (view.getId() == buttons[1].getId())
            {
                animatorClass.buttonclickAnimator(buttons[1]);
                Intent it = new Intent(MainActivity.this,EncryptChoose.class);
                startActivity(it);
            }
            if (view.getId() == buttons[2].getId())
            {
                animatorClass.buttonclickAnimator(buttons[2]);
                Intent it = new Intent(MainActivity.this,Setting.class);
                startActivity(it);
            }
            if (view.getId() == buttons[3].getId())
            {
                animatorClass.buttonclickAnimator(buttons[3]);
                Intent it = new Intent(MainActivity.this,Version.class);
                startActivity(it);
            }
        }
    };
}
