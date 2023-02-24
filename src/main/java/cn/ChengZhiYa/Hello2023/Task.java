package cn.ChengZhiYa.Hello2023;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static cn.ChengZhiYa.Hello2023.main.ChatColor;

public class Task extends BukkitRunnable {
    public static main plugin;
    public Task(main main) { plugin=main; }

    @Override
    public void run() {
        try {
            SimpleDateFormat 时间格式 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date 春节的时间 = 时间格式.parse("2023-01-22 00:00:00");
            Date 当前时间 = new Date();
            long 时间差 = 春节的时间.getTime() - 当前时间.getTime();
            long 天数 = 时间差 / (24 * 60 * 60 * 1000);
            long 小时 = (时间差 / (60 * 60 * 1000) - 天数 * 24);
            long 分钟 = ((时间差 / (60 * 1000)) - 天数 * 24 * 60 - 小时 * 60);
            long 秒钟 = (时间差 / 1000 - 天数 * 24 * 60 * 60 - 小时 * 60 * 60 - 分钟 * 60);
            if (天数 >= 0) {
                if (小时 >= 0) {
                    if (分钟 >= 0) {
                        if (秒钟 >= 0) {
                            for (Player 所有在线的玩家 : Bukkit.getOnlinePlayers()) {
                                所有在线的玩家.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor("&6&l还有" + 天数 + "天" + 小时 + "小时" + 分钟 + "分钟" + 秒钟 + "秒 到达2023年的春节(橙汁的生日)")));
                            }
                        }
                    }
                }
            }
        }catch (Exception ignored) {}
    }
}
