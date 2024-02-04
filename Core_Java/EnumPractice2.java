enum Status{
    Running,failed,Success;
}
public class EnumPractice2{
    public static void main(String[] args) {
        Status s=Status.failed;
        if (s==Status.Running)
            System.out.println("All Good");
        else if(s==Status.failed)
            System.out.println("Please Try Again");
        else
            System.out.println("Done");
        
        Status stat=Status.failed;
        switch (stat) {
            case Running:
                System.out.println("All Good");
                break;
            case failed:
                System.out.println("Try Again");
                break;
            case Success:
                System.out.println("Done");
                break;
            default:
                break;
        }
        
    }
}
