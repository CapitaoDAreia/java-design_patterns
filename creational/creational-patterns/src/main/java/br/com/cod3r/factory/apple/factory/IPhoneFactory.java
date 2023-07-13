package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public abstract class IPhoneFactory {

	public static IPhone orderIphone(String generation, String level){
        IPhone device = null;

        if("X".equals(generation)){
            if("standard".equals(level)){
                device = new IPhoneX();
            }

            if("highEnd".equals(level)){
                device = new IPhoneXSMax();
            }
        }

        if("11".equals(generation)){
            if("standard".equals(level)){
                device = new IPhone11();
            }

            if("highEnd".equals(level)){
                device = new IPhone11Pro();
            }
        }

        if(device != null){
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    };
}
