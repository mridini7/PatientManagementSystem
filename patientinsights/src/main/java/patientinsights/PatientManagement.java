package patientinsights;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class PatientManagement
{
    public static void main( String[] args )
    {
         HashMap<Integer, Patients> newPatients = new HashMap<>();
         String [] arrOfString = null;

        try {
            File myObj = new File("/Users/mridinikulkarni/PatientData/PatientData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            arrOfString = data.split(",", 6); 
            System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

  
        newPatients.put(1, new Patients(arrOfString[0], arrOfString[1], arrOfString[2], arrOfString[3], arrOfString[4], arrOfString[5]));
    }
}
