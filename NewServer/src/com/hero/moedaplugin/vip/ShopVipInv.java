package com.hero.moedaplugin.vip;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.hero.moedaplugin.api.Criar;

public class ShopVipInv {

	public static void open(Player p){
		Inventory inv = Bukkit.createInventory(null, InventoryType.PLAYER, "§6§lVIPS");
		
		ItemStack sword = Criar.add(Material.IRON_ORE, "§8§l[§7§lIRON§8§l]", new String[] {" ", "§7§l> §e§lClique para comprar o vip IRON!", "§7§l> §e40 CASH"}, Enchantment.DAMAGE_ALL, 15);
		ItemStack peitoral = Criar.add(Material.GOLD_ORE, "§8§l[§6§lGOLD§8§l]", new String[] {" ", "§7§l> §e§lClique para comprar o vip GOLD!", "§7§l> §e90 CASH"}, Enchantment.DAMAGE_ALL, 15);
		ItemStack beacon = Criar.add(Material.DIAMOND_ORE, "§8§l[§b§lDIAMOND§8§l]", new String[] {" ", "§7§l> §e§lClique para comprar o vip DIAMOND!", "§7§l> §e300 CASH"}, Enchantment.KNOCKBACK, 15);
		ItemStack espada = Criar.add(Material.RED_ROSE, "§cVoltar", new String[] {" "}, Enchantment.DAMAGE_ALL, 15);
		ItemStack vidro = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro1 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro2 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro4 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro5 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro6 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro7 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro8 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro9 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro10 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro11 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		
		inv.setItem(11, sword);
		inv.setItem(13, peitoral);
		inv.setItem(15, beacon);
		inv.setItem(8, espada);
		inv.setItem(26, vidro11);
		inv.setItem(35, vidro10);
		inv.setItem(34, vidro9);
		inv.setItem(27, vidro7);
		inv.setItem(28, vidro8);
		inv.setItem(18, vidro6);
		inv.setItem(0, vidro1);
		inv.setItem(1, vidro2);
		inv.setItem(9, vidro);
		inv.setItem(7, vidro4);
		inv.setItem(17, vidro5);
		
		
		p.openInventory(inv);
		p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1F, 1.5F);
	}
	
	
	
}
