package nyc.c4q.huilin.hui_lin_final_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

//import android.widget.Button;

public class ProfileActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView rv;
    private LinearLayout btn1;
    private LinearLayout btn2;
    private LinearLayout btn3;
    private LinearLayout btn4;
    private ImageButton imgBtn1;
    private ImageButton imgBtn2;
    private ImageButton imgBtn3;
    private ImageButton imgBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        rv = (RecyclerView) findViewById(R.id.rv_nav_drawer);
        rv.setLayoutManager(new LinearLayoutManager(ProfileActivity.this));
        rv.setAdapter(new NavAdapter(this));

        btn1 = (LinearLayout) findViewById(R.id.btn1);
        imgBtn1 = (ImageButton) btn1.findViewById(R.id.imageButton);
        btn2 = (LinearLayout) findViewById(R.id.btn2);
        imgBtn2 = (ImageButton) btn2.findViewById(R.id.imageButton);
        btn3 = (LinearLayout) findViewById(R.id.btn3);
        imgBtn3 = (ImageButton) btn3.findViewById(R.id.imageButton);
        btn4 = (LinearLayout) findViewById(R.id.btn4);
        imgBtn4 = (ImageButton) btn4.findViewById(R.id.imageButton);

        imgBtn1.setImageResource(R.drawable.ic_favorite_black_24dp);
        imgBtn2.setImageResource(R.drawable.ic_email_black_24dp);
        imgBtn3.setImageResource(R.drawable.ic_settings_black_24dp);
        imgBtn4.setImageResource(R.drawable.ic_highlight_off_black_24dp);

    }

    @Override
    public void onItemClick(int position) {
        switch (position) {
            case 0:
                Toast.makeText(this, "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Selected Message Activity", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Go to Settings", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Selected Logout Activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("Exit me", true);
                startActivity(intent);
                finish();
                break;

        }
    }
}
