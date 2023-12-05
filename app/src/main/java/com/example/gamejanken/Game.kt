package com.example.gamejanken

import kotlin.random.Random

object Game {
//    MENYIMPAN KEY-VALUE DENGAN MAP
    private  val rules = mapOf(
    "ROCKS-SCISSORS" to true,
    "ROCK-PAPER" to false,
    "SCISSORS-PAPER" to true,
    "SCISSORS-ROCK" to true,
    "PAPER-ROCK" to true,
    "PAPER-SCISSORS" to false,
    )
//LIST UNTUK MENYIMPAN ELEMEN BERURUTAN
//JADI URUTAN UNTUK GUNTING-BATU-KERTAS TIDAK TERBALIK

    private  val options = listOf("ROCK","SCISSORS" ,"PAPER")

// MEMBUAT MAP KE-VALUE UNTUK OPSI GAMBAR YANG TAMPIL

    private val optionDrawble = mapOf(
        "ROCK" to R.drawable.rock,
        "SCISSORS" to R.drawable.scissor,
        "PAPER" to R.drawable.paper,
    )


    fun pickRandomOption(): String = options[Random.nextInt(0,3)]
    fun pickDrawble(option:String):Int = optionDrawble[option]!!
    fun isDraw (from:String,to:String):Boolean=from==to
    fun isWin(from: String,to: String):Boolean= rules["$from=$to"]!!

}