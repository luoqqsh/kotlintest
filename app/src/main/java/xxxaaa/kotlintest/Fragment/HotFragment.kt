package xxxaaa.kotlintest.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import xxxaaa.kotlintest.R

class HotFragment : BaseFragment() {


    private var mTitle: String? = null

    /**
     * 存放 tab 标题
     */
    private val mTabTitleList = ArrayList<String>()

    private val mFragmentList = ArrayList<Fragment>()

    companion object {
        fun getInstance(title: String): HotFragment {
            val fragment = HotFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }




    override fun getLayoutId(): Int = R.layout.fragment_b


    override fun lazyLoad() {
    }

    override fun initView() {

    }



    override fun onDestroy() {
        super.onDestroy()
    }

}