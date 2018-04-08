package xxxaaa.kotlintest.Fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import xxxaaa.kotlintest.R


@Suppress("DEPRECATION")
class HomeFragment : BaseFragment() {



    private var mTitle: String? = null

    private var num: Int = 1


    private var loadingMore = false

    private var isRefresh = false

    companion object {
        fun getInstance(title: String): HomeFragment {
            val fragment = HomeFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

    private val linearLayoutManager by lazy {
        LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
    }




    override fun getLayoutId(): Int = R.layout.fragment_a


    /**
     * 初始化 ViewI
     */
    override fun initView() {


    }


    override fun lazyLoad() {
    }





    override fun onDestroy() {
        super.onDestroy()
    }

    fun getColor(colorId: Int): Int {
        return resources.getColor(colorId)
    }


}
