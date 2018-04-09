package com.example.hp.tic_tac_toe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    // turn is used for the players turn to play
    // player1 and player2 are the initial score of the players
    int turn = 1;
    int player1,player2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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

    public void but10 (View view){
        Button b10 = (Button) findViewById(R.id.butn10);
        if(b10.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b10.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b10.setText("O");

            }
        }
        winner();
    }

    public void but11 (View view){
        Button b11 = (Button) findViewById(R.id.butn11);
        if(b11.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b11.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b11.setText("O");

            }
        }
        winner();
    }

    public void but12 (View view){
        Button b12 = (Button) findViewById(R.id.butn12);
        if(b12.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b12.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b12.setText("O");

            }
        }
        winner();
    }

    public void but13 (View view){
        Button b13 = (Button) findViewById(R.id.butn13);
        if(b13.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b13.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b13.setText("O");

            }
        }
        winner();
    }

    public void but14 (View view){
        Button b14 = (Button) findViewById(R.id.butn14);
        if(b14.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b14.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b14.setText("O");

            }
        }
        winner();
    }

    public void but15 (View view){
        Button b15 = (Button) findViewById(R.id.butn15);
        if(b15.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b15.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b15.setText("O");

            }
        }
        winner();
    }

    public void but16 (View view){
        Button b16 = (Button) findViewById(R.id.butn16);
        if(b16.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b16.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b16.setText("O");

            }
        }
        winner();
    }

    public void but17 (View view){
        Button b17 = (Button) findViewById(R.id.butn17);
        if(b17.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b17.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b17.setText("O");

            }
        }
        winner();
    }

    public void but18 (View view){
        Button b18 = (Button) findViewById(R.id.butn18);
        if(b18.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b18.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b18.setText("O");

            }
        }
        winner();
    }

    public void but19 (View view){
        Button b19 = (Button) findViewById(R.id.butn19);
        if(b19.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b19.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b19.setText("O");

            }
        }
        winner();
    }

    public void but20 (View view){
        Button b20 = (Button) findViewById(R.id.butn20);
        if(b20.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b20.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b20.setText("O");

            }
        }
        winner();
    }

    public void but21 (View view){
        Button b21 = (Button) findViewById(R.id.butn21);
        if(b21.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b21.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b21.setText("O");

            }
        }
        winner();
    }

    public void but22 (View view){
        Button b22 = (Button) findViewById(R.id.butn22);
        if(b22.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b22.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b22.setText("O");

            }
        }
        winner();
    }

    public void but23 (View view){
        Button b23 = (Button) findViewById(R.id.butn23);
        if(b23.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b23.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b23.setText("O");

            }
        }
        winner();
    }

    public void but24 (View view){
        Button b24 = (Button) findViewById(R.id.butn24);
        if(b24.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b24.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b24.setText("O");

            }
        }
        winner();
    }

    public void but25 (View view){
        Button b25 = (Button) findViewById(R.id.butn25);
        if(b25.getText().toString().equals("")){
            if(turn == 1){
                turn = 2;
                b25.setText("X");
            }
            else if(turn == 2){
                turn = 1;
                b25.setText("O");

            }
        }
        winner();
    }

    /** This button switches the board from 5X5 to 3X3
     * it uses intent to move to another activity
     * @param v
     */

    public void move2 (View v) {

        Intent intent = new Intent(secondActivity.this, MainActivity.class);
        startActivity(intent);
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

        Button b10 = (Button) findViewById(R.id.butn10);
        b10.setText("");

        Button b11 = (Button) findViewById(R.id.butn11);
        b11.setText("");

        Button b12 = (Button) findViewById(R.id.butn12);
        b12.setText("");

        Button b13 = (Button) findViewById(R.id.butn13);
        b13.setText("");

        Button b14 = (Button) findViewById(R.id.butn14);
        b14.setText("");

        Button b15 = (Button) findViewById(R.id.butn15);
        b15.setText("");

        Button b16 = (Button) findViewById(R.id.butn16);
        b16.setText("");

        Button b17 = (Button) findViewById(R.id.butn17);
        b17.setText("");

        Button b18 = (Button) findViewById(R.id.butn18);
        b18.setText("");

        Button b19 = (Button) findViewById(R.id.butn19);
        b19.setText("");

        Button b20 = (Button) findViewById(R.id.butn20);
        b20.setText("");

        Button b21 = (Button) findViewById(R.id.butn21);
        b21.setText("");

        Button b22 = (Button) findViewById(R.id.butn22);
        b22.setText("");

        Button b23 = (Button) findViewById(R.id.butn23);
        b23.setText("");

        Button b24 = (Button) findViewById(R.id.butn24);
        b24.setText("");

        Button b25 = (Button) findViewById(R.id.butn25);
        b25.setText("");

        TextView x_score = (TextView) findViewById(R.id.x_score);
        x_score.setText("0");

        TextView o_score = (TextView) findViewById(R.id.o_score);
        o_score.setText("0");
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

        Button b10 = (Button) findViewById(R.id.butn10);
        String but10 = b10.getText().toString();

        Button b11 = (Button) findViewById(R.id.butn11);
        String but11 = b11.getText().toString();

        Button b12 = (Button) findViewById(R.id.butn12);
        String but12 = b12.getText().toString();

        Button b13 = (Button) findViewById(R.id.butn13);
        String but13 = b13.getText().toString();

        Button b14 = (Button) findViewById(R.id.butn14);
        String but14 = b14.getText().toString();

        Button b15 = (Button) findViewById(R.id.butn15);
        String but15 = b15.getText().toString();

        Button b16 = (Button) findViewById(R.id.butn16);
        String but16 = b16.getText().toString();

        Button b17 = (Button) findViewById(R.id.butn17);
        String but17 = b17.getText().toString();

        Button b18 = (Button) findViewById(R.id.butn18);
        String but18 = b18.getText().toString();

        Button b19 = (Button) findViewById(R.id.butn19);
        String but19 = b19.getText().toString();

        Button b20 = (Button) findViewById(R.id.butn20);
        String but20 = b20.getText().toString();

        Button b21 = (Button) findViewById(R.id.butn21);
        String but21 = b21.getText().toString();

        Button b22 = (Button) findViewById(R.id.butn22);
        String but22 = b22.getText().toString();

        Button b23 = (Button) findViewById(R.id.butn23);
        String but23 = b23.getText().toString();

        Button b24 = (Button) findViewById(R.id.butn24);
        String but24 = b24.getText().toString();

        Button b25 = (Button) findViewById(R.id.butn25);
        String but25 = b25.getText().toString();

        if (but1.equals("X") && but2.equals("X") && but3.equals("X") && but4.equals("X") && but5.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but6.equals("X") && but7.equals("X") && but8.equals("X") && but9.equals("X") && but10.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but11.equals("X") && but12.equals("X") && but13.equals("X") && but14.equals("X") && but15.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but16.equals("X") && but17.equals("X") && but18.equals("X") && but19.equals("X") && but20.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but21.equals("X") && but22.equals("X") && but23.equals("X") && but24.equals("X") && but25.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but1.equals("X") && but6.equals("X") && but11.equals("X") && but16.equals("X") && but21.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but2.equals("X") && but7.equals("X") && but12.equals("X") && but17.equals("X") && but22.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but3.equals("X") && but8.equals("X") && but13.equals("X") && but18.equals("X") && but23.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but4.equals("X") && but9.equals("X") && but14.equals("X") && but19.equals("X") && but24.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but5.equals("X") && but10.equals("X") && but15.equals("X") && but20.equals("X") && but25.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but1.equals("X") && but7.equals("X") && but13.equals("X") && but19.equals("X") && but25.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but5.equals("X") && but9.equals("X") && but13.equals("X") && but17.equals("X") && but21.equals("X")){
            Toast toast = Toast.makeText(this, "Player X won", Toast.LENGTH_LONG);
            toast.show();
            player1 = player1 + 1;
            display(player1);
            reset1();
        }

        if (but1.equals("O") && but2.equals("O") && but3.equals("O") && but4.equals("O") && but5.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but6.equals("O") && but7.equals("O") && but8.equals("O") && but9.equals("O") && but10.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but11.equals("O") && but12.equals("O") && but13.equals("O") && but14.equals("O") && but15.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but16.equals("O") && but17.equals("O") && but18.equals("O") && but19.equals("O") && but20.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but21.equals("O") && but22.equals("O") && but23.equals("O") && but24.equals("O") && but25.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but1.equals("O") && but6.equals("O") && but11.equals("O") && but16.equals("O") && but21.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but2.equals("O") && but7.equals("O") && but12.equals("O") && but17.equals("O") && but22.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but3.equals("O") && but8.equals("O") && but13.equals("O") && but18.equals("O") && but23.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but4.equals("O") && but9.equals("O") && but14.equals("O") && but19.equals("O") && but24.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but5.equals("O") && but10.equals("O") && but15.equals("O") && but20.equals("O") && but25.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but1.equals("O") && but7.equals("O") && but13.equals("O") && but19.equals("O") && but25.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }

        if (but5.equals("O") && but9.equals("O") && but13.equals("O") && but17.equals("O") && but21.equals("O")){
            Toast toast = Toast.makeText(this, "Player O won", Toast.LENGTH_LONG);
            toast.show();
            player2 = player2 + 1;
            display(player2);
            reset1();
        }


        if ((!but1.isEmpty() && !but2.isEmpty() && !but3.isEmpty() && !but4.isEmpty() && !but5.isEmpty() && !but6.isEmpty() && !but7.isEmpty() &&
                !but8.isEmpty() && !but9.isEmpty() && !but10.isEmpty() && !but11.isEmpty() && !but12.isEmpty() && !but13.isEmpty() && !but14.isEmpty()
                && !but15.isEmpty() && !but16.isEmpty() && !but17.isEmpty() && !but18.isEmpty() && !but19.isEmpty() && !but20.isEmpty()
                && !but21.isEmpty() && !but22.isEmpty() && !but23.isEmpty() && !but24.isEmpty() && !but25.isEmpty() )){
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

        Button b10 = (Button) findViewById(R.id.butn10);
        b10.setText("");

        Button b11 = (Button) findViewById(R.id.butn11);
        b11.setText("");

        Button b12 = (Button) findViewById(R.id.butn12);
        b12.setText("");

        Button b13 = (Button) findViewById(R.id.butn13);
        b13.setText("");

        Button b14 = (Button) findViewById(R.id.butn14);
        b14.setText("");

        Button b15 = (Button) findViewById(R.id.butn15);
        b15.setText("");

        Button b16 = (Button) findViewById(R.id.butn16);
        b16.setText("");

        Button b17 = (Button) findViewById(R.id.butn17);
        b17.setText("");

        Button b18 = (Button) findViewById(R.id.butn18);
        b18.setText("");

        Button b19 = (Button) findViewById(R.id.butn19);
        b19.setText("");

        Button b20 = (Button) findViewById(R.id.butn20);
        b20.setText("");

        Button b21 = (Button) findViewById(R.id.butn21);
        b21.setText("");

        Button b22 = (Button) findViewById(R.id.butn22);
        b22.setText("");

        Button b23 = (Button) findViewById(R.id.butn23);
        b23.setText("");

        Button b24 = (Button) findViewById(R.id.butn24);
        b24.setText("");

        Button b25 = (Button) findViewById(R.id.butn25);
        b25.setText("");

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




