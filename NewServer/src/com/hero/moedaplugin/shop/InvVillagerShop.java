package com.hero.moedaplugin.shop;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import com.hero.moedaplugin.Ptag;
import com.hero.moedaplugin.api.Config;
import com.hero.moedaplugin.moedas.Cash;

public class InvVillagerShop implements Listener{

	@EventHandler
	public void onVillagerDano(EntityDamageByEntityEvent e){
		if (!(e.getEntity() instanceof Villager)) return;
		Villager villager = (Villager)e.getEntity();
		if (villager.getCustomName() != null){
			if (villager.getCustomName().contains("§6§lSHOP")){
				e.setCancelled(true);
				if (e.getDamager() instanceof Player && e.getDamager().isOp()){
					Player p = (Player)e.getDamager();
					if (p.getItemInHand().getType() == Material.GOLD_SWORD){
						villager.damage(1000);
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onInteracao(PlayerInteractEntityEvent e){
		if (e.getRightClicked() instanceof Villager){
			Villager villager = (Villager)e.getRightClicked();
			Player p = e.getPlayer();
			if (villager.getCustomName() != null){
				if (villager.getCustomName().contains("§6§lSHOP")){
					e.setCancelled(true);
					ShopInv.open(p);
					
				}
				
			}
		}
	 }
	
	
}
	

