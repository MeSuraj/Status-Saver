package zero.say.android.statussaver.Adapter;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import zero.say.android.statussaver.R;


public class ItemViewHolder extends RecyclerView.ViewHolder{
    public ImageButton save, share;
    public ImageView imageView;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageThumbnail);
        save = itemView.findViewById(R.id.save);
        share = itemView.findViewById(R.id.share);
    }
}
