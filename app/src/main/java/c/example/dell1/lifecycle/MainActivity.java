package c.example.dell1.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected boolean OnCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }
    protected void onResume()
    {
        Toast.makeText(getApplicationContext(),"On Resume",Toast.LENGTH_SHORT).show();
        super.onResume();
    }
    protected void onStart()
    {
        Toast.makeText(getApplicationContext(),"On Start",Toast.LENGTH_SHORT).show();
        super.onStart();
    }
    protected void onStop()
    {
        Toast.makeText(getApplicationContext(),"On Stop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }
    protected void onPause()
    {
        Toast.makeText(getApplicationContext(),"On pause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    protected void onRestart()
    {
        Toast.makeText(getApplicationContext(),"On REASTART",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

}
