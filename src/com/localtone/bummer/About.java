package com.localtone.bummer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class About extends Activity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        
        ImageView pacdudeImg = (ImageView) this.findViewById(R.id.pacdude_img);
        pacdudeImg.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pacdudegames.com/services.html"));
            	startActivity(i); 
            }
        });
        
        ImageView localtoneImg = (ImageView) this.findViewById(R.id.localtone_img);
        localtoneImg.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.localtone.com"));
            	startActivity(i); 
            }
        });
        
    }
}
