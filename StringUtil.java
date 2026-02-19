public class StringUtil {

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >=0; i--){
            char c = s.charAt(i);
            sb.append(c);            
        }
        return sb.toString();
    }
    
    //EX8
    public static String exploded(String s){    //Baku --> BBaBakBaku
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            for(int j =0; j< i + 1; j++){
                char c = s.charAt(j);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //EX9
    public static String sorted(String s){
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length;i++){
            for(int j = i +1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
        return new String(arr);

    }

    //EX10
    public static boolean anagram(String s1, String s2){
        return sorted(s1).equals(sorted(s2));
    }

    //EX11
    public static String mixedStrings(String s){
        char[] arr = s.toCharArray();
        char temp=0;
        int indexOfFIrst=0;
        for(int i = 0; i < arr.length; i++){
            if( i == 0 || arr[i-1] == ' '){
                temp = arr[i];
                indexOfFIrst = i;

            }
            else if(i == arr.length -1 || arr[i+1] ==' '){
                
                arr[indexOfFIrst] = arr[i];
                arr[i] = temp;

            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {

        String s = "Asiman";
        System.out.println(reverse(s));

        String b = "Baku";
        System.out.println(exploded(b));

        String c = "HelloWorld";
        System.out.println(sorted(c));

        System.out.println(anagram("listen", "silent"));
        System.out.println(anagram("Asiman", "Hello"));
        

        System.out.println(mixedStrings("This is PP2 Fall 2021"));
    }
    
}