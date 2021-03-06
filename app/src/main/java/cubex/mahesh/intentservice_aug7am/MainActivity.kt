package cubex.mahesh.intentservice_aug7am

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        get.setOnClickListener({
            var i = Intent(this,
                    MyIntentService::class.java)
            startService(i)
        })

        var filter = IntentFilter( )
        filter.addAction("iservice_task_done")
        registerReceiver(MyReceiver(iview),filter)
    }  // onCreate
}
