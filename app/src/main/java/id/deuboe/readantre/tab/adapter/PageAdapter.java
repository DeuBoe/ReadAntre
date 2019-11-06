package id.deuboe.readantre.tab.adapter;


import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import id.deuboe.readantre.R;
import id.deuboe.readantre.tab.TabMandiri;
import id.deuboe.readantre.tab.TabMewakilkan;

public class PageAdapter extends FragmentPagerAdapter {

  private final Context context;
  @StringRes
  private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};

  public PageAdapter( Context context, FragmentManager fragmentManager) {
    super(fragmentManager);
    this.context = context;
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {

    switch (position) {
      case 0 :
        return new TabMandiri();
      case 1 :
        return new TabMewakilkan();
      default:
        return null;
    }

  }

  @Nullable
  @Override
  public CharSequence getPageTitle(int position) {
    return context.getResources().getString(TAB_TITLES[position]);
  }

  @Override
  public int getCount() {
    return 2;
  }
}
