package Java_Fundamental.Loop;

public class IfStatement {
    public static void main(String[] args) {
        int salary = 20000;
        if (salary > 10000){
            System.out.println("First position");
        }else{
            System.out.println("Second position");
        }


//        multiple if else statement
        if(salary > 10000){
            System.out.println("1st position");
        }else if (salary > 5000){
            System.out.println("2nd Position");
        }else{
            System.out.println("Third position");
        }
    }
}
