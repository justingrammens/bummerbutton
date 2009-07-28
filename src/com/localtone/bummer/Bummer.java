package com.localtone.bummer;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Bummer extends Activity  {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageButton playButton = (ImageButton) this.findViewById(R.id.playbutton);
        
        playButton.setBackgroundDrawable(null);
        playButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {	
            	MediaPlayer mNotify;
            	mNotify = MediaPlayer.create(v.getContext(), R.drawable.sound);
            	mNotify.start();
            }
        });
    }
    
    @Override 
    public boolean onCreateOptionsMenu(Menu menu) { 
    	super.onCreateOptionsMenu(menu); 
    	MenuInflater inflater = getMenuInflater(); 
    	inflater.inflate(R.menu.menu, menu); 
    	return true; 
    }
    
    @Override 
    public boolean onOptionsItemSelected(MenuItem item) { 
    switch (item.getItemId()) { 
    	case R.id.about: 
    		startActivity(new Intent(this, About.class)); 
    		return true;  
    	} 
    	return false; 
    }

}