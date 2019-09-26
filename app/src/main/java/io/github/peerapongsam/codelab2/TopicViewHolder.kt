package io.github.peerapongsam.codelab2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.github.peerapongsam.codelab2.model.Topic
import kotlinx.android.synthetic.main.item_topic.view.*

class TopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindValue(topic: Topic?) {
        itemView.topic_title.text = topic?.title
        itemView.topic_tags.text = topic?.tags?.joinToString(" ") { it.name }
        itemView.topic_author.text = topic?.author?.name
        itemView.topic_created_time.text = topic?.createdTime
        itemView.topic_vote.text = topic?.votesCount.toString()
        itemView.topic_comment.text = topic?.commentsCount.toString()

        if (topic?.thumbnailUrl != null) {
            Glide.with(itemView.topic_cover)
                .load(topic.thumbnailUrl)
                .into(itemView.topic_cover)
            itemView.topic_cover.visibility = View.VISIBLE
        } else {
            itemView.topic_cover.visibility = View.GONE
        }
    }
}
