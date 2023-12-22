package TicTacToe;

public class TicTacToe {

        private char[][] board;
        private char currentPlayer;
        private char winner;

        // Konstruktor
        public TicTacToe() {
            // Spielfeld initialisieren
            board = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = ' ';
                }
            }

            // Spieler X beginnt
            currentPlayer = 'X';

            // Gewinner initialisieren
            winner = ' ';
        }

        // Methode toString()
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sb.append(board[i][j]);
                    if (j < 2) {
                        sb.append(" | ");
                    }
                }
                sb.append("\n");
                if (i < 2) {
                    sb.append("---------\n");
                }
            }
            return sb.toString();
        }

        // Getter für currentPlayer
        public char getCurrentPlayer() {
            return currentPlayer;
        }

        // Getter für winner
        public char getWinner() {
            return winner;
        }

    public boolean set(int line, int column) {
        // Überprüfen, ob das Spielfeld an der angegebenen Position frei ist
        if (board[line][column] == ' ') {
            // Spielzug durchführen
            board[line][column] = currentPlayer;

            // currentPlayer wechseln
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

            return true; // Spielzug erfolgreich durchgeführt
        } else {
            return false; // Spielfeld ist bereits belegt
        }
    }
    public boolean isGameOver() {
        // Überprüfen der Zeilen und Spalten
        for (int i = 0; i < 3; i++) {
            // Überprüfen der Zeilen
            if (checkLine(i)) {
                winner = board[i][0];
                return true;
            }

            // Überprüfen der Spalten
            if (checkColumn(i)) {
                winner = board[0][i];
                return true;
            }
        }

        // Überprüfen der Diagonalen
        if (checkDiagonals()) {
            winner = board[1][1];
            return true;
        }

        // Überprüfen, ob alle Felder gefüllt sind (Unentschieden)
        if (isBoardFull()) {
            winner = ' '; // Unentschieden
            return true;
        }

        return false; // Das Spiel ist noch nicht beendet
    }

    // Hilfsmethode für das Überprüfen der Zeilen
    private boolean checkLine(int line) {
        return board[line][0] != ' ' && board[line][0] == board[line][1] && board[line][1] == board[line][2];
    }

    // Hilfsmethode für das Überprüfen der Spalten
    private boolean checkColumn(int column) {
        return board[0][column] != ' ' && board[0][column] == board[1][column] && board[1][column] == board[2][column];
    }

    // Hilfsmethode für das Überprüfen der Diagonalen
    private boolean checkDiagonals() {
        return board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
                board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0];
    }

    // Hilfsmethode für das Überprüfen, ob das Spielfeld voll ist
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Es gibt mindestens ein leeres Feld
                }
            }
        }
        return true; // Alle Felder sind gefüllt
    }


}


