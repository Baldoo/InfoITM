package com.example.baldoalberto.infoitm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_inicio:
                    Inicio inicio = new Inicio();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment, inicio, "fragment2");
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigation_mapa:
                    Mapa mapa = new Mapa();
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment, mapa, "fragment2");
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigation_acerca:
                    AcercaDe acerca = new AcercaDe();
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment, acerca, "fragment3");
                    fragmentTransaction.commit();
                    return true;
            }
            return false;
        }
    };

    private void startActivity(MainActivity mainActivity, Class<MainActivity> mainActivityClass) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
