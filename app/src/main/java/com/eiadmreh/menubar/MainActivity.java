package com.eiadmreh.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btnNextPage=findViewById(R.id.fab_button);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setIcon(R.mipmap.chrome);
        actionBar.setTitle(" Welcome");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Send.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.refresh:
                Toast.makeText(this, "Refresh was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.download:
                Toast.makeText(this, "Download was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.send:
                Toast.makeText(this, "Send was clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Send.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
