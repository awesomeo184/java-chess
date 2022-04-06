package chess.domain.board;

import chess.domain.position.Direction;
import chess.domain.position.Position;
import chess.domain.board.movePattern.AbstractSingleMovePattern;
import java.util.List;

public final class Knight extends Piece {

    private static final double POINT = 2.5;

    private final AbstractSingleMovePattern pattern = new AbstractSingleMovePattern() {
        @Override
        public List<Direction> getDirections() {
            return Direction.getKnightDirections();
        }
    };

    public Knight(Color color) {
        super(color, "knight");
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
