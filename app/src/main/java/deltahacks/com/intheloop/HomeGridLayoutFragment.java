/*
package deltahacks.com.intheloop;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

*/
/**
 * Created by Olivia on 2015-02-14.
 *//*


public class HomeGridLayoutFragment extends Fragment implements AdapterView.OnItemClickListener {*//*

       private ImageAdapter mAdapter;

        // A static dataset to back the GridView adapter
        public final static Integer[] imageResIds = new Integer[] {
                R.drawable.ic-weather.png*//*
*/
/* R.drawable.sample_image_2, R.drawable.sample_image_3,
                R.drawable.sample_image_4, R.drawable.sample_image_5, R.drawable.sample_image_6,
                R.drawable.sample_image_7, R.drawable.sample_image_8, R.drawable.sample_image_9}*//*
*/
/*;

        // Empty constructor as per Fragment docs
        public HomeGridLayoutFragment() {}

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mAdapter = new ImageAdapter(getActivity());
        }

        @Override
        public View onCreateView(
                LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            final View v = inflater.inflate(R.layout.image_grid_fragment, container, false);
            final GridView mGridView = (GridView) v.findViewById(R.id.grid_layout);
            mGridView.setAdapter(mAdapter);
            mGridView.setOnItemClickListener(this);
            return v;
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            final Intent i = new Intent(getActivity(), ImageDetailActivity.class);
            i.putExtra(ImageDetailActivity.EXTRA_IMAGE, position);
            startActivity(i);
        }

        private class ImageAdapter extends BaseAdapter {
            private final Context mContext;

            public ImageAdapter(Context context) {
                super();
                mContext = context;
            }

            @Override
            public int getCount() {
                return imageResIds.length;
            }

            @Override
            public Object getItem(int position) {
                return imageResIds[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup container) {
                ImageView imageView;
                if (convertView == null) { // if it's not recycled, initialize some attributes
                    imageView = new ImageView(mContext);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setLayoutParams(new GridView.LayoutParams(
                            LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
                } else {
                    imageView = (ImageView) convertView;
                }
                imageView.setImageResource(imageResIds[position]); // Load image into ImageView
                return imageView;
            }
        }
    }
}
           */
