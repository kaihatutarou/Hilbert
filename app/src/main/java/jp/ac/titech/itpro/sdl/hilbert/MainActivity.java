package jp.ac.titech.itpro.sdl.hilbert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView levelView;
    private HilbertView hilbertView;
    private final static int MAX_N = 9;
    private int n = 1;

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreateだよ〜");

        setContentView(R.layout.activity_main);
        levelView = (TextView)findViewById(R.id.level_view);
        hilbertView = (HilbertView)findViewById(R.id.hilbert_view);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResumeだよ〜");
        display();
    }

    public void onClickDec(View v) {
        if (n > 1) n--;
        display();
    }

    public void onClickInc(View v) {
        if (n < MAX_N) n++;
        display();

    }

    private void display() {
        levelView.setText(getString(R.string.level_format, n));
        hilbertView.setLevel(n);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroyだよ〜");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestartだよ〜");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPauseだよ〜");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStopだよ〜");
    }
}
