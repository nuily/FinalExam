package nyc.c4q.huilin.hui_lin_final_exam;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by huilin on 2/12/17.
 */
public class NavAdapter extends RecyclerView.Adapter<NavViewHolder> {

    private final OnItemClickListener listener;

    public NavAdapter(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public NavViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_vh, parent, false);
        return new NavViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NavViewHolder holder, int position) {
        holder.bind(position, listener);

    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
