/***
 this algorithm work to encrypt and decrypt message by put key in front of message then 
 encrypt character then the front message character be a key 
 decrypt character then the front message character be a key
 algorithm is :  c: cipher text , p:plain text  k:key 
 encrypt auto  C = P+k(key)  mod 26     
 decrypt auto   p = C-k(key)  mod 26
 ***/
package auto_key;

// 
public class auto_key_algorithm {
    
    String key;

    public auto_key_algorithm(String key) {
        this.key = key;
    }
    
    
    String encrypt(String message){
        String result ="";
       message= message.toLowerCase();  // make sure string is lower case
       message= message.replace(" ", "");  // sure that string not have spaces
        String temp = key;
        // shift every character in message 
        for(int i=0,index=0;i<message.length();i++,index= ++index%temp.length()){
               char p =(char)(message.charAt(i)-'a');  // message character
               char t = (char)(temp.charAt(index)-'a');  // key character
               result+= (char) ( ((p+t) %26) +'a');  // put new character in result
               char[] tempChars = temp.toCharArray(); //convert string to char array then 
               tempChars[index] =(char) (p+'a');     // replace character with message caracter
               temp = String.valueOf(tempChars);    // and convert char array to string again
        }
        return result;
    }
    
    
    String decrypt(String message){
       String result = "";
       String temp = key;
       // shift character in message
       for(int i=0,index=0;i<message.length();i++,index= ++index%temp.length()){
           char c = (char) (message.charAt(i)-'a');  // message character
           char t  =(char) (temp.charAt(index)-'a'); // key character
           int val = (c-t) %26;
           
           if(val<0)   // chack if character valeu <0  
               val+=26; //then this sheft should be from the last
           
           result+= (char) ( val +'a');   // put new character in result
           char[] tempChars = temp.toCharArray();         //convert string to char array then
               tempChars[index] = (char) ( val +'a');    // replace character with message caracter
               temp = String.valueOf(tempChars);        // and convert char array to string again
       }
       return result;
    }
    
    
}
