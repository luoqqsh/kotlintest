package xxxaaa.kotlintest.Fragment

import android.os.Bundle
import android.view.View
import xxxaaa.kotlintest.R

class MineFragment : BaseFragment(), View.OnClickListener {

    private var mTitle:String? =null

    companion object {
        fun getInstance(title:String): MineFragment {
            val fragment = MineFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

    override fun getLayoutId(): Int= R.layout.fragment_c

    override fun initView() {
    }
    override fun lazyLoad() {
    }

    override fun onClick(v: View?) {
        when{

        }
    }
}