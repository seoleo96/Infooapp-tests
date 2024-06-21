package com.seoleo.infoapp_tests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.seoleo.infoapp_tests.databinding.LayoutItemBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MyTestAdapter
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = getString(R.string.title)
        setUpAdapter()
    }

    private fun setUpAdapter() {
        recyclerView = findViewById(R.id.recycler_view)
        adapter = MyTestAdapter()
        recyclerView.adapter = adapter
        adapter.update(
            listOf<TestModel>(
                TestModel("title", "venue", "end date 1")
            )
        )
    }
}

data class TestModel(
    val name: String,
    val venue: String,
    val endDate: String,
)

class MyTestAdapter : RecyclerView.Adapter<MyTestAdapter.MyViewHolder>() {

    private val items = mutableListOf<TestModel>()
    fun update(newList: List<TestModel>) {
        items.clear()
        items.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutItemBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setData(items[position])
    }

    class MyViewHolder(
        private val binding: LayoutItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun setData(data: TestModel) {
            binding.name.text = data.name
            binding.venue.text = data.venue
            binding.endDate.text = data.endDate
        }
    }
}
