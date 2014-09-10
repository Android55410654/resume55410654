package com.example.profile654;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	private Button btn1, btn2;
	private TextView txt11, txt12, txt13, txt14, txt15, txt16, txt17;
	private String show1, show2, show3, show4, show5, show6, show7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewMatching();
	}

	private void ViewMatching() {
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btnimg);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		txt11 = (TextView) findViewById(R.id.txt14);
		txt12 = (TextView) findViewById(R.id.txt16);
		txt13 = (TextView) findViewById(R.id.textView8);
		txt14 = (TextView) findViewById(R.id.textView10);
		txt15 = (TextView) findViewById(R.id.textView12);
		txt16 = (TextView) findViewById(R.id.textView14);
		txt17 = (TextView) findViewById(R.id.textView16);
		
		txt11.setText("21");
		txt12.setText("Female");
		txt13.setText("Donut");
		txt14.setText("Computer Busintss");
		txt15.setText("Science and social");
		txt16.setText("3");
		txt17.setText("Burapha University");
		
		;
		show1 = getIntent().getStringExtra("txt11");
		show2 = getIntent().getStringExtra("txt12");
		show3 = getIntent().getStringExtra("txt13");
		show4 = getIntent().getStringExtra("txt14");
		show5 = getIntent().getStringExtra("txt15");
		show6 = getIntent().getStringExtra("txt16");
		show7 = getIntent().getStringExtra("txt17");
	
		txt11.setText(show1);
		txt12.setText(show2);
		txt13.setText(show3);
		txt14.setText(show4);
		txt15.setText(show5);
		txt16.setText(show6);
		txt17.setText(show7);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn1:
			Intent i = new Intent(getApplicationContext(), edit_654.class);
			startActivity(i);
			break;
		case R.id.btnimg:
			Intent j = new Intent(getApplicationContext(), ImageActivity.class);
			startActivity(j);
			break;
		default:
			break;
		}
	}
}
