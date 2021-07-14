package net.cephetir;

import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;

public class Status {
    public Boolean singleplayerCheck(){
        if(Minecraft.getInstance().hasSingleplayerServer()) {
            return true;
        }
        return false;
    }
}
