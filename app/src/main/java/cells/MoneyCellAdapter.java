package cells;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoneyCellAdapter extends RecyclerView.Adapter<MoneyCellAdapter.MoneyViewHolder> {

    @NonNull
    @Override
    public MoneyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MoneyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class MoneyViewHolder extends RecyclerView.ViewHolder {

        public MoneyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
