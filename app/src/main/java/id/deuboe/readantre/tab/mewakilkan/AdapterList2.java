package id.deuboe.readantre.tab.mewakilkan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.deuboe.readantre.R;
import java.util.List;

public class AdapterList2 extends RecyclerView.Adapter<AdapterList2.ReadViewHolder> {

  private List<Model2> list;
  private LayoutInflater layoutInflater;

  class ReadViewHolder extends RecyclerView.ViewHolder {

    TextView
        textName,
        textNameKtp,
        textDateOfBirth,
        textProfession,
        textIdKtp,
        textAddress,
        textNameDiwakilkan,
        textNameKtp_diwakilkan,
        textDateOfBirth_diwakilkan,
        textProfession_diwakilkan,
        textIdKtp_diwakilkan,
        textAddress_diwakilkan,
        textIdPowerOfAttorney,
        textDate,
        textSpinner,
        textId,
        textSort,
        textToday;


    ReadViewHolder(View itemView) {
      super(itemView);
      textName = itemView.findViewById(R.id.name_text);
      textNameKtp = itemView.findViewById(R.id.nameKtp_text);
      textDateOfBirth = itemView.findViewById(R.id.dateOfBirth_text);
      textProfession = itemView.findViewById(R.id.profession_text);
      textIdKtp = itemView.findViewById(R.id.idKtp_text);
      textAddress = itemView.findViewById(R.id.address_text);
      textNameDiwakilkan = itemView.findViewById(R.id.name_text_mewakilkan);
      textNameKtp_diwakilkan = itemView.findViewById(R.id.nameKtp_text_mewakilkan);
      textDateOfBirth_diwakilkan = itemView.findViewById(R.id.dateOfBirth_text_mewakilkan);
      textProfession_diwakilkan = itemView.findViewById(R.id.profession_text_mewakilkan);
      textIdKtp_diwakilkan = itemView.findViewById(R.id.idKtp_text_mewakilkan);
      textAddress_diwakilkan = itemView.findViewById(R.id.address_text_mewakilkan);
      textIdPowerOfAttorney = itemView.findViewById(R.id.idPowerOfAttorney_text);
      textDate = itemView.findViewById(R.id.date_text);
      textSpinner = itemView.findViewById(R.id.choice_text);
      textId = itemView.findViewById(R.id.id_text);
      textSort = itemView.findViewById(R.id.numberOfSort_text);
      textToday = itemView.findViewById(R.id.today_text);
    }
  }

  public AdapterList2(Context context, List<Model2> list) {
    this.layoutInflater = LayoutInflater.from(context);
    this.list = list;
  }

  @NonNull
  @Override
  public ReadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = layoutInflater.inflate(R.layout.list_layout_mewakilkan, parent, false);
    return new ReadViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ReadViewHolder holder, int position) {
    Model2 model = list.get(position);

    holder.textName.setText(model.getName());
    holder.textNameKtp.setText(model.getKtp());
    holder.textDateOfBirth.setText(model.getDateOfBirth());
    holder.textProfession.setText(model.getProfession());
    holder.textIdKtp.setText(model.getIdKtp());
    holder.textAddress.setText(model.getAddress());
    holder.textNameDiwakilkan.setText(model.getNameDiwakilkan());
    holder.textNameKtp_diwakilkan.setText(model.getKtp_diwakilkan());
    holder.textDateOfBirth_diwakilkan.setText(model.getDateOfBirth_diwakilkan());
    holder.textProfession_diwakilkan.setText(model.getProfession_diwakilkan());
    holder.textIdKtp_diwakilkan.setText(model.getIdKtp_diwakilkan());
    holder.textAddress_diwakilkan.setText(model.getAddress_diwakilkan());
    holder.textIdPowerOfAttorney.setText(model.getIdPowerOfAttorney());
    holder.textDate.setText(model.getDate());
    holder.textSpinner.setText(model.getSpinner());
    holder.textId.setText(model.getId());
    holder.textSort.setText("Mewakili- " + (position + 1));
    holder.textToday.setText(model.getToday());
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

}
