package praticals;

public class Rpcraven{
public static void main(String argv[]){
Pmcraven pm1 = new Pmcraven("One");
pm1.run();
Pmcraven pm2 = new Pmcraven("Two");
pm2.run();
}
}
class Pmcraven extends Thread{
private String sTname="";
Pmcraven(String s){
sTname = s;
}
public void run(){
for(int i =0; i < 2 ; i++){
try{
sleep(1000);
}catch(InterruptedException e){}
yield();
System.out.println(sTname);}
}
}
