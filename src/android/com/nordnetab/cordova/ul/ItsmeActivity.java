package be.adn.inco;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ItsmeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("ItsmeActivity", "onCreate");
        super.onCreate(savedInstanceState);
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
        Log.d("ItsmeActivity", appLinkAction);
        Log.d("ItsmeActivity", appLinkData.toString());
        Log.d("ItsmeActivity", "start Intent");
        Intent next = new Intent("android.intent.action.VIEW", appLinkData,ItsmeActivity.this, MainActivity.class);
        startActivity(next);
        Log.d("ItsmeActivity", "started Intent");
        finish();
    }
}
