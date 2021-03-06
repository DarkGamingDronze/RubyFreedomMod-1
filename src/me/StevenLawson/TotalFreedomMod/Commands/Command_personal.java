package me.StevenLawson.TotalFreedomMod.Commands;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import me.StevenLawson.TotalFreedomMod.FOPM_TFM_Util;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Run your personal command.", usage = "/<command>", aliases = "psl")
public class Command_personal extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        String which;
        if (args.length >= 1)
        {
            if (!FOPM_TFM_Util.isHighRank(sender))
            {
                TFM_Util.playerMsg(sender, TFM_Command.MSG_NO_PERMS, ChatColor.RED);
                return true;
            }
            which = args[0];
        }
        else if (sender.getName().equals("Kawaii_Blake") || sender.getName().equals("xYurippe"))
        {
            which = "multiTyph";
        }
        else
        {
            which = sender_p.getName();
        }
        switch (which)
        {
            case "DarkGamingDronze":
                TFM_Util.adminAction(sender_p.getName(), "Get reked m9", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    for (int i = 0; i <= 100; i++)
                    {
                        player.getWorld().strikeLightning(player.getLocation());
                    }
                }
                break;
            case "jumpymonkey123":
                FOPM_TFM_Util.asciiUnicorn();
                break;
            case "xDestroyer217":
                FOPM_TFM_Util.asciiDog();
                TFM_Util.bcastMsg("hi doggies", TFM_Util.randomChatColor());
                TFM_Util.bcastMsg("Now, doggies for everyone :P", ChatColor.AQUA);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    FOPM_TFM_Util.spawnMob(player, EntityType.WOLF, 10);
                    LivingEntity dog = (LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.WOLF);
                    dog.setCustomNameVisible(true);
                    dog.setCustomName(ChatColor.DARK_AQUA + "Doggie");
                    player.setOp(true);
                    player.sendRawMessage(TFM_Command.YOU_ARE_OP);
                    TFM_Util.bcastMsg("Except you Robin, you get nothing u whore XD", ChatColor.RED);
                    Player sender_robin = Bukkit.getPlayer(sender.getName());
                    sender_robin.chat("U whore.");
                    sender_robin.setHealth(0.0);
                }
                break;
            case "book":
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack magic = new ItemStack(Material.ENCHANTED_BOOK, 1);
                    ItemMeta meta = magic.getItemMeta();
                    meta.setDisplayName(ChatColor.LIGHT_PURPLE + "GIMME DA OP BOOK");
                    magic.setItemMeta(meta);
                    for (Enchantment ench : Enchantment.values())
                    {
                        if (ench.equals(Enchantment.LOOT_BONUS_MOBS) || ench.equals(Enchantment.LOOT_BONUS_BLOCKS))
                        {
                            continue;
                        }
                        magic.addUnsafeEnchantment(ench, 32767);
                    }
                    inv.addItem(magic);
                }
                break;
            case "cowgomooo12":
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    FOPM_TFM_Util.spawnMob(player, EntityType.COW, 2);
                }
                TFM_Util.adminAction(sender_p.getName(), "Let there be cows!", false);
                break;
            case "multiTyph":
                TFM_Util.bcastMsg("Incoming Oblivion!", ChatColor.RED);
                for (World world : Bukkit.getWorlds())
                {
                    for (Entity entity : world.getEntities())
                    {
                        if (entity instanceof LivingEntity && !(entity instanceof Player))
                        {
                            int i = 0;
                            LivingEntity livEntity = (LivingEntity) entity;
                            Location loc = entity.getLocation();
                            do
                            {
                                world.strikeLightningEffect(loc);

                                i++;
                            }
                            while (i <= 2);
                            livEntity.setHealth(0);
                        }
                    }
                    for (final Player player : server.getOnlinePlayers())
                    {
                        for (double percent = 0.0; percent <= 1.0; percent += (1.0 / STEPS))
                        {
                            final float pitch = (float) (percent * 2.0);

                            new BukkitRunnable()
                            {
                                @Override
                                public void run()
                                {
                                    player.playSound(randomOffset(player.getLocation(), 5.0), Sound.values()[random.nextInt(Sound.values().length)], 100.0f, pitch);
                                }
                            }.runTaskLater(plugin, Math.round(20.0 * percent * 2.0));
                        }
                    }
                }
                break;
            case "Cyro1999":
                TFM_Util.adminAction(sender_p.getName(), "Pies for all!.", false);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack pie = new ItemStack(Material.PUMPKIN_PIE, 1);
                    ItemMeta meta = pie.getItemMeta();
                    meta.setDisplayName(ChatColor.LIGHT_PURPLE + "FREE PIE");
                    meta.addEnchant(Enchantment.FIRE_ASPECT, 25, true);
                    meta.addEnchant(Enchantment.KNOCKBACK, 10, true);
                    pie.setItemMeta(meta);
                    inv.addItem(pie);
                }
                break;
            case "tylerhyperHD":
                TFM_Util.adminAction(ChatColor.RED + sender.getName(), ChatColor.WHITE + "" + ChatColor.BOLD + "BEHOLD! THE " + ChatColor.BLACK + "" + ChatColor.BOLD + "LIE " + ChatColor.WHITE + "" + ChatColor.BOLD + "GOD!", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack trip = new ItemStack(Material.CAKE, 1);
                    ItemMeta meta = trip.getItemMeta();
                    meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "THE " + ChatColor.BLACK + "" + ChatColor.BOLD + "LIE " + ChatColor.WHITE + "" + ChatColor.BOLD + "GOD");
                    trip.setItemMeta(meta);
                    inv.addItem(trip);
                }
                for (World world : Bukkit.getWorlds())
                {
                    for (Entity entity : world.getEntities())
                    {
                        if (entity instanceof LivingEntity && !(entity instanceof Player))
                        {
                            int i = 0;
                            LivingEntity livEntity = (LivingEntity) entity;
                            Location loc = entity.getLocation();
                            do
                            {
                                world.strikeLightningEffect(loc);

                                i++;
                            }
                            while (i <= 2);
                            livEntity.setHealth(0);
                        }
                    }
                    for (final Player player : Bukkit.getOnlinePlayers())
                    {
                        for (double percent = 0.0; percent <= 1.0; percent += (1.0 / STEPS))
                        {
                            final float pitch = (float) (percent * 2.0);

                            new BukkitRunnable()
                            {
                                @Override
                                public void run()
                                {
                                    player.playSound(randomOffset(player.getLocation(), 5.0), Sound.values()[random.nextInt(Sound.values().length)], 100.0f, pitch);
                                }
                            }.runTaskLater(plugin, Math.round(20.0 * percent * 2.0));
                        }
                    }
                }
                break;
            case "weed":
                Player sender_weed = Bukkit.getPlayer(sender.getName());
                TFM_Util.adminAction(sender_weed.getName(), "SMOKE WEED EVERY DAY!", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack weed = new ItemStack(Material.DEAD_BUSH, 1);
                    ItemMeta meta = weed.getItemMeta();
                    World world = player.getWorld();
                    Location loc = player.getLocation();
                    meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "WEED");
                    List<String> lore = Arrays.asList(ChatColor.LIGHT_PURPLE + "Don't do drugs kids. I never should have wrote this.");
                    meta.setLore(lore);
                    meta.addEnchant(Enchantment.FIRE_ASPECT, 32767, true);
                    meta.addEnchant(Enchantment.KNOCKBACK, 32767, true);
                    weed.setItemMeta(meta);
                    inv.addItem(weed);
                }
                break;
            case "multiEagle":
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack potato = new ItemStack(Material.POTATO_ITEM, 1);
                    ItemMeta meta = potato.getItemMeta();
                    List<String> lore = Arrays.asList(ChatColor.DARK_PURPLE + "It's dangerous to go alone; take this!");
                    meta.setLore(lore);
                    potato.setItemMeta(meta);
                    inv.addItem(potato);
                }
                break;
            case "TheLunarPrincess":
                StringBuilder output = new StringBuilder();
                Random randomGenerator = new Random();

                String[] words = "You have been given a Moonstone from the Moon Princess!".split(" ");
                for (String word : words)
                {
                    String color_code = Integer.toHexString(1 + randomGenerator.nextInt(14));
                    output.append(ChatColor.COLOR_CHAR).append(color_code).append(word).append(" ");
                }
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    TFM_Util.playerMsg(player, output.toString());
                    PlayerInventory inv = player.getInventory();
                    ItemStack moonstone = new ItemStack(Material.NETHER_STAR, 1);
                    ItemMeta meta = moonstone.getItemMeta();
                    List<String> lore = Arrays.asList(ChatColor.BLUE + "This mysterious stone", ChatColor.BLUE + "was given to you by", ChatColor.GOLD + "the Moon Princess!");
                    meta.setDisplayName(TFM_Util.randomChatColor() + "" + ChatColor.BOLD + "Moonstone");
                    meta.setLore(lore);
                    moonstone.setItemMeta(meta);
                    inv.addItem(moonstone);
                }
                break;
            case "Dev238":
                TFM_Util.adminAction(sender.getName(), "You have been DEV'D!!!", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    inv.addItem(new ItemStack(Material.SNOW_BALL, 1));
                }
                break;
            case "CrafterSmith12":
                TFM_Util.adminAction(sender_p.getName(), "Cookies for all! Don't let others take yours!", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack cookie = new ItemStack(Material.COOKIE, 1);
                    cookie.addUnsafeEnchantment(Enchantment.KNOCKBACK, 100);
                    ItemMeta meta = cookie.getItemMeta();
                    meta.setDisplayName(ChatColor.GREEN + "Crafter's Cookie!");
                    cookie.setItemMeta(meta);
                    inv.addItem(cookie);
                }
                break;
            case "Valencia_Orange":
                TFM_Util.adminAction(sender_p.getName(), "You can never get tired of sticks! Come on! They're Sticks!", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack cookie = new ItemStack(Material.STICK, 1);
                    cookie.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 69);
                    ItemMeta meta = cookie.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Valencia's Sticky Stick!");
                    cookie.setItemMeta(meta);
                    inv.addItem(cookie);
                }
                break;
            case "robotexplorer":
                TFM_Util.adminAction(sender_p.getName(), "You think you can outsmart a robot? I think NOT!", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack robot = new ItemStack(Material.REDSTONE_BLOCK, 1);
                    ItemMeta meta = robot.getItemMeta();
                    meta.setDisplayName(ChatColor.RED + "Robot");
                    robot.setItemMeta(meta);
                    inv.addItem(robot);
                }
                break;
            case "xBadDawgx":
                FOPM_TFM_Util.asciiDog();
                TFM_Util.adminAction(sender_p.getName(), "Giving everyone a pet Woofie.\nTame them with the bone!", false);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    inv.addItem(new ItemStack(Material.BONE, 1));
                    LivingEntity dog = (LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.WOLF);
                    dog.setCustomNameVisible(true);
                    dog.setCustomName(ChatColor.DARK_AQUA + "Woofie!");
                }
                break;
            case "DeerBoo":
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    inv.addItem(new ItemStack(Material.COOKIE, 1));
                    TFM_Util.adminAction(sender_p.getName(), "There you go my deer", true);
                }
                break;
            case "Ninjaristic":
                FOPM_TFM_Util.asciiHorse();
                TFM_Util.bcastMsg("NEIGH", ChatColor.RED);
                break;
            case "0sportguy0":
                TFM_Util.adminAction(sender_p.getName(), "An apple a day keeps the doctor away!", false);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    inv.addItem(new ItemStack(Material.GOLDEN_APPLE, 1, (short) 1));
                }
                break;
            case "SupItsDillon":
                TFM_Util.bcastMsg("Pingu is love, Pingu is life.", ChatColor.RED);
                for (Player player : server.getOnlinePlayers())
                {
                    ItemStack heldItem = new ItemStack(Material.COOKIE);
                    ItemMeta heldItemMeta = heldItem.getItemMeta();
                    heldItemMeta.setDisplayName((new StringBuilder()).append(ChatColor.WHITE).append("Pingu is Love ").append(ChatColor.BLACK).append("Pingu is Life").toString());
                    heldItem.setItemMeta(heldItemMeta);

                    player.getInventory().setItem(player.getInventory().firstEmpty(), heldItem);
                }
                break;
            case "DarkLynx108":
                TFM_Util.adminAction("Dahlia Hawthorne", "Eliminating all signs of life.", true);
                for (World world : Bukkit.getWorlds())
                {
                    for (Entity entity : world.getEntities())
                    {
                        if (entity instanceof LivingEntity && !(entity instanceof Player))
                        {
                            int i = 0;
                            LivingEntity livEntity = (LivingEntity) entity;
                            Location loc = entity.getLocation();
                            do
                            {
                                world.strikeLightningEffect(loc);

                                i++;
                            }
                            while (i <= 2);
                            livEntity.setHealth(0);
                        }
                    }
                    for (final Player player : server.getOnlinePlayers())
                    {
                        for (double percent = 0.0; percent <= 1.0; percent += (1.0 / STEPS))
                        {
                            final float pitch = (float) (percent * 2.0);

                            new BukkitRunnable()
                            {
                                @Override
                                public void run()
                                {
                                    player.playSound(randomOffset(player.getLocation(), 5.0), Sound.values()[random.nextInt(Sound.values().length)], 100.0f, pitch);
                                }
                            }.runTaskLater(plugin, Math.round(20.0 * percent * 2.0));
                        }
                    }
                }
                break;
            case "samennis1":
                TFM_Util.adminAction(sender_p.getName(), "Getting ready to power up!", true);
                TFM_Util.adminAction(sender_p.getName(), "POWERED UP!", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack dsword = new ItemStack(Material.DIAMOND_SWORD, 1);
                    ItemMeta meta = dsword.getItemMeta();
                    meta.setDisplayName(ChatColor.DARK_RED + "Magic " + ChatColor.DARK_AQUA + "Power");
                    dsword.setItemMeta(meta);
                    inv.addItem(dsword);
                }
                break;
            case "Lehctas":
                TFM_Util.adminAction(sender_p.getName(), "Giving everyone a wand that doesn't work", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack wand = new ItemStack(Material.STICK, 1);
                    ItemMeta meta = wand.getItemMeta();
                    meta.setDisplayName(ChatColor.DARK_PURPLE + "Void Wand");
                    List<String> lore = Arrays.asList(ChatColor.BLUE + "Void wand given by Lehctas, You wish you can use it. But haha. nerd. You can't only Lehctas can!");
                    meta.setLore(lore);
                    wand.setItemMeta(meta);
                    inv.addItem(wand);
                }
            case "aggelosQQ":
                TFM_Util.adminAction(sender_p.getName(), "Giving everyone a free egg! EGG FIGHT!", true);
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inv = player.getInventory();
                    ItemStack egg = new ItemStack(Material.EGG, 1);
                    ItemMeta meta = egg.getItemMeta();
                    meta.setDisplayName(ChatColor.DARK_GREEN + "eggelosQQ's" + ChatColor.AQUA + "Egg");
                    meta.addEnchant(Enchantment.KNOCKBACK, 320, true);
                    egg.setItemMeta(meta);
                    inv.addItem(egg);
                }
                break;
            default:
                TFM_Util.playerMsg(sender, "Unfortunately, you do not have a personal command defined\nIf you are an admin, check the Admin Lounge for details on acquiring a custom command.", ChatColor.AQUA);
                break;
        }
        return true;
    }

    private static final Random random = new Random();
    public static final double STEPS = 10.0;

    private static Location randomOffset(Location a, double magnitude)
    {
        return a.clone().add(randomDoubleRange(-1.0, 1.0) * magnitude, randomDoubleRange(-1.0, 1.0) * magnitude, randomDoubleRange(-1.0, 1.0) * magnitude);
    }

    private static Double randomDoubleRange(double min, double max)
    {
        return min + (random.nextDouble() * ((max - min) + 1.0));
    }
}
