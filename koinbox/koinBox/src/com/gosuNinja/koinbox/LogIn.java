package com.gosuNinja.koinbox;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends Activity implements OnClickListener{
	EditText user, passw;
	Button Login;
	View forgot;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		user = (EditText) findViewById(R.id.userName);
		passw = (EditText) findViewById(R.id.password);
		Login = (Button) findViewById(R.id.log_in);
		Login.setOnClickListener(this);
		forgot = (View) findViewById(R.id.forgot_pass);
		forgot.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.title);  
		txt.setTypeface(font);
		Typeface sIn = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView sI = (TextView) findViewById(R.id.log_in);  
		sI.setTypeface(sIn);

      
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.log_in:
			Intent lIN = new Intent(this, home.class);
			startActivity(lIN);
			break;
		case R.id.forgot_pass:
			Intent fPW = new Intent(this, forgotPW.class);
			startActivity(fPW);
			break;
		}
		
	}


}
