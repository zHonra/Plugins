package com.hero.moedaplugin.vip;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.hero.moedaplugin.Register;
import com.hero.moedaplugin.shop.ShopInv;
import com.hero.moedaplugin.vip.ShopVipInv;

public class VipCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		
			
		if (!(sender instanceof Player)) return true;
		Player p = (Player)sender;
		if (cmd.getName().equalsIgnoreCase("vip")){
			ShopVipInv.open(p);
		}
		return false;
		
	}
	

}