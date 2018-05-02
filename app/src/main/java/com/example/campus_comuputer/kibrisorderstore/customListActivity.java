package com.example.campus_comuputer.kibrisorderstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class customListActivity extends AppCompatActivity {
    //int[] images={R.drawable.image1,R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10};
    int[] images={R.drawable.image1,R.drawable.image2};
    String[] title = {"Product 1","Product 2"};
    String[] description = {"Description of product 1","Description of product 2"};
    // String[] title = {"Product 1","Product 2","Product 3","Product 4","Product 5","Product 6","Product 7","Product 8","Product 9","Product 10"};
    //String[] description = {"Description of product 1","Description of product 2","Description of product 3","Description of product 4","Description of product 5","Description of product 6","Description of product 7","Description of product 8","Description of product 9","Description of product "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        ListView listView = (ListView) findViewById(R.id.cuslistView);
        CustomListAdapter customAdapter = new CustomListAdapter();
        listView.setAdapter(customAdapter);


    }

    public class CustomListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textView_title = (TextView) view.findViewById(R.id.textView_title);
            TextView textView_description = (TextView) view.findViewById(R.id.textView_description);

            imageView.setImageResource(images[i]);
            textView_description.setText(description[i]);
            textView_title.setText(title[i]);

            return null;
        }
    }
}
