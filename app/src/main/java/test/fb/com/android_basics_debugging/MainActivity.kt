package test.fb.com.android_basics_debugging

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logging()
        division()
    }

    private fun division() {
        val numerator = 60
        var denominator = 4

        // Replace 5 with 4 to fix the division by zero error and prevent the app from
        // crashing
        repeat(4) {
            Thread.sleep(1)
            findViewById<TextView>(R.id.division_textview).text = "${numerator / denominator}"

            denominator--
        }
    }

    private fun logging() {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}