package lib.kg.cleanarch.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding, VM : ViewModel> : AppCompatActivity() {

    protected lateinit var binding: VB
//    protected abstract val viewModel: VM

    abstract fun inflateViewBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding()
        setContentView(binding.root)

        setUI()
        initClickListener()
    }

    open fun setUI() {
        // Инициализация UI компонентов
    }

    open fun initClickListener() {
        // Обработка кликов
    }
}