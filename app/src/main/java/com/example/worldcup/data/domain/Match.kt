package com.example.worldcup.data.domain

 data class Match(
//done
  val year:Int,
  val stadium:String,
  val city:String,
  val homeTeamName:String,
  val awayTeamName:String,
  val homeTeamGoals:Int,
  val awayTeamGoals:Int
 )