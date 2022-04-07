package chess.domain.state;

import chess.domain.board.Board;
import chess.domain.board.Color;
import chess.domain.board.Piece;
import chess.domain.position.Position;
import chess.domain.position.Result;
import java.util.HashMap;
import java.util.Map;

abstract class Running implements State {

    protected final Board board;

    Running(Board board) {
        this.board = board;
    }

    public abstract State movePiece(Position src, Position dest);

    @Override
    public final Map<Color, Double> getScores() {
        double whiteScore = board.calculateScore(Color.WHITE);
        double blackScore = board.calculateScore(Color.BLACK);

        Map<Color, Double> scoreByColor = new HashMap<>();
        scoreByColor.put(Color.WHITE, whiteScore);
        scoreByColor.put(Color.BLACK, blackScore);

        return scoreByColor;
    }

    @Override
    public Map<Position, Piece> getBoard() {
        return board.getValue();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public final Result getResult() {
        return board.calculateCurrentResult();
    }
}
