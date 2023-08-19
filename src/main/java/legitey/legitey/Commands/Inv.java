package legitey.legitey.Commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Inv implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command c, String s, String[] args) {
        Player p = (Player) sender;
        if (!(sender instanceof Player)) {
            p.sendMessage("Você não é um player");
        } else {
            Inventory i = Bukkit.createInventory(p, 32, ChatColor.RED + "Ban User");
            
            p.openInventory(i);
        }
        return true;
    }
}
