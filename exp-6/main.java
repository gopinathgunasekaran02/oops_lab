import com.rev.StringUtil;

class Main{
    public static void main(String [] args) {
        StringUtil util = new StringUtil("test");
        System.out.println(util.isEmptyOrNull());
        System.out.println(util.isNotEmptyAndNotNull());              
    }
}