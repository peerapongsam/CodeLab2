package io.github.peerapongsam.codelab2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import io.github.peerapongsam.codelab2.model.Topic

class ForumAdapter : ListAdapter<Topic, TopicViewHolder>(object : DiffUtil.ItemCallback<Topic?>() {
    override fun areItemsTheSame(oldItem: Topic, newItem: Topic): Boolean {
        return oldItem.topicId == newItem.topicId
    }

    override fun areContentsTheSame(oldItem: Topic, newItem: Topic): Boolean {
        return oldItem == newItem
    }
}) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        return TopicViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_topic,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        holder.bindValue(getItem(position))
    }
}
