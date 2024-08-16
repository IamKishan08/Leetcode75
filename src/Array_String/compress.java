package Array_String;

public class compress {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int newLength = compress1(chars);

        System.out.println("New length: " + newLength);

        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
    }

    private static int compress1(char[] chars){

        int i = 0;
        int index = 0;

        while(i<chars.length){

            char currentchar = chars[i];
            int count = 0;

            while (i<chars.length && chars[i] == currentchar){
                i++;
                count++;
            }

            chars[index++] = currentchar;

            if(count >1 ){
                   for(char c : Integer.toString(count).toCharArray()){
                       chars[index++] = c;
                   }
            }

        }


        return index;
    }
}
