package com.example.busschedule.UI

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.database.schedule.Schedule
import com.example.busschedule.databinding.BusStopItemBinding
import java.sql.Date
import java.text.SimpleDateFormat

class BusStopViewHolder(private var binding: BusStopItemBinding): RecyclerView.ViewHolder(binding.root) {
    @SuppressLint("SimpleDateFormat")
    fun bind(schedule: Schedule) {
        binding.stopNameTextView.text = schedule.stopName
        binding.arrivalTimeTextView.text = SimpleDateFormat(
            "h:mm a").format(
            Date(schedule.arrivalTime.toLong() * 1000)
        )
    }


}