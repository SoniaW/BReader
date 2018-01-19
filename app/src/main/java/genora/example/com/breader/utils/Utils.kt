package genora.example.com.breader.utils

import android.content.Context

/**
 * Created by genora-sonia on 18/1/18.
 */
class Utils {

    companion object {

        const val IMG_EXTENSION = "http://www.genorainnovations.com/Test/img/"

        fun loadJSONFromAsset(context: Context): String {
            return context.assets.open("details_json.json").bufferedReader().use {
                it.readText()
            }
        }
    }
}
