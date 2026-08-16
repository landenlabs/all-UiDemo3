package landenlabs.all_uidemo3.ui.test1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import landenlabs.all_uidemo3.databinding.FragmentTest1Binding;

public class Test1Fragment extends Fragment {

    private FragmentTest1Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        landenlabs.all_uidemo3.ui.test1.Test1ViewModel test1ViewModel =
                new ViewModelProvider(this).get(landenlabs.all_uidemo3.ui.test1.Test1ViewModel.class);

        binding = FragmentTest1Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.test1Title;
        test1ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}