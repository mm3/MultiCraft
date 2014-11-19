/* Разработано MoNTE48, 2014.
 * Код запрещено изменять или распространять,
 * без разрешения автора!
 * Контакты: MoNTE48@mail.ua
 */
 
package com.Minetest.Mobile;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.MoNTE48.MultiCraft.R;

public class About extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		Drawable d = new ColorDrawable(Color.WHITE);
		d.setAlpha(180);
		getWindow().setBackgroundDrawable(d);
		setContentView(R.layout.about);
	}

	public void RateMeSourse(View view) {
		// вывожу тост
		Toast toast = Toast.makeText(getApplicationContext(), "Opening...",
				Toast.LENGTH_LONG);
		toast.show();
		// открываю сайт ч-з Uri
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri
				.parse("https://github.com/kskkbys/Android-RateThisApp"));
		startActivity(intent);
	}
}