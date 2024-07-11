package com.crypto.discord_bot.controller;

import com.crypto.discord_bot.service.DiscordBotService;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DiscordController extends ListenerAdapter {

    @Autowired
    DiscordBotService discordBotService;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        discordBotService.handleMessage(event);
    }
}