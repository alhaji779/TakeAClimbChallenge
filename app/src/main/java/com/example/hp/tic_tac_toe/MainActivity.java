package com.example.hp.tic_tac_toe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // turn is used for the players turn to play
    // player1 and player2 are the initial score of the players
    int turn = 1;
    int player1,player2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** this activates the buttons to show X or O when clicked
     *
     * @param view
     */
    public void but1 (View view){
        Button b1 = (Button) findViewById(R.id.butn1);
        if(b1.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b1.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b1.setText("O");

            }
        }
        winner();
    }

    public void but2 (View view){
        Button b2 = (Button) findViewById(R.id.butn2);
        if(b2.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b2.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b2.setText("O");

            }
        }
        winner();
    }

    public void but3 (View view){
        Button b3 = (Button) findViewById(R.id.butn3);
        if(b3.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b3.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b3.setText("O");

            }
        }
        winner();
    }

    public void but4 (View view){
        Button b4 = (Button) findViewById(R.id.butn4);
        if(b4.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b4.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b4.setText("O");

            }
        }
        winner();
    }

    public void but5 (View view){
        Button b5 = (Button) findViewById(R.id.butn5);
        if(b5.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b5.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b5.setText("O");

            }
        }
        winner();
    }

    public void but6 (View view){
        Button b6 = (Button) findViewById(R.id.butn6);
        if(b6.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b6.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b6.setText("O");

            }
        }
        winner();
    }

    public void but7 (View view){
        Button b7 = (Button) findViewById(R.id.butn7);
        if(b7.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b7.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b7.setText("O");

            }
        }
        winner();
    }

    public void but8 (View view){
        Button b8 = (Button) findViewById(R.id.butn8);
        if(b8.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b8.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b8.setText("O");

            }
        }
        winner();
    }

    public void but9 (View view){
        Button b9 = (Button) findViewById(R.id.butn9);
        if(b9.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b9.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b9.setText("O");

            }
        }
        winner();
    }

    /** this is the reset button
     * when clicked the board is reset as well as the scoreboard
     * @param v
     */

    public void reset (View v) {

        Button b1 = (Button) findViewById(R.id.butn1);
        b1.setText("");

        Button b2 = (Button) findViewById(R.id.butn2);
        b2.setText("");

        Button b3 = (Button) findViewById(R.id.butn3);
        b3.setText("");

        Button b4 = (Button) findViewById(R.id.butn4);
        b4.setText("");

        Button b5 = (Button) findViewById(R.id.butn5);
        b5.setText("");

        Button b6 = (Button) findViewById(R.id.butn6);
        b6.setText("");

        Button b7 = (Button) findViewById(R.id.butn7);
        b7.setText("");

        Button b8 = (Button) findViewById(R.id.butn8);
        b8.setText("");

        Button b9 = (Button) findViewById(R.id.butn9);
        b9.setText("");

        TextView x_score = (TextView) findViewById(R.id.x_score);
        x_score.setText("0");

        TextView o_score = (TextView) findViewById(R.id.o_score);
        o_score.setText("0");

    }

    /** This button switches the board from 3X3 to 5X5
     * it uses intent to move to another activity
     * @param v
     */

    public void move (View v) {

        Intent intent = new Intent(MainActivity.this, secondActivity.class);
        startActivity(intent);
    }

    /** This method determines the winner or loser
     * it is the AI of the app
     */

   public void winner(){
       Button b1 = (Button) findViewById(R.id.butn1);
       String but1 = b1.getText().toString();

       Button b2 = (Button) findViewById(R.id.butn2);
       String but2 = b2.getText().toString();

       Button b3 = (Button) findViewById(R.id.butn3);
       String but3 = b3.getText().toString();

       Button b4 = (Button) findViewById(R.id.butn4);
       String but4 = b4.getText().toString();

       Button b5 = (Button) findViewById(R.id.butn5);
       String but5 = b5.getText().toString();

       Button b6 = (Button) findViewById(R.id.butn6);
       String but6 = b6.getText().toString();

       Button b7 = (Button) findViewById(R.id.butn7);
       String but7 = b7.getText().toString();

       Button b8 = (Button) findViewById(R.id.butn8);
       String but8 = b8.getText().toString();

       Button b9 = (Button) findViewById(R.id.butn9);
       String but9 = b9.getText().toString();

       if (but1.equals("X") && but2.equals("X") && but3.equals("X")){
           Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
           toast.show();
           player1 = player1 + 1;
           display(player1);
           reset1();
       }

       if (but1.equals("X") && but5.equals("X") && but9.equals("X")){
           Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
           toast.show();
           player1 = player1 + 1;
           display(player1);
           reset1();
       }

       if (but1.equals("X") && but4.equals("X") && but7.equals("X")){
           Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
           toast.show();
           player1 = player1 + 1;
           display(player1);
           reset1();
       }

       if (but2.equals("X") && but5.equals("X") && but8.equals("X")){
           Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
           toast.show();
           player1 = player1 + 1;
           display(player1);
           reset1();
       }

       if (but3.equals("X") && but6.equals("X") && but9.equals("X")){
           Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
           toast.show();
           player1 = player1 + 1;
           display(player1);
           reset1();
       }

       if (but4.equals("X") && but5.equals("X") && but6.equals("X")){
           Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
           toast.show();
           player1 = player1 + 1;
           display(player1);
           reset1();
       }

       if (but7.equals("X") && but8.equals("X") && but9.equals("X")){
           Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
           toast.show();
           player1 = player1 + 1;
           display(player1);
           reset1();
       }

       if (but3.equals("X") && but5.equals("X") && but7.equals("X")){
           Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
           toast.show();
           player1 = player1 + 1;
           display(player1);
           reset1();
       }


       if (but1.equals("O") && but2.equals("O") && but3.equals("O")){
           Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
           toast.show();
           player2 = player2 + 1;
           display2(player2);
           reset1();
       }

       if (but1.equals("O") && but5.equals("O") && but9.equals("O")){
           Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
           toast.show();
           player2 = player2 + 1;
           display2(player2);
           reset1();
       }

       if (but1.equals("O") && but4.equals("O") && but7.equals("O")){
           Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
           toast.show();
           player2 = player2 + 1;
           display2(player2);
           reset1();
       }

       if (but2.equals("O") && but5.equals("O") && but8.equals("O")){
           Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
           toast.show();
           player2 = player2 + 1;
           display2(player2);
           reset1();
       }

       if (but3.equals("O") && but6.equals("O") && but9.equals("O")){
           Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
           toast.show();
           player2 = player2 + 1;
           display2(player2);
           reset1();
       }

       if (but4.equals("O") && but5.equals("O") && but6.equals("O")){
           Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
           toast.show();
           player2 = player2 + 1;
           display2(player2);
           reset1();
       }

       if (but7.equals("O") && but8.equals("O") && but9.equals("O")){
           Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
           toast.show();
           player2 = player2 + 1;
           display2(player2);
           reset1();
       }

       if (but3.equals("O") && but5.equals("O") && but7.equals("O")){
           Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
           toast.show();
           player2 = player2 + 1;
           display2(player2);
           reset1();
       }

       if ((!but1.isEmpty() && !but2.isEmpty() && !but3.isEmpty() && !but4.isEmpty() && !but5.isEmpty() && !but6.isEmpty() && !but7.isEmpty() &&
               !but8.isEmpty() && !but9.isEmpty())){
           Toast.makeText(this, "Draw! No Winner", Toast.LENGTH_LONG).show();
           reset1();
       }
   }

    /** This method displays the score of player 1 and 2
     *
     * @param k
     */
   @SuppressLint("SetTextI18n")
   private void display(int k) {
       TextView x_score = (TextView) findViewById(R.id.x_score);
       x_score.setText("" + k);
   }

    @SuppressLint("SetTextI18n")
    private void display2(int k) {
        TextView o_score = (TextView) findViewById(R.id.o_score);
        o_score.setText("" + k);
    }

    /** This method will reset the board after a win or draw or loss
     *
     */
    private void reset1() {
        Button b1 = (Button) findViewById(R.id.butn1);
        b1.setText("");

        Button b2 = (Button) findViewById(R.id.butn2);
        b2.setText("");

        Button b3 = (Button) findViewById(R.id.butn3);
        b3.setText("");

        Button b4 = (Button) findViewById(R.id.butn4);
        b4.setText("");

        Button b5 = (Button) findViewById(R.id.butn5);
        b5.setText("");

        Button b6 = (Button) findViewById(R.id.butn6);
        b6.setText("");

        Button b7 = (Button) findViewById(R.id.butn7);
        b7.setText("");

        Button b8 = (Button) findViewById(R.id.butn8);
        b8.setText("");

        Button b9 = (Button) findViewById(R.id.butn9);
        b9.setText("");

    }

    /** This is to manage the orientation of the app,
     * so when you flip the phone;
     * the contents or state remains the same
     **/

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("player1",player1);
        outState.putInt("player2",player2);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        player1 = savedInstanceState.getInt("player1");
        player2 = savedInstanceState.getInt("player2");
    }
}
