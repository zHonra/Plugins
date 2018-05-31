package com.hero.moedaplugin.shop;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import com.hero.moedaplugin.Ptag;
import com.hero.moedaplugin.api.Criar;
import com.hero.moedaplugin.moedas.Cash;

public class ShopEvent implements Listener {

	@EventHandler
	public void onShop(InventoryClickEvent e){
		if (!(e.getWhoClicked() instanceof Player)){
			return;
		}
		Player p = (Player)e.getWhoClicked();
		if (e.getInventory().getName().equals("§6§lSHOP")){
			e.setCancelled(true);
			if (e.getCurrentItem() == null) return;
			if (e.getCurrentItem().getType() == Material.AIR) return;
			if (e.getCurrentItem().getItemMeta().getDisplayName() == null) return;
			ItemStack item = e.getCurrentItem();
			switch (item.getItemMeta().getDisplayName()) {
			case "§f§lKitPvP":
			if	(Cash.contains(p.getName(), 50)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_SWORD, "§C§lEspada Full §f§l- SplashMC", new String [] {""}, Enchantment.DAMAGE_ALL, 5, Enchantment.DURABILITY, 5, Enchantment.FIRE_ASPECT, 2, Enchantment.DAMAGE_UNDEAD, 5, Enchantment.KNOCKBACK, 2, Enchantment.LOOT_BONUS_MOBS, 3, Enchantment.DAMAGE_ARTHROPODS, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_AXE, "§C§lMachado Full §f§l- SplashMC", new String [] {""}, Enchantment.DAMAGE_ALL, 5, Enchantment.DURABILITY, 3, Enchantment.FIRE_ASPECT, 2)); 
					p.getInventory().addItem(Criar.add(Material.BOW, "§C§lArco Full §f§l- SplashMC", new String [] {" ", "§c"}, Enchantment.ARROW_DAMAGE, 5, Enchantment.DURABILITY, 5, Enchantment.ARROW_KNOCKBACK, 2, Enchantment.ARROW_FIRE, 2, Enchantment.ARROW_INFINITE, 1));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 50);
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + " §fcomprou o Kit PvP por 50 cash!");
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;
				}
				break;
			case "§f§lKit Guerreiro P5":
				if (Cash.contains(p.getName(), 50)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HELMET, "§C§lGuerreiro P5 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 5, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_CHESTPLATE, "§C§lGuerreiro P5 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 5, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_LEGGINGS, "§C§lGuerreiro P5 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 5, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_BOOTS, "§C§lGuerreiro P5 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 5, Enchantment.DURABILITY, 5));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + " §fcomprou o Kit Guerreiro P5 por 50 cash!");
					Cash.retirar(p.getName(), 50);
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;
				}
				break;
			case "§f§lKit Guerreiro P4":
				if (Cash.contains(p.getName(), 20)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HELMET, "§C§lGuerreiro P4 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 4, Enchantment.DURABILITY, 4));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_CHESTPLATE, "§C§lGuerreiro P4 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 4, Enchantment.DURABILITY, 4));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_LEGGINGS, "§C§lGuerreiro P4 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 4, Enchantment.DURABILITY, 4));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_BOOTS, "§C§lGuerreiro P4 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 4, Enchantment.DURABILITY, 4));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 20);
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + " §fcomprou o Kit Guerreiro P4 por 20 cash!");
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;
				}
				break;
			case "§f§lKit Guerreiro Inquebrável 5":
				if (Cash.contains(p.getName(), 15)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HELMET, "§C§lGuerreiro Inquebrável 5 §f§l- SplashMC", new String [] {""}, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_CHESTPLATE, "§C§lGuerreiro Inquebrável 5 §f§l- SplashMC", new String [] {""}, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_LEGGINGS, "§C§lGuerreiro Inquebrável 5 §f§l- SplashMC", new String [] {""}, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_BOOTS, "§C§lGuerreiro Inquebrável 5 §f§l- SplashMC", new String [] {""}, Enchantment.DURABILITY, 5));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 15);
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + " §fcomprou o Kit Guerreiro Inquebrável 5 por 15 cash!");
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;
				}
				break;
			case "§f§lKit Ferramentas II":
				if (Cash.contains(p.getName(), 10)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_PICKAXE, "§C§lPicareta II §f§l- SplashMC", new String [] {""}, Enchantment.DIG_SPEED, 5, Enchantment.DURABILITY, 5, Enchantment.SILK_TOUCH, 1));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_AXE, "§C§lMachado II §f§l- SplashMC", new String [] {""}, Enchantment.DIG_SPEED, 5, Enchantment.DURABILITY, 5, Enchantment.SILK_TOUCH, 1)); 
					p.getInventory().addItem(Criar.add(Material.DIAMOND_SPADE, "§C§lPá II §f§l- SplashMC", new String [] {""}, Enchantment.DIG_SPEED, 5, Enchantment.DURABILITY, 5, Enchantment.SILK_TOUCH, 1));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HOE, "§C§lEnxada §f§l- SplashMC", new String [] {""}, Enchantment.DURABILITY, 5));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 10);
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + " §fcomprou o Kit Ferramentas por 10 cash!");
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;
				}
				break;
			case "§f§lKit Ferramentas I":
				if (Cash.contains(p.getName(), 20)){
					p.sendMessage("§a§lCompra efetuada com sucesso!!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_PICKAXE, "§C§lPicareta I §f§l- SplashMC", new String [] {""}, Enchantment.DIG_SPEED, 5, Enchantment.DURABILITY, 5, Enchantment.LOOT_BONUS_BLOCKS, 3));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_AXE, "§C§lMachado I §f§l- SplashMC", new String [] {""}, Enchantment.DIG_SPEED, 5, Enchantment.DURABILITY, 5, Enchantment.LOOT_BONUS_BLOCKS, 3)); 
					p.getInventory().addItem(Criar.add(Material.DIAMOND_SPADE, "§C§lPá I §f§l- SplashMC", new String [] {""}, Enchantment.DIG_SPEED, 5, Enchantment.DURABILITY, 5, Enchantment.LOOT_BONUS_BLOCKS, 3));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HOE, "§C§lEnxada §f§l- SplashMC", new String [] {""}, Enchantment.DURABILITY, 5));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 20);
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + " §fcomprou o Kit Ferramentas I por 20 cash!");
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;

				}
				break;
			case "§f§lKit BIRL":
				if (Cash.contains(p.getName(), 80)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HELMET, "§C§lGuerreiro P5 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 5,Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_CHESTPLATE, "§C§lGuerreiro P5 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 5, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_LEGGINGS, "§C§lGuerreiro P5 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 5, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_BOOTS, "§C§lGuerreiro P5 §f§l- SplashMC", new String [] {""}, Enchantment.PROTECTION_ENVIRONMENTAL, 5, Enchantment.DURABILITY, 5));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_SWORD, "§c§lEspada Full §f§l- SplashMC", new String [] {""}, Enchantment.DAMAGE_ALL, 5, Enchantment.DURABILITY, 5, Enchantment.FIRE_ASPECT, 2, Enchantment.DAMAGE_UNDEAD, 5, Enchantment.KNOCKBACK, 2, Enchantment.LOOT_BONUS_MOBS, 3, Enchantment.DAMAGE_ARTHROPODS, 5));
					p.getInventory().addItem(Criar.add(Material.BOW, "§C§lArco Full §f§l- SplashMC", new String [] {""}, Enchantment.ARROW_DAMAGE, 5, Enchantment.DURABILITY, 5, Enchantment.ARROW_KNOCKBACK, 2, Enchantment.ARROW_FIRE, 2, Enchantment.ARROW_INFINITE, 1));
					p.getInventory().addItem(Criar.add(Material.ARROW, "§C§lFlecha §f§l- SplashMC", new String [] {""}));
					p.getInventory().addItem(Criar.add(Material.GOLDEN_APPLE, "§C§lMaçã Dourada §f§l- SplashMC", new String [] {""}, 0, 32));
					p.getInventory().addItem(Criar.add(Material.GOLDEN_APPLE, "§C§lMaçã do Capiroto §f§l- SplashMC", new String [] {""}, 1, 16));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 80);
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + " §fcomprou o §4§lKIT BIRL§f por 80 cash!");
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");

		}
				break;
			case "§f§lKit Capiroto":
				if (Cash.contains(p.getName(), 20)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.getInventory().addItem(Criar.add(Material.GOLDEN_APPLE, "§C§lMaçã Dourada §f§l- SplashMC", new String [] {" "}, 0, 192));
					p.getInventory().addItem(Criar.add(Material.APPLE, "§C§lMaçã §f§l- SplashMC", new String [] {""}, 0, 128));
					p.getInventory().addItem(Criar.add(Material.GOLDEN_APPLE, "§C§lMaçã do Capiroto §f§l- SplashMC", new String [] {" "}, 1, 32));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 20);
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + " §fcomprou o Kit Capiroto por 20 cash!");
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");

		}
				break;
			case "§6§lVIPS":
				p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
				p.closeInventory();
				p.performCommand("vip");
					return;

				}
			
		}
	}
		
}
