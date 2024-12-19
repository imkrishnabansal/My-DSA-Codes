package Arrays.src;

public class Hours_of_The_Day {
    public static void main(String[] args) {
        int[] hours = {12,12,30,24,24};
        System.out.println(day(hours));
    }
    public static long day(int[]hours){
//        int count =0;
//        for(int i =0;i<hours.length;i++){
//            for(int j = i+1;j<hours.length;j++){
//                if((hours[i]+hours[j])%24==0){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
long count =0;
        for(int  i =0;i<hours.length;i++){
        for(int  j = i+1;j<hours.length;j++){
            if((int)(hours[i]+hours[j])%24==0){
                count++;
            }
        }
    }
        return (int)count;
}
}

