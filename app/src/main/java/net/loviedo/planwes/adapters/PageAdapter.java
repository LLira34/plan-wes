package net.loviedo.planwes.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import net.loviedo.planwes.fragments.ElectroStimulatorFragment;
import net.loviedo.planwes.fragments.ElectropediaFragment;

public class PageAdapter extends FragmentStatePagerAdapter {
    private int count;

    public PageAdapter(@NonNull FragmentManager fm, int count) {
        super(fm);
        this.count = count;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ElectroStimulatorFragment electroStimulatorFragment = new ElectroStimulatorFragment();
                return electroStimulatorFragment;
            case 1:
                ElectropediaFragment electropediaFragment = new ElectropediaFragment();
                return electropediaFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }

}//End class
