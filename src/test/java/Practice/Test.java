package Practice;

public class Test {

    public static void main(String[] args) {

        int [] arr = new int[] {2,4,6,8,12,14};

        int dvider=100;
        int dvidsor=25;

//        System.out.println(isPrime(21));
//        System.out.println(findremainder(dvider,dvidsor ));
    }
    public static int findmissingnum(int [] arr){

        if(arr[arr.length-1] != 14) return 14;

        for(int i=0;i<arr.length-1;i++){
             if(arr[i] +1 != arr[i+1] )
                     return arr[i]+1;
        }
        return 2;
    }

    public static int findremainder(int dvdn, int dvsr){

        int rmndr = dvdn-dvsr*(dvdn/dvsr);
        return rmndr;
    }
    public static boolean isPrime(int num){

        if(num==0 || num ==1){
            return false ;
        }
        for(int i=2; i< num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
