package xxxaaa.kotlintest.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import xxxaaa.kotlintest.R

class DiscoveryFragment : BaseFragment() {

    private val tabList = ArrayList<String>()

    private val fragments = ArrayList<Fragment>()

    private var mTitle: String? = null

    companion object {
        fun getInstance(title: String): DiscoveryFragment {
            val fragment = DiscoveryFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

    override fun getLayoutId(): Int = R.layout.fragment_b

    override fun initView() {

    }

    override fun lazyLoad() {
    }
}