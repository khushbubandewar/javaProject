package praticals;

import java.io.*;
public class Th{
public static void main(String argv[]){
Th t = new Th();
t.amethod();
}
public void amethod(){
try{
ioCall();
}catch(IOException ioe){}
}
}