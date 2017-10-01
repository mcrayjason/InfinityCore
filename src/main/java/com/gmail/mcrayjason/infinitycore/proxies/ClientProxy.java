package com.gmail.mcrayjason.infinitycore.proxies;

import com.gmail.mcrayjason.infinitycore.helpers.LogHelper;
import com.jadarstudios.developercapes.DevCapes;

public class ClientProxy extends CommonProxy
{
    public ClientProxy()
    {

    }

    @SuppressWarnings("deprecation")
    public void cape()
    {
        LogHelper.info("Dressing Capes");
        DevCapes.getInstance().registerConfig("https://gist.githubusercontent.com/JasonMcRay/b1d2919b84e2901b755bfca38bb41f77/raw/", "InfinityCore");
        LogHelper.info("Capes Dressed");

    }
}
