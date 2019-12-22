package dev.codepassion.kotlin_multi_language

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_spinner.view.*

class SpinnerAdapter(context: Context, languageList: ArrayList<Language>)
    : ArrayAdapter<Language>(context, 0, languageList) {

    // MARK: - Override methods

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createView(position, convertView, parent)
    }


    // MARK: - Private methods

    private fun createView(position: Int, convertView: View?, parent: ViewGroup): View {

        val language = getItem(position)
        val view = convertView ?: LayoutInflater.from(context).inflate(
            R.layout.item_spinner,
            parent,
            false
        )

        view.flagImageView.setImageResource(language?.flag.let { it } ?: R.drawable.ic_android)
        view.languageTextView.text = language?.name

        return view
    }

}