package nyc.c4q.huilin.hui_lin_final_exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SettingsActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setUpRv();
    }

    private void setUpRv() {
        rv = (RecyclerView) findViewById(R.id.rv_settings);
        rv.setLayoutManager(new LinearLayoutManager(SettingsActivity.this));
        rv.setAdapter(new SettingsAdapter());
    }
}
