package chess.domain.state;

import chess.domain.board.Board;

final class BlackWin extends Finished {
    BlackWin(Board board) {
        super(board);
    }
}
