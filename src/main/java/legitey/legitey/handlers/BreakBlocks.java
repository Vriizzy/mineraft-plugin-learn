package legitey.legitey.handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Locale;
import java.util.Random;

public class BreakBlocks implements Listener {
    @EventHandler
    public void BreakBlocks(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Block b = e.getBlock();

        p.sendMessage(ChatColor.GOLD + "O usuario" + p.getName() + "Quebrou" + ChatColor.AQUA + b.getType().toString().toUpperCase());
    }
}
