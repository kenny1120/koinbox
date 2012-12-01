package com.gosuNinja.koinbox;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Shader.TileMode;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Register extends Activity implements OnClickListener{
	EditText userN, passw, rPass, rName, Email, phone, scho, home, dest;
	Button signUp;
	Spinner Age;
	View term;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		userN = (EditText) findViewById(R.id.userName);
		passw = (EditText) findViewById(R.id.passW);
		rPass = (EditText) findViewById(R.id.checkpassW);
		rName = (EditText) findViewById(R.id.name);
		Age = (Spinner) findViewById(R.id.age);
		ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.ages, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Age.setAdapter(adapter);
		Email = (EditText) findViewById(R.id.email);
		phone = (EditText) findViewById(R.id.phoneN);
		signUp = (Button) findViewById(R.id.register);
		signUp.setOnClickListener(this);
		scho = (EditText) findViewById(R.id.school);
		home = (EditText) findViewById(R.id.homeTown);
		dest = (EditText) findViewById(R.id.destination);
		term = (View) findViewById(R.id.TOS);
		term.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.welcomeTitle);  
		txt.setTypeface(font);
		Typeface rPL = Typeface.createFromAsset(getAssets(), "font/Impact Label.ttf");
        TextView rP = (TextView) findViewById(R.id.personal);  
        rP.setTypeface(rPL);
        Typeface rAG = Typeface.createFromAsset(getAssets(), "font/Impact Label.ttf");
        TextView rA = (TextView) findViewById(R.id.ageTxt);  
        rA.setTypeface(rAG);
        Typeface rster = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
        TextView rS = (TextView) findViewById(R.id.register);  
        rS.setTypeface(rster);
        Shader textShader=new LinearGradient(2, 0, 4, 60,
                new int[]{Color.parseColor("#000000"),Color.parseColor("#000000"),Color.parseColor("#000000")},
                new float[]{0, 3,1}, TileMode.MIRROR);
        txt.getPaint().setShader(textShader);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.register:
			Intent sUP = new Intent(this, home.class);
			startActivity(sUP);
			break;
			
		}
		
	}
	

}
