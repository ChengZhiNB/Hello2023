package cn.ChengZhiYa.Hello2023;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.Objects;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        BukkitTask Taskqwq = new Task(this).runTaskTimer(this, 0L, 20L);
        Objects.requireNonNull(getCommand("hello2023")).setExecutor(new Hello2023());
        Objects.requireNonNull(getCommand("hellonewyears")).setExecutor(new 新的一年命令());
        Bukkit.getPluginManager().registerEvents(new PlayerChat(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static String ChatColor(String Message) {
        return ChatColor.translateAlternateColorCodes('&',Message);
    }
}
