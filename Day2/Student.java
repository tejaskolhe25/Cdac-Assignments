class Student{
 String name;
 int sub1;
 int sub2;
 int sub3;
 int avg;
 int total;
 
 void assign(int s1 , int s2 , int s3)
 {
	 sub1=s1;
	 sub2=s2;
	 sub3=s3;
	 total("ujjwal");
	 avg();
	 
	 
 }
 void avg(){
	 avg=total/3;
	 System.out.println("avg of suudent"+avg);
	 
 }
 void total(String n1){
	 name=n1;
	 total=sub1+sub2+sub3;
	 
	 System.out.println("name of student"+name);
	 System.out.println("avg of student"+total);
 }
 
 
 
 
   public static void main(String []args){
   Student s1 = new Student();
   s1.assign(20,30,50);
   
   
	 
 }

}
