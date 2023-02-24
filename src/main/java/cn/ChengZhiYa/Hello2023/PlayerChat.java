package cn.ChengZhiYa.Hello2023;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
    @EventHandler
    public void On_Event(AsyncPlayerChatEvent event) {
        if (HashMap.Get("AntiChat") != null) {
            if (HashMap.Get("AntiChat") == 1) {
                event.setCancelled(true);
            }
        }
    }
}
