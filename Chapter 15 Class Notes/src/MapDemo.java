import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        System.out.println("gurt");
        Map<String, Color> favColors = new HashMap<>();
        favColors.put("Sreeram", Color.GREEN);
        favColors.put("Kaitlyn", Color.GREEN);
        favColors.put("Cam", Color.BLUE);
        favColors.put("Nimai", Color.RED);

        favColors.put("Cam", Color.ORANGE);

        Set<String> keys = favColors.keySet();
        for (String key: keys){
            System.out.println(key+"("+key.hashCode()+"): "+favColors.get(key));
        }
    }
}
