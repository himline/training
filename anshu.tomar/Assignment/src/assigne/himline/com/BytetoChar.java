package assigne.himline.com;

public class BytetoChar {

	public static void main(String[] args) {
		{
			 
			                              // converting byte array to char array
			    byte b1[] = { 65, 66, 67, 68, 69, 70 };
			                             // java array to string
			    String s1 = new String(b1);
			    System.out.println("byte array as string: " + s1);
			 
			    char c1[] = s1.toCharArray();
			    System.out.print("Chars of byte array: ");                
			    for(char ch : c1)
			       System.out.print(ch + ", ");
			                    
			                         // converting char array to byte array
			     char c2[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
			     String s2 = new String(c2);
			     System.out.println("\n\nchar array as string: " + s2);  
			                        // java string to byte array      
			     byte b2[] = s2.getBytes();
			     System.out.print("bytes of char array: ");                
			     for(byte b : b2)
			        System.out.print(b + ", ");
			 
				   // converting single byte to char
			     byte b3 = 65;
			     char c3 = (char) b3;
			     System.out.println("\n\nbyte value is " + b3 + " and corresponding char value is " + c3);
			 
				 // converting single char to byte
			     char c4 = 'a';
			     byte b4 = (byte) c4;
			     System.out.println("char value is " + c4 + " and corresponding byte value is " + b4);
			  }
			}

	}


