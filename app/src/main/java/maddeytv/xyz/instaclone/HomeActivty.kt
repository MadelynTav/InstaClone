package maddeytv.xyz.instaclone

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.firebase.client.Firebase
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initializeBottomBar()
        setBottomBarNavigation()
        supportFragmentManager.beginTransaction().replace(android.R.id.content, HomeFragment()).commit()
        Firebase.setAndroidContext(this)
    }

    private fun initializeBottomBar() {
        bottom_bar.enableAnimation(false)
        bottom_bar.enableItemShiftingMode(false)
        bottom_bar.enableShiftingMode(false)
        bottom_bar.setTextVisibility(false)
    }

    private fun setBottomBarNavigation() {
        bottom_bar.setOnNavigationItemSelectedListener {
            var fragment: Fragment =
            when (it.itemId) {
                R.id.ic_circle -> ShareFragment()
                R.id.ic_android -> ProfileFragment()
                R.id.ic_alert ->  LikesFragment()
                R.id.ic_search ->  SearchFragment()
                else -> HomeFragment()

            }

            if (null != fragment) {
                val ft = supportFragmentManager.beginTransaction();
                ft.replace(android.R.id.content, fragment);
                ft.commit();
            }
            true
        }
    }
}





