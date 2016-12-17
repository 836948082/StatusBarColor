package com.runtai.statusbarcolor;

import android.os.Bundle;

public class SecondActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentViewWithStatusBarColorByColorPrimaryDark(R.layout.activity_second);
	}
}
