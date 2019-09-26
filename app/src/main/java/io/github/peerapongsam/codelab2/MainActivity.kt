package io.github.peerapongsam.codelab2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.peerapongsam.codelab2.model.RoomTopic
import io.github.peerapongsam.codelab2.service.ForumService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val forumAdapter = ForumAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        callService()
    }

    private fun setupView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = forumAdapter
    }

    private fun callService() {
        val service = ForumService.create()

        service.getRoomTopic("food", null).enqueue(object : Callback<RoomTopic?> {
            override fun onFailure(call: Call<RoomTopic?>, t: Throwable) {
                Log.d(TAG, "onFailure() called with: call = [$call], t = [$t]")
            }

            override fun onResponse(call: Call<RoomTopic?>, response: Response<RoomTopic?>) {
                val body = response.body()
                Log.d(TAG, "onResponse() called with: call = [$call], response = [$body]")
                forumAdapter.submitList(body?.data)
            }
        })

    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
