package nyc.c4q.huilin.hui_lin_final_exam;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by huilin on 2/12/17.
 */
public class SettingsAdapter extends RecyclerView.Adapter<SettingsVH> {
    @Override
    public SettingsVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.settings_vh, parent, false);
        return new SettingsVH(view);
    }

    @Override
    public void onBindViewHolder(SettingsVH holder, int position) {
        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
