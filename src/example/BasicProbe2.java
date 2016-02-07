//#################################################################
//# CodeWizard:  Java
//# This code was generated with the Nimsoft CodeWizard version 1.70
//# Date: Saturday, February 6, 2016
//
package example;
import java.io.IOException;
import com.nimsoft.nimbus.*;
import com.nimsoft.nimbus.ci.ConfigurationItem;

public class BasicProbe2 {

    public static void main(String[] args) {
        try {
            BasicProbe2 exampleprobe = new BasicProbe2();
            exampleprobe.doit(args);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void doit(String[] args) throws Exception {
            //ConfigurationItem ConfItem = new ConfigurationItem("citype", "ciname","Hostname");
			 NimAlarm alarm = new NimAlarm(NimAlarm.NIML_WARNING, "Alarm generated from Java");
			 alarm.send();
			 System.out.println("ALARM SENT" + alarm);
			 alarm.disconnect();
    }

}