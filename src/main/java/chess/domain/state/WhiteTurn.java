package chess.domain.state;

import chess.domain.board.Board;
import chess.domain.position.Position;
import chess.domain.board.Color;

final class WhiteTurn extends Running {

    WhiteTurn(Board board) {
        super(board);
    }

    @Override
    public State movePiece(Position src, Position dest) {
        board.move(src, dest, Color.WHITE);
        if (!board.hasKing(Color.BLACK)) {
            return new WhiteWin(board);
        }
        return new BlackTurn(board);
    }

    @Override
    public boolean isWhiteTurn() {
        return true;
    }
}
