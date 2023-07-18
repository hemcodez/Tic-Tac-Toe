import javax.swing.*;
import java.awt.*;

public class FileSolutions {


        public static void GetMove(int currentMove, int remainingMoves, Font font, JButton btnEmpty[],
                                   String startingPlayer) {
            // -- Gets the current move "X" or "O" for the user & displays to screen
            btnEmpty[currentMove].setFont(font);

            if(startingPlayer.equals("X")) {
                if(remainingMoves % 2 != 0) {
                    btnEmpty[currentMove].setText("X");
                } else {
                    btnEmpty[currentMove].setText("O");
                }
            } else {
                if(remainingMoves % 2 != 0) {
                    btnEmpty[currentMove].setText("O");
                } else {
                    btnEmpty[currentMove].setText("X");
                }
            }
        }//END GETMOVE


    // -- Show the playing field
        public static void ShowGame(JPanel pnlSouth, JPanel pnlPlayingField) {
            pnlSouth.setLayout(new BorderLayout());
            pnlSouth.add(pnlPlayingField, BorderLayout.CENTER);
            pnlPlayingField.requestFocus();
        }// END SHOWGAME METHOD


    // -- Clear any unneeded panels
        public static void ClearPanelSouth(JPanel pnlSouth, JPanel pnlTop,
                                           JPanel pnlNewGame, JPanel pnlPlayingField, JPanel pnlBottom, JPanel radioPanel) {
            pnlSouth.remove(pnlTop);
            pnlSouth.remove(pnlBottom);
            pnlSouth.remove(pnlPlayingField);
            pnlTop.remove(pnlNewGame);
            pnlSouth.remove(radioPanel);
        }//END CLEARPANEL METHOD

    }//END CLASS

