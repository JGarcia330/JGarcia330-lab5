public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;

        int pos = rotorValues.indexof(startChar);
        while (rotorValues.charAt(0) != startChar) {
            rotate();
        }
    

        
            
    }
    
    public boolean rotate(){

        

        //shoud create array of rotor characters that should be the size of 27
        char[] arr = rotorValues.toCharArray();
        //set the temp to last index of array 
        char temp = arr[26];
        //for loop to shift elements to right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];      
        }
        //set the last element to be the first index now
        arr[0] = temp;                
        //set the new rotated string to be the next string to rotate
        rotorValues = new String(arr);

        //return true when makes a full cycle


        return rotorValues.charAt(0) == startChar;
    }




        //
               
    }
    

    public int indexOf(char c){
        //TODO
    }

    public char charAt(int idx){
        //TODO
    }
}
    
