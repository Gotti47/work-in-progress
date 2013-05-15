package com.tanzoft.habarihub;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Splash extends Activity {
	
	TextView time;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		time = (TextView)findViewById(R.id.textView1);
		time.setTextColor(Color.BLUE);
			
			
					new CountDownTimer(20000, 1000) {

					     public void onTick(long millisUntilFinished) {
					         time.setText("Application will start in: " + millisUntilFinished / 1000);
					     }

					     public void onFinish() {
					         time.setText("done!");
					     	Intent openMain = new Intent(Splash.this, MainActivity.class);
							startActivity(openMain);
					     }
					  }.start();

				
				}

		
	}


