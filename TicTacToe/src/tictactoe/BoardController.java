package tictactoe;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author risha
 */
public class BoardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button b11;
    @FXML
    private Button b12;
    @FXML
    private Button b13;
    @FXML
    private Button b21;
    @FXML
    private Button b22;
    @FXML
    private Button b23;
    @FXML
    private Button b31;
    @FXML
    private Button b32;
    @FXML
    private Button b33;

    public int[][] board;
    private boolean xTurn = true;

    public void handleButtonClickb11(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[0][0] = 1;
            b11.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[0][0] = 0;
            b11.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b11.setDisable(true);
    }

    public void handleButtonClickb12(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[0][1] = 1;
            b12.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[0][1] = 0;
            b12.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b12.setDisable(true);
    }

    public void handleButtonClickb13(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[0][2] = 1;
            b13.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[0][2] = 0;
            b13.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b13.setDisable(true);
    }

    public void handleButtonClickb21(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[1][0] = 1;
            b21.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[1][0] = 0;
            b21.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b21.setDisable(true);
    }

    public void handleButtonClickb22(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[1][1] = 1;
            b22.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[1][1] = 0;
            b22.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b22.setDisable(true);
    }

    public void handleButtonClickb23(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[1][2] = 1;
            b23.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[1][2] = 0;
            b23.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b23.setDisable(true);
    }

    public void handleButtonClickb31(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[2][0] = 1;
            b31.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[2][0] = 0;
            b31.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b31.setDisable(true);
    }

    public void handleButtonClickb32(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[2][1] = 1;
            b32.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[2][1] = 0;
            b32.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b32.setDisable(true);
    }

    public void handleButtonClickb33(ActionEvent event) {
        System.out.println("Button clicked!" + event.toString());
        if (xTurn) {
            board[2][2] = 1;
            b33.setText("X");
            if (checkWinDiagonal(1) || checkWinHorizontal(1) || checkWinVertical(1)) {
                System.out.print("Player X won");
            }
        } else {
            board[2][2] = 0;
            b33.setText("O");
            if (checkWinDiagonal(0) || checkWinHorizontal(0) || checkWinVertical(0)) {
                System.out.print("Player O won");
            }
        }
        if(checkDraw()){
            System.out.println("GAME IS DRAW");
        }
        xTurn = !xTurn;
        b33.setDisable(true);
    }

    public boolean checkWinHorizontal(int player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinVertical(int player) {
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinDiagonal(int player) {
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }

    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("initialize method called");

        board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], -1);
        }

    }

}
