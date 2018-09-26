import java.util.ArrayList;

public class prime_num {
    public static boolean prime_flag(int target){
        Boolean flag = true;
        for(int i = 2 ; i < target ; i ++ ){
            if(target % i != 0){
                //System.out.println(target % i != 0);
                //System.out.println(i);
                //System.out.println("the target is not prime number!");
                flag = true;

            }else {
                flag = false;
                break;
            }
            //System.out.println(flag);
        }
//        if(flag != true){
//            System.out.println("the target is not prime number!");
//        }else {
//            System.out.println("the target is prime number!");
//        }
        return flag;
    }
    public static void main(String[] args){
        //素数，只能被自己和1整除的数
        //在此，找出1000以内的素数
        ArrayList result = new ArrayList();
        result.add(1);
        for(int j = 2 ; j <= 1000 ; j++ ){
            boolean temp = prime_flag(j);
            if(temp){
                result.add(j);
                System.out.println(j);
            }
        }
        System.out.println("*****************");
        //result[1] = 20;
        System.out.println(result);
        }
    }

