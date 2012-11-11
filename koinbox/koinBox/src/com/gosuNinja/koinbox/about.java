package com.gosuNinja.koinbox;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class about extends Activity implements OnClickListener {
	Button abProf, abMKB, abFriend, abLogout;
	View aback;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		abProf = (Button) findViewById(R.id.aProf);
		abProf.setOnClickListener(this);
		abMKB = (Button) findViewById(R.id.aMKB);
		abMKB.setOnClickListener(this);
		abFriend = (Button) findViewById(R.id.aFriends);
		abFriend.setOnClickListener(this);
		abLogout = (Button) findViewById(R.id.aLogOut);
		abLogout.setOnClickListener(this);
		aback = (View) findViewById(R.id.aBack);
		aback.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.aTitle);  
		txt.setTypeface(font);
		Typeface aPro = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView aP = (TextView) findViewById(R.id.aProf);  
		aP.setTypeface(aPro);
		Typeface AMKB = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView aK = (TextView) findViewById(R.id.aMKB);  
		aK.setTypeface(AMKB);
		Typeface aFR = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView aF = (TextView) findViewById(R.id.aFriends);  
		aF.setTypeface(aFR);
		Typeface aLO = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView aL = (TextView) findViewById(R.id.aLogOut);  
		aL.setTypeface(aLO);
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.aProf:
			Intent pP = new Intent(this, profile.class);
			startActivity(pP);
			break;
		case R.id.aMKB:
			Intent pMK = new Intent(this, myKoinBox.class);
			startActivity(pMK);
			break;
		case R.id.aFriends:
			Intent pFRN = new Intent(this, myFriends.class);
			startActivity(pFRN);
			break;
		case R.id.aLogOut:
			Intent plO = new Intent(this, Logout.class);
			startActivity(plO);
			break;
		case R.id.aBack:
			Intent pBK = new Intent(this, home.class);
			startActivity(pBK);
			break;
			
		
		}
	

	}
}