package poly.manhnt.datn_md09.Views.PlashScreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import poly.manhnt.datn_md09.R;
import poly.manhnt.datn_md09.Views.DetailScreen.DetailActivity;
import poly.manhnt.datn_md09.Views.HomeScreen.HomeActivity;
import poly.manhnt.datn_md09.Views.NotifiScreen.NotifiActivity;
import poly.manhnt.datn_md09.Views.PayScreen.PayActivity;


public class PlashAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plash);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                }catch (Exception e){

                }finally {
                    Intent intent = new Intent(PlashAcivity.this, PayActivity.class);
                    startActivity(intent);
                }
            }
        });
        thread.start();
    }
}