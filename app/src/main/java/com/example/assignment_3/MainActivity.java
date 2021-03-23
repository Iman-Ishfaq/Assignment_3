package com.example.assignment_3;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.content.Intent;
        import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 8000;
    private Handler handler ;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remember_location);

        runnable = new Runnable(){
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), signin.class));
            }
        };

        //noinspection deprecation
        handler = new Handler();
        handler.postDelayed(runnable, 8000);

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler !=null && runnable !=null)
            handler.removeCallbacks(runnable);

    }
}