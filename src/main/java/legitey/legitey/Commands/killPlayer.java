package legitey.legitey.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class killPlayer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (!(sender instanceof Player)) {
            sender.sendMessage("Você não é um player.");
            return true;
        }
        if (args.length == 0) {
            p.sendMessage(ChatColor.GOLD + "Você precisa colocar o comando direito, utilize da seguinte forma:" + ChatColor.RED + "/killPlayer <player>");
        } else {
            String word = args[0];
            p.setHealth(0.0);
            p.sendMessage(ChatColor.GREEN + "Aee, você matou " + p.getName());
        }
        return true;
    }
}
