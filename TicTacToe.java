import javax.swing.*;

public class TicTacToe {

    public static void main(String[] args) {

        // -- Display a UI message to the user
        JOptionPane.showMessageDialog(null, "Tic Tac Toe!" +
                "\n----------------------"+
                "\n NOTE: You will need two players for this game."
                +
                "\n-----------------------"
                + "\nAre you Ready?", "Starting Game..", JOptionPane.INFORMATION_MESSAGE);


        // -- Run the Game
        new GUI();

    } //END MAIN


} //END CLASS
