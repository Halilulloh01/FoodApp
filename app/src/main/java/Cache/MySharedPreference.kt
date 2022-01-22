package Cache

import Models.Food
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPreference {


    private val NAME = "my_cache_file"
    private val MODE = Context.MODE_PRIVATE
    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var name: ArrayList<Food>
        get() = gsonStringToArray(sharedPreferences.getString("obekt", "[]")!!)
        set(value) = sharedPreferences.edit {
            if (value != null) {
                it.putString("obekt", arrayToGsonString(value))
            }
        }

    private fun arrayToGsonString(arrayList: ArrayList<Food>): String? {
        return Gson().toJson(arrayList)
    }

    private fun gsonStringToArray(gsonString: String): ArrayList<Food> {
        val typeToken = object : TypeToken<ArrayList<Food>>() {}.type
        return Gson().fromJson(gsonString, typeToken)
    }
}
