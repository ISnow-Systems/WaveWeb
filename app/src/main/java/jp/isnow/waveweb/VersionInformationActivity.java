package jp.isnow.waveweb;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.geckoview.GeckoRuntime;
import org.mozilla.geckoview.GeckoSession;
import org.mozilla.geckoview.GeckoView;

public class VersionInformationActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_version_information);
		GeckoView geckoView = findViewById(R.id.versiongecko);
		GeckoSession geckoSession = new GeckoSession();
		GeckoRuntime geckoRuntime = GeckoRuntime.getDefault(this);

		geckoSession.open(geckoRuntime);
		geckoView.setSession(geckoSession);
		geckoSession.loadUri("file:///android_asset/versionInfo/dist/index.html");
	}
}