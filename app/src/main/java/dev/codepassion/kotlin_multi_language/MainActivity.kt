package dev.codepassion.kotlin_multi_language

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener, View.OnTouchListener {

    // MARK: - Properties

    private lateinit var languageList: ArrayList<Language>
    private var isTouched: Boolean = false



    // MARK: - Override methods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        daysTextView.text = getString(R.string.days).format(
            getString(R.string.monday),
            getString(R.string.tuesday),
            getString(R.string.wednesday),
            getString(R.string.thursday),
            getString(R.string.friday),
            getString(R.string.saturday),
            getString(R.string.sunday)
        )

        languageList = MainViewModel().loadLanguage()
        spinner.adapter = SpinnerAdapter(this, languageList)

        val currentLanguage = Locale.getDefault().getLanguage()
        val index: Int = languageList.indexOfFirst { l -> l.code == currentLanguage }
        spinner.setSelection(index)

        spinner.setOnTouchListener(this)
        spinner.onItemSelectedListener = this

    }

    override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
        isTouched = true
        return false
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        if (!isTouched) return
        val language = languageList[p2]
        changeLanguage(language.code)
        isTouched = false
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }



    // MARK: - Private methods

    private fun changeLanguage(code: String) {

        val config = resources.configuration
        val locale = Locale(code)

        Locale.setDefault(locale)
        config.locale = locale
        resources.updateConfiguration(config, resources.displayMetrics)

        recreate()
    }
}

