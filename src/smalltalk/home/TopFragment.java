package smalltalk.home;

import lolforum.home.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TopFragment extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.fragment_top_list, container, false);
	    
		return view;
	}
}