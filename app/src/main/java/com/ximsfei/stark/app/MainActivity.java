package com.ximsfei.stark.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ximsfei.stark.core.StarkConfig;

import java.io.File;

public class MainActivity extends Activity {
    @Override
    protected void attachBaseContext(Context newBase) {
        final Context finalNewBase = newBase;
        newBase = new ContextWrapper(finalNewBase) {
            @Override
            public AssetManager getAssets() {
                Resources res = getFixedResources(finalNewBase);
                if (res != null) {
                    return res.getAssets();
                }
                return super.getAssets();
            }

            @Override
            public Resources getResources() {
                Resources res = getFixedResources(finalNewBase);
                if (res != null) {
                    return res;
                }
                return super.getResources();
            }

            @Override
            public void setTheme(int resid) {
                super.setTheme(resid);
            }

            @Override
            public Resources.Theme getTheme() {
                return super.getTheme();
            }
        };
        super.attachBaseContext(newBase);
    }

    private Resources getFixedResources(Context context) {
        File file = new File("/sdcard/Android/data/" + context.getPackageName() + "/fix.apk");
        if (file.exists()) {
            PackageInfo info = getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
            ApplicationInfo applicationInfo = info.applicationInfo;
            applicationInfo.sourceDir = file.getAbsolutePath();
            applicationInfo.publicSourceDir = file.getAbsolutePath();
            try {
                return getPackageManager().getResourcesForApplication(applicationInfo);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button recreate = findViewById(R.id.recreate);
        recreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        TextView content = findViewById(R.id.content);
        content.setText("fix text: " + getResources().getString(R.string.fix_text));
        StarkConfig.init(this);
        Log.e("recreate", "btn text = " + recreate.getText());
        Log.e("recreate", "BUILD_HASH = " + StarkConfig.BUILD_HASH);
    }
}
