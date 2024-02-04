enum Status{
    Running,failed,Success;
}
public class EnumPractice{
    public static void main(String[] args) {
        Status s=Status.failed;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] all=Status.values();
        System.out.println(all[2]);
        for(Status sa:all){
            System.out.println(sa+":"+sa.ordinal());
        }
        

        
    }
}
