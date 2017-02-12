package nyc.c4q.huilin.hui_lin_final_exam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by huilin on 2/12/17.
 */
public class NavViewHolder extends RecyclerView.ViewHolder {

    private final ImageView rv_img;
    private TextView rv_tv;

    public NavViewHolder(View itemView) {
        super(itemView);
        rv_tv = (TextView) itemView.findViewById(R.id.rv_nav_txt);
        rv_img = (ImageView) itemView.findViewById(R.id.rv_nav_icon);
    }

    public void bind(final int position, final OnItemClickListener listener) {
        switch (position) {
            case 0:
                rv_img.setImageResource(R.drawable.ic_favorite_black_24dp);
                rv_tv.setText("Heart Activity");
                break;
            case 1:
                rv_img.setImageResource(R.drawable.ic_email_black_24dp);
                rv_tv.setText("Message Activity");
                break;
            case 2:
                rv_img.setImageResource(R.drawable.ic_settings_black_24dp);
                rv_tv.setText("Settings Activity");
                break;
            case 3:
                rv_img.setImageResource(R.drawable.ic_highlight_off_black_24dp);
                rv_tv.setText("Logout Activity");
                break;
        }
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(getLayoutPosition());
            }
        });
    }
}

