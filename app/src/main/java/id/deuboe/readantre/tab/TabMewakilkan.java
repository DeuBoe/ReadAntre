package id.deuboe.readantre.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import id.deuboe.readantre.R;
import id.deuboe.readantre.tab.mewakilkan.AdapterList2;
import id.deuboe.readantre.tab.mewakilkan.Model2;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class TabMewakilkan extends Fragment {

  private AdapterList2 adapterList;
  private List<Model2> modelList;

  public TabMewakilkan() {

  }

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle saveInstanceState) {
    View view = inflater.inflate(R.layout.tab_mewakilkan, container, false);

    RecyclerView recyclerView = view.findViewById(R.id.list_mewakili);
    recyclerView.setHasFixedSize(true);
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    modelList = new ArrayList<>();
    adapterList = new AdapterList2(getActivity(), modelList);

    recyclerView.setAdapter(adapterList);

    FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    firestore.collection("users2").get()
        .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
          @Override
          public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

            if (!queryDocumentSnapshots.isEmpty()) {
              List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();

              for (DocumentSnapshot documentReference : list) {
                Model2 model = documentReference.toObject(Model2.class);
                modelList.add(model);
              }

              adapterList.notifyDataSetChanged();
            }
          }
        });
    return view;
  }
}
