import java.util.*; 
class securitypin{

    public static int[] returnn_array(int number){
        String temp= String.valueOf(number);
        int [] arr=new int[temp.length()];
        for (int i=0 ; i<temp.length(); i++){
            arr[i]=temp.charAt(i)-'0';
        }
        return arr;
    }
    // this function returns the array of the number fead to it^^^^^^^^

    public static int pin(int input1 , int input2 , int input3){
        int security_pin=0;
        int maxx=0;
        int[] arr1=returnn_array(input1);
        int[] arr2=returnn_array(input2);
        int[] arr3=returnn_array(input3);
        int d1=Arrays.stream(arr1).min().getAsInt();
        int d2=Arrays.stream(arr2).min().getAsInt();
        int d3=Arrays.stream(arr3).min().getAsInt();
        for(int i:arr1){
            if(maxx<i){
                maxx=i;
            }
        }
        for(int i:arr2){
            if(maxx<i){
                maxx=i;
            }
        }
        for(int i:arr3){
            if(maxx<i){
                maxx=i;
            }
        }
        security_pin=Integer.parseInt(String.valueOf(maxx)+String.valueOf(d3)+String.valueOf(d2)+String.valueOf(d1));

        
        return security_pin;
        
    }

    public static void main(String args[]){
        int input1=75745;
        int input2=987651;
        int input3=687979346;
        System.out.println(pin(input1,input2,input3));
        

    }
}