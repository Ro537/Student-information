
package student_management;

import java.util.Scanner;


public class Main_Function {
    
    public static void main(String[] args) {
        
      while(true){
        System.out.println("C=Create data");
        System.out.println("R=Read data");
        System.out.println("U=Update data");
        System.out.println("D=Delete data");
        
        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter any charecter :");
        String chr=sc.nextLine();
       switch(chr)
       {
           case "C":
               System.out.println("Create data");
               InsartData isd = new InsartData();
               isd.insartData();
               break;
           case "R":
               System.out.println("Read data");
               ReadData rd = new ReadData();
               rd.readData();
               break;
           case "U":
               System.out.println("Update data");
               UpdateData ud = new UpdateData();
               ud.updateData();
               break;
           case "D":
               System.out.println("Delete data");
               DeletedData dd = new DeletedData();
               dd.deleteData();
               break;
           default:
               System.out.println("Not matching charecter");
               System.out.println("\n");
       }
         
    }
    }
}
