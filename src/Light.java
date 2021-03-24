public class Light {
    int weight;
    String color;
    int length;
    String shape;
    int radius;

    //This is single line comment.
    /**
    * This is block comment
    * Write more than one line
    * Has no meeting to the JVM
    * */

    //This is my Light Factory

    public Light(int weight, String color, int length,String shape,int radius){
     this.weight=weight;
     this.color=color;
     this.length=length;
     this.shape=shape;
     this.radius=radius;
     System.out.println("You are in Light Factory");

    }

    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Light Factory");
        Light lunaTableLight=new Light(500,"White",6,"Oval",3);
        Light lunaBedRoomLight=new Light(600,"Black",7,"Round",2);
        Light lunaLivingRoomLight=new Light(700,"Orange",8,"Triangle",4);
    lunaTableLight.turnOnLights("LunaTableLight");
    lunaBedRoomLight.turnOnLights("LunaBedRoomLight");
    lunaLivingRoomLight.turnOnLights("LunaLivingRoomLight");
    }
    public void turnOnLights(String lightName){
        System.out.println("Light turned on "+lightName);


    }

}
