package com.gosuNinja.koinbox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class myKoinBox extends Activity implements OnClickListener {
	final Context context = this;
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
		mback = (View) findViewById(R.id.mBack);
		mback.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.mTitle);  
		txt.setTypeface(font);
		Typeface mkbPro = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView mkbP = (TextView) findViewById(R.id.mProf);  
		mkbP.setTypeface(mkbPro);
		Typeface mMKB = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView mkbK = (TextView) findViewById(R.id.mMKB);  
		mkbK.setTypeface(mMKB);
		Typeface mkbFR = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView mkbF = (TextView) findViewById(R.id.mFriends);  
		mkbF.setTypeface(mkbFR);
		Typeface mkbLO = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView mkbL = (TextView) findViewById(R.id.mLogOut);  
		mkbL.setTypeface(mkbLO);
		mkbLogout = (Button) findViewById(R.id.mLogOut);
		mkbLogout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View varg) {
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
		case R.id.mBack:
			Intent mBK = new Intent(this, home.class);
			startActivity(mBK);
			break;
			
		
		}
	

	}
}
