package chess.domain.board;

import chess.domain.position.Direction;
import chess.domain.position.Position;
import chess.domain.board.movePattern.AbstractStraightMovePattern;
import java.util.List;

public final class Queen extends Piece {

    private static final double POINT = 9.0;

    private final AbstractStraightMovePattern pattern = new AbstractStraightMovePattern() {
        @Override
        public List<Direction> getDirections() {
            return Direction.getQueenDirections();
        }
    };

    public Queen(Color color) {
        super(color, "queen");
    }

    @Override
    public boolean canMove(Position src, Position dest) {
        return pattern.canMove(src, dest);
    }

    @Override
    public Direction findDirection(Position src, Position dest) {
        return pattern.findDirection(src, dest);
    }

    @Override
    public double getPoint() {
        return POINT;
    }
}
