package com.example.noteapp.feature_note.domain.util

//정렬 방식은
//오름차순 아니면 내림차순이다.
//다른 값은 존재하지 않는다.
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}