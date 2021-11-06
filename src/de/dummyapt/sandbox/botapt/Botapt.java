package de.dummyapt.sandbox.botapt;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

class Botapt {
    public static void main(String[] args) throws LoginException {
        var builder = JDABuilder.createDefault("ODQxNDUwNTgyNzk0ODI5ODI1.YJm77A.QfqqCsI2bwbc4kKMklqO2vzvsLM");

        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setCompression(Compression.NONE);
        builder.setActivity(Activity.watching("Hentai!"));
        builder.addEventListeners(new PrivateListener());
        builder.build();
    }
}