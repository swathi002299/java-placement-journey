import java.util.Scanner;
public class studentreport{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name");
        String name=sc.nextLine();
        System.out.println("enter student rollno");
        int rollno=sc.nextInt();
        System.out.println("enter student department");
        sc.nextLine();
        String dept=sc.nextLine();
        System.out.println("enter no of subjects");
        int n=sc.nextInt();
        int total=0;
        String subject[]=new String[n];
        int mark[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter subject name");
            subject[i]=sc.next();
            System.out.println("enter marks for subject ");
            mark[i]=sc.nextInt();

            total+=mark[i];
        }

        int cgpa=total/n;
        System.out.println("------------Student Report--------------------------------");
        System.out.println("name of student="+name);
        System.out.println("register number= "+rollno);
        System.out.println("department=    "+dept);
        System.out.println("-------------------------------------------------------------");
        System.out.println("subject              marks");
        for(int i=0;i<n;i++){
            System.out.println(subject[i]+"\t\t\t\t"+mark[i]);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("cgpa=\t\t\t\t"+cgpa);

    }
    }
