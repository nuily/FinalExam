package nyc.c4q.huilin.hui_lin_final_exam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by huilin on 2/12/17.
 */
public class SettingsVH extends RecyclerView.ViewHolder {

    private final TextView settingNumTv;

    public SettingsVH(View itemView) {
        super(itemView);
        settingNumTv = (TextView) itemView.findViewById(R.id.settingNumTv);
    }


    public void bind(int position) {
        settingNumTv.setText("Setting - #" + String.valueOf(position));
    }
}
