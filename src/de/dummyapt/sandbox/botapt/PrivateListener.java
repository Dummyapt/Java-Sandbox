package de.dummyapt.sandbox.botapt;

import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

class PrivateListener extends ListenerAdapter {

    @Override
    public void onPrivateMessageReceived(@NotNull PrivateMessageReceivedEvent event) {
        super.onPrivateMessageReceived(event);
        if (event.getAuthor().isBot()) {
            return;
        }
        // We don't want to respond to other bot accounts, including ourselves
        var message = event.getMessage();
        var content = message.getContentRaw();
        // getContentRaw() is an atomic getter
        // getContentDisplay() is a lazy getter which modifies the content for e.g. console view (strip discord formatting)
        if (content.equals("!greet")) {
            var channel = event.getChannel();
            channel.sendMessage("Hey, " + message.getAuthor().getName() + "! How's your day going?").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
        }
    }
}