import java.util.Scanner;
//stdio.h


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ===================================================================================================================================================================================");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Dedan Kimathi University of Technology \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   School of Computer Science and IT \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    Department of Computer Science \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Academic Year: 2024/2025 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  STUDENT MARKSHEET (SECOND YEAR RESULTS)\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println(" ===================================================================================================================================================================================");

//         Student 1 details
        System.out.println("\nEnter details for Student 1:");
        System.out.print("Registration Number: ");
        String regNo1 = scanner.nextLine();
        System.out.print("Full Name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter marks for Internet Application Programming:");
        int s1u1 = scanner.nextInt();
        System.out.println("Enter marks for Vector Analysis:");
        int s1u2 = scanner.nextInt();
        System.out.println("Enter marks for Computer Graphics:");
        int s1u3 = scanner.nextInt();
        System.out.println("Enter marks for Computer Networks:");
        int s1u4 = scanner.nextInt();
        System.out.println("Enter marks for Knowledge Representation and Reasoning:");
        int s1u5 = scanner.nextInt();
        System.out.println("Enter marks for Object Oriented Programming:");
        int s1u6 = scanner.nextInt();
        System.out.println("Enter marks for Communication Skills:");
        int s1u7 = scanner.nextInt();
        scanner.nextLine();

        int total1 = s1u1 + s1u2 + s1u3 + s1u4 + s1u5 + s1u6 + s1u7;
        double avg1 = total1 / 7.0;
        double average1 = Math.round(avg1 * 10.0) / 10.0;

        // Student 2 details
        System.out.println("\n Enter details for Student 2:");
        System.out.print("Registration Number: ");
        String regNo2 = scanner.nextLine();
        System.out.print("Full Name: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter marks for Internet Application Programming:");
        int s2u1 = scanner.nextInt();
        System.out.println("Enter marks for Vector Analysis:");
        int s2u2 = scanner.nextInt();
        System.out.println("Enter marks for Computer Graphics:");
        int s2u3 = scanner.nextInt();
        System.out.println("Enter marks for Computer Networks:");
        int s2u4 = scanner.nextInt();
        System.out.println("Enter marks for Knowledge Representation and Reasoning:");
        int s2u5 = scanner.nextInt();
        System.out.println("Enter marks for Object Oriented Programming:");
        int s2u6 = scanner.nextInt();
        System.out.println("Enter marks for Communication Skills:");
        int s2u7 = scanner.nextInt();
        scanner.nextLine();

        int total2 = s2u1 + s2u2 + s2u3 + s2u4 + s2u5 + s2u6 + s2u7;
        double avg2 = total2 / 7.0;
        double average2 = Math.round(avg2 * 10.0) / 10.0;

        // Student 3 details
        System.out.println("\n Enter details for Student 3:");
        System.out.print("Registration Number: ");
        String regNo3 = scanner.nextLine();
        System.out.print("Full Name: ");
        String name3 = scanner.nextLine();
        System.out.println("Enter marks for Internet Application Programming:");
        int s3u1 = scanner.nextInt();
        System.out.println("Enter marks for Vector Analysis:");
        int s3u2 = scanner.nextInt();
        System.out.println("Enter marks for Computer Graphics:");
        int s3u3 = scanner.nextInt();
        System.out.println("Enter marks for Computer Networks:");
        int s3u4 = scanner.nextInt();
        System.out.println("Enter marks for Knowledge Representation and Reasoning:");
        int s3u5 = scanner.nextInt();
        System.out.println("Enter marks for Object Oriented Programming:");
        int s3u6 = scanner.nextInt();
        System.out.println("Enter marks for Communication Skills:");
        int s3u7 = scanner.nextInt();
        scanner.nextLine();

        int total3 = s3u1 + s3u2 + s3u3 + s3u4 + s3u5 + s3u6 + s3u7;
        double avg3 = total3 / 7.0;
        double average3 = Math.round(avg3 * 10.0) / 10.0;

        // Student 4 details
        System.out.println("\n Enter details for Student 4:");
        System.out.print("Registration Number: ");
        String regNo4 = scanner.nextLine();
        System.out.print("Full Name: ");
        String name4 = scanner.nextLine();
        System.out.println("Enter marks for Internet Application Programming:");
        int s4u1 = scanner.nextInt();
        System.out.println("Enter marks for Vector Analysis:");
        int s4u2 = scanner.nextInt();
        System.out.println("Enter marks for Computer Graphics:");
        int s4u3 = scanner.nextInt();
        System.out.println("Enter marks for Computer Networks:");
        int s4u4 = scanner.nextInt();
        System.out.println("Enter marks for Knowledge Representation and Reasoning:");
        int s4u5 = scanner.nextInt();
        System.out.println("Enter marks for Object Oriented Programming:");
        int s4u6 = scanner.nextInt();
        System.out.println("Enter marks for Communication Skills:");
        int s4u7 = scanner.nextInt();
        scanner.nextLine();

        int total4 = s4u1 + s4u2 + s4u3 + s4u4 + s4u5 + s4u6 + s4u7;
        double avg4 = total4 / 7.0;
        double average4 = Math.round(avg4 * 10.0) / 10.0;

        // Student 5 details
        System.out.println("\n Enter details for Student 5:");
        System.out.print("Registration Number: ");
        String regNo5 = scanner.nextLine();
        System.out.print("Full Name: ");
        String name5 = scanner.nextLine();
        System.out.println("Enter marks for Internet Application Programming:");
        int s5u1 = scanner.nextInt();
        System.out.println("Enter marks for Vector Analysis:");
        int s5u2 = scanner.nextInt();
        System.out.println("Enter marks for Computer Graphics:");
        int s5u3 = scanner.nextInt();
        System.out.println("Enter marks for Computer Networks:");
        int s5u4 = scanner.nextInt();
        System.out.println("Enter marks for Knowledge Representation and Reasoning:");
        int s5u5 = scanner.nextInt();
        System.out.println("Enter marks for Object Oriented Programming:");
        int s5u6 = scanner.nextInt();
        System.out.println("Enter marks for Communication Skills:");
        int s5u7 = scanner.nextInt();
        scanner.nextLine();

        int total5 = s5u1 + s5u2 + s5u3 + s5u4 + s5u5 + s5u6 + s5u7;
        double avg5 = total5 / 7.0;
        double average5 = Math.round(avg5 * 10.0) / 10.0;
