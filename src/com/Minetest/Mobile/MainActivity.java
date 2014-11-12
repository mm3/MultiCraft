package com.Minetest.Mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;

import com.MoNTE48.MultiCraft.R;
import com.kskkbys.rate.RateThisApp;

public class MainActivity extends Activity {
	private RevMob revmob;
	private RevMobFullscreen fullscreen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// init "rate me" plugin
		RateThisApp.onStart(this);
		RateThisApp.showRateDialogIfNeeded(this);

	}

	public void About(View view) {
		Intent intent = new Intent(this, About.class);
		startActivity(intent);
	}

	public void start(View view) {
		Intent intent = new Intent(this, Start.class);
		startActivity(intent);
	}

}
