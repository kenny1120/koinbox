package com.gosuNinja.koinbox;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainMenu extends Activity implements OnClickListener {
	Button register, signin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        register = (Button) findViewById(R.id.regis);
        register.setOnClickListener(this);
        signin = (Button) findViewById(R.id.signIn);
        signin.setOnClickListener(this);
        Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
        TextView txt = (TextView) findViewById(R.id.main_title);  
        txt.setTypeface(font);
        Typeface cPhrase = Typeface.createFromAsset(getAssets(), "font/Impact Label.ttf");
        TextView cP = (TextView) findViewById(R.id.catch_phrase);  
        cP.setTypeface(cPhrase);
        Typeface rSter = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
        TextView rS = (TextView) findViewById(R.id.regis);  
        rS.setTypeface(rSter);
        Typeface sIn = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
        TextView sI = (TextView) findViewById(R.id.signIn);  
        sI.setTypeface(sIn);
        Shader textShader=new LinearGradient(2, 0, 4, 60,
                new int[]{Color.parseColor("#000000"),Color.parseColor("#000000"),Color.parseColor("#000000")},
                new float[]{0, 3,1}, TileMode.MIRROR);
        txt.getPaint().setShader(textShader);
    }

    public void onClick(View v){
    	switch (v.getId()){
    	case R.id.regis:
    		Intent Rster = new Intent(this, Register.class);
    		startActivity(Rster);
    		break;
    	case R.id.signIn:
    		Intent sIN = new Intent(this, LogIn.class);
    		startActivity(sIN);
    		break;
    	}
    }
}
