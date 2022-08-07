package app.suarahewan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.media.MediaPlayer;
import app.suarahewan.bantuan.ConnectionDetector;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.io.IOException;

public class Act_utama extends Activity implements View.OnClickListener {

    ConnectionDetector cd;
    Boolean isInternetPresent = false;
    Button bt_alpaka,bt_angsa,bt_anjing,bt_antelope,bt_ayambetina,bt_ayamjantan,bt_babi,bt_badak,bt_bebek,bt_beo,bt_berang,bt_buaya,bt_burgak,bt_burhan,bt_cicak,bt_domba,bt_gajah
            ,bt_harimau,bt_hiu,bt_hyena,bt_jerapah,bt_kadal,bt_kalajengking,bt_kalkun,bt_keledai,bt_kelelawar,bt_kelinci,bt_kera,bt_kerbau,bt_kingkong,bt_kodok,bt_komodo,bt_kucing,
            bt_kuda,bt_kudanil,bt_kupukupu,bt_lalat,bt_landak,bt_lebah,bt_lumba,bt_macantutul,bt_merpati,bt_musang,bt_nyamuk,bt_panda,bt_pausbungkus,bt_pauskepalabusur,bt_pemakansemut,
            bt_penguin,bt_rakun,bt_rusa,bt_sapi,bt_serigala,bt_singa,bt_tikus,bt_tokek,bt_ular,bt_unta,bt_yak,bt_zebra;
    MediaPlayer mp_alpaka,mp_angsa,mp_anjing,mp_antelope,mp_ayambetina,mp_ayamjantan,mp_babi,mp_badak,mp_bebek,mp_beo,mp_berang,mp_buaya,mp_burgak,mp_burhan,mp_cicak,mp_domba,mp_gajah
            ,mp_harimau,mp_hiu,mp_hyena,mp_jerapah,mp_kadal,mp_kalajengking,mp_kalkun,mp_keledai,mp_kelelawar,mp_kelinci,mp_kera,mp_kerbau,mp_kingkong,mp_kodok,mp_komodo,mp_kucing
            ,mp_kuda,mp_kudanil,mp_kupukupu,mp_lalat,mp_landak,mp_lebah,mp_lumba,mp_macantutul,mp_merpati,mp_musang,mp_nyamuk,mp_panda,mp_pausbungkus,mp_pauskepalabusur,mp_pemakansemut,
            mp_penguin,mp_rakun,mp_rusa,mp_sapi,mp_serigala,mp_singa,mp_tikus,mp_tokek,mp_ular,mp_unta,mp_yak,mp_zebra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* layout splashscreen dengan background gambar */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.lay_utama);
        mp_alpaka = MediaPlayer.create(Act_utama.this, R.raw.alpaka);

        mp_angsa = MediaPlayer.create(Act_utama.this, R.raw.angsa);
        mp_anjing = MediaPlayer.create(Act_utama.this, R.raw.anjing);
        mp_antelope = MediaPlayer.create(Act_utama.this, R.raw.antelop);
        mp_ayambetina = MediaPlayer.create(Act_utama.this, R.raw.ayambetina);
        mp_ayamjantan = MediaPlayer.create(Act_utama.this, R.raw.ayamjantan);
        mp_babi = MediaPlayer.create(Act_utama.this, R.raw.babi);
        mp_badak = MediaPlayer.create(Act_utama.this, R.raw.badak);
        mp_bebek = MediaPlayer.create(Act_utama.this, R.raw.bebek);
        mp_beo = MediaPlayer.create(Act_utama.this, R.raw.beoabu2afrika);
        mp_berang = MediaPlayer.create(Act_utama.this, R.raw.berangberang);
        mp_buaya = MediaPlayer.create(Act_utama.this, R.raw.buaya);
        mp_burgak = MediaPlayer.create(Act_utama.this, R.raw.burunggagak);
        mp_burhan = MediaPlayer.create(Act_utama.this, R.raw.burunghantu);
        mp_cicak = MediaPlayer.create(Act_utama.this, R.raw.cicak);
        mp_domba = MediaPlayer.create(Act_utama.this, R.raw.domba);
        mp_gajah = MediaPlayer.create(Act_utama.this, R.raw.gajah);
        mp_harimau = MediaPlayer.create(Act_utama.this, R.raw.harimau);
        mp_hiu = MediaPlayer.create(Act_utama.this, R.raw.hiu);
        mp_hyena = MediaPlayer.create(Act_utama.this, R.raw.hyena);
        mp_jerapah = MediaPlayer.create(Act_utama.this, R.raw.jerapah);
        mp_kadal = MediaPlayer.create(Act_utama.this, R.raw.kadal);
        mp_kalajengking = MediaPlayer.create(Act_utama.this, R.raw.kalajengking);
        mp_kalkun = MediaPlayer.create(Act_utama.this, R.raw.kalkun);
        mp_keledai = MediaPlayer.create(Act_utama.this, R.raw.keledai);
        mp_kelelawar = MediaPlayer.create(Act_utama.this, R.raw.kelelawar);
        mp_kelinci = MediaPlayer.create(Act_utama.this, R.raw.kelinci);
        mp_kera = MediaPlayer.create(Act_utama.this, R.raw.kera);
        mp_kerbau = MediaPlayer.create(Act_utama.this, R.raw.kerbau);
        mp_kingkong = MediaPlayer.create(Act_utama.this, R.raw.kingkong);
        mp_kodok = MediaPlayer.create(Act_utama.this, R.raw.kodok);
        mp_komodo = MediaPlayer.create(Act_utama.this, R.raw.komodo);
        mp_kucing = MediaPlayer.create(Act_utama.this, R.raw.kucing);
        mp_kuda = MediaPlayer.create(Act_utama.this, R.raw.kuda);
        mp_kudanil = MediaPlayer.create(Act_utama.this, R.raw.kudanil);
        mp_kupukupu = MediaPlayer.create(Act_utama.this, R.raw.kupukupu);
        mp_lalat = MediaPlayer.create(Act_utama.this, R.raw.lalat);
        mp_landak = MediaPlayer.create(Act_utama.this, R.raw.landak);
        mp_lebah = MediaPlayer.create(Act_utama.this, R.raw.lebah);
        mp_lumba = MediaPlayer.create(Act_utama.this, R.raw.lumba);
        mp_macantutul = MediaPlayer.create(Act_utama.this, R.raw.macantutul);
        mp_merpati = MediaPlayer.create(Act_utama.this, R.raw.merpati);
        mp_musang = MediaPlayer.create(Act_utama.this, R.raw.musang);
        mp_nyamuk = MediaPlayer.create(Act_utama.this, R.raw.nyamuk);
        mp_panda = MediaPlayer.create(Act_utama.this, R.raw.panda);
        mp_pausbungkus = MediaPlayer.create(Act_utama.this, R.raw.pausbungkuk);
        mp_pauskepalabusur = MediaPlayer.create(Act_utama.this, R.raw.pauskepalabusur);
        mp_pemakansemut = MediaPlayer.create(Act_utama.this, R.raw.pemakansemut);
        mp_penguin = MediaPlayer.create(Act_utama.this, R.raw.penguin);
        mp_rakun = MediaPlayer.create(Act_utama.this, R.raw.rakun);
        mp_rusa = MediaPlayer.create(Act_utama.this, R.raw.rusa);
        mp_sapi = MediaPlayer.create(Act_utama.this, R.raw.sapi);
        mp_serigala = MediaPlayer.create(Act_utama.this, R.raw.serigala);
        mp_singa = MediaPlayer.create(Act_utama.this, R.raw.singa);
        mp_tikus = MediaPlayer.create(Act_utama.this, R.raw.tikus);
        mp_tokek = MediaPlayer.create(Act_utama.this, R.raw.tokek);
        mp_ular = MediaPlayer.create(Act_utama.this, R.raw.ular);
        mp_unta = MediaPlayer.create(Act_utama.this, R.raw.unta);
        mp_yak = MediaPlayer.create(Act_utama.this, R.raw.yak);
        mp_zebra = MediaPlayer.create(Act_utama.this, R.raw.zebra);


        bt_alpaka = findViewById(R.id.btn_alpaka);
        bt_angsa = findViewById(R.id.btn_angsa);
        bt_anjing = findViewById(R.id.btn_anjing);
        bt_antelope = findViewById(R.id.btn_antelop);
        bt_ayambetina = findViewById(R.id.btn_ayambetina);
        bt_ayamjantan = findViewById(R.id.btn_ayamjantan);
        bt_babi = findViewById(R.id.btn_babi);
        bt_badak = findViewById(R.id.btn_badak);
        bt_bebek = findViewById(R.id.btn_bebek);
        bt_beo = findViewById(R.id.btn_beo);
        bt_berang = findViewById(R.id.btn_berang);
        bt_buaya = findViewById(R.id.btn_buaya);
        bt_burgak = findViewById(R.id.btn_burgak);
        bt_burhan = findViewById(R.id.btn_burhan);
        bt_cicak = findViewById(R.id.btn_cicak);
        bt_domba = findViewById(R.id.btn_domba);
        bt_gajah = findViewById(R.id.btn_gajah);
        bt_harimau = findViewById(R.id.btn_harimau);
        bt_hiu = findViewById(R.id.btn_hiu);
        bt_hyena = findViewById(R.id.btn_hyena);
        bt_jerapah = findViewById(R.id.btn_jerapah);
        bt_kadal = findViewById(R.id.btn_kadal);
        bt_kalajengking = findViewById(R.id.btn_kalajengking);
        bt_kalkun = findViewById(R.id.btn_kalkun);
        bt_keledai = findViewById(R.id.btn_keledai);
        bt_kelelawar = findViewById(R.id.btn_kelelawar);
        bt_kelinci = findViewById(R.id.btn_kelinci);
        bt_kera = findViewById(R.id.btn_kera);
        bt_kerbau = findViewById(R.id.btn_kerbau);
        bt_kingkong = findViewById(R.id.btn_kingkong);
        bt_kodok = findViewById(R.id.btn_kodok);
        bt_komodo = findViewById(R.id.btn_komodo);
        bt_kucing = findViewById(R.id.btn_kucing);
        bt_kuda = findViewById(R.id.btn_kuda);
        bt_kudanil = findViewById(R.id.btn_kudanil);
        bt_kupukupu = findViewById(R.id.btn_kupu);
        bt_lalat = findViewById(R.id.btn_lalat);
        bt_landak = findViewById(R.id.btn_landak);
        bt_lebah = findViewById(R.id.btn_lebah);
        bt_lumba = findViewById(R.id.btn_lumba);
        bt_macantutul = findViewById(R.id.btn_macantut);
        bt_merpati = findViewById(R.id.btn_merpati);
        bt_musang = findViewById(R.id.btn_musang);
        bt_nyamuk = findViewById(R.id.btn_nyamuk);
        bt_panda = findViewById(R.id.btn_panda);
        bt_pausbungkus = findViewById(R.id.btn_pausbung);
        bt_pauskepalabusur = findViewById(R.id.btn_pauskepalabus);
        bt_pemakansemut = findViewById(R.id.btn_pemakansemut);
        bt_penguin = findViewById(R.id.btn_penguin);
        bt_rakun = findViewById(R.id.btn_rakun);
        bt_rusa = findViewById(R.id.btn_rusa);
        bt_sapi = findViewById(R.id.btn_sapi);
        bt_serigala = findViewById(R.id.btn_serigala);
        bt_singa = findViewById(R.id.btn_singa);
        bt_tikus = findViewById(R.id.btn_tikus);
        bt_tokek = findViewById(R.id.btn_tokek);
        bt_ular = findViewById(R.id.btn_ular);
        bt_unta = findViewById(R.id.btn_unta);
        bt_yak = findViewById(R.id.btn_yak);
        bt_zebra = findViewById(R.id.btn_zebra);


        bt_alpaka.setOnClickListener(this);
        bt_angsa.setOnClickListener(this);
        bt_anjing.setOnClickListener(this);
        bt_antelope.setOnClickListener(this);
        bt_ayambetina.setOnClickListener(this);
        bt_ayamjantan.setOnClickListener(this);
        bt_babi.setOnClickListener(this);
        bt_badak.setOnClickListener(this);
        bt_bebek.setOnClickListener(this);
        bt_beo.setOnClickListener(this);
        bt_berang.setOnClickListener(this);
        bt_buaya.setOnClickListener(this);
        bt_burgak.setOnClickListener(this);
        bt_burhan.setOnClickListener(this);
        bt_cicak.setOnClickListener(this);
        bt_domba.setOnClickListener(this);
        bt_gajah.setOnClickListener(this);
        bt_harimau.setOnClickListener(this);
        bt_hiu.setOnClickListener(this);
        bt_hyena.setOnClickListener(this);
        bt_jerapah.setOnClickListener(this);
        bt_kadal.setOnClickListener(this);
        bt_kalajengking.setOnClickListener(this);
        bt_kalkun.setOnClickListener(this);
        bt_keledai.setOnClickListener(this);
        bt_kelelawar.setOnClickListener(this);
        bt_kelinci.setOnClickListener(this);
        bt_kera.setOnClickListener(this);
        bt_kerbau.setOnClickListener(this);
        bt_kingkong.setOnClickListener(this);
        bt_kodok.setOnClickListener(this);
        bt_komodo.setOnClickListener(this);
        bt_kucing.setOnClickListener(this);
        bt_kuda.setOnClickListener(this);
        bt_kudanil.setOnClickListener(this);
        bt_kupukupu.setOnClickListener(this);
        bt_lalat.setOnClickListener(this);
        bt_landak.setOnClickListener(this);
        bt_lebah.setOnClickListener(this);
        bt_lumba.setOnClickListener(this);
        bt_macantutul.setOnClickListener(this);
        bt_merpati.setOnClickListener(this);
        bt_musang.setOnClickListener(this);
        bt_nyamuk.setOnClickListener(this);
        bt_panda.setOnClickListener(this);
        bt_pausbungkus.setOnClickListener(this);
        bt_pauskepalabusur.setOnClickListener(this);
        bt_pemakansemut.setOnClickListener(this);
        bt_penguin.setOnClickListener(this);
        bt_rakun.setOnClickListener(this);
        bt_rusa.setOnClickListener(this);
        bt_sapi.setOnClickListener(this);
        bt_serigala.setOnClickListener(this);
        bt_singa.setOnClickListener(this);
        bt_tikus.setOnClickListener(this);
        bt_tokek.setOnClickListener(this);
        bt_ular.setOnClickListener(this);
        bt_unta.setOnClickListener(this);
        bt_yak.setOnClickListener(this);
        bt_zebra.setOnClickListener(this);



        isInternetPresent = false;
        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-5256228815542923/9525158731");

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView bannerAdview = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAdview.loadAd(adRequest);
    }

    @Override
    public void onClick(View v) {
        //stop_semua();
        cd = new ConnectionDetector(getApplicationContext());
        isInternetPresent = cd.isConnectingToInternet();
        if (isInternetPresent) {
            if (v == bt_alpaka) {
                try{
                    mp_alpaka.prepare();
                    matikan_tombol();
                }catch (IllegalStateException ex){
                    ex.printStackTrace();
                }catch (IOException ex1){
                    ex1.printStackTrace();
                }
                mp_alpaka.start();
                mp_alpaka.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        hidupkan_tombol();
                    }
                });



            }else if (v == bt_angsa) {
                try{
                    mp_angsa.prepare();
                    matikan_tombol();
                }catch (IllegalStateException ex){
                    ex.printStackTrace();
                }catch (IOException ex1){
                    ex1.printStackTrace();
                }
                mp_angsa.start();
                mp_angsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        hidupkan_tombol();
                    }
                });
            } else if (v == bt_anjing) {
                //stop_semua();
                mp_anjing.start();
            } else if (v == bt_antelope) {
                // stop_semua();
                mp_antelope.start();
            } else if (v == bt_ayambetina) {
                // stop_semua();
                mp_ayambetina.start();
            } else if (v == bt_ayamjantan) {
                // stop_semua();
                mp_ayamjantan.start();
            }  else if (v == bt_babi) {
                // stop_semua();
                mp_babi.start();
            }  else if (v == bt_badak) {
                // stop_semua();
                mp_badak.start();
            }  else if (v == bt_bebek) {
                // stop_semua();
                mp_bebek.start();
            }else if (v == bt_beo) {
                // stop_semua();
                mp_beo.start();
            }else if (v == bt_berang) {
                // stop_semua();
                mp_berang.start();
            }else if (v == bt_buaya) {
                // stop_semua();
                mp_buaya.start();
            }else if (v == bt_burgak) {
                // stop_semua();
                mp_burgak.start();
            }else if (v == bt_burhan) {
                // stop_semua();
                mp_burhan.start();
            }else if (v == bt_cicak) {
                // stop_semua();
                mp_cicak.start();
            }else if (v == bt_domba) {
                // stop_semua();
                mp_domba.start();
            }else if (v == bt_gajah) {
                // stop_semua();
                mp_gajah.start();
            }else if (v == bt_harimau) {
                // stop_semua();
                mp_harimau.start();
            }else if (v == bt_hiu) {
                // stop_semua();
                mp_hiu.start();
            }else if (v == bt_hyena) {
                // stop_semua();
                mp_hyena.start();
            }else if (v == bt_jerapah) {
                // stop_semua();
                mp_jerapah.start();
            }else if (v == bt_kadal) {
                // stop_semua();
                mp_kadal.start();
            }else if (v == bt_kalajengking) {
                // stop_semua();
                mp_kalajengking.start();
            }else if (v == bt_kalkun) {
                // stop_semua();
                mp_kalkun.start();
            }else if (v == bt_keledai) {
                // stop_semua();
                mp_keledai.start();
            }else if (v == bt_kelelawar) {
                // stop_semua();
                mp_kelelawar.start();
            }else if (v == bt_kelinci) {
                // stop_semua();
                mp_kelinci.start();
            }else if (v == bt_kera) {
                // stop_semua();
                mp_kera.start();
            }else if (v == bt_kerbau) {
                // stop_semua();
                mp_kerbau.start();
            }else if (v == bt_kingkong) {
                // stop_semua();
                mp_kingkong.start();
            }else if (v == bt_kodok) {
                // stop_semua();
                mp_kodok.start();
            }else if (v == bt_komodo) {
                // stop_semua();
                mp_komodo.start();
            }else if (v == bt_kucing) {
                // stop_semua();
                mp_kucing.start();
            }else if (v == bt_kuda) {
                mp_kuda.start();
            }else if (v == bt_kudanil) {
                mp_kudanil.start();
            }else if (v == bt_kupukupu) {
                mp_kupukupu.start();
            }else if (v == bt_lalat) {
                mp_lalat.start();
            }else if (v == bt_landak) {
                mp_landak.start();
            }else if (v == bt_lebah) {
                mp_lebah.start();
            }else if (v == bt_lumba) {
                mp_lumba.start();
            }else if (v == bt_macantutul) {
                mp_macantutul.start();
            }else if (v == bt_merpati) {
                mp_merpati.start();
            }else if (v == bt_musang) {
                mp_musang.start();
            }else if (v == bt_nyamuk) {
                mp_nyamuk.start();
            }else if (v == bt_panda) {
                mp_panda.start();
            }else if (v == bt_pausbungkus) {
                mp_pausbungkus.start();
            }else if (v == bt_pauskepalabusur) {
                mp_pauskepalabusur.start();
            }else if (v == bt_pemakansemut) {
                mp_pemakansemut.start();
            }else if (v == bt_penguin) {
                mp_penguin.start();
            }else if (v == bt_rakun) {
                mp_rakun.start();
            }else if (v == bt_rusa) {
                mp_rusa.start();
            }else if (v == bt_sapi) {
                mp_sapi.start();
            }else if (v == bt_serigala) {
                mp_serigala.start();
            }else if (v == bt_singa) {
                mp_singa.start();
            }else if (v == bt_tikus) {
                mp_tikus.start();
            }else if (v == bt_tokek) {
                mp_tokek.start();
            }else if (v == bt_ular) {
                mp_ular.start();
            }else if (v == bt_unta) {
                mp_unta.start();
            }else if (v == bt_yak) {
                mp_yak.start();
            }else if (v == bt_zebra) {
                mp_zebra.start();
            }
        }
        else {
            inet_mati();
        }
    }
    public void stop_semua(){
        mp_alpaka.pause();
        mp_angsa.pause();
        mp_anjing.pause();

    }

    public void inet_mati () {
        AlertDialog damz_dialog = new AlertDialog.Builder(Act_utama.this).create();
        damz_dialog.setTitle("Warning");
        //damz_dialog.setIcon(R.drawable.warning);
        damz_dialog.setMessage("Please Activate Your Connection Internet...");
        damz_dialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        damz_dialog.show();
    }
    public void matikan_tombol () {
        bt_alpaka.setEnabled(false);
        bt_angsa.setEnabled(false);
        bt_anjing.setEnabled(false);
        bt_antelope.setEnabled(false);
        bt_ayambetina.setEnabled(false);
        bt_ayamjantan.setEnabled(false);
        bt_babi.setEnabled(false);
        bt_badak.setEnabled(false);
        bt_bebek.setEnabled(false);
        bt_beo.setEnabled(false);
        bt_berang.setEnabled(false);
        bt_buaya.setEnabled(false);
        bt_burgak.setEnabled(false);
        bt_burhan.setEnabled(false);
        bt_cicak.setEnabled(false);
        bt_domba.setEnabled(false);
        bt_gajah.setEnabled(false);
        bt_harimau.setEnabled(false);
        bt_hiu.setEnabled(false);
        bt_hyena.setEnabled(false);
        bt_jerapah.setEnabled(false);
        bt_kadal.setEnabled(false);
        bt_kalajengking.setEnabled(false);
        bt_kalkun.setEnabled(false);
        bt_keledai.setEnabled(false);
        bt_kelelawar.setEnabled(false);
        bt_kelinci.setEnabled(false);
        bt_kera.setEnabled(false);
        bt_kerbau.setEnabled(false);
        bt_kingkong.setEnabled(false);
        bt_kodok.setEnabled(false);
        bt_komodo.setEnabled(false);
        bt_kucing.setEnabled(false);
        bt_kuda.setEnabled(false);
        bt_kudanil.setEnabled(false);
        bt_kupukupu.setEnabled(false);
        bt_lalat.setEnabled(false);
        bt_landak.setEnabled(false);
        bt_lebah.setEnabled(false);
        bt_lumba.setEnabled(false);
        bt_macantutul.setEnabled(false);
        bt_merpati.setEnabled(false);
        bt_musang.setEnabled(false);
        bt_nyamuk.setEnabled(false);
        bt_panda.setEnabled(false);
        bt_pausbungkus.setEnabled(false);
        bt_pauskepalabusur.setEnabled(false);
        bt_pemakansemut.setEnabled(false);
        bt_penguin.setEnabled(false);
        bt_rakun.setEnabled(false);
        bt_rusa.setEnabled(false);
        bt_sapi.setEnabled(false);
        bt_serigala.setEnabled(false);
        bt_singa.setEnabled(false);
        bt_tikus.setEnabled(false);
        bt_tokek.setEnabled(false);
        bt_ular.setEnabled(false);
        bt_unta.setEnabled(false);
        bt_yak.setEnabled(false);
        bt_zebra.setEnabled(false);

    }
    public void hidupkan_tombol () {
        bt_alpaka.setEnabled(true);
        bt_angsa.setEnabled(true);
        bt_anjing.setEnabled(true);
        bt_antelope.setEnabled(true);
        bt_ayambetina.setEnabled(true);
        bt_ayamjantan.setEnabled(true);
        bt_babi.setEnabled(true);
        bt_badak.setEnabled(true);
        bt_bebek.setEnabled(true);
        bt_beo.setEnabled(true);
        bt_berang.setEnabled(true);
        bt_buaya.setEnabled(true);
        bt_burgak.setEnabled(true);
        bt_burhan.setEnabled(true);
        bt_cicak.setEnabled(true);
        bt_domba.setEnabled(true);
        bt_gajah.setEnabled(true);
        bt_harimau.setEnabled(true);
        bt_hiu.setEnabled(true);
        bt_hyena.setEnabled(true);
        bt_jerapah.setEnabled(true);
        bt_kadal.setEnabled(true);
        bt_kalajengking.setEnabled(true);
        bt_kalkun.setEnabled(true);
        bt_keledai.setEnabled(true);
        bt_kelelawar.setEnabled(true);
        bt_kelinci.setEnabled(true);
        bt_kera.setEnabled(true);
        bt_kerbau.setEnabled(true);
        bt_kingkong.setEnabled(true);
        bt_kodok.setEnabled(true);
        bt_komodo.setEnabled(true);
        bt_kucing.setEnabled(true);
        bt_kuda.setEnabled(true);
        bt_kudanil.setEnabled(true);
        bt_kupukupu.setEnabled(true);
        bt_lalat.setEnabled(true);
        bt_landak.setEnabled(true);
        bt_lebah.setEnabled(true);
        bt_lumba.setEnabled(true);
        bt_macantutul.setEnabled(true);
        bt_merpati.setEnabled(true);
        bt_musang.setEnabled(true);
        bt_nyamuk.setEnabled(true);
        bt_panda.setEnabled(true);
        bt_pausbungkus.setEnabled(true);
        bt_pauskepalabusur.setEnabled(true);
        bt_pemakansemut.setEnabled(true);
        bt_penguin.setEnabled(true);
        bt_rakun.setEnabled(true);
        bt_rusa.setEnabled(true);
        bt_sapi.setEnabled(true);
        bt_serigala.setEnabled(true);
        bt_singa.setEnabled(true);
        bt_tikus.setEnabled(true);
        bt_tokek.setEnabled(true);
        bt_ular.setEnabled(true);
        bt_unta.setEnabled(true);
        bt_yak.setEnabled(true);
        bt_zebra.setEnabled(true);

    }

}