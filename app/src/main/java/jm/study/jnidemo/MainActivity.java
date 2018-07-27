package jm.study.jnidemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static jm.study.jnidemo.JniMethod.getABI;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tv_result);

        String CPU_ABI = android.os.Build.CPU_ABI;
        Log.e("jm", "onCreate: CPU_ABI="+CPU_ABI);
    }


    public void callJni(View view) {
        tvResult.setText(getABI());
    }
}
