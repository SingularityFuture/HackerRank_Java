import java.util.*;

class Student implements Comparable<Student>{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }   
    
    @Override
    public int compareTo(Student x){
        if(cgpa==x.cgpa){
            if(fname.equals(x.fname)){
                if(id==x.id){
                    return 0;
                }
                else return id - x.id;
            }
            else return fname.compareTo(x.fname);                
        }
        else{
            if(x.cgpa - cgpa > 0)
                return 1; 
            else
                return -1;
        }
    }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       
      Collections.sort(studentList);
      //Collections.reverse(studentList);
      
      for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
