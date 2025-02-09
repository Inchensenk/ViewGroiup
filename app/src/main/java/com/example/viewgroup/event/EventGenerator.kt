package com.example.viewgroup.event

import com.example.viewgroup.R

object EventGenerator {

    private val imageIdList:List<Int> = listOf(
        R.drawable.calendar_icon,
        R.drawable.lunch_icon,
        R.drawable.walking_icon,
        R.drawable.meeteng_icon
    )

    fun generateEvents(count:Int):List<Event> =
        (0..count).map { index ->
            Event(
                imageResId = imageIdList.random(),
                name = "Событие $index",
                time = "${(12..23).random()}:${(10..59).random()}",
            )
        }




}