/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<ComputerMonitor> monitors = new ArrayList<>();
        monitors.add(new ComputerMonitor("Samsung S345", Screen.CurvedScreen, MonitorType.OLED));
        monitors.add(new ComputerMonitor("Philips P532", Screen.WideScreen, MonitorType.LCD));
        monitors.add(new ComputerMonitor("LG L888", Screen.WideScreen, MonitorType.LED));
        monitors.add(new ComputerMonitor("Samsung S999", Screen.WideScreen, MonitorType.OLED));
        monitors.add(new ComputerMonitor("Dell D2J47", Screen.CurvedScreen, MonitorType.LCD));
        
        Scanner in = new Scanner(System.in);
        System.out.println("Quiere filtrar por tipo de monitor o de pantalla:\na.Monitor\nb.Pantalla");
        String choice = in.nextLine();
        ISpecification<ComputerMonitor> filter = null;
        String monitorType = "";
        if (choice.equals("a")) {
            System.out.println("Tipos de monitor:\na.OLED\nb.LED\nc.LCD");
            monitorType = in.nextLine();
            switch (monitorType) {
                case "a":
                    filter = new MonitorTypeSpecification(MonitorType.OLED);
                    break;
                case "b":
                    filter = new MonitorTypeSpecification(MonitorType.LED);
                    break;
                case "c":
                    filter = new MonitorTypeSpecification(MonitorType.LCD);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Tipos de pantalla:\na.Curved\nb.Wide");
            monitorType = in.nextLine();
            switch (monitorType) {
                case "a":
                    filter = new MonitorScreenSpecification(Screen.CurvedScreen);
                    break;
                case "b":
                    filter = new MonitorScreenSpecification(Screen.WideScreen);
                    break;
                default:
                    break;
            }
        }

        List<ComputerMonitor> Monitors = MonitorFilter.filter(monitors, filter);
        System.out.println("All LCD monitors");
        for (ComputerMonitor monitor : Monitors) {
            System.out.println("Name: " + monitor.getName() + ", Type: " + monitor.getType() + ", Screen: " + monitor.getScreen());
        }
        in.close();
    }
}
