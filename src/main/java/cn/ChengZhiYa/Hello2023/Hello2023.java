package cn.ChengZhiYa.Hello2023;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static cn.ChengZhiYa.Hello2023.main.ChatColor;

public class Hello2023 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
                HashMap.Set("AntiChat",1);
                TextComponent 可点击文本 = new TextComponent(ChatColor("&7[&a&l点击此处发送&7]"));
                可点击文本.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/hellonewyears"));
                for (Player 所有在线的玩家 : Bukkit.getOnlinePlayers()) {
                    所有在线的玩家.sendMessage(ChatColor("\n&7\n&8\n&9\n&4\n&5\n&6\n&3\n&2\n&1\n&0" +
                            "&6白驹过隙，日月如梭。\n" +
                            "转眼间，我们已经迈入2023年的大门。\n" +
                            "在2022年间，我们服务器经历了许多艰难险阻，翻越了一座座前进路上的高山，\n" +
                            "在资金并不充足的条件下尽力向玩家提供最好的服务。\n" +
                            "团队披星戴月，夙兴夜寐。虽然辛苦，但是看到你们满意的评价，\n" +
                            "一切劳累都烟消云散。\n" +
                            "在新的一年里，愿我们能携手，再出发！\n" +
                            "让我们说出\"再见2022！你好2023！\"\n&f\n&6" +
                            "不忘初心，方得始终！"));
                    所有在线的玩家.spigot().sendMessage(可点击文本);
                HashMap.Clear();
            }
        }
        return false;
    }
}
