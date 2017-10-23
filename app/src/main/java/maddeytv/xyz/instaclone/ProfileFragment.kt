package maddeytv.xyz.instaclone

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.profile_fragment.*

/**
 * Created by mtavarez on 10/21/17.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater?.inflate(R.layout.profile_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val items = listOf<Post>(Post(User("12", "John"), "First Photo", "img", 4, "1234"),
                Post(User("12", "Mary"), "Second Photo", "img", 4, "1234"))
        val adapter = ProfileRecyclerViewAdapter(context, items)
        profile_recyclerView.layoutManager = LinearLayoutManager(context)
        profile_recyclerView.adapter = adapter
    }
}