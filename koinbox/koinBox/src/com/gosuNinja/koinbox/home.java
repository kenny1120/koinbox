package com.gosuNinja.koinbox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class home extends Activity implements OnClickListener{
	final Context context = this;
	Button hProf, hmykb, hFriend, hAbout, hLogout;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		hProf = (Button) findViewById(R.id.homeProf);
		hProf.setOnClickListener(this);
		hmykb = (Button) findViewById(R.id.homemykoin);
		hmykb.setOnClickListener(this);
		hFriend = (Button) findViewById(R.id.homeFriends);
		hFriend.setOnClickListener(this);
		hAbout = (Button) findViewById(R.id.homeAbout);
		hAbout.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.homeTitle);  
		txt.setTypeface(font);
		Typeface hPro = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView hP = (TextView) findViewById(R.id.homeProf);  
		hP.setTypeface(hPro);
		Typeface HMKB = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView mK = (TextView) findViewById(R.id.homemykoin);  
		mK.setTypeface(HMKB);
		Typeface hFR = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView hF = (TextView) findViewById(R.id.homeFriends);  
		hF.setTypeface(hFR);
		Typeface hAB = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView hA = (TextView) findViewById(R.id.homeAbout);  
		hA.setTypeface(hAB);
		Typeface hLO = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView hL = (TextView) findViewById(R.id.homeLogout);  
		hL.setTypeface(hLO);
		hLogout = (Button) findViewById(R.id.homeLogout);
		hLogout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg) {
				new AlertDialog.Builder(context)
	        	.setMessage(R.string.LOtext)
	               .setPositiveButton(R.string.bye, new DialogInterface.OnClickListener() {
	                   public void onClick(DialogInterface dialog, int id) {
	                	   Intent mfLO = new Intent(context, MainMenu.class);
	                	   startActivity(mfLO);
	                	   
	                   }
	               })
	               .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
	                   public void onClick(DialogInterface dialog, int id) {
	                	   dialog.cancel();
	                   }
	               })
	               .show();
				
			}
		});
        Shader textShader=new LinearGradient(2, 0, 4, 60,
                new int[]{Color.parseColor("#000000"),Color.parseColor("#000000"),Color.parseColor("#000000")},
                new float[]{0, 3,1}, TileMode.MIRROR);
        txt.getPaint().setShader(textShader);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.homeProf:
			Intent hP = new Intent(this, profile.class);
			startActivity(hP);
			break;
		case R.id.homemykoin:
			Intent hMK = new Intent(this, myKoinBox.class);
			startActivity(hMK);
			break;
		case R.id.homeFriends:
			Intent FRN = new Intent(this, myFriends.class);
			startActivity(FRN);
			break;
		case R.id.homeAbout:
			Intent aB = new Intent(this, about.class);
			startActivity(aB);
			break;
			
		}
		
	}
	
	

}
