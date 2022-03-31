package chess.console.command;

import chess.console.GameManager;

public final class End implements Command {

    @Override
    public void execute(GameManager gameManager) {
        // do nothing
    }

    @Override
    public boolean isEnd() {
        return true;
    }
}
