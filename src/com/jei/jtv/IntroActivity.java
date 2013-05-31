package com.jei.jtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class IntroActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intro);
		initialize();
	}

	private void initialize(){
		Handler handler = new Handler(){
			@Override
			public void handleMessage(Message msg) {
				finish();
				startActivity(new Intent(IntroActivity.this, MainActivity.class));
			}
		};
		handler.sendEmptyMessageDelayed(0, 3000);
	}
}
