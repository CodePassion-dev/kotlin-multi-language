package dev.codepassion.kotlin_multi_language

class MainViewModel {

    val languageList: ArrayList<Language> = arrayListOf(
        Language(R.drawable.cn, "Chinese", "zh"),
        Language(R.drawable.us, "English", "en"),
        Language(R.drawable.fr, "French", "fr"),
        Language(R.drawable.`in`, "Hindi", "hi"),
        Language(R.drawable.np, "Nepali", "ne"),
        Language(R.drawable.ir, "Persian", "fa"),
        Language(R.drawable.vn, "Vietnamese", "vi")
    )

}