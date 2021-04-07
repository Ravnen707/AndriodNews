package com.example.andriodnews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.andriodnews.businessLogic.Nyhedsindslag;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nyhedsindslag nyhed = new Nyhedsindslag();
        nyhed.setOverskrift("I will travel across that land\n");
        nyhed.setTeasertekst("Searching far and wide\n");
        nyhed.setLinktilvideo("Teach-Pokemon-to-understand.com\n");
        nyhed.setLinktilbillede("The-power-that's-inside.png\n");
        nyhed.setUdgivelsedato("Pokemon, gotta catch 'em all, it's you and me(07-04-2021)\n");
        nyhed.setUdgivetellerej(false);
        nyhed.setSlettet(false);
        Log.d("Debug", nyhed.getOverskrift()
                + nyhed.getTeasertekst()
                + nyhed.getLinktilvideo()
                + nyhed.getLinktilbillede()
                + nyhed.getUdgivelsedato()
                + nyhed.getUdgivetellerej()
                + nyhed.getSlettet());
        Nyhedsindslag nyhedsindslag2 = new Nyhedsindslag("overskrift\n", "teasetekst\n", "linktilvideo\n");
        Log.d("Debug", nyhedsindslag2.getOverskrift()+ nyhedsindslag2.getTeasertekst()+ nyhedsindslag2.linktilbillede);
    }
}