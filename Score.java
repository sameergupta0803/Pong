import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;

    int player1;      // current score player 1
    int player2;      // current score player 2
    int player1Win;   // total wins player 1
    int player2Win;   // total wins player 2

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        // Center dividing line
        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);

        // Current score display
        g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 50);
        g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 50);

        // Wins display (smaller font, fixed top corners)
        g.setFont(new Font("Consolas", Font.PLAIN, 30));
        g.drawString("Wins: " + player1Win, 50, 80); // left side
        g.drawString("Wins: " + player2Win, GAME_WIDTH - 150, 80); // right side
    }
}
