import java.util.*;
public class doctorfees
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int no_of_patient = obj.nextInt();
        int patient_age[] = new int[no_of_patient];
        int fees=0;
        for(int i=0;i<no_of_patient;i++)
        {
            patient_age[i] = obj.nextInt();

            if(patient_age[i] < 17)
            {
                fees +=200;
            }
            else if((patient_age[i]>= 17 && patient_age[i] < 40))
            {
                fees += 400;
            }
            else if(patient_age[i] >=40)
            {
                fees+= 300;
            }
        }
        System.out.println(fees);
    }
}
