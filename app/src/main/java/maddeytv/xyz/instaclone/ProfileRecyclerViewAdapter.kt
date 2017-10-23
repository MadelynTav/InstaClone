package maddeytv.xyz.instaclone

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.vertical_viewholder.view.*

/**
 * Created by mtavarez on 10/21/17.
 */
class ProfileRecyclerViewAdapter(val context: Context, val items: List<Post>)
: RecyclerView.Adapter<ProfileRecyclerViewAdapter.VerticalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): VerticalViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.vertical_viewholder, parent, false);
        return VerticalViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        val post = items[position]
        holder.userName.setText(post.user.userName)
        holder.comment.setText(post.description)

    }


    class VerticalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val profilePhoto: ImageView = view.profile_photo
        var userName : TextView = view.username_tv
        val image : ImageView = view.image_view
        val heartIcon : ImageView = view.heart_icon
        val comment : TextView = view.comment_tv

        init {
            userName = view.findViewById(R.id.username_tv) as TextView;
        }

    }

}

class Post(val user: User,val description:String, val imgUrl: String, val numLikes : Int,
           val timeStamp: String) {

}

class User(val id: String, val userName: String) {

}

