package id.deuboe.readantre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ReadViewHolder> {

  private Context context;
  private List<Model> list;

  public AdapterList(Context context, List<Model> list) {
    this.context = context;
    this.list = list;
  }
  @NonNull
  @Override
  public ReadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new ReadViewHolder(
        LayoutInflater.from(context).inflate(R.layout.list_layout, parent, false)
    );
  }

  @Override
  public void onBindViewHolder(@NonNull ReadViewHolder holder, int position) {
    Model model = list.get(position);

    holder.textId.setText(model.getDateOfBirth());
    holder.textName.setText(model.getName());
    holder.textChoice.setText(model.getAddress());
    holder.textDate.setText(model.getDate());
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

  class ReadViewHolder extends RecyclerView.ViewHolder {

    TextView textId, textName, textChoice, textDate;


    public ReadViewHolder(View itemView) {
      super(itemView);

      textId = itemView.findViewById(R.id.number_of_sort);
      textName = itemView.findViewById(R.id.name_text);
      textChoice = itemView.findViewById(R.id.choice_text);
      textDate = itemView.findViewById(R.id.date_text);
    }
  }
}
