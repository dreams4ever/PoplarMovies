package as.asd.myapp.poplarmovies;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class DataAdapter extends BaseAdapter {
    Context mContext;

    private  int [] photo={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,};
    private LayoutInflater mInflater;
    public DataAdapter(Context c)
    {
        mContext=c;
        mInflater = LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        return photo.length;

    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if(view==null)
        {
            view = mInflater.inflate(R.layout.custom,viewGroup,false);
            holder = new ViewHolder();

            holder.poster= (ImageView) view.findViewById(R.id.poster);
            //Picasso.with(mContext).load().into();

            if(i==0)
            {
                view.setTag(holder);
            }
        }
        else
        {
            holder = (ViewHolder) view.getTag();
        }

        holder.poster.setImageResource(photo[i]);
        return view;
    }
    static class ViewHolder
    {

        ImageView poster;
    }
}
