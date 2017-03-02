package br.com.heiderlopes.torcedometro;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by heiderlopes on 02/03/17.
 */

public class App  extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}