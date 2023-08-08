import androidx.lifecycle.ViewModel

class ComparisonViewModel(private val model: ComparisonModel) : ViewModel() {

    fun compareAndGenerateResult(str1: String, str2: String): String {
        val areEqual = model.compareStrings(str1, str2)
        return if (areEqual) "Las cadenas son iguales" else "Las cadenas son diferentes"
    }
}
