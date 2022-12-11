
package assesement.question.pkg1.and.pkg2;
import java.util.Scanner;
import java.util.ArrayList;

public class AssesementQuestion1And2 {

    
    public static void main(String[] args) {
        
  
        Scanner scanner = new Scanner(System.in);
        // array 
        ArrayList<StudentId> list = new ArrayList<>();
        String a, b = "N", c = "Y";

        do{
            System.out.println(" insert Student ID to be added to the list:");
            
            String i = scanner.nextLine();
            System.out.println("");
            System.out.println(" insert Student PIN:");
            String p = scanner.nextLine();
            System.out.println("");

            StudentId temp = new StudentId(i,p);

            list.add(temp);

            System.out.println("Student include to the list!");
            System.out.println("");

            do{
                System.out.println(" add more students?(Y/N)");
                a = scanner.nextLine();
                System.out.println("");

                if(!a.equals(b) & !a.equals(c)){
                    System.out.println("Invalid option,  try again!");
                }

            }while(!a.equals(b) & !a.equals(c));

        }while(a.equals(c));

        int arrayLength = list.size();
        
        System.out.println("N*\t\t ID"+"\tPIN");
        for(int i=0;i<arrayLength;i++){
            System.out.println((i+1)+"\t"+list.get(i).getId()+"\t\t"+list.get(i).getPin());
        }
        System.out.println("");
        
        boolean testID = false;
        boolean testPin;
        int ind = -1;
        
        do{
            System.out.println("Login:");
            System.out.println(" Insert Student ID");
            String loginID = scanner.nextLine();
            System.out.println("");
            
            for (int i = 0; i < arrayLength; i++) {
                    
                if(list.get(i).getId().equals(loginID)){
                    testID = list.get(i).getId().equals(loginID);
                    ind = i;
                    System.out.println("ID found!");
                    System.out.println("");
                }
                
            }
            if(testID == false){
                
                System.out.println("Invalid ID.");
                System.out.println("");
                
            }
        
        }while(testID == false);
        
        do{
            System.out.println("Please insert  PIN");
            String loginPin = scanner.nextLine();
            System.out.println("");
            
            testPin = list.get(ind).getPin().equals(loginPin);
            
            if(testPin == true){
                System.out.println(" Pin accepted!");
                System.out.println("");
            }
                
            if(testPin == false){
                
                System.out.println(" incorrect Pin.");
                System.out.println("");
                
            }
        
        }while(testPin == false);
        
    }
        
 }
   class StudentId {
    
    String id;
    String pin;
    
    public StudentId(String id, String pin){
        this.id = id;
        this.pin = pin;
    }
    
  
    
    public String getId(){
    	return id;
    }
    
    public String getPin(){
        return pin;
    }
    
     
} 
    

