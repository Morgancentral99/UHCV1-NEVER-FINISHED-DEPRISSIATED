package github.morgancentral99.UHC.Utils;

import java.util.logging.Logger;

import org.bukkit.Bukkit;

import github.morgancentral99.UHC.Config;

public class LoggerAPI {
	
	static Logger logger = Bukkit.getLogger();
	
	public static void info(String msg) {
		logger.info(msg);
	}
	public static void warning(String msg) {
		logger.info(msg);
	}
	public static void debug(String msg) {
		if(Config.isDebug() == true) {
		logger.info(msg);
		}
	}
	

}
