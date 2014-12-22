package com.os.operando.toolbarsample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolBar = (Toolbar) findViewById(R.id.toolbar);
        toolBar.setPopupTheme(R.style.PopupMenu);
        toolBar.setTitle("Test Title");
        setSupportActionBar(toolBar);
        toolBar.setNavigationIcon(R.drawable.ic_launcher);

        Toolbar bottomToolbar = (Toolbar) findViewById(R.id.bottom_toolbar);
        bottomToolbar.setNavigationIcon(R.drawable.ic_launcher);
        bottomToolbar.setTitle("Bottom Toolbar");
        bottomToolbar.inflateMenu(R.menu.menu_main);
        bottomToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Log.d("", "onMenuItemClick");
                return true;
            }
        });
        bottomToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("", "Navigation Click");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("", "onOptionsItemSelected");
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
