package xyz.madmuv.testfakeit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mooveit.library.Fakeit;
import xyz.madmuv.testfakeit.model.Test

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = arrayListOf<Test>()
        Fakeit.init()


        for(i in 1..20) {
            data.add(Test(Fakeit.name().firstName(),Fakeit.name().lastName()))
        }

        Log.d("Fakeit", data.toString())
    }
}
