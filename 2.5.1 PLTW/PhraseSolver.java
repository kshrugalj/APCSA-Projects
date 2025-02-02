public class PhraseSolver {
    private Player[] players;
    private int currentPlayerIndex;

    public PhraseSolver(Player player1, Player player2) {
        this.players = new Player[]{player1, player2};
        this.currentPlayerIndex = 0;
    }

    public Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public void switchPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % 2; // Switch between 0 and 1
    }

    public void updateScore(Player player, int score) {
        player.setScore(player.getScore() + score);
    }
}