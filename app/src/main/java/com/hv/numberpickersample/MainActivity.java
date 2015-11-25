package com.hv.numberpickersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hivedi.numberpicker.NumberPicker;

public class MainActivity extends AppCompatActivity {

	NumberPicker np;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		np = (NumberPicker) findViewById(R.id.picker);
		np.setMaxValue(100);
		np.setMinValue(1);
		np.setValue(20);
	}

	public void handleValue(View v) {
		Toast.makeText(this, "Value: " + np.getValue() + "\nText: " + np.getText(), Toast.LENGTH_SHORT).show();
	}
}
