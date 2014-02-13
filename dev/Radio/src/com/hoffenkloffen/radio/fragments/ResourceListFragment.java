package com.hoffenkloffen.radio.fragments;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.hoffenkloffen.radio.R;
import com.hoffenkloffen.radio.entities.Resource;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;

import java.util.List;

@EFragment
public class ResourceListFragment extends ListFragment {

    public interface ResourceListEventHandler {
        public List<? extends Resource> getResourceList();

        public void onResourceSelected(Resource resource);
    }

    ResourceListEventHandler eventHandler;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            eventHandler = (ResourceListEventHandler) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement ResourceListEventHandler");
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        if (getFragmentManager().findFragmentById(R.id.resourceListFragment) != null) {
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }

    @AfterViews
    public void init() {
        load();
    }

    @Background
    public void load() {
        List<Resource> list = (List<Resource>) eventHandler.getResourceList();

        update(list);
    }

    @UiThread
    public void update(List<Resource> list) {
        setListAdapter(new ResourceAdapter(getActivity(), R.layout.resource_list_item, list));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Resource resource = (Resource) l.getItemAtPosition(position);

        eventHandler.onResourceSelected(resource);

        getListView().setItemChecked(position, true);
    }

    private class ResourceAdapter extends ArrayAdapter<Resource> {

        private int resource;

        public ResourceAdapter(Context context, int resource, List<Resource> objects) {
            super(context, resource, objects);
            this.resource = resource;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;

            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(resource, null);
            }

            Resource resource = getItem(position);

            if (resource == null) return view;

            TextView text = (TextView) view.findViewById(R.id.text);
            if (text != null) text.setText(resource.getName());

            return view;
        }
    }
}
