package com.eva.multismarts.vscoreboard;

import com.eva.multismarts.Main;
import static com.eva.multismarts.Main.ConfigVscoreboard;
import static com.eva.multismarts.Main.ConfigVscoreboarddata;
import static com.eva.multismarts.Main.ConfigVscoreboardmultiworld;
import com.eva.multismarts.Useful_methods;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import static org.bukkit.Bukkit.getServer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;



public class Board {
   
    private final Main plugin;
  
    public Board(Main instance) {
        this.plugin = instance;
    }
        static FileConfiguration cfg = ConfigVscoreboard;
        
        static FileConfiguration cfgdata = ConfigVscoreboarddata;
        
        static FileConfiguration cfgmultiworld = ConfigVscoreboardmultiworld;
 
        
       public static void setBoard(Player p) {
           
        //Objetos y variables para un uso cómodo del código
        Permission perm = Main.getPermissions();
        
      //  String rank = perm.getPrimaryGroup(p);
        
        int numberplayers = getServer().getOnlinePlayers().size();
            
        int maxplayers = getServer().getMaxPlayers();
          
        String nameserver = getServer().getServerName();
        
        String nameuser = p.getName();
        
        Economy econ = Main.getEconomy();
        
        String playermoney = Useful_methods.Decimal_formatter.format(econ.getBalance(p));
        
        String worldname = p.getWorld().toString();
        
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        
        Objective obj = board.registerNewObjective("aaa", "bbb");
            
        //Valores traidos desde los diferentes archivos yml del módulo.
          
          //multiworld
           
          boolean multiworldstatus = cfgmultiworld.getBoolean("Multiworld_status");
          String  multiworldname1 = cfgmultiworld.getString("Worlds.World1.Worldname");
          String  multiworldname2 = cfgmultiworld.getString("Worlds.World2.Worldname");
          String  multiworldname3 = cfgmultiworld.getString("Worlds.World3.Worldname");
          String  multiworldname4 = cfgmultiworld.getString("Worlds.World4.Worldname");
          String  multiworldname5 = cfgmultiworld.getString("Worlds.World5.Worldname");
          
          int worldstructure1 = cfg.getInt("Worlds.World1.Structure"); 
          int worldstructure2 = cfg.getInt("Worlds.World2.Structure"); 
          int worldstructure3 = cfg.getInt("Worlds.World3.Structure"); 
          int worldstructure4 = cfg.getInt("Worlds.World4.Structure"); 
          int worldstructure5 = cfg.getInt("Worlds.World5.Structure"); 
          
            //World1
            
            //World2
            
            //World3
            
            //World4
            
            //World5
          
          //cfgdata
          
          int kills = ConfigVscoreboarddata.getInt(p.getName() + "." + "Kills");
          int deaths = ConfigVscoreboarddata.getInt(p.getName() + "." + "Deaths");
          double kd = ConfigVscoreboarddata.getDouble(p.getName() + "." + "Ratio");
          
          //cfg
          
          int scoreboardstructure = cfg.getInt("Scoreboard_structure.Structure");       
          String titlecfg = cfg.getString("Scoreboard_sections.Title").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String spacer1cfg = cfg.getString("Scoreboard_sections.Sectionspacer1").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section1acfg = cfg.getString("Scoreboard_sections.Section1a").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));     
          String section1bcfg = cfg.getString("Scoreboard_sections.Section1b").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String spacer2cfg = cfg.getString("Scoreboard_sections.Sectionspacer2").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section2acfg = cfg.getString("Scoreboard_sections.Section2a").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section2bcfg = cfg.getString("Scoreboard_sections.Section2b").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String spacer3cfg = cfg.getString("Scoreboard_sections.Sectionspacer3").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section3acfg = cfg.getString("Scoreboard_sections.Section3a").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section3bcfg = cfg.getString("Scoreboard_sections.Section3b").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String spacer4cfg = cfg.getString("Scoreboard_sections.Sectionspacer4").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section4acfg = cfg.getString("Scoreboard_sections.Section4a").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section4bcfg = cfg.getString("Scoreboard_sections.Section4b").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String spacer5cfg = cfg.getString("Scoreboard_sections.Sectionspacer5").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section5acfg = cfg.getString("Scoreboard_sections.Section5a").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
          String section5bcfg = cfg.getString("Scoreboard_sections.Section5b").replaceAll("<player>", p.getName()).replaceAll("<numberplayers>", Integer.toString(numberplayers)).replaceAll("<balance>", playermoney).replaceAll("<servername>", nameserver).replaceAll("<worldname>", worldname).replaceAll("<maxplayers>", Integer.toString(maxplayers)).replaceAll("<kills>", Integer.toString(kills)).replaceAll("<deaths>", Integer.toString(deaths)).replaceAll("<kdratio>", Useful_methods.Decimal_formatter.format(kd));
       
        //Tipo de Scoreboard y su título.
        
        obj.setDisplayName(Useful_methods.Text_formatter(titlecfg));
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        
        //Resultados del marcador
        
         //UNIWORLD
         
               //Barra limitadora del título
        
                Score bar = obj.getScore(Useful_methods.Text_formatter(spacer1cfg));
        
               //Espacios
        
                Score space1 = obj.getScore(Useful_methods.Text_formatter(spacer2cfg));
                Score space2 = obj.getScore(Useful_methods.Text_formatter(spacer3cfg));
                Score space3 = obj.getScore(Useful_methods.Text_formatter(spacer4cfg));
                Score space4 = obj.getScore(Useful_methods.Text_formatter(spacer5cfg));
                
               //Nombre de usuario
         
                 Score text1a = obj.getScore(Useful_methods.Text_formatter(section1acfg));
                 Score text1b = obj.getScore(Useful_methods.Text_formatter(section1bcfg));
        
               //Número de jugadores conectados
         
                 Score text2a = obj.getScore(Useful_methods.Text_formatter(section2acfg));
                 Score text2b = obj.getScore(Useful_methods.Text_formatter(section2bcfg));
                 
               //Dinero del jugador
               
                 Score text3a = obj.getScore(Useful_methods.Text_formatter(section3acfg));
                 Score text3b = obj.getScore(Useful_methods.Text_formatter(section3bcfg));
                 
               //Dirección del servidor de TeamSpeak 3.
         
                 Score text4a = obj.getScore(Useful_methods.Text_formatter(section4acfg));
                 Score text4b = obj.getScore(Useful_methods.Text_formatter(section4bcfg));
               //Text5
               
                 Score text5a = obj.getScore(Useful_methods.Text_formatter(section5acfg));
                 Score text5b = obj.getScore(Useful_methods.Text_formatter(section5bcfg));
                 
        //WORLD1
                
        //WORLD2
        
        //WORLD3
        
        //WORLD4
        
        //WORLD5
        
        //Orden de los marcadores
        
        //Uniworld
        
        if (scoreboardstructure == 1 && multiworldstatus == false)
        {
                bar.setScore(15);
                
                text1a.setScore(14);
                
                text1b.setScore(13);
              
                space1.setScore(12);
                
                text2a.setScore(11);
                
                text2b.setScore(10);
                
                space2.setScore(9);
                
                text3a.setScore(8);
                
                text3b.setScore(7);
                
                space3.setScore(6);
                
                text4a.setScore(5);
                
                text4b.setScore(4);
                
                space4.setScore(3);
                
                text5a.setScore(2);
                
                text5b.setScore(1);     
                
                p.setScoreboard(board); 
         }
        
        if (scoreboardstructure == 4 && multiworldstatus == false)
            
        {
            bar.setScore(12);
                
            text1a.setScore(11);
                
            text1b.setScore(10);
              
            space1.setScore(9);
                
            text2a.setScore(8);
                
            text2b.setScore(7);
                
            space2.setScore(6);
                
            text3a.setScore(5);
                
            text3b.setScore(4);
                
            space3.setScore(3);
                
            text4a.setScore(2);
                
            text4b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if ((scoreboardstructure == 3 || scoreboardstructure <= 0 || scoreboardstructure >= 6) && multiworldstatus == false)
            
        {
            bar.setScore(9);
                
            text1a.setScore(8);
                
            text1b.setScore(7);
              
            space1.setScore(6);
                
            text2a.setScore(5);
                
            text2b.setScore(4);
                
            space2.setScore(3);
                
            text3a.setScore(2);
                
            text3b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (scoreboardstructure == 2 && multiworldstatus == false)
            
        {
            bar.setScore(6);
                
            text1a.setScore(5);
                
            text1b.setScore(4);
              
            space1.setScore(3);
                
            text2a.setScore(2);
                
            text2b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (scoreboardstructure == 1 && multiworldstatus == false)
            
        {      
            text1a.setScore(2);
                
            text1b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
       
       //Multiworld
       
          //MUNDO1
       if (worldname.equalsIgnoreCase(multiworldname1) && multiworldstatus == true)
       {
           if (worldstructure1 == 5)
        {
                bar.setScore(15);
                
                text1a.setScore(14);
                
                text1b.setScore(13);
              
                space1.setScore(12);
                
                text2a.setScore(11);
                
                text2b.setScore(10);
                
                space2.setScore(9);
                
                text3a.setScore(8);
                
                text3b.setScore(7);
                
                space3.setScore(6);
                
                text4a.setScore(5);
                
                text4b.setScore(4);
                
                space4.setScore(3);
                
                text5a.setScore(2);
                
                text5b.setScore(1);     
                
                p.setScoreboard(board); 
         }
        
        if (worldstructure1 == 4)
            
        {
            bar.setScore(12);
                
            text1a.setScore(11);
                
            text1b.setScore(10);
              
            space1.setScore(9);
                
            text2a.setScore(8);
                
            text2b.setScore(7);
                
            space2.setScore(6);
                
            text3a.setScore(5);
                
            text3b.setScore(4);
                
            space3.setScore(3);
                
            text4a.setScore(2);
                
            text4b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure1 == 3 || worldstructure1 <= 0 || worldstructure1 >= 6)
            
        {
            bar.setScore(9);
                
            text1a.setScore(8);
                
            text1b.setScore(7);
              
            space1.setScore(6);
                
            text2a.setScore(5);
                
            text2b.setScore(4);
                
            space2.setScore(3);
                
            text3a.setScore(2);
                
            text3b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure1 == 2)
            
        {
            bar.setScore(6);
                
            text1a.setScore(5);
                
            text1b.setScore(4);
              
            space1.setScore(3);
                
            text2a.setScore(2);
                
            text2b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure1 == 1)
            
        {      
            text1a.setScore(2);
                
            text1b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
       }
       //MUNDO2
       if (worldname.equalsIgnoreCase(multiworldname2) && multiworldstatus == true)
       {
        if (worldstructure2 == 5)
        {
                bar.setScore(15);
                
                text1a.setScore(14);
                
                text1b.setScore(13);
              
                space1.setScore(12);
                
                text2a.setScore(11);
                
                text2b.setScore(10);
                
                space2.setScore(9);
                
                text3a.setScore(8);
                
                text3b.setScore(7);
                
                space3.setScore(6);
                
                text4a.setScore(5);
                
                text4b.setScore(4);
                
                space4.setScore(3);
                
                text5a.setScore(2);
                
                text5b.setScore(1);     
                
                p.setScoreboard(board); 
         }
        
        if (worldstructure2 == 4)
            
        {
            bar.setScore(12);
                
            text1a.setScore(11);
                
            text1b.setScore(10);
              
            space1.setScore(9);
                
            text2a.setScore(8);
                
            text2b.setScore(7);
                
            space2.setScore(6);
                
            text3a.setScore(5);
                
            text3b.setScore(4);
                
            space3.setScore(3);
                
            text4a.setScore(2);
                
            text4b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure2 == 3 || worldstructure2 <= 0 || worldstructure2 >= 6)
            
        {
            bar.setScore(9);
                
            text1a.setScore(8);
                
            text1b.setScore(7);
              
            space1.setScore(6);
                
            text2a.setScore(5);
                
            text2b.setScore(4);
                
            space2.setScore(3);
                
            text3a.setScore(2);
                
            text3b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure2 == 2)
            
        {
            bar.setScore(6);
                
            text1a.setScore(5);
                
            text1b.setScore(4);
              
            space1.setScore(3);
                
            text2a.setScore(2);
                
            text2b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure2 == 1)
            
        {      
            text1a.setScore(2);
                
            text1b.setScore(1);
            
            p.setScoreboard(board); 
        }
       }
       //MUNDO3
       if (worldname.equalsIgnoreCase(multiworldname3) && multiworldstatus == true)
       {
        if (worldstructure3 == 5)
        {
                bar.setScore(15);
                
                text1a.setScore(14);
                
                text1b.setScore(13);
              
                space1.setScore(12);
                
                text2a.setScore(11);
                
                text2b.setScore(10);
                
                space2.setScore(9);
                
                text3a.setScore(8);
                
                text3b.setScore(7);
                
                space3.setScore(6);
                
                text4a.setScore(5);
                
                text4b.setScore(4);
                
                space4.setScore(3);
                
                text5a.setScore(2);
                
                text5b.setScore(1);     
                
                p.setScoreboard(board); 
         }
        
        if (worldstructure3 == 4)
            
        {
            bar.setScore(12);
                
            text1a.setScore(11);
                
            text1b.setScore(10);
              
            space1.setScore(9);
                
            text2a.setScore(8);
                
            text2b.setScore(7);
                
            space2.setScore(6);
                
            text3a.setScore(5);
                
            text3b.setScore(4);
                
            space3.setScore(3);
                
            text4a.setScore(2);
                
            text4b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure3 == 3 || worldstructure3 <= 0 || worldstructure3 >= 6)
            
        {
            bar.setScore(9);
                
            text1a.setScore(8);
                
            text1b.setScore(7);
              
            space1.setScore(6);
                
            text2a.setScore(5);
                
            text2b.setScore(4);
                
            space2.setScore(3);
                
            text3a.setScore(2);
                
            text3b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure3 == 2)
            
        {
            bar.setScore(6);
                
            text1a.setScore(5);
                
            text1b.setScore(4);
              
            space1.setScore(3);
                
            text2a.setScore(2);
                
            text2b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure3 == 1)
            
        {      
            text1a.setScore(2);
                
            text1b.setScore(1);
            
            p.setScoreboard(board); 
        }
       }
       //MUNDO4
       if (worldname.equalsIgnoreCase(multiworldname4) && multiworldstatus == true)
       {
         if (worldstructure4 == 5)
          {
                bar.setScore(15);
                
                text1a.setScore(14);
                
                text1b.setScore(13);
              
                space1.setScore(12);
                
                text2a.setScore(11);
                
                text2b.setScore(10);
                
                space2.setScore(9);
                
                text3a.setScore(8);
                
                text3b.setScore(7);
                
                space3.setScore(6);
                
                text4a.setScore(5);
                
                text4b.setScore(4);
                
                space4.setScore(3);
                
                text5a.setScore(2);
                
                text5b.setScore(1);     
                
                p.setScoreboard(board); 
           }
        
        if (worldstructure4 == 4)
            
        {
            bar.setScore(12);
                
            text1a.setScore(11);
                
            text1b.setScore(10);
              
            space1.setScore(9);
                
            text2a.setScore(8);
                
            text2b.setScore(7);
                
            space2.setScore(6);
                
            text3a.setScore(5);
                
            text3b.setScore(4);
                
            space3.setScore(3);
                
            text4a.setScore(2);
                
            text4b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure4 == 3 || worldstructure4 <= 0 || worldstructure4 >= 6)
            
        {
            bar.setScore(9);
                
            text1a.setScore(8);
                
            text1b.setScore(7);
              
            space1.setScore(6);
                
            text2a.setScore(5);
                
            text2b.setScore(4);
                
            space2.setScore(3);
                
            text3a.setScore(2);
                
            text3b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure4 == 2)
            
        {
            bar.setScore(6);
                
            text1a.setScore(5);
                
            text1b.setScore(4);
              
            space1.setScore(3);
                
            text2a.setScore(2);
                
            text2b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure4 == 1)
            
        {      
            text1a.setScore(2);
                
            text1b.setScore(1);
            
            p.setScoreboard(board); 
        } 
       }
       //Mundo5
       if (worldname.equalsIgnoreCase(multiworldname5) && multiworldstatus == true)
        {
          if (worldstructure5 == 5)
          {
                bar.setScore(15);
                
                text1a.setScore(14);
                
                text1b.setScore(13);
              
                space1.setScore(12);
                
                text2a.setScore(11);
                
                text2b.setScore(10);
                
                space2.setScore(9);
                
                text3a.setScore(8);
                
                text3b.setScore(7);
                
                space3.setScore(6);
                
                text4a.setScore(5);
                
                text4b.setScore(4);
                
                space4.setScore(3);
                
                text5a.setScore(2);
                
                text5b.setScore(1);     
                
                p.setScoreboard(board); 
         }
        
        if (worldstructure5 == 4)
            
        {
            bar.setScore(12);
                
            text1a.setScore(11);
                
            text1b.setScore(10);
              
            space1.setScore(9);
                
            text2a.setScore(8);
                
            text2b.setScore(7);
                
            space2.setScore(6);
                
            text3a.setScore(5);
                
            text3b.setScore(4);
                
            space3.setScore(3);
                
            text4a.setScore(2);
                
            text4b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure5 == 3 || worldstructure5 <= 0 || worldstructure5 >= 6)
            
        {
            bar.setScore(9);
                
            text1a.setScore(8);
                
            text1b.setScore(7);
              
            space1.setScore(6);
                
            text2a.setScore(5);
                
            text2b.setScore(4);
                
            space2.setScore(3);
                
            text3a.setScore(2);
                
            text3b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure5 == 2)
            
        {
            bar.setScore(6);
                
            text1a.setScore(5);
                
            text1b.setScore(4);
              
            space1.setScore(3);
                
            text2a.setScore(2);
                
            text2b.setScore(1);
            
            p.setScoreboard(board); 
        }
        
        if (worldstructure5 == 1)
            
        {      
            text1a.setScore(2);
                
            text1b.setScore(1);
            
            p.setScoreboard(board); 
        }
       }
              
     }       
}

