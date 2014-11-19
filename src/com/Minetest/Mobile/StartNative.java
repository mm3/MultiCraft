/* Разработано MoNTE48, 2014.
 * Код запрещено изменять или распространять,
 * без разрешения автора!
 * Контакты: MoNTE48@mail.ua
 */

package com.Minetest.Mobile;

import org.minetest.minetest.MtNativeActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StartNative extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent(this, MtNativeActivity.class);
		startActivity(intent);

	}

}
