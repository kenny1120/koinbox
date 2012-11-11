package com.gosuNinja.koinbox;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class profile extends Activity implements OnClickListener {
	Button proProf, proMKB, proFriend, proLogout;
	View pback;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		proProf = (Button) findViewById(R.id.pProf);
		proProf.setOnClickListener(this);
		proMKB = (Button) findViewById(R.id.pMKB);
		proMKB.setOnClickListener(this);
		proFriend = (Button) findViewById(R.id.pFriends);
		proFriend.setOnClickListener(this);
		proLogout = (Button) findViewById(R.id.pLogOut);
		proLogout.setOnClickListener(this);
		pback = (View) findViewById(R.id.pBack);
		pback.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.pTitle);  
		txt.setTypeface(font);
		Typeface pPro = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView pP = (TextView) findViewById(R.id.pProf);  
		pP.setTypeface(pPro);
		Typeface PMKB = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView pK = (TextView) findViewById(R.id.pMKB);  
		pK.setTypeface(PMKB);
		Typeface pFR = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView pF = (TextView) findViewById(R.id.pFriends);  
		pF.setTypeface(pFR);
		Typeface pLO = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView pL = (TextView) findViewById(R.id.pLogOut);  
		pL.setTypeface(pLO);
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.pProf:
			Intent pP = new Intent(this, profile.class);
			startActivity(pP);
			break;
		case R.id.pMKB:
			Intent pMK = new Intent(this, myKoinBox.class);
			startActivity(pMK);
			break;
		case R.id.pFriends:
			Intent pFRN = new Intent(this, myFriends.class);
			startActivity(pFRN);
			break;
		case R.id.pLogOut:
			Intent plO = new Intent(this, Logout.class);
			startActivity(plO);
			break;
		case R.id.pBack:
			Intent pBK = new Intent(this, home.class);
			startActivity(pBK);
			break;
			
		
		}
	

	}
}
