package com.tan.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        restart_btn.setOnClickListener {
            clear_score()
        }

        //when player click on scissor icon.
        scissors_btn.setOnClickListener {

            //set the image of user move to scissors
            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors));

            //choose a random number between 1 to 3.
            val computer_move = (1..4).random() //4 is not included.
            //1 denotes "Rock"
            //if value of computer move is 1 it means computer has chosen Rock

            //2 denotes "Paper"
            //if value of computer move is 2 it means computer has chosen paper

            //3 denotes "Scissor"
            //if value of computer move is 1 it means computer has chosen Scissors

            if (computer_move == 1) {
                //set the image of computer move to rock
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.rock));

                //rock beats scissors.
                winner_tv.text = "Computer has won"

                //increase the computer score
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()
            } else if (computer_move == 2) {

                //set the image of computer move to paper
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper));

                //scissors beats paper
                winner_tv.text = "Player has won"

                //increase the player score
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            } else {

                //set the image of computer move to scissors
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors));

                //both user move and computer move are "scissors"
                winner_tv.text = "Draw"
            }

        }


        //when player clicks on  paper icon
        paper_btn.setOnClickListener {

            //set the image of player move to paper
            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper));


            val computer_move = (1..4).random()
            //1 denotes "Rock"
            //if value of computer move is 1 it means computer has chosen Rock

            //2 denotes "Paper"
            //if value of computer move is 2 it means computer has chosen paper

            //3 denotes "Scissor"
            //if value of computer move is 1 it means computer has chosen Scissors

            if (computer_move == 1) {

                //set the image of computer move to rock
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.rock));

                //paper beats rock
                winner_tv.text = "Player has won"

                //increase count of player score
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()
            }
            else if (computer_move == 2) {

                //set the image of computer move to paper
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper));

                //both user move and computer move are "paper"
                winner_tv.text = "Draw"
            } else {

                //set the image of computer move to scissors

                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors));
                //scissors beats paper
                winner_tv.text = "Computer has won"

                //increase the computer score
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()


            }

        }



        //when player click on rock icon.
        rock_btn.setOnClickListener {

            //set the image of user move to rock
            user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.rock));


            val computer_move = (1..4).random()
            //1 denotes "Rock"
            //if value of computer move is 1 it means computer has chosen Rock

            //2 denotes "Paper"
            //if value of computer move is 2 it means computer has chosen paper

            //3 denotes "Scissor"
            //if value of computer move is 1 it means computer has chosen Scissors

            if (computer_move == 1) {
                //set the image of computer move to rock
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.rock));

                //both user  and computer moves are rock
                winner_tv.text = "Draw"

            } else if (computer_move == 2) {

                //set the image of computer move to paper
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.paper));

                //paper beats rock
                winner_tv.text = "Computer has won"

                //increase the computer score
                val cscore: Int = computer_score.text.toString().toInt() + 1
                computer_score.text = cscore.toString()


            } else {
                //set the image of computer move to scissors
                computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.scissors));

                //rock beats scissors
                winner_tv.text = "Player has won"

                //increase the count of plyer
                val pscore: Int = player_score.text.toString().toInt() + 1
                player_score.text = pscore.toString()


            }

        }


    }

    private fun clear_score() {

        //set the computer and player score to 0
        computer_score.text = "0"
        player_score.text = "0"

        winner_tv.text = ""

        //set the images of computer move and user move to "Question mark image".
        user_move_img.setImageDrawable(getResources().getDrawable(R.drawable.question_mark));
        computer_move_img.setImageDrawable(getResources().getDrawable(R.drawable.question_mark));

    }

}