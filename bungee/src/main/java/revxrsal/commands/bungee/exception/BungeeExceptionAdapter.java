package revxrsal.commands.bungee.exception;

import org.jetbrains.annotations.NotNull;
import revxrsal.commands.command.CommandActor;
import revxrsal.commands.exception.DefaultExceptionHandler;

public class BungeeExceptionAdapter extends DefaultExceptionHandler {

    public static final BungeeExceptionAdapter INSTANCE = new BungeeExceptionAdapter();

    public void senderNotPlayer(@NotNull CommandActor actor, @NotNull SenderNotPlayerException exception) {
        actor.error("You must be a player to use this command!");
    }

    public void senderNotConsole(@NotNull CommandActor actor, @NotNull SenderNotConsoleException exception) {
        actor.error("This command can only be used on console!");
    }

    public void invalidPlayer(@NotNull CommandActor actor, @NotNull InvalidPlayerException exception) {
        actor.error("Invalid player: &e" + exception.getInput());
    }
}
