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

public class profile extends Activity implements OnClickListener {
	final Context context = this;
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
		pback = (View) findViewById(R.id.pBack);
		pback.setOnClickListener(this);
		Typeface font = Typeface.createFromAsset(getAssets(), "font/deftone_stylus.ttf");
		TextView txt = (TextView) findViewById(R.id.pTitle);  
		txt.setTypeface(font);
		Shader textShader=new LinearGradient(2, 0, 4, 60,
                new int[]{Color.parseColor("#000000"),Color.parseColor("#000000"),Color.parseColor("#000000")},
                new float[]{0, 3,1}, TileMode.MIRROR);
        txt.getPaint().setShader(textShader);
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
		proLogout = (Button) findViewById(R.id.pLogOut);
		proLogout.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View arg) {
		        new AlertDialog.Builder(context)
		        	.setMessage(R.string.LOtext)
		               .setPositiveButton(R.string.bye, new DialogInterface.OnClickListener() {
		                   public void onClick(DialogInterface dialog, int id) {
		                	   Intent pLO = new Intent(context, MainMenu.class);
		                	   startActivity(pLO);
		                	   
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
		case R.id.pBack:
			Intent pBK = new Intent(this, home.class);
			startActivity(pBK);
			break;
		}
	
			
		
		}
	}


