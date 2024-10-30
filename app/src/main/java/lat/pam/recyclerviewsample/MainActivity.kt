package lat.pam.recyclerviewsample

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)


        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)


        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()


        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            if(i % 2 ==0) data.add(ItemsViewModel("Item even " + i)) else data.add(ItemsViewModel("Item odd  " + i))



        }


        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)
        Log.d("test string","Jumlah data: "+data.size)


        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}
