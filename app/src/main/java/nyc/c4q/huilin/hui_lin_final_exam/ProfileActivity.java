package nyc.c4q.huilin.hui_lin_final_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ProfileActivity extends AppCompatActivity implements OnItemClickListener, View.OnClickListener {

    private RecyclerView rv;
    private LinearLayout btn1;
    private LinearLayout btn2;
    private LinearLayout btn3;
    private LinearLayout btn4;
    private ImageButton imgBtn1;
    private ImageButton imgBtn2;
    private ImageButton imgBtn3;
    private ImageButton imgBtn4;
    private TextView btnTxt1;
    private TextView btnTxt2;
    private TextView btnTxt3;
    private TextView btnTxt4;
    private ImageView navHeaderImg;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setUpRv();

        setNavHeaderImg();

        setUpButtons();

    }

    private void setUpButtons() {
        setUpFirstBtn();

        setUpSecBtn();

        setUpThrdBtn();

        setUpFrthBtn();
    }

    private void setUpFrthBtn() {
        btn4 = (LinearLayout) findViewById(R.id.btn4);
        imgBtn4 = (ImageButton) btn4.findViewById(R.id.imageButton);
        btnTxt4 = (TextView) btn4.findViewById(R.id.profile_btn_txt);
        imgBtn4.setImageResource(R.drawable.ic_highlight_off_black_24dp);
        btnTxt4.setText(R.string.profile_btn_4);
        imgBtn4.setTag(3);
        imgBtn4.setOnClickListener(this);
    }

    private void setUpThrdBtn() {
        btn3 = (LinearLayout) findViewById(R.id.btn3);
        imgBtn3 = (ImageButton) btn3.findViewById(R.id.imageButton);
        btnTxt3 = (TextView) btn3.findViewById(R.id.profile_btn_txt);
        imgBtn3.setImageResource(R.drawable.ic_settings_black_24dp);
        btnTxt3.setText(R.string.profile_btn_3);
        imgBtn3.setTag(2);
        imgBtn3.setOnClickListener(this);
    }

    private void setUpSecBtn() {
        btn2 = (LinearLayout) findViewById(R.id.btn2);
        imgBtn2 = (ImageButton) btn2.findViewById(R.id.imageButton);
        btnTxt2 = (TextView) btn2.findViewById(R.id.profile_btn_txt);
        imgBtn2.setImageResource(R.drawable.ic_email_black_24dp);
        btnTxt2.setText(R.string.profile_btn_2);
        imgBtn2.setTag(1);
        imgBtn2.setOnClickListener(this);
    }

    private void setUpFirstBtn() {
        btn1 = (LinearLayout) findViewById(R.id.btn1);
        imgBtn1 = (ImageButton) btn1.findViewById(R.id.imageButton);
        btnTxt1 = (TextView) btn1.findViewById(R.id.profile_btn_txt);
        imgBtn1.setImageResource(R.drawable.ic_favorite_black_24dp);
        btnTxt1.setText(R.string.profile_btn_1);
        imgBtn1.setTag(0);
        imgBtn1.setOnClickListener(this);
    }

    private void setNavHeaderImg() {
        navHeaderImg = (ImageView) findViewById(R.id.nav_header);
        navHeaderImg.setImageResource(R.drawable.ic_mood_black_24dp);
    }

    private void setUpRv() {
        rv = (RecyclerView) findViewById(R.id.rv_nav_drawer);
        rv.setLayoutManager(new LinearLayoutManager(ProfileActivity.this));
        rv.setAdapter(new NavAdapter(this));
    }

    @Override
    public void onItemClick(int number) {
        selectAction(number);
    }

    private void selectAction(int number) {
        switch (number) {
            case 0:
                chooseHeart();
                break;
            case 1:
                chooseMessage();
                break;
            case 2:
                chooseSettings();
                break;
            case 3:
                chooseLogout();
                break;
        }
    }

    private void chooseLogout() {
        Toast.makeText(this, "Selected Logout Activity", Toast.LENGTH_SHORT).show();
        intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("Exit me", true);
        startActivity(intent);
        finish();
    }

    private void chooseSettings() {
        Toast.makeText(this, "Go to Settings", Toast.LENGTH_SHORT).show();
        intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    private void chooseMessage() {
        Toast.makeText(this, "Selected Message Activity", Toast.LENGTH_SHORT).show();
    }

    private void chooseHeart() {
        Toast.makeText(this, "Selected Heart Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        selectAction((Integer) view.getTag());
    }
}
