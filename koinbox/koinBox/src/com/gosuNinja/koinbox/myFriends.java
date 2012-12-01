package com.gosuNinja.koinbox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Shader.TileMode;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class myFriends extends Activity implements OnClickListener {
	final Context context = this;
	Button frnProf, frnMKB, frnFriend, frnLogout;
	View fback;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friends);
		frnProf = (Button) findViewById(R.id.fProf);
		frnProf.setOnClickListener(this);
		frnMKB = (Button) findViewById(R.id.fMKB);
		frnMKB.setOnClickListener(this);
		frnFriend = (Button) findViewById(R.id.fFriends);
	    frnFriend.setOnClickListener(this);
		fback = (View) findViewById(R.id.fBack);
		fback.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.fTitle);  
		txt.setTypeface(font);
		Shader textShader=new LinearGradient(2, 0, 4, 60,
                new int[]{Color.parseColor("#000000"),Color.parseColor("#000000"),Color.parseColor("#000000")},
                new float[]{0, 3,1}, TileMode.MIRROR);
        txt.getPaint().setShader(textShader);
		Typeface fPro = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView fP = (TextView) findViewById(R.id.fProf);  
		fP.setTypeface(fPro);
		Typeface FMKB = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView fK = (TextView) findViewById(R.id.fMKB);  
		fK.setTypeface(FMKB);
		Typeface fFR = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView fF = (TextView) findViewById(R.id.fFriends);  
		fF.setTypeface(fFR);
		Typeface fLO = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView fL = (TextView) findViewById(R.id.fLogOut);  
		fL.setTypeface(fLO);
		frnLogout = (Button) findViewById(R.id.fLogOut);
		frnLogout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg) {
				new AlertDialog.Builder(context)
					.setMessage(R.string.LOtext)
						.setPositiveButton(R.string.bye, new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								Intent mfLO = new Intent(context, MainMenu.class);
								mfLO.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
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
		case R.id.fProf:
			Intent fP = new Intent(this, profile.class);
			startActivity(fP);
			break;
		case R.id.fMKB:
			Intent fMK = new Intent(this, myKoinBox.class);
			startActivity(fMK);
			break;
		case R.id.fFriends:
			Intent fFRN = new Intent(this, myFriends.class);
			startActivity(fFRN);
			break;
		case R.id.fBack:
			Intent fBK = new Intent(this, home.class);
			startActivity(fBK);
			break;
			
		
		}
	

	}
}