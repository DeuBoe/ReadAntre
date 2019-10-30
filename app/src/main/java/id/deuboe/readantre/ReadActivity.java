package id.deuboe.readantre;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.List;

public class ReadActivity extends AppCompatActivity {

  private AdapterList adapterList;
  private List<Model> modelList;
  private ProgressBar progressBar;

  private FirebaseFirestore firestore;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_read);

    progressBar = findViewById(R.id.progress_bar);

    RecyclerView recyclerView = findViewById(R.id.list);
    recyclerView.setHasFixedSize(true);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));

    modelList = new ArrayList<>();
    adapterList = new AdapterList(this, modelList);

    recyclerView.setAdapter(adapterList);

    firestore = FirebaseFirestore.getInstance();

    firestore.collection("users").get()
        .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
          @Override
          public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

            progressBar.setVisibility(View.GONE);

            if (!queryDocumentSnapshots.isEmpty()) {
              List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();

              for (DocumentSnapshot documentReference : list) {
                Model model = documentReference.toObject(Model.class);
                modelList.add(model);
              }

              adapterList.notifyDataSetChanged();
            }
          }
        });
  }
}
