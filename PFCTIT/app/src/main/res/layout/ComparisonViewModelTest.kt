import org.junit.Test
import org.junit.Assert.assertEquals

class ComparisonViewModelTest {

    @Test
    fun testComparison() {
        val model = ComparisonModel()
        val viewModel = ComparisonViewModel(model)

        val result1 = viewModel.compareAnd
    }
}