package me.aniimalz.plugins

import android.annotation.SuppressLint
import android.content.Context
import com.aliucord.Http
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.entities.Plugin

@AliucordPlugin
class TestPlugin : Plugin() {
    @SuppressLint("SetTextI18n")
    override fun start(ctx: Context) {
        // shut
    }

    override fun stop(ctx: Context) {
        patcher.unpatchAll()
        commands.unregisterAll()
    }
}