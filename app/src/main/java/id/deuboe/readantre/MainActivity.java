package id.deuboe.readantre;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout.Tab;
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener;
import id.deuboe.readantre.tab.adapter.PageAdapter;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

//    Toolbar toolbar = findViewById(R.id.toolbar);
//    setSupportActionBar(toolbar);
//    setTitle("Antrean");

//    TabLayout tabLayout = findViewById(R.id.tab_layout);
//    tabLayout.addTab(tabLayout.newTab().setText("Mandiri"));
//    tabLayout.addTab(tabLayout.newTab().setText("Mewakili"));
//    tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    ViewPager viewPager = findViewById(R.id.pager);
    PageAdapter pageAdapter = new PageAdapter(this, getSupportFragmentManager());
    viewPager.setAdapter(pageAdapter);
    TabLayout tabLayout = findViewById(R.id.tab_layout);
    tabLayout.setupWithViewPager(viewPager);
    tabLayout.addOnTabSelectedListener(new OnTabSelectedListener() {
      @Override
      public void onTabSelected(Tab tab) {

      }

      @Override
      public void onTabUnselected(Tab tab) {

      }

      @Override
      public void onTabReselected(Tab tab) {

      }
    });
  }
}