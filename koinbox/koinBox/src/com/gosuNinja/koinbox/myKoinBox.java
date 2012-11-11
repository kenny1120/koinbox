package com.gosuNinja.koinbox;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class myKoinBox extends Activity implements OnClickListener {
	Button mkbProf, mkbMKB, mkbFriend, mkbLogout;
	View mback;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mykoinbox);
		mkbProf = (Button) findViewById(R.id.mProf);
		mkbProf.setOnClickListener(this);
		mkbMKB = (Button) findViewById(R.id.mMKB);
		mkbMKB.setOnClickListener(this);
		mkbFriend = (Button) findViewById(R.id.mFriends);
		mkbFriend.setOnClickListener(this);
		mkbLogout = (Button) findViewById(R.id.mLogOut);
		mkbLogout.setOnClickListener(this);
		mback = (View) findViewById(R.id.mBack);
		mback.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.mTitle);  
		txt.setTypeface(font);
		Typeface pPro = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView pP = (TextView) findViewById(R.id.mProf);  
		pP.setTypeface(pPro);
		Typeface PMKB = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView pK = (TextView) findViewById(R.id.mMKB);  
		pK.setTypeface(PMKB);
		Typeface pFR = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView pF = (TextView) findViewById(R.id.mFriends);  
		pF.setTypeface(pFR);
		Typeface pLO = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView pL = (TextView) findViewById(R.id.mLogOut);  
		pL.setTypeface(pLO);
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.mProf:
			Intent mP = new Intent(this, profile.class);
			startActivity(mP);
			break;
		case R.id.mMKB:
			Intent mMK = new Intent(this, myKoinBox.class);
			startActivity(mMK);
			break;
		case R.id.mFriends:
			Intent mFRN = new Intent(this, myFriends.class);
			startActivity(mFRN);
			break;
		case R.id.mLogOut:
			Intent mlO = new Intent(this, Logout.class);
			startActivity(mlO);
			break;
		case R.id.mBack:
			Intent mBK = new Intent(this, home.class);
			startActivity(mBK);
			break;
			
		
		}
	

	}
}
