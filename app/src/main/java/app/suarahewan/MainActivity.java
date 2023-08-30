package app.suarahewan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.multidex.BuildConfig;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.TextView;

public class MainActivity  extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 1500;
    TextView tx_vers;
    /** Called when the activity is first created. */
    @
            Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        /* layout splashscreen dengan background gambar */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        tx_vers = (findViewById(R.id.txt_version));
        //String version ="Version Name : " + BuildConfig.VERSION_NAME + "\n" + "Version Code : " + BuildConfig.VERSION_CODE.toString()



        new Handler().postDelayed(new Runnable() {
            @SuppressLint("SetTextI18n")
            @
                Override
        public void run() {
            Intent mainIntent = null;
            try{
                double ver = BuildConfig.VERSION_CODE;

                //tx_vers.setText("Version Code: "+ver);
            }
            catch (Exception e){

            }
            mainIntent = new Intent(MainActivity.this, Act_utama.class);

            MainActivity.this.startActivity(mainIntent);
            MainActivity.this.finish();
        }
        }, SPLASH_DISPLAY_LENGTH);
    }

}