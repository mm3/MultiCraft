/* Разработано MoNTE48, 2014.
 * Код запрещено изменять или распространять,
 * без разрешения автора!
 * Контакты: MoNTE48@mail.ua
 */
 
package com.Minetest.Mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;

import com.MoNTE48.MultiCraft.R;
import com.kskkbys.rate.RateThisApp;
import com.winsontan520.wversionmanager.library.WVersionManager;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// init "rate me" plugin
		RateThisApp.onStart(this);
		RateThisApp.showRateDialogIfNeeded(this);
		// Check
		WVersionManager versionManager = new WVersionManager(this);
		versionManager.setVersionContentUrl("http://URL/ver/ver.txt");
		versionManager.checkVersion();
		versionManager.setUpdateNowLabel((String) getResources().getText(R.string.update_yes));
		versionManager.setRemindMeLaterLabel((String) getResources().getText(R.string.update_no));
		versionManager.setIgnoreThisVersionLabel((String) getResources().getText(R.string.update_ignore));
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
