package com.Minetest.Mobile;

import org.minetest.minetest.MtNativeActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class StartNative extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = new Intent(this, MtNativeActivity.class);
		startActivity(intent);

	}

}
