//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Using normal variables to assign values
        int age1, age2, age3, age4;
        age1 = 40;
        age2 = 28;
        age3 = 17;
        age4 = 16;
        System.out.println("Age 1: " + age1);
        System.out.println("Age 2: " + age2);
        System.out.println("Age 3: " + age3);
        System.out.println("Age 4: " + age4);


        // ARRAYS
        // Using arrays to assign values: Declaring and then assigning
        int[] ages = new int[4];
        ages[0] = 40;
        ages[1] = 28;
        ages[2] = 17;
        ages[3] = 16;
        System.out.println("\nThe age in index 1 is: " + ages[0]);
        System.out.println("The age in index 2 is: " + ages[1]);
        System.out.println("The age in index 3 is: " + ages[2]);
        System.out.println("The age in index 4 is: " + ages[3]);



        // Using arrays to assign values: Initialization
        int[] miaka = {40, 28, 17, 16};

        System.out.println("\nMiaka katika mkebe wa kwanza ni: " + miaka[0]);
        System.out.println("Miaka katika mkebe wa kwanza ni: " + miaka[1]);
        System.out.println("Miaka katika mkebe wa kwanza ni: " + miaka[2]);
        System.out.println("Miaka katika mkebe wa kwanza ni: " + miaka[3] + "\n");

        // Using FOR LOOP to print the ages
        for(int index = 0; index < miaka.length; index++ ) {
//            System.out.println("Nambari kama ilivyo kwenye tarakilishi: " + index);
            System.out.println("Miaka katika mkebe wa kwanza ni: " + miaka[index]);
        }


    }
}