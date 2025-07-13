package learn;

public class PersonInfo {
    public static void main(String[] args) {
        String[] names =
        {
            "Aさん",
            "Bさん",
            "Dさん",
            "Jさん",
            "Zさん"
        };
        
        int[] ages =
        {
            21,
            22,
            23,
            24,
            25
        };
        
        int index;
        System.out.println("------------------------------\n For loop:");
        
        for (index = 0; index < names.length; index++) {
            System.out.println(names[index] + ": " + ages[index] + " Years");
        }
        
        System.out.println("------------------------------\n While loop:");
        index = 0;
        
        while (index < names.length) {
            System.out.println(names[index] + ": " + ages[index] + " Years");
            index++;
        }
//        if (
//                index >= 0
//                        &&
//                index < ages.length
//                        && 
//                index < names.length
//        )   
//                 {
//                    System.out.println(names[index] + ": " + ages[index] + " Years");
//                 }
    }
}
