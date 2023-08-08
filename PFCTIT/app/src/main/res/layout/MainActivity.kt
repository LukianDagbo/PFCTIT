import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ComparisonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ComparisonModel()
        viewModel = ViewModelProvider(this, ComparisonViewModelFactory(model)).get(ComparisonViewModel::class.java)

        compareButton.setOnClickListener {
            val str1 = editText1.text.toString()
            val str2 = editText2.text.toString()

            val result = viewModel.compareAndGenerateResult(str1, str2)
            resultText.text = result
        }
    }
}
