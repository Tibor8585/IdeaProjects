import java.util.Arrays;
import java.util.List;

public class exercise83extend {
    public static void main(String[] args) {
        int requiredVitaminC=500;
        int requiredVitaminD=800;
        int requiredVitaminE=100;
        List<String> vitaminConsumptions = Arrays.asList(
                "Name:Scarlett-6fccbdca,C:50,D:600,E:3000",
                "Name:Scarlett-c52ec32f,C:350,D:2000,E:4000",
                "Name:Bob-600b03a6,C:150,D:2000,E:2200",
                "Name:Scarlett-38d7e3a2,C:150,D:1000,E:100",
                "Name:Scarlett-3abde882,C:950,D:1200,E:300",
                "Name:Scarlett-76b92994,C:900,D:1600,E:4000",
                "Name:Bob-2b4a1544,C:600,D:800,E:1800",
                "Name:Bob-2421990a,C:50,D:200,E:1200",
                "Name:Bob-dd9be590,C:800,D:1200,E:600",
                "Name:Bob-4e0104b2,C:850,D:1000,E:2400",
                "Name:Bob-d63cb4ae,C:300,D:1800,E:200",
                "Name:Scarlett-294ece9c,C:100,D:1600,E:3100",
                "Name:Bob-a2a8b3d4,C:300,D:1200,E:1000",
                "Name:Bob-b87ae9dc,C:800,D:2000,E:2500",
                "Name:Scarlett-8e174152,C:350,D:200,E:3800",
                "Name:Scarlett-ec5a81be,C:450,D:1600,E:3700",
                "Name:Scarlett-ef7b71b9,C:50,D:400,E:1500",
                "Name:Scarlett-97856f0d,C:1000,D:1200,E:2000",
                "Name:Bob-2883e779,C:950,D:800,E:4000",
                "Name:Scarlett-abcc50bc,C:550,D:600,E:2800",
                "Name:Scarlett-28af295b,C:650,D:800,E:500",
                "Name:Bob-3d58e4c1,C:700,D:800,E:1700",
                "Name:Bob-0b8301b7,C:150,D:1400,E:1000",
                "Name:Bob-4041df3e,C:900,D:1800,E:1700",
                "Name:Scarlett-3e15502a,C:450,D:600,E:2200",
                "Name:Scarlett-1fae31bc,C:950,D:800,E:1800",
                "Name:Bob-47126df2,C:1000,D:1000,E:1900",
                "Name:Scarlett-63167044,C:550,D:1400,E:1600",
                "Name:Scarlett-ea01d4c2,C:800,D:800,E:3000",
                "Name:Scarlett-1c0c8bd5,C:1000,D:800,E:4000",
                "Name:Scarlett-af993b7d,C:800,D:1400,E:500",
                "Name:Scarlett-dc49a3f7,C:500,D:800,E:1200",
                "Name:Bob-2c2d260b,C:600,D:1200,E:2600",
                "Name:Bob-a4e7e3f7,C:150,D:1800,E:3600",
                "Name:Scarlett-991f6f64,C:750,D:2000,E:4000"
        );
        for(String personDailyVitamins : vitaminConsumptions){
            String[] data= personDailyVitamins.split(",");
            String[] nameData=data[0].split(":");
            String[] vitaminCData=data[1].split(":");
            String[] vitaminDData=data[2].split(":");
            String[] vitaminEData=data[3].split(":");

            int vitaminCvalue=Integer.parseInt(vitaminCData[1]);
            int vitaminDvalue=Integer.parseInt(vitaminDData[1]);
            int vitaminEvalue=Integer.parseInt(vitaminEData[1]);

            String resultToConsole="";
            if(vitaminCvalue<requiredVitaminC){
                resultToConsole+=vitaminCData[0]+"";
            }
            if(vitaminDvalue<requiredVitaminD){
                System.out.println(nameData[1] + ". Your Vitamin D is too low.");
                resultToConsole+=vitaminDData[0]+"";
            }
            if(vitaminEvalue<requiredVitaminE){
                System.out.println(nameData[1] + ". Your Vitamin E is too low.");
                resultToConsole+=vitaminEData[0]+"";
            }
            if (!resultToConsole.equals(""))
                System.out.println(nameData[1] + ". You are low in Vitamin " + resultToConsole + ".");

        }

    }

}
