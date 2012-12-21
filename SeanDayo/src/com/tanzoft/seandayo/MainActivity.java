package com.tanzoft.seandayo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	// Declare buttons
	Button about;
	Button photography;
	Button contacts;
	Button wearables;
	WebView abtweb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initialize Buttons
		about = (Button) findViewById(R.id.about);
		photography = (Button) findViewById(R.id.photography);
		contacts = (Button) findViewById(R.id.contact);
		wearables = (Button) findViewById(R.id.wearable);
		abtweb = (WebView) findViewById(R.id.web1);

		// set actions for every button click
		about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Class<?> web = Class
							.forName("com.tanzoft.seandayo.AboutActivity");
					Intent abt = new Intent(MainActivity.this, web);
					startActivity(abt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		photography.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent photo = new Intent("com.tanzoft.SeanDayo.COMINGSOON");
				startActivity(photo);

			}
		});

		// open subContacts when contacts button is clicked
		contacts.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openCredits = new Intent(
						"com.tanzoft.SeanDayo.SUBCONTACTS");
				startActivity(openCredits);

			}
		});

		wearables.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent wear = new Intent("com.tanzoft.SeanDayo.COMINGSOON");
				startActivity(wear);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);

		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
		case R.id.credits:
			Toast.makeText(this, "Developed by:\nDamas Mlabwa",
					Toast.LENGTH_LONG).show();
			break;

		case R.id.help:
			break;
		case R.id.rate:
			String myUrl = "https://play.google.com/store/apps/details?id=com.tanzoft.seandayo";

			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(myUrl)));

			break;
		default:
			return super.onOptionsItemSelected(item);
		}

		return true;
	}

}
