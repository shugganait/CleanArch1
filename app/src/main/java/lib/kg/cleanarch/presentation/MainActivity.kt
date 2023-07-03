package lib.kg.cleanarch.presentation

import lib.kg.cleanarch.presentation.base.BaseActivity
import lib.kg.cleanarch.presentation.base.BaseViewModel
import lib.kg.cleanarch.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {

    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setUI() {
        super.setUI()
    }

    override fun initClickListener() {
        super.initClickListener()
    }

}