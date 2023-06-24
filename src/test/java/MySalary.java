public class MySalary {

    public static void main(String[] args) {
        MySalary mySalary=new MySalary();
        System.out.println( mySalary.calculateSalary(10));

        System.out.println( mySalary.calculateSalary(10,2));
    }

    public int calculateSalary(int hour)

    {
        return hour * 500;


    }
    public int calculateSalary(int hour,int overtime)

    {
        return (hour * 500) +(overtime*800);


    }
}
