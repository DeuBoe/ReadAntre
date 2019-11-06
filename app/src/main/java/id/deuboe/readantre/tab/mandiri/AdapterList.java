package id.deuboe.readantre.tab.mandiri;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import id.deuboe.readantre.R;
import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ReadViewHolder> {

  private List<Model> list;
  private LayoutInflater layoutInflater;

  class ReadViewHolder extends RecyclerView.ViewHolder {

    TextView
        textName,
        textNameKtp,
        textDateOfBirth,
        textProfession,
        textIdKtp,
        textAddress,
        textIdPowerOfAttorney,
        textDate,
        textSpinner,
        textId,
        textSort,
        textToday;

    ReadViewHolder(View view) {
      super(view);
      textName = view.findViewById(R.id.name_text);
      textNameKtp = view.findViewById(R.id.nameKtp_text);
      textDateOfBirth = view.findViewById(R.id.dateOfBirth_text);
      textProfession = view.findViewById(R.id.profession_text);
      textIdKtp = view.findViewById(R.id.idKtp_text);
      textAddress = view.findViewById(R.id.address_text);
      textIdPowerOfAttorney = view.findViewById(R.id.idPowerOfAttorney_text);
      textDate = view.findViewById(R.id.date_text);
      textSpinner = view.findViewById(R.id.choice_text);
      textId = view.findViewById(R.id.id_text);
      textSort = view.findViewById(R.id.numberOfSort_text);
      textToday = view.findViewById(R.id.today_text);

    }

  }

  public AdapterList(Context context, List<Model> list) {
    this.layoutInflater = LayoutInflater.from(context);
    this.list = list;
  }

  @NonNull
  @Override
  public ReadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = layoutInflater.inflate(R.layout.list_layout, parent, false);
    return new ReadViewHolder(view);
  }

  @SuppressLint("SetTextI18n")
  @Override
  public void onBindViewHolder(@NonNull ReadViewHolder holder, int position) {
    Model model = list.get(position);

    holder.textName.setText(model.getName());
    holder.textNameKtp.setText(model.getKtp());
    holder.textDateOfBirth.setText(model.getDateOfBirth());
    holder.textProfession.setText(model.getProfession());
    holder.textIdKtp.setText(model.getIdKtp());
    holder.textAddress.setText(model.getAddress());
    holder.textIdPowerOfAttorney.setText(model.getIdPowerOfAttorney());
    holder.textDate.setText(model.getDate());
    holder.textSpinner.setText(model.getSpinner());
    holder.textId.setText(model.getId());
    holder.textSort.setText("Mandiri- " + (position + 1));
    holder.textToday.setText(model.getToday());
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

}
