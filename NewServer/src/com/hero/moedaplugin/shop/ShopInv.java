package com.hero.moedaplugin.shop;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.hero.moedaplugin.api.Criar;

public class ShopInv {

	public static void open(Player p){
		Inventory inv = Bukkit.createInventory(null, 5*9, "§6§lSHOP");
		
		ItemStack kitpvp = Criar.add(Material.DIAMOND_SWORD, "§f§lKitPvP", new String[] {" ", "§7§l> §2§lCusto: 50 Cash"}, Enchantment.DAMAGE_ALL, 15);
		ItemStack kit5 = Criar.add(Material.DIAMOND_CHESTPLATE, "§f§lKit Guerreiro P5", new String[] {" ", "§7§l> §2§lCusto: 50 Cash"}, Enchantment.DAMAGE_ALL, 15);
		ItemStack kit4 = Criar.add(Material.BONE, "§f§lKit Guerreiro P4", new String[] {" ", "§7§l> §2§lCusto: 20 Cash"}, Enchantment.KNOCKBACK, 15);
		ItemStack kit5inq = Criar.add(Material.IRON_SWORD, "§f§lKit Guerreiro Inquebrável 5", new String[] {" ", "§7§l> §2§lCusto: 15 Cash"}, Enchantment.DAMAGE_ALL, 15);
		ItemStack kitferr = Criar.add(Material.IRON_HOE, "§f§lKit Ferramentas II", new String[] {" ", "§7§l> §2§lCusto: 10 Cash"}, Enchantment.DAMAGE_ALL, 100);
		ItemStack kitferr1 = Criar.add(Material.DIAMOND_HOE, "§f§lKit Ferramentas I", new String[] {" ", "§7§l> §2§lCusto: 20 Cash"}, Enchantment.DAMAGE_ALL, 100);
		ItemStack kitbirl = Criar.add(Material.DIAMOND_SWORD, "§f§lKit BIRL", new String[] {" ", "§7§l> §2§lCusto: 80 Cash"}, Enchantment.DAMAGE_ALL, 100);
		ItemStack kitcap = Criar.add(Material.GOLDEN_APPLE, "§f§lKit Capiroto", new String[] {" ", "§7§l> §2§lCusto: 20 Cash"}, Enchantment.DAMAGE_ALL, 100);
		ItemStack vips = Criar.add(Material.EMERALD_BLOCK, "§6§lVIPS", new String[] {" ", "§7§l> §6Compre seu vip aqui!"}, Enchantment.DAMAGE_ALL, 100);
		ItemStack vidro = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro1 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro2 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro3 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro4 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro5 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro6 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro7 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro8 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro9 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro10 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro11 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro12 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro13 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro14 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		
		
		inv.setItem(40, vips);
		inv.setItem(37, vidro14);
		inv.setItem(44, vidro12);
		inv.setItem(43, vidro13);
		inv.setItem(26, vidro11);
		inv.setItem(35, vidro10);
		inv.setItem(34, vidro9);
		inv.setItem(27, vidro7);
		inv.setItem(36, vidro8);
		inv.setItem(18, vidro6);
		inv.setItem(0, vidro1);
		inv.setItem(1, vidro2);
		inv.setItem(9, vidro);
		inv.setItem(7, vidro4);
		inv.setItem(8, vidro3);
		inv.setItem(17, vidro5);
		inv.setItem(10, kitpvp);
		inv.setItem(12, kit5);
		inv.setItem(14, kit4);
		inv.setItem(16, kit5inq);
		inv.setItem(28, kitferr);
		inv.setItem(30, kitferr1);
		inv.setItem(32, kitbirl);
		inv.setItem(34, kitcap);
		
		
		p.openInventory(inv);
		p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1F, 1.5F);
	}
	
	
	
}
