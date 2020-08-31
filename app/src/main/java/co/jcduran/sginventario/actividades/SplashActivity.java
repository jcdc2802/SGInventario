package co.jcduran.sginventario.actividades;

import android.app.*;
import android.os.*;
import co.jcduran.sginventario.*;
import android.content.*;


public class SplashActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				Intent intent = new Intent(SplashActivity.this,MainActivity.class);
				startActivity(intent);
				finish();
			}
		},3000);
	}
	
}
