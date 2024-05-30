import java.util.HashMap;

public class Vehicle
    {
        private String _vehicleType;
        private HashMap<String, String> _parts = new HashMap<String, String>();

        public Vehicle(String vehicleType)
        {
            this._vehicleType = vehicleType;
        }

        public String getPart(String key) {
            return _parts.get(key);
        }
        
        public void setPart(String key, String value) {
            _parts.put(key, value);
        }

        public void Show()
        {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("Vehicle Type: " + _vehicleType);
            System.out.println(" Frame : " + _parts.get("frame"));
            System.out.println(" Engine : " + _parts.get("engine"));
            System.out.println(" #Wheels: " + _parts.get("wheels"));
            System.out.println(" #Doors : " + _parts.get("doors"));
        }
    }