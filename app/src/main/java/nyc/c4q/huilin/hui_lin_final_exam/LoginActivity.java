package nyc.c4q.huilin.hui_lin_final_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText loginUserEt;
    private EditText loginPwEt;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (getIntent().getBooleanExtra(getString(R.string.Logout), false)) {
            finish();
        }
        loginUserEt = (EditText) findViewById(R.id.login_username);
        loginPwEt = (EditText) findViewById(R.id.login_pw);
        submitBtn = (Button) findViewById(R.id.login_submit);

        submitBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Editable username = loginUserEt.getText();
        Editable pw = loginPwEt.getText();
        if (TextUtils.isEmpty(username) || username.toString().contains(" ")) {
            Toast.makeText(this, R.string.usernameReminder, Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(pw) || pw.toString().contains(" ")) {
            Toast.makeText(this, R.string.pwReminder, Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        }
    }
}