//
//
//
        System.out.println(" \n\n===================================================================================================================================================================================");
        System.out.println("| Student Score Sheet \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");




        System.out.println("| Reg No \t\t\t\t| Full Name \t\t\t\t| CCS 2207\t| SMA 2215\t| CCS 2208\t| CCS 2209\t| CCS 2210\t| CCS 2211\t| IGS 2202\t| TOTALS\t| AVERAGE\t| STATUS\t| GRADE\t|");
        System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("| " + regNo1 + "\t\t| " + name1 + "\t\t|  " + s1u1 + "\t\t|  " + s1u2 + "\t\t|  " + s1u3 + "\t\t|  " + s1u4 + "\t\t|  " + s1u5 + "\t\t|  " + s1u6 + "\t\t|  " + s1u7 + "\t\t|  " + total1 + "\t\t|  " + average1 + "\t\t|  " + "\t\t\t|  " + " " + " " + "\t|");
        System.out.println("| " + regNo2 + "\t\t| " + name2 + "\t\t|  " + s2u1 + "\t\t|  " + s2u2 + "\t\t|  " + s2u3 + "\t\t|  " + s2u4 + "\t\t|  " + s2u5 + "\t\t|  " + s2u6 + "\t\t|  " + s2u7 + "\t\t|  " + total2 + "\t\t|  " + average2 + "\t\t|  " + "\t\t\t|  " + " " + " " + "\t|");
        System.out.println("| " + regNo3 + "\t\t| " + name3 + "\t\t|  " + s3u1 + "\t\t|  " + s3u2 + "\t\t|  " + s3u3 + "\t\t|  " + s3u4 + "\t\t|  " + s3u5 + "\t\t|  " + s3u6 + "\t\t|  " + s3u7 + "\t\t|  " + total3 + "\t\t|  " + average3 + "\t\t|  " + "\t\t\t|  " + " " + " " + "\t|");
        System.out.println("| " + regNo4 + "\t\t| " + name4 + "\t\t|  " + s4u1 + "\t\t|  " + s4u2 + "\t\t|  " + s4u3 + "\t\t|  " + s4u4 + "\t\t|  " + s4u5 + "\t\t|  " + s4u6 + "\t\t|  " + s4u7 + "\t\t|  " + total4 + "\t\t|  " + average4 + "\t\t|  " + "\t\t\t|  " + " " + " " + "\t|");
        System.out.println("| " + regNo5 + "\t\t| " + name5 + "\t\t|  " + s5u1 + "\t\t|  " + s5u2 + "\t\t|  " + s5u3 + "\t\t|  " + s5u4 + "\t\t|  " + s5u5 + "\t\t|  " + s5u6 + "\t\t|  " + s5u7 + "\t\t|  " + total5 + "\t\t|  " + average5 + "\t\t|  " + "\t\t\t|  " + " " + " " + "\t|");
        System.out.println(" ===================================================================================================================================================================================");

    }
}
// Dummy data
// C026-01-0739/2024 Kelvin Mwarano Njogu
// C026-01-2422/2024 MORRISON MAINA NJAGI
// C026-01-0755/2024 Alex Gitau Muriithi
// C026-01-0877/2024 Alice Wanjiru Gitari
// C026-01-0009/2024 Grace Achieng Otieno





