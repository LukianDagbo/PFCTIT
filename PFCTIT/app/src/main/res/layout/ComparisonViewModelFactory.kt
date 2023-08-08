import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ComparisonViewModelFactory(private val model: ComparisonModel) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ComparisonViewModel::class.java)) {
            return ComparisonViewModel(model) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
