public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){    
        String result = "";
      for (int k = 0; k < message.length(); k++) {
        char y = message.charAt(k);


        //reverse method of encrypt 

        int j = rotors[2].indexOf(y);

        char t1 = rotors[1].charAt(j);

        int i = rotors[2].indexOf(t1);

        char inner = rotors[0].charAt(i);

        result = result + inner;

      rotate();
    }
    return result; 
}


    
    public String encrypt(String message){
     String result = "";
      for (int k = 0; k < message.length(); k++) {
        char c = message.charAt(k);


        //finc c on inncer
        int i = rotors[0].indexOf(c);
        //the alligned character in outer
        char t = rotors[2].charAt(i); 
        //find that char in the middle
        int j = rotors[1].indexOf(t);
        //take that aligned from outer
        char out = rotors[2].charAt(j); 

        result = result + out;

        rotate();

      }

      return result;








        
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
