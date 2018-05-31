package com.hero.autofarm;

import java.util.ArrayList;

import net.minecraft.server.v1_8_R1.BlockDirt;
import net.minecraft.server.v1_8_R1.EntityVillager;
import net.minecraft.server.v1_8_R1.World;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ItemFarm implements Listener {
	
	@EventHandler
	public void Inventario(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if (p.getWorld().getName().equalsIgnoreCase("world")){
			
			if (e.getAction() == Action.LEFT_CLICK_AIR || p.getItemInHand().getItemMeta().getDisplayName().equals("§7§lAutoFarm") ) {
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 2f);
				Villager villager = (Villager)p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
				villager.setAdult();
				villager.setCustomName("§6§lAutoFarm");
				villager.setCustomNameVisible(true);
				villager.setProfession(Profession.FARMER);
				villager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99*99*99, 7));
				p.sendMessage("§6§lVoce colocou um autofarm!");
				
				
	}
	
		
	}
		
		}
		
	}